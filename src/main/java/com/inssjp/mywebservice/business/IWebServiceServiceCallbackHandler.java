
/**
 * IWebServiceServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.inssjp.mywebservice.business;

    /**
     *  IWebServiceServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class IWebServiceServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public IWebServiceServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public IWebServiceServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sendCancelacTransacc method
            * override this method for handling normal response from sendCancelacTransacc operation
            */
           public void receiveResultsendCancelacTransacc(
                    com.inssjp.mywebservice.business.IWebServiceServiceStub.SendCancelacTransaccResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sendCancelacTransacc operation
           */
            public void receiveErrorsendCancelacTransacc(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sendMedicamentos method
            * override this method for handling normal response from sendMedicamentos operation
            */
           public void receiveResultsendMedicamentos(
                    com.inssjp.mywebservice.business.IWebServiceServiceStub.SendMedicamentosResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sendMedicamentos operation
           */
            public void receiveErrorsendMedicamentos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sendMedicamentosDHSerie method
            * override this method for handling normal response from sendMedicamentosDHSerie operation
            */
           public void receiveResultsendMedicamentosDHSerie(
                    com.inssjp.mywebservice.business.IWebServiceServiceStub.SendMedicamentosDHSerieResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sendMedicamentosDHSerie operation
           */
            public void receiveErrorsendMedicamentosDHSerie(java.lang.Exception e) {
            }
                


    }
    