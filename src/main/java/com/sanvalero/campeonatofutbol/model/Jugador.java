package com.sanvalero.campeonatofutbol.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jugador{
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String direccion;
	private int telefono;
	
	private List<DetalleJugador> detalles;

	public Jugador(String nombre, String apellidos, LocalDate fechaNacimiento, String direccion, int telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;

		detalles = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public List<DetalleJugador> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleJugador> detalles) {
		this.detalles = detalles;
	}

	public void anadirDetalle(int goles, int tarjetaAmarilla, int tarjetaRoja) {
		DetalleJugador detalle = new DetalleJugador(goles, tarjetaAmarilla, tarjetaRoja);
		detalles.add(detalle);
	}
		
}
