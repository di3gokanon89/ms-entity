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

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity that represents a table in the database.
 * 
 * @author DevPredator
 * @since v1.0
 * @version v1.0 21/07/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "anime")
public class Anime {

	@ApiModelProperty(value = "The id of the anime (Autoincrement)", name = "id", required = true, example = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ApiModelProperty(value = "The name of the anime", name = "nombre", required = true, example = "Dragon Ball Z")
	@NotNull
	@NotBlank(message = "The name is required")
	@Size(min = 3, max = 30, message = "The lenght of the name is to less or to long")
	@Column(name = "nombre")
	private String nombre;
	
	@ApiModelProperty(value = "The year of the anime", name = "anio", example = "2021, Format: yyyy")
	@Column(name = "anio")
	private int anio;
	
	@ApiModelProperty(value = "The date of the anime", name = "fechaCreacion", example = "2021-06-02'T'00:00:00")
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;

}
