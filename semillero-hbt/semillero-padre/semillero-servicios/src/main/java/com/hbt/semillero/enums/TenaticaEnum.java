/**
 * TenaticaEnnum.java
 */
package com.hbt.semillero.enums;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public enum TenaticaEnum {
	DRAMA("Drama",1),
	ACCION("Accion",2),
	SUSPENSO("Sustempenso",3);
	
	private String tipo;
	private int identificador;
	
	TenaticaEnum (String tipo, int identificador) {
		this.tipo =tipo;
		this.identificador =identificador;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo identificador
	 * @return El identificador asociado a la clase
	 */
	public int getIdentificador() {
		return identificador;
	}
	
	public String getTipo() {
		return tipo;
	}

}
