
public class Abduzcan extends Alienigenas {
    
    private int animales;

    public Abduzcan() {
        super();
    }

    public Abduzcan(String planetaPrimordial, String nombreRaza,String nombre,int edad, boolean amenaza,int animales) {
        super(planetaPrimordial,nombreRaza,nombre,edad,amenaza);
       this.animales=animales;
    }
      public Abduzcan( String nombreRaza,String nombre,int edad, boolean amenaza,int animales) {
        super(nombreRaza,nombre,edad,amenaza);
       this.animales=animales;
    }

    public int getAnimales() {
        return animales;
    }

    public void setAnimales(int animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
