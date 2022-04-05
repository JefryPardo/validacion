/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.validacionrest.controller;

import co.com.tucompra.validacion.ValidarListasRestrictivas;
import co.com.tucompra.validacion.ValidarListasRestrictivasResponse;
import co.com.tucompra.validacionrest.service.impl.ValidacionServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeffr
 */
@Slf4j
@RestController
@CrossOrigin("*")
@RequestMapping("validacion")
public class validacionRestController {
    
    @Autowired
    private ValidacionServiceImpl validacionServiceImpl;
    
    @PostMapping("validarPersona")
    public ResponseEntity<ValidarListasRestrictivasResponse> validarPersona(@RequestBody ValidarListasRestrictivas lista) {
    
        System.out.println("Entro: " + lista);
        
        ValidarListasRestrictivasResponse respuesta = validacionServiceImpl.validarListasRestrictivas(lista);
        if (null == respuesta) {
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        
        System.out.println("Respuesta: "+ respuesta);
        return ResponseEntity.ok(respuesta);
    }
}