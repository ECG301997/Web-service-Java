
package com.definitiva;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.definitiva package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetNotas_QNAME = new QName("http://Definitiva.com/", "getNotas");
    private final static QName _GetNotasResponse_QNAME = new QName("http://Definitiva.com/", "getNotasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.definitiva
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNotas }
     * 
     */
    public GetNotas createGetNotas() {
        return new GetNotas();
    }

    /**
     * Create an instance of {@link GetNotasResponse }
     * 
     */
    public GetNotasResponse createGetNotasResponse() {
        return new GetNotasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNotas }{@code >}
     */
    @XmlElementDecl(namespace = "http://Definitiva.com/", name = "getNotas")
    public JAXBElement<GetNotas> createGetNotas(GetNotas value) {
        return new JAXBElement<GetNotas>(_GetNotas_QNAME, GetNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNotasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Definitiva.com/", name = "getNotasResponse")
    public JAXBElement<GetNotasResponse> createGetNotasResponse(GetNotasResponse value) {
        return new JAXBElement<GetNotasResponse>(_GetNotasResponse_QNAME, GetNotasResponse.class, null, value);
    }

}
