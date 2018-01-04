
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GeoIPServiceHttpGet", targetNamespace = "http://www.webservicex.net/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GeoIPServiceHttpGet {


    /**
     * GeoIPService - GetGeoIP enables you to easily look up countries by IP addresses
     * 
     * @param ipAddress
     * @return
     *     returns net.webservicex.GeoIP
     */
    @WebMethod(operationName = "GetGeoIP")
    @WebResult(name = "GeoIP", targetNamespace = "http://www.webservicex.net/", partName = "Body")
    public GeoIP getGeoIP(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "IPAddress")
        String ipAddress);

    /**
     * GeoIPService - GetGeoIPContext enables you to easily look up countries by Context
     * 
     * @return
     *     returns net.webservicex.GeoIP
     */
    @WebMethod(operationName = "GetGeoIPContext")
    @WebResult(name = "GeoIP", targetNamespace = "http://www.webservicex.net/", partName = "Body")
    public GeoIP getGeoIPContext();

}
