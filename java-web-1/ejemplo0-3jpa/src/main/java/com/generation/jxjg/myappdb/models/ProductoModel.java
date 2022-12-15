package com.generation.jxjg.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

	private Long id;
	private String nombreProducto;
	
	
	/*------RELACIONES-----------------*/
	@ManyToOne // muchos productos con un usuario
	private UsuarioModel usuario;
	/*--------------------------------*/
	// La relacion de visibilidad no existe con detalle
	//en donde no es necesario ver al detalle orden desde producto 
	//pero al contrario si debe existir la visibilidad
	
	public ProductoModel() {
		
	}
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	public ProductoModel(Long id, String nombreProducto) {
		this.id = id;
		this.nombreProducto = nombreProducto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
}
