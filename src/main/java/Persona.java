import java.util.ArrayList;

public class Persona {
	private int rut;
	private String nombre;
	private String apellido;
	public ArrayList<CorreoElectronico> unnamed_CorreoElectronico_ = new ArrayList<CorreoElectronico>();
	public ArrayList<Automoviles> unnamed_Automoviles_ = new ArrayList<Automoviles>();

	public int getRut() {
		return this.rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}
}