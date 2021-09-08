
package parcial_ed.pkg1;
import java.time.*;

public class Nodo {
    
    private Nodo next;
    private Nodo previous;
    private Vehiculo valor;
    private LocalDate hora;
    
    public Nodo(){
        this.valor=null;
        this.next=null;
        this.previous=null;
        this.hora = LocalDate.now();
    }        

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }

    public Vehiculo getValor() {
        return valor;
    }

    public void setValor(Vehiculo valor) {
        this.valor = valor;
    }

    public String mostrarInfo(){
        return "Placa: "+ valor.getPlaca()+"  Marca: "+ valor.getMarca()+"  Cedula: "+valor.getCedula();
    }    

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }
}
