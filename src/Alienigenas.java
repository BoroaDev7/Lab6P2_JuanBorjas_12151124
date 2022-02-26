
public class Alienigenas extends Raza {
   
    private String nombre;
    private int edad;
    private boolean amenaza;

    public Alienigenas() {
        super();
    }

    public Alienigenas(String planetaPrimordial, String nombreRaza,String nombre,  int edad, boolean amenaza) {
        super(planetaPrimordial,nombreRaza);
        this.nombre = nombre;
        this.edad = edad;
        this.amenaza = amenaza;
    }
    public Alienigenas( String nombreRaza,String nombre,  int edad, boolean amenaza) {
        super(nombreRaza);
        this.nombre = nombre;
        this.edad = edad;
        this.amenaza = amenaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAmenaza() {
        return amenaza;
    }

    public void setAmenaza(boolean amenaza) {
        this.amenaza = amenaza;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
}
