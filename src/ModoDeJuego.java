public enum ModoDeJuego {
    MODO_CLÁSICO(1),
    MULTIJUGADOR(2);
    private final int numeroDeJugadoresEnPartida;

    ModoDeJuego(int numeroDeJugadoresEnPartida) {
        this.numeroDeJugadoresEnPartida = numeroDeJugadoresEnPartida;
    }

    public int getNumeroDeJugadoresEnPartida() {
        return numeroDeJugadoresEnPartida;
    }
}
