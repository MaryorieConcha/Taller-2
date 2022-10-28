import java.util.ArrayList;

public class Persona {
	private String rut;
	private String nombre;
	private String apellido;

	public ArrayList<CorreoElectronico> correos;
	public ArrayList<Automoviles> automoviles;

	public Persona(String rut, String nombre, String apellido) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correos = new ArrayList<CorreoElectronico>();
		this.automoviles = new ArrayList<Automoviles>();
	}

	public String getRut() {
		return this.rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	@Override
	public String toString() {
		return "Persona{" + "rut=" + rut + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' +
				", correo(s)=" + correos + ", auto(s)=" + automoviles + '}';
	}
}