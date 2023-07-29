public class Nivel {
    private final int numeroDeEnemigos;
    private final Mostruo[] tipoDeMostruo;
    private static int contador = 1;
    public Nivel(int numeroDeEnemigos, Mostruo...tipoDeMostruo) {
        this.numeroDeEnemigos = numeroDeEnemigos;
        this.tipoDeMostruo = tipoDeMostruo;
    }

    public void crearNuevoLaberinto() {
        System.out.println("Nivel " + contador);
        Laberinto laberintoDelNivel = new Laberinto (numeroDeEnemigos);
        contador++;
    }

}
