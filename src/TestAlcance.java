public class TestAlcance {

    public static void main (String [] args) {
        System.out.println ("pruebas condicionales");

        int edad = 17;
        int cantidadPersonas = 1;
        boolean acompañado = false;

        if (cantidadPersonas >= 2) {
            acompañado  = true;
        } else {
            acompañado = false;
        }

        if (edad >= 18 || acompañado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
    }
}