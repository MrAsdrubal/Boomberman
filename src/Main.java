
public class Main{
    public static void main(String[] args) {
        Boomberman juegoBomberman = new Boomberman(ModoDeJuego.MULTIJUGADOR);
        System.out.println(juegoBomberman.obtenerPuntajeDePartidaAnterior());
    }
}