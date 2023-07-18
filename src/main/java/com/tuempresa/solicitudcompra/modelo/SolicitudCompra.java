package com.tuempresa.solicitudcompra.modelo;

import java.math.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


enum Prioridad {
    ALTO("Alto"),
    MEDIO("Medio"),
    BAJO("Bajo");

    private final String nombre;

    private Prioridad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


@Entity
@Getter
@Setter
public class SolicitudCompra extends Identificador {
	
	
    String numeroRFC;
	
	
	@ManyToOne
	Solicitante solicitante;
	
	
	String departamento;
	
	
	@ManyToOne
	Aprobador aprobador;
	
	@Money
	BigDecimal presupuesto;
	
	@TextArea
    String justificacion;
	
	Prioridad prioridad;
	
	@ElementCollection
    @ListProperties("requisito.oid,requisito.descripcion, cantidad,importe")
    Collection<Detalle> detalles;
    
	@ReadOnly
    @Stereotype("DINERO")
    @Calculation("sum(detalles.importe)")    
    BigDecimal importeTotal;  
}
