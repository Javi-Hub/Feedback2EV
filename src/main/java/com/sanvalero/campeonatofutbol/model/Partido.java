package com.sanvalero.campeonatofutbol.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partido {
		
		private LocalDate fechaPartido;
		private int numeroPartido;
		private String nombreEquipo1;
		private String nombreEquipo2;
		private String arbitroAsignado;
		private String campo;
		private String incidencia;
		private int resultado;
		
		private List<DetallePartido> detalles;
		
		
		public Partido(LocalDate fechaPartido, int numeroPartido, String nombreEquipo1, String nombreEquipo2,
				String arbitroAsignado, String campo, String incidencia, int resultado) {
			super();
			this.fechaPartido = fechaPartido;
			this.numeroPartido = numeroPartido;
			this.nombreEquipo1 = nombreEquipo1;
			this.nombreEquipo2 = nombreEquipo2;
			this.arbitroAsignado = arbitroAsignado;
			this.campo = campo;
		
			
			detalles = new ArrayList<>();
		}

		public LocalDate getFechaPartido() {
			return fechaPartido;
		}

		public void setFechaPartido(LocalDate fechaPartido) {
			this.fechaPartido = fechaPartido;
		}

		public int getNumeroPartido() {
			return numeroPartido;
		}

		public void setNumeroPartido(int numeroPartido) {
			this.numeroPartido = numeroPartido;
		}

		public String getNombreEquipo1() {
			return nombreEquipo1;
		}

		public void setNombreEquipo1(String nombreEquipo1) {
			this.nombreEquipo1 = nombreEquipo1;
		}

		public String getNombreEquipo2() {
			return nombreEquipo2;
		}

		public void setNombreEquipo2(String nombreEquipo2) {
			this.nombreEquipo2 = nombreEquipo2;
		}

		public String getArbitroAsignado() {
			return arbitroAsignado;
		}

		public void setArbitroAsignado(String arbitroAsignado) {
			this.arbitroAsignado = arbitroAsignado;
		}

		public String getCampo() {
			return campo;
		}

		public void setCampo(String campo) {
			this.campo = campo;
		}

		public String getIncidencia() {
			return incidencia;
		}

		public void setIncidencia(String incidencia) {
			this.incidencia = incidencia;
		}

		public int getResultado() {
			return resultado;
		}

		public void setResultado(int resultado) {
			this.resultado = resultado;
		}
		
		
		
}
