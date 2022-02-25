
public class Raza {
    private Planetas planetaPrimordial;
    private String nombreRaza;

    public Raza() {
    }

    public Raza(Planetas planetaPrimordial, String nombreRaza) {
        this.planetaPrimordial = planetaPrimordial;
        this.nombreRaza = nombreRaza;
    }

  

    public Planetas getPlanetaPrimordial() {
        return planetaPrimordial;
    }

    public void setPlanetaPrimordial(Planetas planetaPrimordial) {
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
