package co.uniquindio.software.medisys.entidades;

import co.uniquindio.software.medisys.entidades.Usuario;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Secretaria
 *
 */
@Entity
public class Secretaria extends Usuario implements Serializable {

	
	private String perfil;
	private static final long serialVersionUID = 1L;

	public Secretaria() {
		super();
	}   
	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
   
}
