/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.validacionrest.service.impl;

import co.com.tucompra.validacion.ValidarListasRestrictivas;
import co.com.tucompra.validacion.ValidarListasRestrictivasResponse;
import javax.xml.bind.JAXBElement;
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
    
    public ValidarListasRestrictivasResponse validarListasRestrictivas( ValidarListasRestrictivas validacion) {
    
        try {
            
            Object obj = callWebService(validacion);
            JAXBElement<ValidarListasRestrictivasResponse> alfo = (JAXBElement) obj;
            ValidarListasRestrictivasResponse response = (ValidarListasRestrictivasResponse) alfo.getValue();
            return response;
        } catch (Exception e) {
            
            log.error("validarPersona: Error: [{}]", e);
            return null;
//            throw new TuCompraException("Error cerrar sesion en security.");
        }
    }
}
