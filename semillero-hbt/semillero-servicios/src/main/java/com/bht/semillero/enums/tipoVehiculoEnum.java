/**
 * tipoVehiculoEnum.java
 */
package com.bht.semillero.enums;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version 
 */
public enum tipoVehiculoEnum {
	TERRESTRE("Terrestre", 1),
	ACUATICO("Acuatico", 2),
	AEREO("Aereo", 3);
	
	private String tipo;
	private int identificador;
	tipoVehiculoEnum(String tipo,int identificador){
		this.tipo= tipo;
		this.identificador = identificador;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo Tipo
	 * @return El tipo asociado a la clase
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Metodo encargado de retornar el valor del atributo Identificador
	 * @return El identificador asociado a la clase
	 */
	public int getIdentificador() {
		return identificador;
	}

	

}
