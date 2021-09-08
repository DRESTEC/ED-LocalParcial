
package parcial_ed.pkg1;

public class Nodo {
    
    private Nodo next;
    private Nodo previous;
    private Vehiculo valor;
    
    public Nodo(){
        this.valor=null;
        this.next=null;
        this.previous=null;
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
}
