
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        short seleccion = 0;
        boolean numeroCorrecto = false;

        while (numeroCorrecto == false) {
            System.out.println("Introduzca el numero correspondiente del arma preferida:\n1 - Fusil de asalto\n2 - Subfusil\n3 - Francotirador pesado\n4 - Lanzacohetes\n5 - Desert Eagle\n");

            seleccion = sc.nextShort();

            if (seleccion < 1 || seleccion > 5) {
                System.out.println("Introduzca una opcion correcta.");
            } else if (seleccion >= 1 && seleccion <= 5) {
                numeroCorrecto = true;
            }
        }

        Arma arma = null;

        switch (seleccion) {
            case 1:
                System.out.println("-- Estadisticas de Fusil de Asalto --");
                arma = new Fusil();
                System.out.println("Daño fusil: " + arma.danio + "\n" + "Cargador fusil: " + arma.cargador + "\n" + "Cadencia de fuego fusil: " + arma.rate + "\n" + "Tiempo de recarga fusil: " + arma.recarga);
                break;

            case 2:
                System.out.println("-- Estadisticas de Subfusil --");
                arma = new Subfusil();
                System.out.println("Daño subfusil: " + arma.danio + "\n" + "Cargador subfusil: " + arma.cargador + "\n" + "Cadencia de fuego subfusil: " + arma.rate + "\n" + "Tiempo de recarga subfusil: " + arma.recarga);
                break;

            case 3:
                System.out.println("-- Estadisticas de Francotirador Pesado --");
                arma = new FrancotiradorPesado();
                System.out.println("Daño francotirador pesado: " + arma.danio + "\n" + "Cargador francotirador pesado: " + arma.cargador + "\n" + "Cadencia de fuego francotirador: " + arma.rate + "\n" + "Tiempo de recarga francotirador pesado: " + arma.recarga);
                break;

            case 4:
                System.out.println("-- Estadisticas de Lanzacohetes --");
                arma = new Lanzacohetes();
                System.out.println("Daño lanzacohetes: " + arma.danio + "\n" + "Cargador lanzacohetes: " + arma.cargador + "\n" + "Cadencia de fuego lanzacohetes: " + arma.rate + "\n" + "Tiempo de recarga lanzacohetes: " + arma.recarga);
                break;

            case 5:
                System.out.println("-- Estadisticas de Desert Eagle --");
                arma = new DesertEagle();
                System.out.println("Daño desert eagle: " + arma.danio + "\n" + "Cargador desert eagle: " + arma.cargador + "\n" + "Cadencia de fuego desert eagle: " + arma.rate + "\n" + "Tiempo de recarga desert eagle: " + arma.recarga);
                break;
        }

        short seleccion2 = 0;
        boolean numeroCorrecto2 = false;

        while (numeroCorrecto2 == false) {
            System.out.println("Como prefiere probar el arma:\n1 - Vaciar un cargador\n2 - Tiempo\n3 - No hacer nada\n");

            seleccion2 = sc.nextShort();

            if (seleccion2 < 1 || seleccion2 > 3) {
                System.out.println("Introduzca una opcion correcta.");
            } else if (seleccion2 >= 1 && seleccion2 <= 3) {
                numeroCorrecto2 = true;
            }
        }

        switch (seleccion2) {
            case 1:
                arma.pruebaCargador();
                break;

            case 2:
                System.out.println("Introduzca el tiempo:");
                arma.pruebaPorTiempo();
                break;

            case 3:
                break;
        }

        sc.close();
    }
}
