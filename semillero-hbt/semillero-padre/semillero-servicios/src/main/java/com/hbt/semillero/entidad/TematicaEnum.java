/**
 * TematicaEnum.java
 */
package com.hbt.semillero.entidad;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public enum TematicaEnum {
	AVENTURAS("enum.tematica.aventuras"), 
    BELICO("enum.tematica.belico"), 
    HUMORISTICO("enum.tematica.humoristico"),
    FANTASTICO("enum.tematica.fantastico"),
    CIENCIA_FICCION("enum.tematica.ciencia_ficcion"), 
    HORROR("enum.tematica.horror"); 

	/**
	 * Variable que representa el codigo de mensaje
	 */
	private String codigoMensaje;

	/**
	 * Constructor de la clase.
	 */
	private TematicaEnum(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo codigoMensaje
	 * 
	 * @return El codigoMensaje asociado a la clase
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo codigoMensaje
	 * 
	 * @param codigoMensaje El nuevo codigoMensaje a modificar.
	 */
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

}



