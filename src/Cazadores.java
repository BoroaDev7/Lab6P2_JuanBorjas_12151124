
import java.util.ArrayList;


public class Cazadores extends Alienigenas {
   private int humanosAtrapados;

    public Cazadores() {
        super();
    }

    
     public Cazadores(Planetas planetaPrimordial, String nombreRaza,String nombre,  int edad, boolean amenaza,int humanosatrapados) {
        super(planetaPrimordial,nombreRaza,nombre,edad,amenaza);
       this.humanosAtrapados=humanosatrapados;
    }
     public Cazadores(String nombreRaza,String nombre,  int edad, boolean amenaza,int humanosatrapados) {
        super(nombreRaza,nombre,edad,amenaza);
        this.humanosAtrapados=humanosatrapados;
       
    }

    public int getHumanosAtrapados() {
        return humanosAtrapados;
    }

    public void setHumanosAtrapados(int humanosAtrapados) {
        this.humanosAtrapados = humanosAtrapados;
    }

    

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
