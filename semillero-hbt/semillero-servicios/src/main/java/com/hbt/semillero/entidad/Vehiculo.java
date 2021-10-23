/**
 * Vehiculo.java
 */
package com.hbt.semillero.entidad;

import java.math.BigDecimal;

import com.bht.semillero.enums.TipoVehiculoEnum;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public class Vehiculo {
	// Declaramos los atributos por lo general todos son private y generar a cada uno sus Get y Set 
	
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private String Color;
	
	/**
	 * Atributo que determina el Tipo de Vehiculo de un vehiculo
	 */
	private TipoVehiculoEnum tipoVehiculo;// importamos de paquete enum para que funcione el metodo enumerador
	
	/**
	 * Atributo que determina el numero de llantas de un vehiculo
	 */
	private int numeroLlantas;
	
	/**
	 * Atributo que determina si requiere licencia el vehiculo
	 */
	private boolean requiereLicencia;
	
	/**
	 * Atributo que determina el precio de un vehiculo
	 */
	private BigDecimal precio;
	
	// CREAMOS CONSTRUCTORES VACIOS
	public Vehiculo() {
		
	}
	
	// CREAMOS CONSTRUCTORES GENEREN MULTIPLES ATRIBUTOS
		public Vehiculo(String Color,Integer precio) {
			this.Color= Color;
			this.precio=new BigDecimal(650000);
			
			
		}
		
	
		


	// GENERAMOS LOS GET Y SET DE CADA ATRIBUTO
	/**
	 * Metodo encargado de retornar el valor del atributo Color
	 * @return El color asociado a la clase
	 */
	public String getColor() {
		return Color;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo Color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(String color) {
		Color = color;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tipoVehiculo
	 * @return El tipoVehiculo asociado a la clase
	 */
	public TipoVehiculoEnum getTipoVehiculo() {
		return tipoVehiculo;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo tipoVehiculo
	 * @param tipoVehiculo El nuevo tipoVehiculo a modificar.
	 */
	public void setTipoVehiculo(TipoVehiculoEnum tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroLlantas
	 * @return El numeroLlantas asociado a la clase
	 */
	public int getNumeroLlantas() {
		return numeroLlantas;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroLlantas
	 * @param numeroLlantas El nuevo numeroLlantas a modificar.
	 */
	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo requiereLicencia
	 * @return El requiereLicencia asociado a la clase
	 */
	public boolean isRequiereLicencia() {
		return requiereLicencia;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo requiereLicencia
	 * @param requiereLicencia El nuevo requiereLicencia a modificar.
	 */
	public void setRequiereLicencia(boolean requiereLicencia) {
		this.requiereLicencia = requiereLicencia;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [Color=" + Color + ", tipoVehiculo=" + tipoVehiculo + ", numeroLlantas=" + numeroLlantas
				+ ", requiereLicencia=" + requiereLicencia + ", precio=" + precio + "]";
	}
}
