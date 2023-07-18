package com.tuempresa.solicitudcompra.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Aprobador extends Persona{
	
	 @Column(length=50) @Required
	    String email;
}
