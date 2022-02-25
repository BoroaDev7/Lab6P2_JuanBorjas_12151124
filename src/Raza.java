
import javax.swing.JComboBox;


public class Raza {
    private JComboBox  planetaPrimordial;
    private String nombreRaza;

    public Raza() {
    }

    public Raza( String nombreRaza) {
      
        this.nombreRaza = nombreRaza;
    }

  

    public JComboBox getPlanetaPrimordial() {
        return planetaPrimordial;
    }

    public void setPlanetaPrimordial(JComboBox planetaPrimordial) {
        this.planetaPrimordial = planetaPrimordial;
    }

    

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    @Override
    public String toString() {
        return  planetaPrimordial + nombreRaza ;
    }
    
    
     
    
    
}
