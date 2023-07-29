public class Partida {
    public static final int NUMERO_MAX_DE_NIVELES = 4;
    private final int jugadoresEnPartida;
    private static int vidaActualDeJugador;
    private static int puntajeActual;
    private Nivel[] nivelesDePartida;

    public Partida(int jugadoresEnPartida) {
        this.jugadoresEnPartida = jugadoresEnPartida;
        nivelesDePartida = new Nivel[NUMERO_MAX_DE_NIVELES];
        asignarNivelesEnPartida();
        iniciarPartida();
        obtenerPuntajeDePartida();
    }

    private void asignarNivelesEnPartida() {
        nivelesDePartida[0] = new Nivel(3, new Valcon());
        nivelesDePartida[1] = new Nivel(6, new Valcon(), new Ovape());
        nivelesDePartida[2] = new Nivel(7, new Valcon(), new Ovape());
        nivelesDePartida[3] = new Nivel(1, new BossFinal());
    }

    private void iniciarPartida() {
        for (Nivel nivelAsignado : nivelesDePartida) {
            if (haPasadoElNivel()) {
                recorrerNivel(nivelAsignado);
            }
            finDePartida();
        }

    }

    private void recorrerNivel(Nivel nivelAsignado) {
        nivelAsignado.crearNuevoLaberinto();
    }

    private boolean haPasadoElNivel() {
        return true;
    }

    private void finDePartida() {
        // todo: conectar el fin de partida con la interfaz gráfica
        System.out.println("Se ha culminado la partida");
    }

    public int obtenerPuntajeDePartida() {
        return puntajeActual;
    }
}
