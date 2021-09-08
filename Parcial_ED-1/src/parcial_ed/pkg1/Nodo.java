
package parcial_ed.pkg1;


public class Nodo {
    
    private Nodo next;
    private Nodo previous;
    private Vehiculo valor;
    private int id;
    
    public Nodo(String placa, String marca, String cedula){
        Vehiculo nuevo = new Vehiculo(placa, marca, cedula);
        this.valor=nuevo;
        this.next=null;
        this.previous=null;
    }
    
    public Nodo(){
        String placa=null;
        String marca=null;
        String cedula=null;
        Vehiculo nuevo = new Vehiculo(placa, marca, cedula);
        
        this.valor=nuevo;
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
        return "Placa: "+ valor.getPlaca()+"  Marca: "+ valor.getMarca()+"\nCedula: "+valor.getCedula();
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
