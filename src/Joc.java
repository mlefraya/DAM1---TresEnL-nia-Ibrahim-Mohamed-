import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Joc {
    private char[][] tablero;
    private char turnoActual;

    // Constructor para inicializar el juego con el tamaño del tablero
    public Joc(int filas, int columnas) {
        tablero = new char[filas][columnas];
        turnoActual = 'X'; // Inicializar el juego con el jugador 'X'
    }

    public Joc() {

    }


    public void novaPartida() {
        // Recorrer cada celda del tablero y establecerla como vacía o en blanco
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = ' '; // representa una celda en blanco
            }
        }
    }


    public void jugar(int fila, int columna) {
        // Verificar si la casilla está vacía antes de colocar la ficha
        if (tablero[fila][columna] == ' ') {
            tablero[fila][columna] = turnoActual; // Colocar la ficha del jugador en la casilla
            cambiarTurno(); // Cambiar al siguiente jugador
        } else {
            System.out.println("La casilla seleccionada ya está ocupada. Por favor, elige otra.");
        }
    }

    // Método para cambiar el turno al siguiente jugador
    private void cambiarTurno() {
        // Si el turno actual es 'X', cambia a 'O', y viceversa
        turnoActual = (turnoActual == 'X') ? 'O' : 'X';
    }


    public boolean jugadaGuanyadora(int fila, int columna) {
        char jugadorActual = tablero[fila][columna];
        // Verificar la fila
        int contador = 0;
        for (int i = 0; i < tablero[0].length; i++) {
            if (tablero[fila][i] == jugadorActual) {
                contador++;
            }
        }
        if (contador == 3) {
            return true;
        }

        // Verificar la columna
        contador = 0;
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][columna] == jugadorActual) {
                contador++;
            }
        }
        if (contador == 3) {
            return true;
        }

        // Verificar la diagonal principal (si la casilla está en la diagonal principal)
        if (fila == columna) {
            contador = 0;
            for (int i = 0; i < tablero.length; i++) {
                if (tablero[i][i] == jugadorActual) {
                    contador++;
                }
            }
            if (contador == 3) {
                return true;
            }
        }

        // Verificar la diagonal secundaria (si la casilla está en la diagonal secundaria)
        if (fila + columna == tablero.length - 1) {
            contador = 0;
            for (int i = 0; i < tablero.length; i++) {
                if (tablero[i][tablero.length - 1 - i] == jugadorActual) {
                    contador++;
                }
            }
            if (contador == 3) {
                return true;
            }
        }

        // Si no hay tres en raya en ninguna dirección, devuelve false
        return false;
    }


    // Método para copiar el tablero actual
    private char[][] copiarTablero() {
        char[][] copia = new char[tablero.length][tablero[0].length];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                copia[i][j] = tablero[i][j];
            }
        }
        return copia;
    }

    // Otros métodos del juego pueden seguir aquí...
}

