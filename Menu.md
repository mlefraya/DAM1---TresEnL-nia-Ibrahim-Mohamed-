import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        String op1 = "1. Nueva partida";
        String op2 = "2. Cargar partida";
        String op3 = "3. Configuración";
        String op4 = "4. Salir";

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);

        int opu = sc.nextInt();

        if (opu == 1){
            System.out.println("Comenzando nueva partida");
        } else if (opu == 2) {
            System.out.println("Cargando partida..");
        } else if (opu == 3) {
            System.out.println("Ajustar dificultad");
            System.out.println("Ajustar sonido");
        } else if (opu == 4) {
            System.out.println("Cerrando aplicación");
        }else {
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(op4);
        }
    }
}
