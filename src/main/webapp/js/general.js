function sendComprobCliente(transacNr) {								
	$.ajax({
		type : "POST",
		url : "sendComprobCliente",
		data : {
			"transac.transacNr" : transacNr			
		},
		success : function(msg) {
			 $.blockUI({ 
		            message: msg, 
		            timeout: 3500 
		     }); 			
		}
	});		
}