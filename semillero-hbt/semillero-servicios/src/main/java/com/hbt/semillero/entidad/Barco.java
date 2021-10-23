/**
 * Barco.java
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
public class Barco extends Vehiculo implements AccionesVehiculosInterface{
	private String nombreCapitan;
	private String puertoLlegda;
	
	/**
	 * Metodo encargado de retornar el valor del atributo nombreCapitan
	 * @return El nombreCapitan asociado a la clase
	 */
	public String getNombreCapitan() {
		return nombreCapitan;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombreCapitan
	 * @param nombreCapitan El nuevo nombreCapitan a modificar.
	 */
	public void setNombreCapitan(String nombreCapitan) {
		this.nombreCapitan = nombreCapitan;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo puertoLlegda
	 * @return El puertoLlegda asociado a la clase
	 */
	public String getPuertoLlegda() {
		return puertoLlegda;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo puertoLlegda
	 * @param puertoLlegda El nuevo puertoLlegda a modificar.
	 */
	public void setPuertoLlegda(String puertoLlegda) {
		this.puertoLlegda = puertoLlegda;
	}
	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public long obtenerPesoMaxima() {
		// TODO Auto-generated method stub
		return 20L;
	}
	@Override
	public boolean DeterminarTipoVehiculo(TipoVehiculoEnum TipoVehiculo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
