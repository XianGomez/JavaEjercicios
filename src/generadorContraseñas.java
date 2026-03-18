package src;
import java.util.Random;


public class generadorContraseñas {
    public static void main(String[] args) {
        
        int longitud = 8;
        
        String contraseña = (generadorConstraseña(longitud));

        System.out.println("La contraseña es " + contraseña);
        
    }

    public static int generaAleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt(min, max + 1);
    }

    public static String generadorConstraseña(int longitud) {
        String contraseña = "";
        char caracter = 0;
        for (int i = 0; i <= longitud; i++) {
            int opcion =  generaAleatorio(1, 3);
            switch(opcion) {
                case 1 :
                    caracter = (char) generaAleatorio('A', 'Z');
                    break;
                case 2:
                    caracter = (char) generaAleatorio('a', 'z');
                    break;
                case 3:
                    caracter = (char) generaAleatorio('0', '9');
                    break;
            }
            contraseña += caracter;
        }
        return contraseña;
    }

    
    
}
