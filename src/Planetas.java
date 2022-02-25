
import java.util.ArrayList;


public class Planetas {
    private String nombrePlaneta;
    private boolean agua=false;
    private double tamanio,temperatura;
    private ArrayList<Alienigenas> miembros= new ArrayList();

    public Planetas() {
    }

    public Planetas(String nombrePlaneta, double tamanio, double temperatura,boolean agua) {
        this.nombrePlaneta = nombrePlaneta;
        this.tamanio = tamanio;
        this.temperatura = temperatura;
        this.agua=agua;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public ArrayList<Alienigenas> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Alienigenas> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return  nombrePlaneta ;
    }
 
    
    
   
    
}
