package com.tuempresa.solicitudcompra.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Solicitante extends Persona{
	
	 @Column(length=10) @Required
	    String telefono;
}
