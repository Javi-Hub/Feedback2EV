package com.sanvalero.campeonatofutbol.model;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
	
	private  List<Partido> partidos;
	
	public Calendario(){
		partidos = new ArrayList<>();
	}
	
	public void registrarPartido(Partido partido) {
		partidos.add(partido);
	}
	
	public void suspenderPartido(Partido partido){
		partidos.remove(partido);
	}
		
	
}
