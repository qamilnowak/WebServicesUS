
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
 *         &lt;element name="napis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wysokosc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="szerokosc" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "napis",
    "wysokosc",
    "szerokosc"
})
@XmlRootElement(name = "getQRcodeAsBytes")
public class GetQRcodeAsBytes {

    @XmlElement(required = true)
    protected String napis;
    protected int wysokosc;
    protected int szerokosc;

    /**
     * Gets the value of the napis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNapis() {
        return napis;
    }

    /**
     * Sets the value of the napis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNapis(String value) {
        this.napis = value;
    }

    /**
     * Gets the value of the wysokosc property.
     * 
     */
    public int getWysokosc() {
        return wysokosc;
    }

    /**
     * Sets the value of the wysokosc property.
     * 
     */
    public void setWysokosc(int value) {
        this.wysokosc = value;
    }

    /**
     * Gets the value of the szerokosc property.
     * 
     */
    public int getSzerokosc() {
        return szerokosc;
    }

    /**
     * Sets the value of the szerokosc property.
     * 
     */
    public void setSzerokosc(int value) {
        this.szerokosc = value;
    }

}
