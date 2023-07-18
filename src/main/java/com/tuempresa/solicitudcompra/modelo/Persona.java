package com.tuempresa.solicitudcompra.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@MappedSuperclass
@Getter @Setter
public class Persona extends Identificador{

	 @Column(length=50) @Required
	    String nombre;
	 
	 @Column(length=50) @Required
	    String cargo;
	    
	    
	
}
