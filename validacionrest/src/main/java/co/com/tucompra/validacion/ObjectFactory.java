//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.05 a las 07:56:09 AM COT 
//


package co.com.tucompra.validacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.tucompra.validacion package. 
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

    private final static QName _ValidarListasRestrictivas_QNAME = new QName("http://validacion.tucompra.com.co/", "validarListasRestrictivas");
    private final static QName _ValidarListasRestrictivasResponse_QNAME = new QName("http://validacion.tucompra.com.co/", "validarListasRestrictivasResponse");
    private final static QName _Exception_QNAME = new QName("http://validacion.tucompra.com.co/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.tucompra.validacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarListasRestrictivas }
     * 
     */
    public ValidarListasRestrictivas createValidarListasRestrictivas() {
        return new ValidarListasRestrictivas();
    }

    /**
     * Create an instance of {@link ValidarListasRestrictivasResponse }
     * 
     */
    public ValidarListasRestrictivasResponse createValidarListasRestrictivasResponse() {
        return new ValidarListasRestrictivasResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ListaRestrictivas }
     * 
     */
    public ListaRestrictivas createListaRestrictivas() {
        return new ListaRestrictivas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarListasRestrictivas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validacion.tucompra.com.co/", name = "validarListasRestrictivas")
    public JAXBElement<ValidarListasRestrictivas> createValidarListasRestrictivas(ValidarListasRestrictivas value) {
        return new JAXBElement<ValidarListasRestrictivas>(_ValidarListasRestrictivas_QNAME, ValidarListasRestrictivas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarListasRestrictivasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validacion.tucompra.com.co/", name = "validarListasRestrictivasResponse")
    public JAXBElement<ValidarListasRestrictivasResponse> createValidarListasRestrictivasResponse(ValidarListasRestrictivasResponse value) {
        return new JAXBElement<ValidarListasRestrictivasResponse>(_ValidarListasRestrictivasResponse_QNAME, ValidarListasRestrictivasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validacion.tucompra.com.co/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
