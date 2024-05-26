public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("que nota dag");

        //instancia para los tipos de vehiculo

        auto auto = new auto("toyota","corola", 2020, 15000, 5, "gasolina");
        camion camion = new camion("vuvlo", "fh", 2019, 75000, 20000, 4);

        //mostra la informacion del vehiculo

        System.out.println("mostra info del auto ");
        auto.mostrarInfo();

        System.out.println("//");
        System.out.println("//");
        System.out.println("//");
        System.out.println("//");

        System.out.println("mostrar info del camion");
        camion.mostrarInfo();















    }
}
