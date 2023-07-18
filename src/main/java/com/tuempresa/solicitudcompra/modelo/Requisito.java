package com.tuempresa.solicitudcompra.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Requisito extends Identificador{

	
	
	@Column(length=50) 
	String descripcion;
	
	@Column(length=9)
	int cantidad;
	
	@Money
	BigDecimal precio;
	
}
