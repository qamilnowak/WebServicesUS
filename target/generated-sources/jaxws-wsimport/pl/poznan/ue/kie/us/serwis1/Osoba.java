
package pl.poznan.ue.kie.us.serwis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Osoba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Osoba">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nazwisko" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrTelefonu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrIndeksu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Osoba", propOrder = {
    "nazwisko",
    "imie",
    "nrTelefonu",
    "email",
    "nrIndeksu"
})
public class Osoba {

    @XmlElement(required = true, nillable = true)
    protected String nazwisko;
    @XmlElement(required = true, nillable = true)
    protected String imie;
    @XmlElement(required = true, nillable = true)
    protected String nrTelefonu;
    @XmlElement(required = true, nillable = true)
    protected String email;
    protected int nrIndeksu;

    /**
     * Gets the value of the nazwisko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Sets the value of the nazwisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwisko(String value) {
        this.nazwisko = value;
    }

    /**
     * Gets the value of the imie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImie() {
        return imie;
    }

    /**
     * Sets the value of the imie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImie(String value) {
        this.imie = value;
    }

    /**
     * Gets the value of the nrTelefonu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrTelefonu() {
        return nrTelefonu;
    }

    /**
     * Sets the value of the nrTelefonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrTelefonu(String value) {
        this.nrTelefonu = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the nrIndeksu property.
     * 
     */
    public int getNrIndeksu() {
        return nrIndeksu;
    }

    /**
     * Sets the value of the nrIndeksu property.
     * 
     */
    public void setNrIndeksu(int value) {
        this.nrIndeksu = value;
    }

}
