
package parcial_ed.pkg1;

public class ListaCircuDoble implements IListable {
    
    private Nodo entrada;
    public int cantidad = 10;
    private Nodo current;
    private Nodo primero;
    private Nodo ultimo;
    
    public void lista(){
        int x =1;
        
        while(cantidad!=0){
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
                        ultimo=nuevo;
                        primero.setNext(ultimo);
                        primero.setPrevious(ultimo);
                        ultimo.setNext(primero);
                        ultimo.setPrevious(primero);
                        
                        x++;
                        break;
                    }
                default ->                     {
                        Nodo nuevo = new Nodo();
                        ultimo.setNext(nuevo);
                        nuevo.setPrevious(ultimo);
                        ultimo=nuevo;
                        primero.setPrevious(ultimo);
                        ultimo.setNext(primero);
                        entrada=primero;
                        current=entrada;
                        break;
                    }
            }
        }
    }
    
    @Override
    public void add(Vehiculo n){
        
        if(entrada.getValor()==null){
            entrada.setValor(n);
        }else{
            Vehiculo nuevo =n;
            masCercano(nuevo);
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
        int de = 0;
        int iz = 0;
        
        while(current.getValor()!=null && de!=10){
            de++;
            current=current.getNext();  
        }
        current=entrada;
        while(current.getValor()!=null && iz!=10){
            iz++;
            current=current.getPrevious();    
        }        
        
        while( i!=11){
            
            i++;
            
            if(de<=iz){
                
                if(current.getValor()==null){
                    current=current.getNext();
                }else if(current.getValor().getPlaca().equals(placa)){
                    current.setValor(null);
                    entrada=current;
                    System.out.println("Vuelva pronto");
                    
                    break;
                } else {
                current=current.getNext();
                }               
            }else{
                
                if(current.getValor()==null){
                    current=current.getPrevious();
                }else if(current.getValor().getPlaca().equals(placa)){
                    current.setValor(null);
                    entrada=current;
                    System.out.println("Vuelva pronto");
                    break;
                } else {
                    current=current.getPrevious();
                }
            }
        }
        if(i==11){
            System.out.println("Esta placa no esta registrada");
        }
    }
    
    public void buscarCedula(String cedula){
        int i = 0;
        int de = 0;
        int iz = 0;
        
        while(current.getValor()!=null && de!=10){
            de++;
            current=current.getNext();  
        }
        current=entrada;
        while(current.getValor()!=null && iz!=10){
            iz++;
            current=current.getPrevious();    
        }        
        
        while( i!=11){
            
            i++;
            
            if(de<=iz){
                
                if(current.getValor()==null){
                    current=current.getNext();
                }else if(current.getValor().getPlaca().equals(cedula)){
                    current.setValor(null);
                    entrada=current;
                    System.out.println("Vuelva pronto");
                    break;
                } else {
                current=current.getNext();
                }               
            }else{
                
                if(current.getValor()==null){
                    current=current.getPrevious();
                }else if(current.getValor().getPlaca().equals(cedula)){
                    current.setValor(null);
                    entrada=current;
                    System.out.println("Vuelva pronto");
                    break;
                } else {
                    current=current.getPrevious();
                }
            }
        }
        if(i==11){
            System.out.println("Esta placa no esta registrada");
        }
    }
    
    public void imprimir(){
        int i = 0;
        while(i!=10){
            if(current.getValor()!=null){
                System.out.println("\nvehiculo: "+current.mostrarInfo());
                current=current.getNext(); 
            }else{
                System.out.println("Espacio libre");
                current=current.getNext();
            }
            i++;
        }
        current=entrada;
    }

}
