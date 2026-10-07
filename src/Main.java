import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean opcionValida = false;
        System.out.print("Seleccione una opcion: ");
        System.out.println("1. Añadir contacto -- 2. Mostrar contacto -- 3. Buscar contacto -- 4. Salir");
        Scanner sc = new Scanner(System.in);
        short opcionSeleccionada = sc.nextShort();
        if (opcionSeleccionada == 1) {
            opcionValida = true;
            System.out.println("Añadir contacto");
        }
        if (opcionSeleccionada == 2) {
            opcionValida = true;
            System.out.println("Mostrar contacto");
        }
        if (opcionSeleccionada == 3) {
            opcionValida = true;
            System.out.println("Buscar contacto");
        }
        if (opcionSeleccionada == 4) {
            opcionValida = true;
            System.out.println("Saliendo...");
        }
        if (opcionValida == false) { // Pendiente de actualizar cuando aprendamos bucles
            System.out.println("Error; seleccione una opcion correcta.");
        }
    }
}