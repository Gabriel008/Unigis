
package com.micrologica.UnigisProduccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dominio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Altitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Velocidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FechaHoraEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaHoraRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "systemUser",
    "password",
    "dominio",
    "nroSerie",
    "codigo",
    "latitud",
    "longitud",
    "altitud",
    "velocidad",
    "fechaHoraEvento",
    "fechaHoraRecepcion"
})
@XmlRootElement(name = "LoginYInsertarEvento")
public class LoginYInsertarEvento {

    @XmlElement(name = "SystemUser")
    protected String systemUser;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Dominio")
    protected String dominio;
    @XmlElement(name = "NroSerie")
    protected String nroSerie;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Latitud")
    protected double latitud;
    @XmlElement(name = "Longitud")
    protected double longitud;
    @XmlElement(name = "Altitud")
    protected double altitud;
    @XmlElement(name = "Velocidad")
    protected double velocidad;
    @XmlElement(name = "FechaHoraEvento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraEvento;
    @XmlElement(name = "FechaHoraRecepcion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraRecepcion;

    /**
     * Obtiene el valor de la propiedad systemUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUser() {
        return systemUser;
    }

    /**
     * Define el valor de la propiedad systemUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUser(String value) {
        this.systemUser = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad dominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDominio() {
        return dominio;
    }

    /**
     * Define el valor de la propiedad dominio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDominio(String value) {
        this.dominio = value;
    }

    /**
     * Obtiene el valor de la propiedad nroSerie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSerie() {
        return nroSerie;
    }

    /**
     * Define el valor de la propiedad nroSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSerie(String value) {
        this.nroSerie = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     */
    public void setLatitud(double value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     */
    public void setLongitud(double value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad altitud.
     * 
     */
    public double getAltitud() {
        return altitud;
    }

    /**
     * Define el valor de la propiedad altitud.
     * 
     */
    public void setAltitud(double value) {
        this.altitud = value;
    }

    /**
     * Obtiene el valor de la propiedad velocidad.
     * 
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * Define el valor de la propiedad velocidad.
     * 
     */
    public void setVelocidad(double value) {
        this.velocidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraEvento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraEvento() {
        return fechaHoraEvento;
    }

    /**
     * Define el valor de la propiedad fechaHoraEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraEvento(XMLGregorianCalendar value) {
        this.fechaHoraEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraRecepcion() {
        return fechaHoraRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaHoraRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraRecepcion(XMLGregorianCalendar value) {
        this.fechaHoraRecepcion = value;
    }

}
