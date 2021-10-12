package datos;
import model.*;

public class Datos {

    public static String setRutCliente(){

        Persona persona = new Persona();
        persona.setRutCliente("165442237");
        return persona.getRutCliente();
    }
    public static String setClaveCliente (){
        Persona persona = new Persona();
        persona.setClaveCliente("1986");
        return persona.getClaveCliente();
    }

}
