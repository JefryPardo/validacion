/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.validacionrest.service.impl;

import co.com.tucompra.validacion.ValidarListasRestrictivas;
import co.com.tucompra.validacion.ValidarListasRestrictivasResponse;
import co.com.tucompra.validacionrest.dto.Informe;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 *
 * @author jeffr
 */

@Slf4j
public class ValidacionServiceImpl extends WebServiceGatewaySupport {
    
    public Object callWebService(Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(request);
    }
    
    public Informe validarListasRestrictivas( ValidarListasRestrictivas validacion) {
    
        try {
            
//            Object obj = callWebService(validacion);
//            JAXBElement<ValidarListasRestrictivasResponse> alfo = (JAXBElement) obj;
//            ValidarListasRestrictivasResponse response = (ValidarListasRestrictivasResponse) alfo.getValue();
//            return response;

            Object obj = callWebService(validacion);

            ValidarListasRestrictivasResponse response = (ValidarListasRestrictivasResponse) obj;

            JAXBContext contextSession = JAXBContext.newInstance(Informe.class);
            Unmarshaller unSession = contextSession.createUnmarshaller();
            StringReader readerResultado = new StringReader(response.getReturn());

            Object unmarshal = unSession.unmarshal(readerResultado);

            log.info("unmarshal: [{}]", unmarshal);
            Informe respInforme = (Informe) unmarshal;

            log.info("respValidacion:[{}]", respInforme);

            return respInforme;

        } catch (Exception e) {
            
            log.error("validarPersona: Error: [{}]", e);
            return null;
//            throw new TuCompraException("Error cerrar sesion en security.");
        }
    }
}
