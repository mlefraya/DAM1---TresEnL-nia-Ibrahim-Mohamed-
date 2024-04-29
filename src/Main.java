import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TUI menu = new TUI();

        menu.mostrarMenu();

        if (menu.partida) {
            menu.mostrarTaulell();
            menu.recollirJugada(); //
        } else if (menu.cpartida) {
            menu.mostrarTaulell();
        } else if (menu.configuracion) {
            System.out.println("Has seleccionado, Configuración. . .");
            System.out.println("------------------");
            System.out.println("Nivel de dificultad");
            System.out.println("Ajustar sonido");
        }
    }


}
