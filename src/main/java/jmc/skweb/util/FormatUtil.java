package jmc.skweb.util;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import com.inssjp.mywebservice.business.IWebServiceStub.MedicamentosDTO;
import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentos;
import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentosE;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.report.TransacJoin;
import jmc.skweb.core.model.shortEntities.GenteBasic;
import jmc.skweb.core.model.traza.ObraSocial;
import jmc.skweb.core.model.traza.TrazabiFarma;
import jmc.skweb.core.model.traza.report.DatosTrazaWS;

public class FormatUtil {

	private static String llenarConCero(String s, int width) {
		String formattedString;

		// La serie es ms corta que la anchura especificada,
		// por lo que tenemos que rellenarla con blancos.
		if (s.length() < width) {
			StringBuffer buffer = new StringBuffer(s);
			for (int i = s.length(); i < width; ++i) {
				buffer.append("0");
			}
			formattedString = buffer.toString();
		} else {
			formattedString = s.substring(0, width);
		}
		return formattedString;
	}

	public static Long formatCuit(String cuit) throws Exception {
		Long cuitFormated = 0l;
		System.out.println("Cuit " + cuit);
		cuit = cuit.trim().replaceAll("-", "");
		cuit = cuit.trim().replaceAll(" ", "");
		try {
			cuitFormated = Long.parseLong(cuit);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return cuitFormated;
	}

	public static boolean validar(String cadena, Long[] valores) {

		char[] nroClave = cadena.toCharArray();
		int checksuma = 0;

		for (int i = 0; i < 11; i++) {
			checksuma += Integer.parseInt(String.valueOf(nroClave[i])) * i;
		}

		for (Long valor : valores) {
			System.out.println("comparo valor: " + valor + "checksuma =" + checksuma);
			if (checksuma == valor)
				return true;
		}
		return false;
	}

	public static String getError(String valorInt) {
		if (valorInt != null) {
			int i = valorInt.indexOf("|", 1);
			while (i != -1) {
				valorInt = valorInt.substring(i);
				i = valorInt.indexOf("|", 1);

			}
			return valorInt.replaceFirst("\\|", "");
		} else {
			return null;
		}
	}

	public static String llenoConCeros(String valor, int longitud) {
		while (valor.length() < longitud) {
			valor = "0" + valor;
		}
		return valor;
	}

	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y data en el vector 1
	 */
	public static String getListHTMLOS(List<ObraSocial> osList) {

		String data = "";
		int sizeList = osList.size();
		if (sizeList > 10)
			sizeList = 10;
		String header = " <select onclick=\"callSelectList();\" name=\"drop1\" id=\"idAutoCompleteManual\" size=\""
				+ sizeList + "\" >";
		String options = "";
		String footer = " </select> ";
		for (ObraSocial os : osList) {
			String option = "<option value=\"" + os.getIdObraSocial() + "\">" + os.getDescripC() + "</option>";
			options = options + option;
		}
		data = header + options + footer;

		return data;
	}

	public static String llenoDosCeros(String valor) {
		int valorN = 0;
		String result = "00";
		try {
			valorN = Integer.parseInt(valor);
			result = llenoConCeros(String.valueOf(valorN), 2);
		} catch (Exception e) {

		}
		return result;
	}

	public static double redondearEn2(double numero) {
		return Math.rint(numero * 100) / 100;
	}

	public static double redondearEn6(double numero) {
		return Math.rint(numero * 1000000) / 1000000;
	}

/*
	public static byte[] getFacturasExcel(List<String> facturasPerdidas){
		
        HSSFWorkbook libro = new HSSFWorkbook();

        // Se crea una hoja dentro del libro
        HSSFSheet hoja = libro.createSheet();

        // Se crea una fila dentro de la hoja
        HSSFRow fila = hoja.createRow(1);

        // Se crea una celda dentro de la fila.
        HSSFCell prefijo = fila.createCell((short) 0);
        HSSFCell tipoCompr = fila.createCell((short) 1);	        
        HSSFCell nroComprobante = fila.createCell((short) 2);
        HSSFCell cae = fila.createCell((short) 3);
        HSSFCell vtoCae = fila.createCell((short) 4);
        HSSFCell impTotal = fila.createCell((short) 5);
        HSSFCell impNeto = fila.createCell((short) 6);	        
        HSSFCell impTrib = fila.createCell((short) 7);
        HSSFCell impIVA = fila.createCell((short) 8);
        HSSFCell docNro = fila.createCell((short) 9);
        HSSFCell docTipo = fila.createCell((short) 10);
        HSSFCell cbteFch = fila.createCell((short) 11);               
        
        // Se crea el contenido de la celda y se mete en ella.        
        prefijo.setCellValue("Punto de Vta");
        tipoCompr.setCellValue("Tipo Comprobante");
        nroComprobante.setCellValue("Numero Comprobante");        
        cae.setCellValue("Nro CAE");
        vtoCae.setCellValue("Vto. CAE");
        impTotal.setCellValue("Importe Total");
        impNeto.setCellValue("Importe Neto");
        impTrib.setCellValue("Importe Tributo");        
        impIVA.setCellValue("Importe IVA");
        docNro.setCellValue("Numero Doc");
        docTipo.setCellValue("Tipo de Doc");
        cbteFch.setCellValue("Fecha Cbte");
        
        int i = 2;
        for(String factura : facturasPerdidas){
            HSSFRow filaNew = hoja.createRow(i);

            // Se crea una celda dentro de la fila
            HSSFCell prefijoNew = filaNew.createCell((short) 0);
            HSSFCell tipoComprNew = filaNew.createCell((short) 1);	        
            HSSFCell nroComprobanteNew = filaNew.createCell((short) 2);
            HSSFCell caeNew = filaNew.createCell((short) 3);
            HSSFCell vtoCaeNew = filaNew.createCell((short) 4);
            HSSFCell impTotalNew = filaNew.createCell((short) 5);
            HSSFCell impNetoNew = filaNew.createCell((short) 6);	        
            HSSFCell impTribNew = filaNew.createCell((short) 7);
            HSSFCell impIVANew = filaNew.createCell((short) 8);
            HSSFCell docNroNew = filaNew.createCell((short) 9);
            HSSFCell docTipoNew = filaNew.createCell((short) 10);
            HSSFCell cbteFchNew = filaNew.createCell((short) 11);               
            
            
            // Se crea el contenido de la celda y se mete en ella.
            //HSSFRichTextString texto = new HSSFRichTextString("hola mundo");
            
        	String[] campos = factura.split("\\;");
        	try{
        		prefijoNew.setCellValue(campos[0]);	
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{        		
        		tipoComprNew.setCellValue(campos[1]);
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{        		
        		nroComprobanteNew.setCellValue(campos[2]);
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{
        		caeNew.setCellValue(campos[3]);        		
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{        		
        		vtoCaeNew.setCellValue(campos[4]);	
        	}catch(Exception e){
        		e.printStackTrace();
        	}

        	try{        		
        		impTotalNew.setCellValue(campos[5]);	
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{        		
        		impNetoNew.setCellValue(campos[6]);	
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{        		
        		impTribNew.setCellValue(campos[7]);	
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{        		
        		impIVANew.setCellValue(campos[8]);	
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{
        		docNroNew.setCellValue(campos[9]);
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	try{
        		docTipoNew.setCellValue(campos[10]);
        	}catch(Exception e){
        		e.printStackTrace();
        	}try{
        		cbteFchNew.setCellValue(campos[11]);
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	i++;
        }
        // Se salva el libro.
        FileOutputStream elFichero = null;
        String nombreArchivo = "c:\\T_" +System.currentTimeMillis()+".txt";
        byte[] array = null;
        try {
        	
        	elFichero = new FileOutputStream(nombreArchivo);
            libro.write(elFichero);
            elFichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

		try {
			array = FileUtil.getBytesFromFile(new File(nombreArchivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File fileDelete = new File(nombreArchivo);
		fileDelete.delete();


        return array;
    }
	*/

	public static Image getImage(byte[] bytes, boolean isThumbnail) throws IOException {

		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
		ImageReader reader = (ImageReader) readers.next();
		Object source = bis; // File or InputStream
		ImageInputStream iis = ImageIO.createImageInputStream(source);
		reader.setInput(iis, true);
		ImageReadParam param = reader.getDefaultReadParam();
		if (isThumbnail) {

			param.setSourceSubsampling(4, 4, 0, 0);

		}
		return reader.read(0, param);

	}
	/*

	public static byte[] convertJPG(String filename, int parte) throws IOException {

		File file = new File(filename);
		SeekableStream s = new FileSeekableStream(file);

		TIFFDecodeParam param = null;

		ImageDecoder dec = ImageCodec.createImageDecoder("tiff", s, param);

		System.out.println("Number of images in this TIFF: " + dec.getNumPages());

		// Which of the multiple images in the TIFF file do we want to load
		// 0 refers to the first, 1 to the second and so on.
		int imageToLoad = parte;

		RenderedImage op = new NullOpImage(dec.decodeAsRenderedImage(imageToLoad), null, OpImage.OP_IO_BOUND, null);

		PlanarImage pi = PlanarImage.wrapRenderedImage(op);

		BufferedImage bi = pi.getAsBufferedImage();

		Graphics2D g = (Graphics2D) bi.getGraphics();

		g.drawLine(0, 0, 50, 50);

		g.scale(20, 20);

		g.dispose();

		ByteArrayOutputStream bas = new ByteArrayOutputStream();
		ImageIO.write(bi, "jpg", bas);
		byte[] data = bas.toByteArray();

		return data;
	}

<<<<<<< HEAD
		*/
		
	public static byte[] mergeJPG(byte[] image1, byte[] image2){
		ByteArrayInputStream bi1 = new ByteArrayInputStream (image1);
		ByteArrayInputStream bi2 = new ByteArrayInputStream (image2);

		BufferedImage image = null;
		BufferedImage overlay = null;
		try {
			image = ImageIO.read(bi1);
			overlay = ImageIO.read(bi2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// create the new image, canvas size is the max. of both image sizes
		int w = Math.max(image.getWidth(), overlay.getWidth());
		int h = Math.max(image.getHeight(), overlay.getHeight());
		BufferedImage combined = new BufferedImage(w, h * 2, BufferedImage.TYPE_BYTE_GRAY);

		// paint both images, preserving the alpha channels
		Graphics g = combined.getGraphics();
		g.drawImage(image, 0, 0, null);
		g.drawImage(overlay, 0, h, null);
		ByteArrayOutputStream bas = new ByteArrayOutputStream();
		try {
			ImageIO.write(combined, "jpg", bas);
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] data = bas.toByteArray();
		return data;
	}

	public static String getSignoRow(Integer tipoComprob) {
		if (tipoComprob == 2 || tipoComprob == 4 || tipoComprob == 6 || tipoComprob == 10) {
			return "red";
		} else {
			return "black";
		}
	}

	public static String getSignoPorNegativoRow(Float valor) {
		if (valor < 0) {
			return "red";
		} else {
			return "black";
		}
	}

	public static String getSignoPorNegativoRow(Double valor) {
		if (valor < 0) {
			return "red";
		} else {
			return "black";
		}
	}

	public static BigDecimal getSaldoCalculado(Integer tipoComprob, BigDecimal saldo) {
		if (tipoComprob == 2 || tipoComprob == 4 || tipoComprob == 6 || tipoComprob == 10) {
			return saldo.multiply(BigDecimal.valueOf(-1l));
		} else {
			return saldo;
		}
	}

	public static BigDecimal getSaldoCalculado(Short factCtaCte, BigDecimal saldo) {

		return saldo.multiply(BigDecimal.valueOf(factCtaCte));

	}

	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y data en el vector 1
	 */
	public static String getListHTMLGenteBasic(List<GenteBasic> genteList) {

		String data = "";
		int sizeList = genteList.size();
		if (sizeList > 10)
			sizeList = 10;
		String header = " <select onclick=\"callSelectList();\" name=\"drop1\" id=\"idAutoCompleteManual\" size=\""
				+ sizeList + "\" >";
		String options = "";
		String footer = " </select> ";
		for (GenteBasic gente : genteList) {
			String option = "<option value=\"" + gente.getGenteNr() + "\">" + gente.getDescripC() + "</option>";
			options = options + option;
		}
		data = header + options + footer;

		return data;
	}

	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y data en el vector 1
	 */
	public static String getListHTMLStock(List<Stock> stockList) {

		String data = "";
		int sizeList = stockList.size();
		if (sizeList > 10)
			sizeList = 10;
		String header = " <select onclick=\"callSelectList();\" name=\"drop1\" id=\"idAutoCompleteManual\" size=\""
				+ sizeList + "\" class = \"AutoComplete\">";
		String options = "";
		String footer = " </select> ";
		for (Stock stock : stockList) {
			String option = "<option value=\"" + stock.getClave() + "\">" + stock.getDescripC() + "</option>";
			options = options + option;
		}
		data = header + options + footer;

		return data;
	}

	/*
	 * <table cellpadding=\
	 * "0\" cellspacing=\"0\" border=\"0\" class = \"uiTableBlue\"><tr><th>Agendado</th><th>Razon Social</th><th>NrComprob/Transac</th><th>Fecha</th><th>IntNr</th><th>CantPedido</th><th>CantEntregado</th><th>Saldo</th><th>Fecha Entrega</th><th><img alt=\"\" src=\"images/general/delete.png\" title=\"Ocultar Tabla\" onclick=\"CloseUiTableBlue();\"
	 * ></th></tr>
	 * 
	 * <tr><td>122</td><td>La
	 * Filomena</td><td>0000090/123432</td><td>10/01/2012</td><td>1</td><td>1232
	 * .00</td><td>123.00</td><td>123.89</td><td>10/08/2012</td></tr></table>
	 */

	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y data en el vector 1
	 */
	public static String getTableHTMLPedido(List<TransacJoin> transacJoinList, String tipoComprob) {
		String data = "";
		String sizeVertical = "auto";
		int sizeList = transacJoinList.size();
		if (sizeList > 8)
			sizeVertical = "200px";

		String style = "<style type=\"text/css\">#scroller {width:700px;height:" + sizeVertical
				+ ";overflow:auto;}</style>";

		String header = "<div id=\"scroller\">"
				+ "<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class = \"uiTableBlue\">"
				+ "<tr><th width=\"100%\" colspan=\"9\">Tipo de Comprobante: " + tipoComprob
				+ "&nbsp;&nbsp;&nbsp;&nbsp;<img alt=\"\" src=\"images/general/delete.png\" title=\"Ocultar Tabla\" onclick=\"CloseUiTableBlue();\"></th></tr>"
				+ "<tr><th>Agendado</th><th>Razon Social</th><th>NrComprob/Transac</th><th>Fecha</th><th>IntNr</th><th>CantPedido</th><th>CantEntregado</th><th>Saldo</th><th>Fecha Entrega</th></tr>";
		// String options = "<tr><td>122</td><td>La
		// Filomena</td><td>0000090/123432</td><td>10/01/2012</td><td>1</td><td>1232.00</td><td>123.00</td><td>123.89</td><td>10/08/2012</td></tr></table>";
		String options = "";
		int i = 0;
		for (TransacJoin transac : transacJoinList) {
			String color = "";
			if (MathUtil.esPar(i))
				color = "#BDBDBD";
			else
				color = "#83aec0";

			String option = "<tr><td bgcolor=\"" + color + "\">" + transac.getTransacNr() + "</td>" + "<td bgcolor=\""
					+ color + "\">" + transac.getRazonSocial() + "</td>" + "<td bgcolor=\"" + color + "\">"
					+ transac.getNrComprob() + "/" + transac.getTransacNr() + "</td>" + "<td bgcolor=\"" + color + "\">"
					+ transac.getFormatFecha() + "</td>" + "<td bgcolor=\"" + color + "\">" + transac.getNrInt()
					+ "</td>" + "<td bgcolor=\"" + color + "\">" + transac.getCant1() + "</td>" + "<td bgcolor=\""
					+ color + "\">" + transac.getCant1Entregado() + "</td>" + "<td bgcolor=\"" + color + "\">"
					+ transac.getSaldoCantidad() + "</td>" + "<td bgcolor=\"" + color + "\">"
					+ transac.getFormatFechaEntrega() + "</td>" + "</tr>";
			options = options + option;
			i++;
		}

		String footer = " </table> </div>";

		data = style + header + options + footer;

		return data;
	}

	public static String parseLote(String lote) {
		String result = lote;
		if (result == null) {
			result = "";
			return result;
		}
		try {
			// Encuentro la V
			int v = lote.indexOf("V=");
			if (v == -1) {
				v = lote.indexOf("V ");
			}
			if (v == -1) {
				v = lote.indexOf("V");
			}
			if (v != -1) {
				lote = lote.substring(0, v).trim();
			}
			int sizeLote = lote.length();
			int l = lote.indexOf("L=");
			if (l != -1) {
				l = l + 2;
			}
			if (l == -1) {
				l = lote.indexOf("L ");
				if (l != -1) {
					l = l + 2;
				}
			}
			if (l == -1) {
				l = lote.indexOf("L");
				if (l != -1) {
					l = l + 1;
				}

			}
			if (l != -1) {
				lote = lote.substring(l, sizeLote).trim();
			}

			System.out.println(lote);
			result = lote;

		} catch (Exception e) {
			e.printStackTrace();
		}
		result = result.replace(".", "");
		return result;
	}

	public SendMedicamentosE makeSendMedicamentosCompraDocument(TrazabiFarma tf, String usr, String pass)
			throws Exception {

		SendMedicamentosE req = null;

		SendMedicamentos sm = new SendMedicamentos();

		MedicamentosDTO[] arg0Array = new MedicamentosDTO[1];

		MedicamentosDTO m = new MedicamentosDTO();

		// Carga del objeto Requet
		String errorParseo = "";
		// Cargo Cabezera.

		m = makeDatosComunes(m, tf);
		m.setId_evento(tf.getCodEventoIng().toString());
		m.setGln_origen(tf.getGlnorigenIng().trim());
		m.setGln_destino(tf.getGlndestinoIng().trim());
		m.setCuit_origen(tf.getCuitOrigenIng());
		m.setCuit_destino(tf.getCuitDestinoIng());
		// Parseo Vencimiento
		String vencimiento = tf.getVencimLote();
		m.setVencimiento(vencimiento);
		// Parseo FEvento
		Date fechaHoraIngreso = tf.getFechaIng();
		m.setF_evento(DateUtil.getFormatedDate(new Timestamp(fechaHoraIngreso.getTime())));
		m.setLote(tf.getLoteStr());
		if (tf.getNrRemCompra().indexOf("-") != -1) {
			String remito = "R" + tf.getNrRemCompra().replace("-", "");
			m.setN_remito(remito);
		} else {
			m.setN_remito(tf.getNrRemCompra());
		}

		// Parseo HEvento
		m.setH_evento(DateUtil.getFormatedHour(new Timestamp(fechaHoraIngreso.getTime())));

		arg0Array[0] = m;

		sm.setArg0(arg0Array);
		sm.setArg1(usr);
		sm.setArg2(pass);

		System.out.println("GNL Origen: " + m.getGln_origen());
		System.out.println("GNL Destino: " + m.getGln_destino());
		System.out.println("Fecha Evento: " + m.getF_evento());
		System.out.println("ID Evento: " + m.getId_evento());
		System.out.println("Lote: " + m.getLote());

		return req;

	}

	public SendMedicamentosE makeSendMedicamentosDevolucionDocument(TrazabiFarma tf, String usr, String pass)
			throws Exception {

		SendMedicamentosE req = null;

		SendMedicamentos sm = new SendMedicamentos();

		MedicamentosDTO[] arg0Array = new MedicamentosDTO[1];

		MedicamentosDTO m = new MedicamentosDTO();

		// Carga del objeto Requet
		String errorParseo = "";
		// Cargo Cabezera.

		m = makeDatosComunes(m, tf);
		m.setId_evento(tf.getCodEventoIng().toString());
		m.setGln_origen(tf.getGlnorigenIng().trim());
		m.setGln_destino(tf.getGlndestinoIng().trim());
		m.setCuit_origen(tf.getCuitOrigenIng());
		m.setCuit_destino(tf.getCuitDestinoIng());
		// Parseo Vencimiento
		String vencimiento = tf.getVencimLote();
		m.setVencimiento(vencimiento);
		// Parseo FEvento
		Date fechaHoraIngreso = tf.getFechaIng();
		m.setF_evento(DateUtil.getFormatedDate(new Timestamp(System.currentTimeMillis())));
		m.setLote(tf.getLoteStr());
		if (tf.getNrRemCompra().indexOf("-") != -1) {
			String remito = "R" + tf.getNrRemCompra().replace("-", "");
			m.setN_remito(remito);
		} else {
			m.setN_remito(tf.getNrRemCompra());
		}

		// Parseo HEvento
		m.setH_evento(DateUtil.getFormatedHour(new Timestamp(fechaHoraIngreso.getTime())));

		arg0Array[0] = m;

		sm.setArg0(arg0Array);
		sm.setArg1(usr);
		sm.setArg2(pass);

		System.out.println("GNL Origen: " + m.getGln_origen());
		System.out.println("GNL Destino: " + m.getGln_destino());
		System.out.println("Fecha Evento: " + m.getF_evento());
		System.out.println("ID Evento: " + m.getId_evento());
		System.out.println("Lote: " + m.getLote());

		return req;

	}

	public MedicamentosDTO makeDatosComunes(MedicamentosDTO m, TrazabiFarma tf) {
		m.setGtin(tf.getGtin());
		m.setNumero_serial(tf.getSerieGtin());
		m.setVencimiento(tf.getVencimLote());
		m.setLote(tf.getLoteStr());
		return m;
	}

	public SendMedicamentosE makeSendMedicamentosEgresoDocument(TrazabiFarma tf, String usr, String pass,
			DatosTrazaWS datos) {
		SendMedicamentosE req = null;

		SendMedicamentos sm = new SendMedicamentos();

		MedicamentosDTO[] arg0Array = new MedicamentosDTO[1];

		MedicamentosDTO m = new MedicamentosDTO();

		// Carga del objeto Requet
		String errorParseo = "";
		// Cargo Cabecera.
		
		if (tf.getObserEgr().equals("PROGRAMA")){
			m.setId_programa(16);			
		}		

		m = makeDatosComunes(m, tf);
		m.setId_evento(tf.getCodEventoSal().toString());
		m.setGln_origen(tf.getGlnorigenSal().trim());
		try {
			m.setGln_destino(tf.getGlndestinoSal().trim());
		} catch (Exception e) {
		}
		m.setCuit_origen(tf.getCuitOrigenSal());
		
		// m.setCuitDestino(tf.getCuitDestinoIng());
		// Parseo Vencimiento
		String vencimiento = tf.getVencimLote();
		m.setVencimiento(vencimiento);
		// Parseo FEvento
		Date fechaHoraSalida = tf.getFechaSalida();
		m.setF_evento(DateUtil.getFormatedDate(new Timestamp(fechaHoraSalida.getTime())));
		m.setLote(tf.getLoteStr());
		m.setN_remito(datos.getNroRemito());
		// Parseo HEvento
		m.setH_evento(DateUtil.getFormatedHour(new Timestamp(fechaHoraSalida.getTime())));
		m.setId_obra_social(datos.getIdObraSocial());
		m.setNro_asociado(datos.getNroAsociado());
		m.setNombres(datos.getNombrePaciente());

		arg0Array[0] = m;

		sm.setArg0(arg0Array);
		sm.setArg1(usr);
		sm.setArg2(pass);

		System.out.println("GNL Origen: " + m.getGln_origen());
		System.out.println("GNL Destino: " + m.getGln_destino());
		System.out.println("Fecha Evento: " + m.getF_evento());
		System.out.println("ID Evento: " + m.getId_evento());
		System.out.println("Lote: " + m.getLote());

		return req;
	}

	/**
	 * Este metodo hace un merge entre n documentos PDF
	 * 
	 * @param streamOfPDFFiles
	 * @param outputStream
	 * @param paginate
	 * @return
	 */
	public static byte[] concatPDFs(List<byte[]> streamOfPDFFiles, boolean paginate) {
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
		Document document = new Document();
		document.setMargins(1, 1, 1, 1);
		document.setPageSize(PageSize.A4);
		try {
			// List<byte[]> pdfs = streamOfPDFFiles;
			List<PdfReader> readers = new ArrayList<PdfReader>();
			int totalPages = 0;
			// Iterator<byte[]> iteratorPDFs = pdfs.iterator();

			// Create Readers for the pdfs.
			for (byte[] pdf : streamOfPDFFiles) {
				PdfReader pdfReader = new PdfReader(pdf);
				readers.add(pdfReader);
				totalPages += pdfReader.getNumberOfPages();
			}

			// Create a writer for the outputstream
			PdfWriter writer = PdfWriter.getInstance(document, baosPDF);

			document.open();
			BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
			PdfContentByte cb = writer.getDirectContent(); // Holds the PDF
			// data

			PdfImportedPage page;
			int currentPageNumber = 0;
			int pageOfCurrentReaderPDF = 0;
			Iterator<PdfReader> iteratorPDFReader = readers.iterator();

			// Loop through the PDF files and add to the output.
			while (iteratorPDFReader.hasNext()) {
				PdfReader pdfReader = iteratorPDFReader.next();

				// Create a new page in the target for each source page.
				while (pageOfCurrentReaderPDF < pdfReader.getNumberOfPages()) {
					document.newPage();
					pageOfCurrentReaderPDF++;
					currentPageNumber++;
					page = writer.getImportedPage(pdfReader, pageOfCurrentReaderPDF);
					cb.addTemplate(page, 0, 0);

					// Code for pagination.
					if (paginate) {
						cb.beginText();
						cb.setFontAndSize(bf, 9);
						cb.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + currentPageNumber + " of " + totalPages,
								520, 5, 0);
						cb.endText();
					}
				}
				pageOfCurrentReaderPDF = 0;
			}
			baosPDF.flush();
			document.close();
			baosPDF.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (document.isOpen())
				document.close();
			try {
				if (baosPDF != null)
					baosPDF.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		return baosPDF.toByteArray();
	}

	public static Object getListHTMLTrazabiFarma(List<TrazabiFarma> trazabiFarmaList) {

		String data = "";
		int sizeList = trazabiFarmaList.size();
		if (sizeList > 10)
			sizeList = 10;
		String header = " <select onclick=\"callTrazaSelectList();\" name=\"drop1\" id=\"idAutoCompleteManual\" size=\""
				+ sizeList + "\" class = \"AutoComplete\">";
		String options = "";
		String footer = " </select> ";
		for (TrazabiFarma trazabiFarma : trazabiFarmaList) {
			String option = "<option value=\"" + trazabiFarma.getNr() + "\">" + trazabiFarma.getDescripC()
					+ "</option>";
			options = options + option;
		}
		data = header + options + footer;

		return data;
	}

}
