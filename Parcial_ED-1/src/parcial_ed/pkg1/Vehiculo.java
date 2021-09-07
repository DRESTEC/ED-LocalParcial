
package parcial_ed.pkg1;

public  class Vehiculo {
    
    private String placa;
    private String marca;
    private int cedula;

  
    public Vehiculo(String placa, String marca, int cedula){
        setPlaca(placa);
        setMarca(marca);
        setCedula(cedula);
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCedula() {
        return cedula;
    }

    private void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
