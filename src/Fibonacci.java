import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int posicion;
        do {
            System.out.println("Introduce una posicion mayor o igual que 1");
            posicion = sn.nextInt();

            if (posicion < 1){
                System.out.println("Debes introducir un valor mayor o igual que 1");
            }
        } while (posicion < 1) ;

        int fibonacci = serieFibonacci(posicion);

        System.out.println("En la posicion " + posicion + " está el numero "+ fibonacci);
    }

    public static int serieFibonacci(int posicion) {

        int numero1 = 0;
        int numero2 = 1;
        int suma = 1;
        
        for (int i = 1; i < posicion; i++) {
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
        } return suma;
    }
}
