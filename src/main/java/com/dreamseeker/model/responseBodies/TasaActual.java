package com.dreamseeker.model.responseBodies;

import java.io.Serializable;

public class TasaActual implements Serializable{
private static final long serialVersionUID = 1L;
	
	private float tasaPromedio;
	private float tasaMinima;
	private float tasaMaxima;
	
	public float getTasaPromedio() {
		return tasaPromedio;
	}
	public void setTasaPromedio(float tasaPromedio) {
		this.tasaPromedio = tasaPromedio;
	}
	public float getTasaMinima() {
		return tasaMinima;
	}
	public void setTasaMinima(float tasaMinima) {
		this.tasaMinima = tasaMinima;
	}
	public float getTasaMaxima() {
		return tasaMaxima;
	}
	public void setTasaMaxima(float tasaMaxima) {
		this.tasaMaxima = tasaMaxima;
	}
	
    @Override
    public String toString() {
        return String.format(
                "TasaActual [tasaPromedio = %f, tasaMinima = %f, tasaMaxima = %f]", tasaPromedio, tasaMinima, tasaMaxima);
    }

}
