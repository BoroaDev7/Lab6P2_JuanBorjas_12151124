

import javax.swing.JList;


public class Conquistadores extends Alienigenas {
    
    private JList planetasConquistados;

    public Conquistadores() {
        super();
    }

    public Conquistadores(Planetas planetaPrimordial, String nombreRaza,String nombre, int edad, boolean amenaza) {
        super(planetaPrimordial,nombreRaza,nombre,edad,amenaza);
       
    }
    public Conquistadores(String nombreRaza,String nombre, int edad, boolean amenaza) {
        super(nombreRaza,nombre,edad,amenaza);
       
    }

    public JList getPlanetasConquistados() {
        return planetasConquistados;
    }

    public void setPlanetasConquistados(JList planetasConquistados) {
        this.planetasConquistados = planetasConquistados;
    }

  
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
