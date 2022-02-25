
import java.util.ArrayList;


public class Exploradores extends Alienigenas {
    private ArrayList<Planetas> planetasExplorados=new ArrayList();

    public Exploradores() {
    }

   
    public Exploradores(Planetas planetaPrimordial, String nombreRaza,String nombre, String raza, int edad, boolean amenaza) {
        super(planetaPrimordial,nombreRaza,nombre,raza,edad,amenaza);
       
    }
    

    public ArrayList<Planetas> getPlanetasExplorados() {
        return planetasExplorados;
    }

    public void setPlanetasExplorados(ArrayList<Planetas> planetasExplorados) {
        this.planetasExplorados = planetasExplorados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
