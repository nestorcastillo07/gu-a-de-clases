public class VehiculoCarga extends Vehiculo {

    private int capacidadcarga;

    //Constructor

public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadcarga){
    super(marca, modelo, año, kilometraje);
    this.capacidadcarga = capacidadcarga;
}

//getter and setter 
 public int getCapacidadcarga(){
    return  capacidadcarga;
 }

 public void setCapacidadcarga(int capacidadcarga){
    this.capacidadcarga = capacidadcarga;
 }

 @Override
 public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("capacidad de carga: " + capacidadcarga +" kg");

 }

}
