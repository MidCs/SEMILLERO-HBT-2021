/**
 * Bicicleta.java
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
public class Bicicleta extends Vehiculo implements AccionesVehiculosInterface{
	private String tipoBicicleta;
	private String utilizaChalecoReflectivo;
	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 10;
	}
	@Override
	public long obtenerPesoMaxima() {
		// TODO Auto-generated method stub
		return 5L;
	}
	@Override
	public boolean DeterminarTipoVehiculo(TipoVehiculoEnum TipoVehiculo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo tipoBicicleta
	 * @return El tipoBicicleta asociado a la clase
	 */
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo tipoBicicleta
	 * @param tipoBicicleta El nuevo tipoBicicleta a modificar.
	 */
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo utilizaChalecoReflectivo
	 * @return El utilizaChalecoReflectivo asociado a la clase
	 */
	public String getUtilizaChalecoReflectivo() {
		return utilizaChalecoReflectivo;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo utilizaChalecoReflectivo
	 * @param utilizaChalecoReflectivo El nuevo utilizaChalecoReflectivo a modificar.
	 */
	public void setUtilizaChalecoReflectivo(String utilizaChalecoReflectivo) {
		this.utilizaChalecoReflectivo = utilizaChalecoReflectivo;
	}

}
