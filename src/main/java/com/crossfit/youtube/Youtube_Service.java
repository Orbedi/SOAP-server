package com.crossfit.youtube;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2019-05-22T16:22:30.329+01:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebServiceClient(name = "youtube", 
                  wsdlLocation = "src/main/resources/youtube.wsdl",
                  targetNamespace = "http://crossfit.com/youtube/") 
public class Youtube_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://crossfit.com/youtube/", "youtube");
    public final static QName YoutubeSOAP = new QName("http://crossfit.com/youtube/", "youtubeSOAP");
    static {
        URL url = Youtube_Service.class.getResource("src/main/resources/youtube.wsdl");
        if (url == null) {
            url = Youtube_Service.class.getClassLoader().getResource("src/main/resources/youtube.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(Youtube_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "src/main/resources/youtube.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public Youtube_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Youtube_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Youtube_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Youtube_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Youtube_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Youtube_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns Youtube
     */
    @WebEndpoint(name = "youtubeSOAP")
    public Youtube getYoutubeSOAP() {
        return super.getPort(YoutubeSOAP, Youtube.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Youtube
     */
    @WebEndpoint(name = "youtubeSOAP")
    public Youtube getYoutubeSOAP(WebServiceFeature... features) {
        return super.getPort(YoutubeSOAP, Youtube.class, features);
    }

}
