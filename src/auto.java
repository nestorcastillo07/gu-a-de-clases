public class auto extends vehiculopasajero {

    private String tipodecombustible;
    private int Costodelmantenimiento;
    private int recorrido ;
    public static int costo(int Costodelmantenimiento, int recorrido){
        int costototal = Costodelmantenimiento*recorrido;
        return costototal;


    }

    
   
    
    
   
    
    

    public auto(String marca, String modelo, int año, int kilometraje,int numpasajero, String tipodecombustible, int Costodelmantenimiento,int recorrido){
        super(marca, modelo, año, kilometraje, numpasajero);
        this.tipodecombustible = tipodecombustible;
        this.Costodelmantenimiento = Costodelmantenimiento;
        this.recorrido = recorrido;
    }
    //getter and setter

public String gettipodecombustible(){
    return tipodecombustible;
}
public void settipodecombustible( String tipodecombustible){
    this.tipodecombustible = tipodecombustible;
}
public int getCostodelmantenimiento(){
    return Costodelmantenimiento;
}

public void setCostodelmantenimiento(int Costodelmantenimiento){
    this.Costodelmantenimiento = Costodelmantenimiento;
}
public int getrecorrido(){
    return recorrido;
}
public void setrecorrido(int recorrido){
    this.recorrido = recorrido;
}

 

@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("el tipo de combustible es : " + tipodecombustible);
}
@Override 
public void realizarmantenimiento(){
    super.realizarmantenimiento();
    System.out.println("Adicional a este tipo de vehiculo: cambio del combustible");
}



public void costodemantenimiento(){
    System.out.println("el costo por kilometro es de: " + Costodelmantenimiento);
    System.out.println("usted ha recorrido: " + recorrido + "km");
    System.out.println("el costo total es "+costo(Costodelmantenimiento, recorrido));

}

}


