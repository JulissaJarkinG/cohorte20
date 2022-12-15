package com.generation.jxjg.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleOrden")
public class DetalleOrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	/*-----------------------------*/
	private String nombreDetalleOrden;
		/*---------------Relacion-------------*/
	@OneToOne
	private OrdenModel orden;
	@OneToOne //un detalle un producto
	private ProductoModel producto;
		public DetalleOrdenModel() {
			
		}
		public DetalleOrdenModel(Long id, String nombreDetalleOrden, OrdenModel orden) {
		
			this.id = id;
			this.nombreDetalleOrden = nombreDetalleOrden;
			this.orden = orden;
		}
		public ProductoModel getProducto() {
			return producto;
		}
		public void setProducto(ProductoModel producto) {
			this.producto = producto;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombreDetalleOrden() {
			return nombreDetalleOrden;
		}
		public void setNombreDetalleOrden(String nombreDetalleOrden) {
			this.nombreDetalleOrden = nombreDetalleOrden;
		}
		public OrdenModel getOrden() {
			return orden;
		}
		public void setOrden(OrdenModel orden) {
			this.orden = orden;
		}
	

}
