package com.sanvalero.campeonatofutbol.model;

public class DetalleJugador {
	private int goles;
	private int tarjetaAmarilla;
	private int tarjetaRoja;


	public DetalleJugador(int goles, int tarjetaAmarilla, int tarjetaRoja) {
		super();
		this.goles = goles;
		this.tarjetaAmarilla = tarjetaAmarilla;
		this.tarjetaRoja = tarjetaRoja;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getTarjetaAmarilla() {
		return tarjetaAmarilla;
	}

	public void setTarjetaAmarilla(int tarjetaAmarilla) {
		this.tarjetaAmarilla = tarjetaAmarilla;
	}

	public int getTarjetaRoja() {
		return tarjetaRoja;
	}

	public void setTarjetaRoja(int tarjetaRoja) {
		this.tarjetaRoja = tarjetaRoja;
	}
	
	public boolean revisarDetalleJugador(int goles, int tarjetaAmarilla, int tarjetaRoja) {
		
		if ( goles >= 0 && tarjetaAmarilla >= 0 && tarjetaRoja >= 0) {
			return true;
		}
		else {
			return false;
		}

	}
}
