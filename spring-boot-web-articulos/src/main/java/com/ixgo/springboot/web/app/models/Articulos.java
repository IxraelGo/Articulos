package com.ixgo.springboot.web.app.models;

public class Articulos {
	
	private String descripcion;
	private float precio;
	private String marca;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public Articulos(String descripcion, float precio, String marca, int cantidad, String proveedor) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
		this.cantidad = cantidad;
		this.proveedor = proveedor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	private int cantidad;
	private String proveedor;

}
