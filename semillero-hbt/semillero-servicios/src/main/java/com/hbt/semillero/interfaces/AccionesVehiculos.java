/**
 * AccionesVehiculos.java
 */
package com.hbt.semillero.interfaces;

import com.bht.semillero.enums.TipoVehiculoEnum;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public abstract class AccionesVehiculos {
	
   public abstract int obtenerVelocidadMaxima();
   public abstract long obtenerPesoMaxima();
   public abstract boolean DeterminarTipoVehiculo(TipoVehiculoEnum TipoVehiculo) throws Exception;
   
   public void acelerar() {
	   System.out.println("El vehiculo ha iniciado acelerar");
	   
   }
}
