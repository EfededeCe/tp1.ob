public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        int resultado = suma(2,5,10);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementaPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}


class Coche{
    int puertas = 3;
    public void incrementaPuertas(){
        this.puertas++;
    }
}

