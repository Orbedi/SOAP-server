
package com.crossfit.youtube;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.crossfit.youtube package. 
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

    private final static QName _InvalidURL_QNAME = new QName("http://crossfit.com/youtube/", "invalidURL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.crossfit.youtube
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeVideo }
     * 
     */
    public ChangeVideo createChangeVideo() {
        return new ChangeVideo();
    }

    /**
     * Create an instance of {@link ChangeVideoResponse }
     * 
     */
    public ChangeVideoResponse createChangeVideoResponse() {
        return new ChangeVideoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://crossfit.com/youtube/", name = "invalidURL")
    public JAXBElement<String> createInvalidURL(String value) {
        return new JAXBElement<String>(_InvalidURL_QNAME, String.class, null, value);
    }

}
