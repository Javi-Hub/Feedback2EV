package com.sanvalero.campeonatofutbol.model;

import java.time.LocalDate;

public class Mensaje {
	
	private LocalDate fecha;
	private String mensaje;
	private boolean recibido;
	private String emisor;
	private String receptor;
	
	
	public Mensaje(LocalDate fecha, String mensaje, boolean recibido, String emisor, String receptor) {
		super();
		this.fecha = fecha;
		this.mensaje = mensaje;
		this.recibido = recibido;
		this.emisor = emisor;
		this.receptor = receptor;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public boolean isRecibido() {
		return recibido;
	}


	public void setRecibido(boolean recibido) {
		this.recibido = recibido;
	}


	public String getEmisor() {
		return emisor;
	}


	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}


	public String getReceptor() {
		return receptor;
	}


	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}
	
	
	
	
	

}
