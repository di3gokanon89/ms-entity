/**
 * 
 */
package com.devpredator.msentity.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * Entity that represents a table in the database.
 * 
 * @author DevPredator
 * @since v1.0
 * @version v1.0 21/07/2021
 */
@Data
@Entity
@Table(name = "anime")
public class Anime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@NotBlank(message = "The name is required")
	@Size(min = 3, max = 30, message = "The lenght of the name is to less or to long")
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "anio")
	private int anio;
	
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;

}
