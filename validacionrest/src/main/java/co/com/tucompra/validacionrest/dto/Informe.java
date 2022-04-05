/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.validacionrest.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author jeffr
 */
@Data
@XmlRootElement(name = "informe" )
public class Informe {
    
    @XmlElement(name = "version")
    private String version;
    
    @XmlElement(name = "fechaConsulta")
    private String fechaConsulta;
    
    @XmlElement(name = "respuesta")
    private String respuesta;
    
    @XmlElement(name = "esIndependiente")
    private boolean esIndependiente;
    
    @XmlElement(name = "NaturalNacional")
    private NaturalNacional naturalNacional;
    
    @XmlElement(name = "Alerta")
    private List<Alerta> alerta;
    
    @Data
    public static class NaturalNacional {
        
        private String nombres;
        private String primerApellido;
        private String segundoApellido;
        private String nombreCompleto;
        private Integer genero;
        private boolean validada;
        
        private Identificacion identificacion;
        private Edad edad;
        
        @Data
        public static class Identificacion {
        
            private String estado;
            private String fechaExpedicion;
            private String ciudad;
            private String departamento;
            private Integer numero;
        }
        
        @Data
        public static class Edad {
        
            private Integer min;
            private Integer max;
        }
    }
    
    @Data
    public static class Alerta {
        
        private String colocacion;
        private String vencimiento;
        private String modificacion;
        private Integer codigo;
        private String texto;
        
        @Data
        public static class Fuente {
        
            private Integer codigo;
            private String nombre;
        }
    }
}