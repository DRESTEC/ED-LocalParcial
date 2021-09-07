
package parcial_ed.pkg1;


public class ListaCircuDoble {
    
    private Nodo entrada;
    public int cantidad = 10;
    private Nodo current;
    private Nodo primero;
    private Nodo anterior;
    
    public void lista(){
        
        while(cantidad!=0){
            
            int x = 1;
            cantidad--;
            
            switch (x) {
                case 1 ->                     {
                        Nodo nuevo = new Nodo();
                        primero = nuevo;
                        x++;
                        break;
                    }
                case 2 ->                     {
                        Nodo nuevo = new Nodo();
                        primero.setNext(nuevo);
                        primero.setPrevious(nuevo);
                        nuevo.setNext(primero);
                        nuevo.setPrevious(primero);
                        anterior=nuevo;
                        x++;
                        break;
                    }
                default ->                     {
                        Nodo nuevo = new Nodo();
                        primero.setPrevious(nuevo);
                        nuevo.setNext(primero);
                        nuevo.setPrevious(anterior);
                        anterior=nuevo;
                        entrada=nuevo;
                        break;
                    }
            }
        }
    }
    
    public void add(Nodo n){
        
        if(entrada.getValor()==null){
            entrada=n;
            current=entrada;
        }else{
            masCercano();
        }
        
    }
    
    public void masCercano(){
        int d=0;
        int i=0;
        Nodo derecha = new Nodo();
        Nodo izquierda = new Nodo();
        
        
        while(current!=null && d!=9){
            d++;
            current=current.getNext();
            derecha=current;
        }
        while(current!=null && i!=9){
            i++;
            current=current.getPrevious();
            izquierda=current;
        }
        if(d==9){
            System.out.println("No hay mas espacios disponbles");
        }else if(d<=i){
            entrada=derecha;
        }else{
            entrada=izquierda;
        }
        
    }

    public Nodo getEntrada() {
        return entrada;
    }

    public Nodo getCurrent() {
        return current;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}
