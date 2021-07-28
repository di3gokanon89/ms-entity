/**
 * 
 */
package com.devpredator.msentity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author DevPredator
 *
 */
@Data
@Entity
@Table(name = "personaje")
public class Personaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@NotEmpty(message = "The name is required")
	private String nombre;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "anime_id")
	private Anime anime;
}
