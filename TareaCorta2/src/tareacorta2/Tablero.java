package tareacorta2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mari
 */
public class Tablero {

    private int casillas;
    private int jugadores;
    private int jugadorActual;
    private boolean victoria;
    private String ganador;
    private ArrayList<Ficha> lista;

    Tablero(int casillasP, int jugadoresP) {
        setCasillas(casillasP);
        setJugadores(jugadoresP);
        setJugadorActual(0);
        setVictoria(false);
        setGanador("");
        setLista(new ArrayList());
    }

    void agregarJugador() {
        int actual = 0;
        String color = "";
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < getJugadores(); i++) {
            actual = i + 1;
            System.out.println("\nJugador " + actual);
            System.out.print("Ingrese el color de su ficha: ");
            color = input.next();
            Ficha ficha = new Ficha(color, 6);
            ArrayList<Ficha> newLista = getLista();
            newLista.add(ficha);
            setLista(newLista);
        }
    }

    void cambiarJugador() {
        int actual = getJugadorActual() + 1;
        
        if (getJugadorActual() != getJugadores()) {
            System.out.println("\nJugador " + actual);
            ArrayList<Ficha> newLista = getLista();
            Ficha ficha = getLista().get(getJugadorActual());
            ficha.avanzar();
            if (ficha.getPosicion() >= getCasillas()) {
                setGanador(ficha.getColor());
                setVictoria(true);
            }
            setJugadorActual(getJugadorActual() + 1);
        } else {
            setJugadorActual(0);
        }
    }

    public int getCasillas() {
        return casillas;
    }

    public void setCasillas(int casillas) {
        this.casillas = casillas;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public int getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(int jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Ficha> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ficha> lista) {
        this.lista = lista;
    }

}
