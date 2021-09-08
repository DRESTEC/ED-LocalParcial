
package parcial_ed.pkg1;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        ListaCircuDoble parqueadero=new ListaCircuDoble();

        parqueadero.lista();
        
        int input = -1;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar \n2. Buscar por placa\n3. Buscar por cedula \n4. Imprimir \n0. Salir"));

            switch (input) {
                case 1:
                    String placa = JOptionPane.showInputDialog("Digite la placa");
                    String marca = JOptionPane.showInputDialog("Digite la marca");
                    String cedula = JOptionPane.showInputDialog("Digite su cedula");
                    Vehiculo n = new Vehiculo(placa, marca, cedula);
                    
                    parqueadero.add(n);
                    break;
                case 2:
                    String placa2 = JOptionPane.showInputDialog("Digite la placa");
                    parqueadero.buscarPlaca(placa2);
                    break;

                case 3:
                    String cedula2 = JOptionPane.showInputDialog("Digite su cedula");
                    parqueadero.buscarCedula(cedula2);
                    break;
                case 4:
                    parqueadero.imprimir();
                    break;
            }
        } while (input != 0);        
    } 
}
