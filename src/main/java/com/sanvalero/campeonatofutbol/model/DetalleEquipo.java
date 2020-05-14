package com.sanvalero.campeonatofutbol.model;

public class DetalleEquipo {
	private int puntos;
	private int partidosJugados;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	private int posicionTabla;
	
	DetalleEquipo detalleEquipo;

	public DetalleEquipo(int puntos, int partidosJugados, int partidosGanados, int partidosPerdidos,
			int partidosEmpatados, int posicionTabla, DetalleEquipo detalleEquipo) {
		super();
		this.puntos = puntos;
		this.partidosJugados = partidosJugados;
		this.partidosGanados = partidosGanados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
		this.posicionTabla = posicionTabla;
		this.detalleEquipo = detalleEquipo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	public int getPosicionTabla() {
		return posicionTabla;
	}

	public void setPosicionTabla(int posicionTabla) {
		this.posicionTabla = posicionTabla;
	}

	public DetalleEquipo getDetalleEquipo() {
		return detalleEquipo;
	}

	public void setDetalleEquipo(DetalleEquipo detalleEquipo) {
		this.detalleEquipo = detalleEquipo;
	}
	
}
