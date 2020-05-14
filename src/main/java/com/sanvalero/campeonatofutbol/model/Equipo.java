package com.sanvalero.campeonatofutbol.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
		private String nombreEquipo;
		private LocalDate fechaAlta;
		private String patrocinador;
		private String colorCamiseta1;
		private String colorCamiseta2;
		private String categoria;
		
		private Equipo equipo;
		
		private List<DetalleEquipo> detallesEquipo;

		public Equipo(String nombreEquipo, LocalDate fechaAlta, String patrocinador, String colorCamiseta1,
				String colorCamiseta2, String categoria, Equipo equipo) {
			super();
			this.nombreEquipo = nombreEquipo;
			this.fechaAlta = fechaAlta;
			this.patrocinador = patrocinador;
			this.colorCamiseta1 = colorCamiseta1;
			this.colorCamiseta2 = colorCamiseta2;
			this.categoria = categoria;
			this.equipo = equipo;
			detallesEquipo = new ArrayList<>();
		}

		public String getNombreEquipo() {
			return nombreEquipo;
		}

		public void setNombreEquipo(String nombreEquipo) {
			this.nombreEquipo = nombreEquipo;
		}

		public LocalDate getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(LocalDate fechaAlta) {
			this.fechaAlta = fechaAlta;
		}

		public String getPatrocinador() {
			return patrocinador;
		}

		public void setPatrocinador(String patrocinador) {
			this.patrocinador = patrocinador;
		}

		public String getColorCamiseta1() {
			return colorCamiseta1;
		}

		public void setColorCamiseta1(String colorCamiseta1) {
			this.colorCamiseta1 = colorCamiseta1;
		}

		public String getColorCamiseta2() {
			return colorCamiseta2;
		}

		public void setColorCamiseta2(String colorCamiseta2) {
			this.colorCamiseta2 = colorCamiseta2;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public Equipo getEquipo() {
			return equipo;
		}

		public void setEquipo(Equipo equipo) {
			this.equipo = equipo;
		}
		
		public void anadirDetallesEquipo(DetalleEquipo detalleEquipo) {
			detallesEquipo.add(detalleEquipo);
		}
		
		public void eliminarDetallesEquipo(DetalleEquipo detalleEquipo) {
			detallesEquipo.remove(detalleEquipo);
		}
	
}
