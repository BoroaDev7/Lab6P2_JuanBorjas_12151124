
import java.util.ArrayList;


public class Conquistadores extends Alienigenas {
    
    ArrayList<Planetas> planetasConquistados=new ArrayList();

    public Conquistadores() {
        super();
    }

    public Conquistadores(Planetas planetaPrimordial, String nombreRaza,String nombre, String raza, int edad, boolean amenaza) {
        super(planetaPrimordial,nombreRaza,nombre,raza,edad,amenaza);
       
    }

    public ArrayList<Planetas> getPlanetasConquistados() {
        return planetasConquistados;
    }

    public void setPlanetasConquistados(ArrayList<Planetas> planetasConquistados) {
        this.planetasConquistados = planetasConquistados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
