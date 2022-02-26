
public class Raza {
    private String planetaPrimordial;
    private String nombreRaza;

    public Raza() {
    }

    public Raza(String planetaPrimordial, String nombreRaza) {
        this.planetaPrimordial = planetaPrimordial;
        this.nombreRaza = nombreRaza;
    }
    public Raza(String nombreRaza) {

        this.nombreRaza = nombreRaza;
    }


  

    public String getPlanetaPrimordial() {
        return planetaPrimordial;
    }

    public void setPlanetaPrimordial(String planetaPrimordial) {
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
        return   nombreRaza ;
    }
    
    
     
    
    
}
