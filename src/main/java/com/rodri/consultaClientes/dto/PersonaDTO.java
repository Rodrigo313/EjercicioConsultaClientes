/**
 * 
 */
package com.rodri.consultaClientes.dto;

/**
 * @author 201909
 *
 */
public class PersonaDTO {
	
	private Integer id;
	private String nombre;
	
	/**
	 * 
	 */
	public PersonaDTO() {
		super();
	}
	
	/**
	 * @param id
	 * @param nombre
	 */
	public PersonaDTO(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
