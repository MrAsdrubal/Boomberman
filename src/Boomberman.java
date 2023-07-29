import java.util.ArrayList;
public class Boomberman {
    private ArrayList<Partida> partidas = new ArrayList<>();
    public Boomberman(ModoDeJuego modoDeJuego) {
        Partida partidaEnCurso = new Partida(modoDeJuego.getNumeroDeJugadoresEnPartida());
        partidas.add(0, partidaEnCurso);
    }
    public double obtenerPuntajeDePartidaAnterior() {
        Partida partidaRequerida = partidas.get(0);
        return  partidaRequerida.obtenerPuntajeDePartida();
    }

}
