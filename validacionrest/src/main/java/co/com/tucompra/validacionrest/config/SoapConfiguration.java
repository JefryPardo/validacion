package co.com.tucompra.validacionrest.config;

import co.com.tucompra.validacionrest.service.impl.ValidacionServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapConfiguration {
    
    @Value("${url.validacion}")
    private String ENDPOINTVALIDACION;
   
    @Bean(name="validacion")
    public Jaxb2Marshaller marshallerAntifraude() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("co.com.tucompra.validacion");
        return marshaller;
    }
    
    @Bean(name = "validacionSOAP")
    public ValidacionServiceImpl validacionSoapClient(@Qualifier("validacion") Jaxb2Marshaller marshallerAntifraude) {
        ValidacionServiceImpl client = new ValidacionServiceImpl();
        client.setDefaultUri(ENDPOINTVALIDACION);
        client.setMarshaller(marshallerAntifraude);
        client.setUnmarshaller(marshallerAntifraude);
        client.setMessageSender(webServiceMessageSender());
        return client;
    }
    
    @Bean
    public WebServiceMessageSender webServiceMessageSender() {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        // timeout for creating a connection
        httpComponentsMessageSender.setConnectionTimeout(10000);
        // when you have a connection, timeout the read blocks for
        httpComponentsMessageSender.setReadTimeout(10000);

        return httpComponentsMessageSender;
    }    
}