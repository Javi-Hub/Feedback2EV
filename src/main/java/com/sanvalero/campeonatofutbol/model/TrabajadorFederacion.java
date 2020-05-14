package com.sanvalero.campeonatofutbol.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrabajadorFederacion{
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String direccion;
	private int telefono;
	private List<Jugador> jugadores;
	private List<Equipo> equipos;
	
	public TrabajadorFederacion(String nombre, String apellidos, LocalDate fechaNacimiento, String direccion,
			int telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		jugadores = new ArrayList<>();
		equipos = new ArrayList<>();
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
	
	public void anadirJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void eliminarJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}
	
	public void anadirEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}

}

