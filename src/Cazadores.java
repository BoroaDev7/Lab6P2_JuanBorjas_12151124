
import java.util.ArrayList;


public class Cazadores extends Alienigenas {
    ArrayList humanosAtrapados=new ArrayList();

    public Cazadores() {
        super();
    }

    
     public Cazadores(Planetas planetaPrimordial, String nombreRaza,String nombre,  int edad, boolean amenaza) {
        super(planetaPrimordial,nombreRaza,nombre,edad,amenaza);
       
    }

    public ArrayList getHumanosAtrapados() {
        return humanosAtrapados;
    }

    public void setHumanosAtrapados(ArrayList humanosAtrapados) {
        this.humanosAtrapados = humanosAtrapados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
