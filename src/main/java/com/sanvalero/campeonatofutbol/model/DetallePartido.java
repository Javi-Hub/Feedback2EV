package com.sanvalero.campeonatofutbol.model;


public class DetallePartido {
	private String incidencia;
	private int golesEquipo1;
	private int golesEquipo2;
	private int golesTotal = golesEquipo1 + golesEquipo2;
	
	public DetallePartido(String incidencia, int golesEquipo1, int golesEquipo2, int golesTotal) {
		super();
		this.incidencia = incidencia;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		this.golesTotal = golesTotal;
	}
	

	public String getIncidencia() {
		return incidencia;
	}


	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}


	public int getGolesEquipo1() {
		return golesEquipo1;
	}


	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}


	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
	public int golesTotal() {
		return golesTotal;
	}

	public void resultado(int golesTotal) {
		this.golesTotal = golesTotal;
	}
	
	public static int sumarGoles(int golesEquipo1, int golesEquipo2) {
		int total = golesEquipo1 + golesEquipo2;
		return total;
	}
}
