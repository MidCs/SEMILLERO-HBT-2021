/**
 * CreacionVehiculo.java
 */
package com.hbt.semillero.rest;

import java.math.BigDecimal;

import com.bht.semillero.enums.TipoVehiculoEnum;
import com.hbt.semillero.entidad.Avion;
import com.hbt.semillero.entidad.Barco;
import com.hbt.semillero.entidad.Bicicleta;
import com.hbt.semillero.entidad.Vehiculo;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public class CreacionVehiculoRest {

	/**
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author midac
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos instancias objetos de la clase Vehiculo
		// asi se crea un objeto nombredelaclase nombredelobjeto = new nombredelaclase con();
		Vehiculo vehiculo1=new Vehiculo("Amarillo",650000);// se importa de clase vehiculo que se encuenta en el packete de com.hbt.semillero.entidad
		// asi asignamos los valores al nuevo objetovehiculos
		vehiculo1.setColor("Naranjado");
		
		vehiculo1.setNumeroLlantas(4);
		vehiculo1.setPrecio(new BigDecimal(650000));
		vehiculo1.setRequiereLicencia(true);
		vehiculo1.setTipoVehiculo(TipoVehiculoEnum.TERRESTRE);
		
		Vehiculo vehiculo2=new Vehiculo("Amarillo",650000);// se importa de clase vehiculo que se encuenta en el packete de com.hbt.semillero.entidad
		// asi asignamos los valores al nuevo objetovehiculos
		vehiculo2.setColor("Naranjado");
		vehiculo2.setNumeroLlantas(4);
		vehiculo2.setPrecio(new BigDecimal(650000));
		vehiculo2.setRequiereLicencia(true);
		vehiculo2.setTipoVehiculo(TipoVehiculoEnum.ACUATICO);
		
		Barco Barco1=new Barco();// se importa de clase vehiculo que se encuenta en el packete de com.hbt.semillero.entidad
		// asi asignamos los valores al nuevo objetoBarco
		Barco1.setColor("Blanco");
		Barco1.setNumeroLlantas(0);
		Barco1.setPrecio(new BigDecimal(650000));
		Barco1.setRequiereLicencia(true);
		Barco1.setTipoVehiculo(TipoVehiculoEnum.ACUATICO);
		
		Bicicleta Bicicleta1 =new Bicicleta();
		Avion Avion1 =new Avion();
		
		
		
		System.out.println(vehiculo2.toString());
		System.out.println(vehiculo1.toString());
		System.out.println("LA VELOCIDAD DEL Barco ES : " +Barco1.obtenerPesoMaxima());
		Barco1.acelerar();
		System.out.println("LA VELOCIDAD DEL Bicicleta ES : " +Bicicleta1.obtenerPesoMaxima());
		Bicicleta1.acelerar();
		System.out.println("LA VELOCIDAD DEL Avion ES : " +Avion1.obtenerPesoMaxima());
		Avion1.acelerar();

	}

}
