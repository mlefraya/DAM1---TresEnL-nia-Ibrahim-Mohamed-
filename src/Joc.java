public class Joc {
    int[][] tablero = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };

    public Joc(int filas, int columnas) {

    }

    public Joc() {

    }

    // Método para iniciar una nueva partida
    public void novaPartida() {
        // Recorrer cada celda del tablero y establecerla como vacía o en blanco
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = ' '; // ' ' representa una celda en blanco
            }
        }
    }
}



