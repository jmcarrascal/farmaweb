/**
 * IWebServiceServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package org.apache.axis2.axis2userguide;

/*
 *  IWebServiceServiceStub java implementation
 */

public class IWebServiceServiceStub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis())
				+ "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService(
				"IWebServiceService" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[3];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://business.mywebservice.inssjp.com/",
				"sendCancelacTransacc"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation
				.setName(new javax.xml.namespace.QName(
						"http://business.mywebservice.inssjp.com/",
						"sendMedicamentos"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://business.mywebservice.inssjp.com/",
				"sendMedicamentosDHSerie"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public IWebServiceServiceStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public IWebServiceServiceStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener)
			throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(
				configurationContext, _service);

		_serviceClient.getOptions().setTo(
				new org.apache.axis2.addressing.EndpointReference(
						targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	}

	/**
	 * Default Constructor
	 */
	public IWebServiceServiceStub(
			org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "https://localhost:9050/trazamed.WebService");

	}

	/**
	 * Default Constructor
	 */
	public IWebServiceServiceStub() throws org.apache.axis2.AxisFault {

		this("https://localhost:9050/trazamed.WebService");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public IWebServiceServiceStub(java.lang.String targetEndpoint)
			throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see org.apache.axis2.axis2userguide.IWebServiceService#sendCancelacTransacc
	 * @param sendCancelacTransacc
	 */

	public com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument sendCancelacTransacc(

			com.inssjp.mywebservice.business.SendCancelacTransaccDocument sendCancelacTransacc)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://business.mywebservice.inssjp.com/IWebService/sendCancelacTransacc");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), sendCancelacTransacc,
					optimizeContent(new javax.xml.namespace.QName(
							"http://business.mywebservice.inssjp.com/",
							"sendCancelacTransacc")),
					new javax.xml.namespace.QName(
							"http://business.mywebservice.inssjp.com/",
							"sendCancelacTransacc"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "sendCancelacTransacc"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"sendCancelacTransacc"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"sendCancelacTransacc"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see org.apache.axis2.axis2userguide.IWebServiceService#sendMedicamentos
	 * @param sendMedicamentos
	 */

	public com.inssjp.mywebservice.business.SendMedicamentosResponseDocument sendMedicamentos(

	com.inssjp.mywebservice.business.SendMedicamentosDocument sendMedicamentos)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://business.mywebservice.inssjp.com/IWebService/sendMedicamentos");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), sendMedicamentos,
					optimizeContent(new javax.xml.namespace.QName(
							"http://business.mywebservice.inssjp.com/",
							"sendMedicamentos")),
					new javax.xml.namespace.QName(
							"http://business.mywebservice.inssjp.com/",
							"sendMedicamentos"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.inssjp.mywebservice.business.SendMedicamentosResponseDocument.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "sendMedicamentos"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "sendMedicamentos"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "sendMedicamentos"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see org.apache.axis2.axis2userguide.IWebServiceService#sendMedicamentosDHSerie
	 * @param sendMedicamentosDHSerie
	 */

	public com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument sendMedicamentosDHSerie(

			com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument sendMedicamentosDHSerie)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://business.mywebservice.inssjp.com/IWebService/sendMedicamentosDHSerie");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), sendMedicamentosDHSerie,
					optimizeContent(new javax.xml.namespace.QName(
							"http://business.mywebservice.inssjp.com/",
							"sendMedicamentosDHSerie")),
					new javax.xml.namespace.QName(
							"http://business.mywebservice.inssjp.com/",
							"sendMedicamentosDHSerie"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "sendMedicamentosDHSerie"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"sendMedicamentosDHSerie"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"sendMedicamentosDHSerie"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(
			org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
					.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// https://localhost:9050/trazamed.WebService

	private org.apache.axiom.om.OMElement toOM(
			com.inssjp.mywebservice.business.SendCancelacTransaccDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		return toOM(param);

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.inssjp.mywebservice.business.SendCancelacTransaccDocument param)
			throws org.apache.axis2.AxisFault {

		org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
		xmlOptions.setSaveNoXmlDecl();
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setSaveNamespacesFirst();
		org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory
				.createOMBuilder(new javax.xml.transform.sax.SAXSource(
						new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
								xmlOptions), new org.xml.sax.InputSource()));
		try {
			return builder.getDocumentElement(true);
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
			com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		return toOM(param);

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument param)
			throws org.apache.axis2.AxisFault {

		org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
		xmlOptions.setSaveNoXmlDecl();
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setSaveNamespacesFirst();
		org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory
				.createOMBuilder(new javax.xml.transform.sax.SAXSource(
						new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
								xmlOptions), new org.xml.sax.InputSource()));
		try {
			return builder.getDocumentElement(true);
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
			com.inssjp.mywebservice.business.SendMedicamentosDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		return toOM(param);

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.inssjp.mywebservice.business.SendMedicamentosDocument param)
			throws org.apache.axis2.AxisFault {

		org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
		xmlOptions.setSaveNoXmlDecl();
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setSaveNamespacesFirst();
		org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory
				.createOMBuilder(new javax.xml.transform.sax.SAXSource(
						new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
								xmlOptions), new org.xml.sax.InputSource()));
		try {
			return builder.getDocumentElement(true);
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
			com.inssjp.mywebservice.business.SendMedicamentosResponseDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		return toOM(param);

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.inssjp.mywebservice.business.SendMedicamentosResponseDocument param)
			throws org.apache.axis2.AxisFault {

		org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
		xmlOptions.setSaveNoXmlDecl();
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setSaveNamespacesFirst();
		org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory
				.createOMBuilder(new javax.xml.transform.sax.SAXSource(
						new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
								xmlOptions), new org.xml.sax.InputSource()));
		try {
			return builder.getDocumentElement(true);
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
			com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		return toOM(param);

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument param)
			throws org.apache.axis2.AxisFault {

		org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
		xmlOptions.setSaveNoXmlDecl();
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setSaveNamespacesFirst();
		org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory
				.createOMBuilder(new javax.xml.transform.sax.SAXSource(
						new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
								xmlOptions), new org.xml.sax.InputSource()));
		try {
			return builder.getDocumentElement(true);
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
			com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		return toOM(param);

	}

	private org.apache.axiom.om.OMElement toOM(
			final com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument param)
			throws org.apache.axis2.AxisFault {

		org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
		xmlOptions.setSaveNoXmlDecl();
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setSaveNamespacesFirst();
		org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory
				.createOMBuilder(new javax.xml.transform.sax.SAXSource(
						new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
								xmlOptions), new org.xml.sax.InputSource()));
		try {
			return builder.getDocumentElement(true);
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.inssjp.mywebservice.business.SendCancelacTransaccDocument param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		org.apache.axiom.soap.SOAPEnvelope envelope = factory
				.getDefaultEnvelope();
		if (param != null) {
			envelope.getBody().addChild(toOM(param, optimizeContent));
		}
		return envelope;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.inssjp.mywebservice.business.SendMedicamentosDocument param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		org.apache.axiom.soap.SOAPEnvelope envelope = factory
				.getDefaultEnvelope();
		if (param != null) {
			envelope.getBody().addChild(toOM(param, optimizeContent));
		}
		return envelope;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		org.apache.axiom.soap.SOAPEnvelope envelope = factory
				.getDefaultEnvelope();
		if (param != null) {
			envelope.getBody().addChild(toOM(param, optimizeContent));
		}
		return envelope;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	public org.apache.xmlbeans.XmlObject fromOM(
			org.apache.axiom.om.OMElement param, java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
		try {

			if (com.inssjp.mywebservice.business.SendCancelacTransaccDocument.class
					.equals(type)) {
				if (extraNamespaces != null) {
					return com.inssjp.mywebservice.business.SendCancelacTransaccDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching(),
									new org.apache.xmlbeans.XmlOptions()
											.setLoadAdditionalNamespaces(extraNamespaces));
				} else {
					return com.inssjp.mywebservice.business.SendCancelacTransaccDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching());
				}
			}

			if (com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument.class
					.equals(type)) {
				if (extraNamespaces != null) {
					return com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching(),
									new org.apache.xmlbeans.XmlOptions()
											.setLoadAdditionalNamespaces(extraNamespaces));
				} else {
					return com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching());
				}
			}

			if (com.inssjp.mywebservice.business.SendMedicamentosDocument.class
					.equals(type)) {
				if (extraNamespaces != null) {
					return com.inssjp.mywebservice.business.SendMedicamentosDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching(),
									new org.apache.xmlbeans.XmlOptions()
											.setLoadAdditionalNamespaces(extraNamespaces));
				} else {
					return com.inssjp.mywebservice.business.SendMedicamentosDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching());
				}
			}

			if (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument.class
					.equals(type)) {
				if (extraNamespaces != null) {
					return com.inssjp.mywebservice.business.SendMedicamentosResponseDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching(),
									new org.apache.xmlbeans.XmlOptions()
											.setLoadAdditionalNamespaces(extraNamespaces));
				} else {
					return com.inssjp.mywebservice.business.SendMedicamentosResponseDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching());
				}
			}

			if (com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument.class
					.equals(type)) {
				if (extraNamespaces != null) {
					return com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching(),
									new org.apache.xmlbeans.XmlOptions()
											.setLoadAdditionalNamespaces(extraNamespaces));
				} else {
					return com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching());
				}
			}

			if (com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument.class
					.equals(type)) {
				if (extraNamespaces != null) {
					return com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching(),
									new org.apache.xmlbeans.XmlOptions()
											.setLoadAdditionalNamespaces(extraNamespaces));
				} else {
					return com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument.Factory
							.parse(param.getXMLStreamReaderWithoutCaching());
				}
			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
