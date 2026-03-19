import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int numeroRandom = r.nextInt(1, 101);
        Scanner sc = new Scanner(System.in);
        
        boolean seguir = true;
        int intentos = 0;
        int maxIntentos = 5;

        while (seguir) {
            System.out.print("Introduce un numero del 1 al 100: ");
            int numeroInput = sc.nextInt();
            intentos++;

            if (numeroInput == numeroRandom) {
                System.out.println("¡Número acertado en " + intentos + " intentos!");
                seguir = false;
            } else {
                
                if (intentos >= maxIntentos) {
                    System.out.println("Has agotado tus " + maxIntentos + " intentos. El número era: " + numeroRandom);
                    seguir = false;
                } else {
                    // Pistas
                    if (numeroInput > numeroRandom) {
                        System.out.println("El número es más pequeño.");
                    } else {
                        System.out.println("El número es más grande.");
                    }
                    System.out.println("Llevas " + intentos + " intentos.");
                }
            }
        }
        sc.close();
    }
}