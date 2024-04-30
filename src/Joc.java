public class Joc {
    private char[][] taulell;
    private char torn;

    public Joc() {
        taulell = new char[3][3];
        // Inicializar el tablero con espacios en blanco
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taulell[i][j] = ' ';
            }
        }
        torn = 'X'; // Comienza el jugador X
    }

    // Otros métodos de la clase Joc...

    public boolean jugar(int fila, int columna) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
            System.out.println("Movimiento inválido. Fuera del rango del tablero.");
            return false;
        }
        if (taulell[fila][columna] != ' ') {
            System.out.println("La casilla ya está ocupada. Elige otra.");
            return false;
        }
        taulell[fila][columna] = torn;
        if (torn == 'X') {
            torn = 'O';
        } else {
            torn = 'X';
        }
        return true;
    }

    public boolean jugadaGuanyadora(int fila, int columna) {
        // Guardar el estado actual del tablero y el turno
        char[][] tableroTemp = clonarTablero();
        char turnoTemp = torn;

        // Realizar la jugada en la fila y columna especificadas
        taulell[fila][columna] = torn;

        // Verificar si hay una jugada ganadora
        boolean jugadaGanadora = verificarGanador();

        // Restaurar el estado original del tablero y el turno
        taulell = tableroTemp;
        torn = turnoTemp;

        return jugadaGanadora;
    }

    public boolean verificarGanador() {
        // Verificar ganador en filas
        for (int i = 0; i < 3; i++) {
            if (taulell[i][0] != ' ' && taulell[i][0] == taulell[i][1] && taulell[i][1] == taulell[i][2]) {
                System.out.println("¡Felicidades! ¡El jugador " + taulell[i][0] + " ha ganado!");
                return true;
            }
        }

        // Verificar ganador en columnas
        for (int j = 0; j < 3; j++) {
            if (taulell[0][j] != ' ' && taulell[0][j] == taulell[1][j] && taulell[1][j] == taulell[2][j]) {
                System.out.println("¡Felicidades! ¡El jugador " + taulell[0][j] + " ha ganado!");
                return true;
            }
        }

        // Verificar ganador en diagonal principal
        if (taulell[0][0] != ' ' && taulell[0][0] == taulell[1][1] && taulell[1][1] == taulell[2][2]) {
            System.out.println("¡Felicidades! ¡El jugador " + taulell[0][0] + " ha ganado!");
            return true;
        }

        // Verificar ganador en diagonal secundaria
        if (taulell[0][2] != ' ' && taulell[0][2] == taulell[1][1] && taulell[1][1] == taulell[2][0]) {
            System.out.println("¡Felicidades! ¡El jugador " + taulell[0][2] + " ha ganado!");
            return true;
        }

        return false; // No hay ganador
    }


    private char[][] clonarTablero() {
        // Método auxiliar para clonar el tablero actual
        char[][] tableroClonado = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tableroClonado[i][j] = taulell[i][j];
            }
        }
        return tableroClonado;
    }
}



