package com.tuempresa.solicitudcompra.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Detalle {
	
	 int cantidad;
	 
	 @ManyToOne(fetch = FetchType.LAZY, optional = true)
	 Requisito requisito;
	    
	    
	    @Stereotype("DINERO")
	    @Depends("requisito.oid, cantidad") 
	    public BigDecimal getImporte() { 
	        if (requisito == null || requisito.precio == null) return BigDecimal.ZERO;
	        return new BigDecimal(cantidad).multiply(requisito.precio);
	    }
	 
	
	
}
