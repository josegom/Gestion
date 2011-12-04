package gestion.gastos.dominio;

/**
 * Clase que represent a un usuario de la aplicacion.
 * @author josegom
 *
 */
public class Usuario {
	
	public String nombre;
	
	public String clave;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
