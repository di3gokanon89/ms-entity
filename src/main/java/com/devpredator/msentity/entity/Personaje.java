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

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DevPredator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personaje")
public class Personaje {

	@ApiModelProperty(value = "The id of the personaje (Autoincrement)", name = "id", required = true, example = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ApiModelProperty(value = "The name of the personaje", name = "nombre", required = true, example = "Goku")
	@NotNull
	@NotEmpty(message = "The name is required")
	private String nombre;

	@ApiModelProperty(value = "The object anime", name = "anime", required = true, example = "Dragon Ball Z")
	@NotNull
	@ManyToOne
	@JoinColumn(name = "anime_id")
	private Anime anime;
}
