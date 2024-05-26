public class camion extends VehiculoCarga {
    private int numeeje;

    public camion(String marca, String modelo, int año, int kilometraje, int capacidadcarga, int numeeje){
        super(marca, modelo, año, kilometraje, capacidadcarga);
        this.numeeje = numeeje;
    }

    //get and set
public int getnumeeje(){
    return numeeje;

}

public void setnumeje(int numeeje){
    this.numeeje = numeeje;
}

@Override

public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de eje es : " + numeeje);
}

}
