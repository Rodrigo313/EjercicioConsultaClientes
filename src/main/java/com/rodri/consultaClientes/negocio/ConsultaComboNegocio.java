/**
 * 
 */
package com.rodri.consultaClientes.negocio;

import java.util.List;

import com.rodri.consultaClientes.dto.PersonaDTO;
import com.rodri.consultaClientes.modelo.ConsultaCombo;

/**
 * @author 201909
 *
 */
public class ConsultaComboNegocio {
	public List<PersonaDTO> consulta(){
		return new ConsultaCombo().ConsultaComboPersonas();
		
	}
}
