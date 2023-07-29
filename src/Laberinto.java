import java.util.Random;

public class Laberinto {
    //todo: Implementar posible try catch cuando haya dimensiones incorrectas. Talvez no sea necesario.
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static final char MURO = '#';
    private static final char BLOQUE_NO_DESTRUIBLE = '1';
    private static final char ZONA_LIBRE = '0';
    private static final char BLOQUE_DESTRUIBLES = '2';
    private static final char PUERTA = '5';

    private final int numeroDeEnemigos;

    private final char[][] laberinto;

    public Laberinto(int numeroDeEnemigos ) {
        this.numeroDeEnemigos = numeroDeEnemigos;
        laberinto = new char[FILAS][COLUMNAS];
        crearMapa();
        presentarMapa();
    }

    private void presentarMapa() {
        for (char[] mapa : laberinto) {
            System.out.println(mapa);
        }
    }

    private void crearMapa() {

        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (estaEnElBorde(fila, columna)) {
                    laberinto[fila][columna] = MURO;
                } else if (intersecciónEsPar(fila, columna)) {
                    laberinto[fila][columna] = BLOQUE_NO_DESTRUIBLE;
                } else if (esZonaLibre(fila, columna)) {
                    laberinto[fila][columna] = ZONA_LIBRE;
                } else
                    laberinto[fila][columna] = crearBloqueDestruibleYEspacio();
            }
        }
    }

    private static boolean esZonaLibre(int fila, int columna) { //zona libre corresponde a los primeros bloques de la parte superior izquierda de la Matriz.
        return (fila == 1 && columna == 1) || (fila == 1 && columna == 2) || (fila == 2 && columna == 1);
    }

    private static boolean intersecciónEsPar(int fila, int columna) { // método que verifica si existe intersecciones de filas y columnas cuando son pares.
        return fila % 2 == 0 && columna % 2 == 0;
    }

    private static boolean estaEnElBorde(int fila, int columna) { // método que verifica si las filas o las columnas están en el borde de la matriz
        return fila == 0 || columna == 0 || fila == FILAS - 1 || columna == COLUMNAS - 1;
    }

    private char crearBloqueDestruibleYEspacio() { // método que devuelve aleatoriamente casillas en donde se van a crear los bloques destructibles.
        Random random = new Random();
        int numeroRandom = random.nextInt(2) + 2;
        return (numeroRandom == 2) ? BLOQUE_DESTRUIBLES : ZONA_LIBRE;
    }

}
