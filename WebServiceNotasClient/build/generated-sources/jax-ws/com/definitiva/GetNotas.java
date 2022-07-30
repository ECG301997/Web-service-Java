
package com.definitiva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getNotas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getNotas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nota1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nota2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nota3" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNotas", propOrder = {
    "nota1",
    "nota2",
    "nota3"
})
public class GetNotas {

    protected double nota1;
    protected double nota2;
    protected double nota3;

    /**
     * Obtiene el valor de la propiedad nota1.
     * 
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Define el valor de la propiedad nota1.
     * 
     */
    public void setNota1(double value) {
        this.nota1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota2.
     * 
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Define el valor de la propiedad nota2.
     * 
     */
    public void setNota2(double value) {
        this.nota2 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota3.
     * 
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Define el valor de la propiedad nota3.
     * 
     */
    public void setNota3(double value) {
        this.nota3 = value;
    }

}
