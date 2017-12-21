
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
 *         &lt;element name="get128BarcodeAsBytesReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "get128BarcodeAsBytesReturn"
})
@XmlRootElement(name = "get128BarcodeAsBytesResponse")
public class Get128BarcodeAsBytesResponse {

    @XmlElement(required = true)
    protected byte[] get128BarcodeAsBytesReturn;

    /**
     * Gets the value of the get128BarcodeAsBytesReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGet128BarcodeAsBytesReturn() {
        return get128BarcodeAsBytesReturn;
    }

    /**
     * Sets the value of the get128BarcodeAsBytesReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGet128BarcodeAsBytesReturn(byte[] value) {
        this.get128BarcodeAsBytesReturn = value;
    }

}
