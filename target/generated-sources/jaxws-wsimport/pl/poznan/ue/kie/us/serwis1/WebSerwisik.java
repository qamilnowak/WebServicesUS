
package pl.poznan.ue.kie.us.serwis1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebSerwisik", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebSerwisik {


    /**
     * 
     * @param o
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "utworzVcardReturn", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
    @RequestWrapper(localName = "utworzVcard", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.UtworzVcard")
    @ResponseWrapper(localName = "utworzVcardResponse", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.UtworzVcardResponse")
    public String utworzVcard(
        @WebParam(name = "o", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
        Osoba o);

    /**
     * 
     * @param szerokosc
     * @param wysokosc
     * @param napis
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(name = "getQRcodeAsBytesReturn", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
    @RequestWrapper(localName = "getQRcodeAsBytes", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.GetQRcodeAsBytes")
    @ResponseWrapper(localName = "getQRcodeAsBytesResponse", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.GetQRcodeAsBytesResponse")
    public byte[] getQRcodeAsBytes(
        @WebParam(name = "napis", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
        String napis,
        @WebParam(name = "wysokosc", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
        int wysokosc,
        @WebParam(name = "szerokosc", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
        int szerokosc);

    /**
     * 
     * @param input
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "helloNameReturn", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
    @RequestWrapper(localName = "helloName", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.HelloName")
    @ResponseWrapper(localName = "helloNameResponse", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.HelloNameResponse")
    public String helloName(
        @WebParam(name = "input", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
        String input);

    /**
     * 
     * @param rozdzielczosc
     * @param napis
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(name = "get128BarcodeAsBytesReturn", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
    @RequestWrapper(localName = "get128BarcodeAsBytes", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.Get128BarcodeAsBytes")
    @ResponseWrapper(localName = "get128BarcodeAsBytesResponse", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl", className = "pl.poznan.ue.kie.us.serwis1.Get128BarcodeAsBytesResponse")
    public byte[] get128BarcodeAsBytes(
        @WebParam(name = "napis", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
        String napis,
        @WebParam(name = "rozdzielczosc", targetNamespace = "http://serwis1.us.kie.ue.poznan.pl")
        int rozdzielczosc);

}
