import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TUI menu = new TUI();
        menu.recollirJugada();
    }
    public void NovaPartida() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Comenzando nueva partida");
                break;
            case 2:
                System.out.println("Cargando partida...");
                break;
            case 3:
                System.out.println("Ajustar dificultad");
                System.out.println("Ajustar sonido");
                break;
            case 4:
                System.out.println("Cerrando aplicación...");
                break;
            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");
                //mostrarMenu(); // Vuelve a mostrar el menú si la opción es inválida
                break;
        }
    }
}