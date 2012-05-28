package co.uniquindio.software.medisys.logica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import co.uniquindio.software.medisys.entidades.Usuario;

public class GestorUsuario {

	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("MedisysPU");

	public Usuario consultarUsuario(String login, String password) {
		Usuario u;
		try {

			EntityManager em = emf.createEntityManager();
			u = (Usuario) em.find(Usuario.class, login);
			if(u != null && u.getPassword().equals(password)){
				return u;
			}else{
				return null;
			}
//					.createQuery(
//							"SELECT u FROM Usuario u WHERE u.login=:login AND u.password=:password")
//					.setParameter("login", login)
//					.setParameter("password", password).getSingleResult();
		} catch (NoResultException ex) {
			ex.printStackTrace();
			u = null;
		}
		return u;
	}
}
