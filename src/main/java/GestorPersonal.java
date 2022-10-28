import java.util.ArrayList;
import java.util.List;

public class GestorPersonal {
    private List <Persona> personas;
    private List <Automoviles> autos;
    private List <CorreoElectronico> correos;

    public GestorPersonal(){
        this.personas = new ArrayList<>();
        this.autos = new ArrayList<>();
        this.correos = new ArrayList<>();
    }

    public Persona buscarPersonas(String rut){
        for (Persona persona : this.personas){
            if (persona.getRut().equals(rut)){
                return persona;
            }
        }
        return null;
    }

    public boolean agregarPersonas(String rut, String nombre, String apellido){
        if (buscarPersonas(rut) == null) {
            Persona persona = new Persona(rut, nombre, apellido);
            this.personas.add(persona);
            return true;
        }
        else {
            return false;
        }
    }

    //Buscar a una persona por Rut.
    public void mostrarPersonaPorRut(String rut){
        for (Persona persona : this.personas){
            if (persona.getRut().equals(rut)){
                System.out.println(persona.toString());
            }
        }
    }

    //Buscar personas por nombre
    public void mostrarPersonaPorNombre(String nombre){
        for (Persona persona : this.personas){
            if (persona.getNombre().equals(nombre)){
                System.out.println(persona.toString());
            }
        }
    }

    public boolean agregarAutomoviles (){

    }
}
