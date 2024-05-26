public class vehiculopasajero extends Vehiculo {

    private int numpasajero;
    // Constructor 
public vehiculopasajero(String marca, String modelo, int año, int kilometraje, int numpasajero){

    super(marca, modelo, año, kilometraje);
    this.numpasajero = numpasajero;
}
//Getter y setter para numpasajero 
public int getnumpasajero(){
    return numpasajero;
}

public void setnumpasajero(int numpasajero){
    this.numpasajero = numpasajero;
}

// Sobre escribir el metodo mostrar info;
@Override 
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("num psajero: " + numpasajero);
}

@Override 
public void realizarmantenimiento(){
    super.realizarmantenimiento();
}


}
