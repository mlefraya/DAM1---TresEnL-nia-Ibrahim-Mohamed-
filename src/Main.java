import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TUI menu = new TUI();

        menu.mostrarMenu();

        if (menu.partida) {
         menu.mostrarTaulell();
         menu.recollirJugada();
        }
    }


    }
