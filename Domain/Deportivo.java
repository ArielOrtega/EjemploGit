
package Domain;

public class Deportivo extends Zapato{

    private String deporte;
    //ademas de recibir sus parametros debe de recibir los de padre, primero los atributos de padre
    public Deportivo(int numCalzado) {
        super(); //super se basa en constructor de padre, debe recibir en el mismo orden que el padre
    }

    
    public Deportivo(String deporte, int numCalzado) {
        super(numCalzado);
        this.deporte = deporte;
    }

    public Deportivo() {
    }
    
    
    
    public Deportivo(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return super.toString() + "Deportivo{" + "deporte=" + deporte + '}'; //con super llamo al ToString de la clase padre
    }

    
}
