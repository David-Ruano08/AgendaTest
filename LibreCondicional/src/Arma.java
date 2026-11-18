import java.util.Scanner;

public class Arma {

    int danio;
    int cargador;
    double rate;
    double recarga;

    public Arma(int danio, int cargador, double rate, double recarga) {
        this.danio = danio;
        this.cargador = cargador;
        this.rate = rate;
        this.recarga = recarga;
    }

    public void mostrarStats() {
        System.out.println("Daño: " + danio);
        System.out.println("Cargador: " + cargador);
        System.out.println("Rate: " + rate);
        System.out.println("Recarga: " + recarga);
    }

    // PRIMER METODO: prueba por cargador
    public void pruebaCargador() {
        int danioTotal = danio*cargador;
        double tiempo = cargador*rate;
        System.out.println("Daño total: "+danioTotal+"\nBalas disparadas: "+cargador+"\nTiempo transcurrido: "+((float) tiempo));
    }

    // SEGUNDO METODO: prueba por tiempo
    public void pruebaPorTiempo() {
        double tiempo2 = 0;
        Scanner sc2 = new Scanner(System.in);
        double tiempoInput = sc2.nextDouble();
        int balasDisparadas = 0;
        while (tiempo2 <= tiempoInput) {
            tiempo2 = tiempo2 + rate*cargador;
            tiempo2 = tiempo2 + recarga;
            balasDisparadas = balasDisparadas + 30;
            if (tiempo2 + rate*cargador <tiempoInput) {
                tiempo2 = tiempo2+rate;
                balasDisparadas++;
            }
        }
        int danioTotal = danio*balasDisparadas;
        float cargadoresUsados = (float) balasDisparadas /cargador;
        System.out.println("Daño total: "+danioTotal+"\nBalas disparadas: "+balasDisparadas+"\nCargadores usados: "+cargadoresUsados+"\nTiempo transcurrido :"+tiempoInput);
    }
}