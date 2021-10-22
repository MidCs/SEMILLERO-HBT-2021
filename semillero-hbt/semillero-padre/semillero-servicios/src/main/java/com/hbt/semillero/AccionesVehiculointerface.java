/**
 * AccionesVehiculointerface.java
 */
package com.hbt.semillero;

import com.hbt.semillero.enums.TipoVehiculoEnum;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */


public interface AccionesVehiculointerface {
	
	public int obtenerVelocidadMaxima();
	
	public Long obternerPesoMaximoCarga();
	
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEmun) throws Exception;
	
	public default void acelerar() {
		System.out.println("El vehiculo ha iniciado acelerar");
	}
}