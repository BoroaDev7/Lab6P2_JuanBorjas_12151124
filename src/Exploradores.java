



import javax.swing.JList;


public class Exploradores extends Alienigenas {
    private JList planetasExplorados;

    public Exploradores() {
    }

   
    public Exploradores(String planetaPrimordial, String nombreRaza,String nombre, int edad, boolean amenaza) {
        super(planetaPrimordial,nombreRaza,nombre,edad,amenaza);
       
    }

    public JList getPlanetasExplorados() {
        return planetasExplorados;
    }

    public void setPlanetasExplorados(JList planetasExplorados) {
        this.planetasExplorados = planetasExplorados;
    }

   
    
    

   

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
