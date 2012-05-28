package co.uniquindio.software.medisys.logica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import co.uniquindio.software.medisys.entidades.Paciente;
import co.uniquindio.software.medisys.entidades.Usuario;

public class GestorPaciente {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MedisysPU");
	
	public void guardarPaciente(Paciente paciente){
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(paciente);
		em.flush();
		tx.commit();
	}
	
	public List<Paciente> seleccionarUsuarios(){
		EntityManager em = emf.createEntityManager();
		return em.createQuery("SELECT p FROM Paciente p").getResultList();
	}
	

}
