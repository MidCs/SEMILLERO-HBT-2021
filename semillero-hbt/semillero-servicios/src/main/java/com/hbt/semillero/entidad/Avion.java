/**
 * Avion.java
 */
package com.hbt.semillero.entidad;

import com.bht.semillero.enums.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculos;
import com.hbt.semillero.interfaces.AccionesVehiculosInterface;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public class Avion extends Vehiculo implements AccionesVehiculosInterface {

	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public long obtenerPesoMaxima() {
		// TODO Auto-generated method stub
		return 50L;
	}

	@Override
	public boolean DeterminarTipoVehiculo(TipoVehiculoEnum TipoVehiculo) throws Exception {// esta excepcion es para argumentar que si es avion se sabe que es tipo aereo
		
		if(getTipoVehiculo().getIdentificador() == (TipoVehiculoEnum.getIdentificador())) {
			return true;
		} else {
			throw new Exception("EL TIPO DE VEHICULO DEBE SER AEREO");
		}
		// TODO Auto-generated method stub
		return false;
	}

}
