
package Domain;

import java.util.ArrayList;

public class Sistema {
    
    private String nombre;
    private ArrayList<Organo> organos;

    public Sistema(String nombre, ArrayList<Organo> organos) {
        this.nombre = nombre;
        this.organos = organos;
    }

    public Sistema() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }

    public void imprimir(){
        System.out.println("Sistema: "+this.nombre);
        for (int i = 0; i < this.getOrganos().size(); i++) {
            System.out.println(this.getOrganos().get(i).toString());
        }
    }
}
