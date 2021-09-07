
package parcial_ed.pkg1;


public class Nodo {
    
    private Nodo next;
    private Nodo previous;
    private Vehiculo valor;
    
    public Nodo(String placa, String marca, int cedula){
        Vehiculo nuevo = new Vehiculo(placa, marca, cedula);
        setValor(nuevo);
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

    private void setValor(Vehiculo valor) {
        this.valor = valor;
    }

    public String mostrarInfo(){
        return "Placa: "+ valor.getPlaca()+"  Marca: "+ valor.getMarca()+"\nCedula: "+valor.getCedula();
    }    
}
