/**
 * CreacionVehiculoRest.java
 */
package com.hbt.semillero.rest;

import java.math.BigDecimal;

import com.hbt.semillero.entidad.Avion;
import com.hbt.semillero.entidad.Barco;
import com.hbt.semillero.entidad.Bicicleta;
import com.hbt.semillero.entidad.Vehiculo;
import com.hbt.semillero.enums.TipoVehiculoEnum;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public class CreacionVehiculoRest {

	/**
	 * Metodo encargado de la creacionde vehiculos
	 * <b>Caso de Uso</b>
	 * @author midac
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo1= new Vehiculo("Amarrillo",650000);// nuevo vehiculo
		vehiculo1.setColor("Amarillo");
		vehiculo1.setNumeroAsientos(4);
		vehiculo1.setNumeroLlantas(4);
		vehiculo1.setPrecio(new BigDecimal(650000));
		vehiculo1.setRequiereLicencia(true);
		vehiculo1.setTipoVehiculo(TipoVehiculoEnum.TERRESTRE);
		System.out.println(vehiculo1.toString());

		Barco barco1 = new Barco();
		barco1.setColor("Blanco");
		barco1.setNumeroAsientos(20);
		barco1.setNumeroLlantas(0);
		barco1.setRequiereLicencia(true);
		barco1.setTipoVehiculo(TipoVehiculoEnum.ACUATICO);
		System.out.println(barco1.toString());
		
		Bicicleta bicicleta1 = new Bicicleta();
		
		Avion avion1 = new Avion();
		avion1.setTipoVehiculo(TipoVehiculoEnum.AEREO);
		

	}

}
