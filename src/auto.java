public class auto extends vehiculopasajero {

    private String tipodecombustible;

    public auto(String marca, String modelo, int año, int kilometraje,int numpasajero, String tipodecombustible){
        super(marca, modelo, año, kilometraje, numpasajero);
        this.tipodecombustible = tipodecombustible;
    }
    //getter and setter

public String gettipodecombustible(){
    return tipodecombustible;
}
public void settipodecombustible( String tipodecombustible){
    this.tipodecombustible = tipodecombustible;
}
@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("el tipo de combustible es : " + tipodecombustible);
}

}
