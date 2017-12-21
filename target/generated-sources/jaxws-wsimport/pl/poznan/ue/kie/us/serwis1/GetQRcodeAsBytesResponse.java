
package pl.poznan.ue.kie.us.serwis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getQRcodeAsBytesReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getQRcodeAsBytesReturn"
})
@XmlRootElement(name = "getQRcodeAsBytesResponse")
public class GetQRcodeAsBytesResponse {

    @XmlElement(required = true)
    protected byte[] getQRcodeAsBytesReturn;

    /**
     * Gets the value of the getQRcodeAsBytesReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetQRcodeAsBytesReturn() {
        return getQRcodeAsBytesReturn;
    }

    /**
     * Sets the value of the getQRcodeAsBytesReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetQRcodeAsBytesReturn(byte[] value) {
        this.getQRcodeAsBytesReturn = value;
    }

}
