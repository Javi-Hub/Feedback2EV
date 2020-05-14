package com.savalero.campeonatofutbol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.campeonatofutbol.model.DetalleJugador;
import com.sanvalero.campeonatofutbol.model.DetallePartido;
import com.sanvalero.campeonatofutbol.model.Jugador;
import com.sanvalero.campeonatofutbol.model.Partido;

public class CampeonatoTest {
	
	private static Jugador jugador;
	
	@BeforeAll
	public static void setupAll() {
		jugador = new Jugador(null, null, null, null, 0);
	}
	
	@Test
	public void revisarDetalleJugadorTest() {
		DetalleJugador validarDetalle = new DetalleJugador(0, 0, 0);
		assertEquals(true, validarDetalle.revisarDetalleJugador(1, 1, 0));
	}
	
	@Test
	public void anadirDetalleJugadorTest() {
		DetalleJugador detalle = new DetalleJugador(0, 0, 0);
		jugador.anadirDetalle(1,1,2);
		assertEquals(1,jugador.getDetalles().size());
	}
	
	@Test
	public void sumarGolesTest() {
		int resultado = DetallePartido.sumarGoles(1,2);
		assertEquals(5, resultado);
	}
}
 