/**
 * 
 */
package com.rodri.consultaClientes.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rodri.consultaClientes.dto.PersonaDTO;

/**
 * @author 201909
 *
 */
public class ConsultaCombo {

	
	public List<PersonaDTO> ConsultaComboPersonas(){
		
		List<PersonaDTO> lista = new ArrayList<>();
		
		File fichero = new File("C:\\Users\\201909\\Documents\\Clientes.txt");
		BufferedReader lector;
		
		try {
			lector = new BufferedReader(new FileReader(fichero));
			String linea;
			
			while((linea = lector.readLine()) != null) {
				lista.add(recuperaPersona(linea));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;

	}
	
	private PersonaDTO recuperaPersona(String linea) {
		String[] arrayPersona = linea.split("-");
		return new PersonaDTO(Integer.parseInt(arrayPersona[0]), arrayPersona[1]);
	}
	
}
