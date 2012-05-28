package co.uniquindio.software.medisys.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	   
	@Id
	private Integer cedula;
	private String nombre;
	private String apellido;
	private String eps;
	private String direccion;
	
	private String telefono;
	private static final long serialVersionUID = 1L;

	public Paciente() {
		super();
	}   
	public Integer getCedula() {
		return this.cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}   
	public String getEps() {
		return this.eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}
   
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
