public class Ejercicio1 {

    //Logica
    public static String saludo(String nombre){
        String cadenaSaludo = "hola " + nombre;
        return cadenaSaludo;
    }
    public static void main(String[] args) {
        var nombre ="Jaime Rodriguez";

        var resultado = saludo(nombre);

        System.out.println(resultado);
    }

     
}
