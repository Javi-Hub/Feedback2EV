package com.savalero.campeonatofutbol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.campeonatofutbol.model.DetalleJugador;
import com.sanvalero.campeonatofutbol.model.DetallePartido;
import com.sanvalero.campeonatofutbol.model.Jugador;

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
		DetalleJugador detalle = new DetalleJugador(2, 2, 1);
		jugador.anadirDetalle(1,1,2);
		assertEquals(1,jugador.getDetalles().size());
		assertEquals(2,detalle.getGoles());
		assertEquals(2,detalle.getTarjetaAmarilla());
		assertEquals(2,detalle.getTarjetaRoja());
	}
	
	@Test
	public void sumarGolesTest() {
		int resultado = DetallePartido.sumarGoles(1,2);
		assertEquals(3, resultado);
	}
}
 