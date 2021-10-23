/**
 * Moto.java
 */
package com.hbt.semillero.entidad;

import com.bht.semillero.enums.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculosInterface;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public class Moto extends Vehiculo implements AccionesVehiculosInterface{

	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long obtenerPesoMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean DeterminarTipoVehiculo(TipoVehiculoEnum TipoVehiculo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
