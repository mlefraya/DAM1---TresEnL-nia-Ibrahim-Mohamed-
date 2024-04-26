import java.util.Scanner;

public class TUI {
    Scanner sc = new Scanner(System.in);

    boolean partida = false;
    boolean cpartida = false;
    boolean configuracion = false;
    public void mostrarMenu(){

        String op1 = "1. Nueva partida";
        String op2 = "2. Cargar partida";
        String op3 = "3. Configuración";
        String op4 = "4. Salir";

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);

        int opcion = sc.nextInt();

        if (opcion == 1) {

             partida = true;
            System.out.println("Has seleccionado, ¡ Nueva partida !");
            System.out.println("------------------");

        } else if (opcion == 2) {

            cpartida = true;
            System.out.println("Has seleccionado, ¡ Cargar partida !");
            System.out.println("------------------");
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(op4);
        } else if (opcion == 3) {
            configuracion = true;


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

    public void recollirJugada(){
        char[][] tablero = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        System.out.println("¿En qué casilla te quieres posicionar?");
        int filas = sc.nextInt();
        int columnas = sc.nextInt();


        for (int i=0; i< 3; i++){
            for (int j=0; j<3; j++){
                tablero[filas-1][columnas-1] = 'X';
                System.out.print(tablero[i][j]);
                if (j<2) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public void fiDePartida(){
        System.out.println("Método incompleto");
    }
    }

