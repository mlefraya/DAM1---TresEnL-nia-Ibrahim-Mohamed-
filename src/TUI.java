import java.util.Scanner;

public class TUI {

    public void mostrarMenu(){

        String op1 = "1. Nueva partida";
        String op2 = "2. Cargar partida";
        String op3 = "3. Configuración";
        String op4 = "4. Salir";

        Scanner sc = new Scanner(System.in);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);

        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Has seleccionado, ¡ Nueva partida !");
            System.out.println("------------------");
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(op4);
        } else if (opcion == 2) {
            System.out.println("Has seleccionado, ¡ Cargar partida !");
            System.out.println("------------------");
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(op4);
        } else if (opcion == 3) {
            System.out.println("Has seleccionado, Configuración. . .");
            System.out.println("------------------");
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(op4);
        } else if (opcion == 4) {
            System.out.println("Has seleccionado, ¡ Salir del menú !");
            System.out.println("------------------");
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(op4);
        } else {
            System.out.println("Elección inválida");
            System.out.println("------------------");
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(op4);
        }

    }

    //////

    public void mostrarTaulell(){

        int[][] tablero = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        for (int i=0; i< 3; i++){
            for (int j=0; j<3; j++){
                System.out.print(tablero[i][j]);
                if (j<2) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Turno del jugador 1");
    }
    }

