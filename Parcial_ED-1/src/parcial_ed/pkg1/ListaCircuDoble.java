
package parcial_ed.pkg1;

//import java.util.Scanner;



public class ListaCircuDoble {
    
    private Nodo entrada;
    public int cantidad = 10;
    private Nodo current;
    private Nodo primero;
    private Nodo anterior;
    
    public void lista(){
        int y = 0; 
        int x =1;
        
        while(cantidad!=0){
            
            y++;
            cantidad--;
            
            switch (x) {
                case 1 ->                     {
                        Nodo nuevo = new Nodo();
                        nuevo.setId(y);
                        primero = nuevo;
                        x++;
                        System.out.println("sadwehdgf");
                        break;
                    }
                case 2 ->                     {
                        Nodo nuevo = new Nodo();
                        nuevo.setId(y);
                        primero.setNext(nuevo);
                        primero.setPrevious(nuevo);
                        nuevo.setNext(primero);
                        nuevo.setPrevious(primero);
                        anterior=nuevo;
                        x++;
                        System.out.println("dvrtjt");
                        break;
                    }
                default ->                     {
                        Nodo nuevo = new Nodo();
                        nuevo.setId(y);
                        primero.setPrevious(nuevo);
                        nuevo.setNext(primero);
                        nuevo.setPrevious(anterior);
                        anterior=nuevo;
                        entrada=primero;
                        current=entrada;
                        System.out.println("gfdhdrf");
                        break;
                    }
            }
        }
    }
    
    public void add(Vehiculo n){
        
        if(entrada.getValor()==null){
            entrada.setValor(n);
            current=entrada;
        }else{
            masCercano(n);
        }  
    }
    
    private void masCercano(Vehiculo n){
        int d=0;
        int i=0;
        
        while(current.getValor()!=null && d!=10){
            d++;
            current=current.getNext();  
        }
        current=entrada;
        while(current.getValor()!=null && i!=10){
            i++;
            current=current.getPrevious();    
        }
        current=entrada;
        if(d==10){
            System.out.println("No hay mas espacios disponbles");
            current=entrada;
        }else if(d<=i){
            while(current.getValor()!=null){
            current=current.getNext();  
            }
            current.setValor(n);
            entrada=current;
        }else{
            while(current.getValor()!=null){
            current=current.getPrevious(); 
            }
            current.setValor(n);
            entrada=current;
        }
    }
    
    public void buscarPlaca(String placa){
        int i = 0;
        boolean detener = true;
        
        while(detener==true && i!=10){
            if(current!=null){
                if(current.getValor().getPlaca()!=placa){
                    current=current.getNext();
                }else{
                    Nodo nuevo=new Nodo();
                    current=nuevo;
                    entrada=nuevo;
                    detener=false;
                }
            }else{
                try{
                    current=current.getNext();
                }catch(NullPointerException jodete){
                current=current.getNext();
            }       
            }
        }
        if(i==9){
            System.out.println("Esta placa no esta registrada");
        }
        current=entrada;
    }
    public void buscarCedula(String cedula){
        int i = 0;
        while(current.getValor().getCedula()!=cedula && i!=10){
            current=current.getNext();
            i++;
        }
        if(i==9){
            System.out.println("Esta placa no esta registrada");
        }else{
            Nodo nuevo=new Nodo();
            current=nuevo;
        }        
    }
    
    public void imprimir(){
        int i = 0;
        while(i!=10){
            if(current!=null){
                System.out.println("vehiculo: "+current.mostrarInfo()+current.getId());
                current=current.getNext(); 
            }else{
                System.out.println("Espacio libre");
            }
            i++;
        }
        current=entrada;
    }

    public Nodo getEntrada() {
        return entrada;
    }

    public Nodo getCurrent() {
        return current;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}
