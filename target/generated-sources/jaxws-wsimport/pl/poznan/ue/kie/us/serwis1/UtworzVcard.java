
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
 *         &lt;element name="o" type="{http://serwis1.us.kie.ue.poznan.pl}Osoba"/>
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
    "o"
})
@XmlRootElement(name = "utworzVcard")
public class UtworzVcard {

    @XmlElement(required = true)
    protected Osoba o;

    /**
     * Gets the value of the o property.
     * 
     * @return
     *     possible object is
     *     {@link Osoba }
     *     
     */
    public Osoba getO() {
        return o;
    }

    /**
     * Sets the value of the o property.
     * 
     * @param value
     *     allowed object is
     *     {@link Osoba }
     *     
     */
    public void setO(Osoba value) {
        this.o = value;
    }

}
