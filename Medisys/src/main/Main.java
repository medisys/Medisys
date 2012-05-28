package main;

import java.util.ArrayList;
import java.util.List;

import co.uniquindio.software.medisys.entidades.Paciente;
import co.uniquindio.software.medisys.logica.GestorPaciente;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GestorPaciente gp = new GestorPaciente();
//        Paciente p = new Paciente();
//        p.setCedula(123);
//        p.setNombre("Diana");
//        p.setApellido("frasica");
//        p.setDireccion("7 de agosto");
//        gp.guardarPaciente(p);
        
        List<Paciente> pacientes = (List<Paciente>) gp.seleccionarUsuarios();
        for(Paciente p: pacientes){
        	System.out.println(p.getNombre());
        }
	}

}
