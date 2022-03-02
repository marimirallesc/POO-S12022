package tareacorta2;

import java.util.Scanner;
        
/**
 *
 * @author Mari
 */
public class TareaCorta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int casillas = 0;
        int jugadores = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de casillas del tablero: ");
        casillas = input.nextInt();
        System.out.print("Ingrese la cantidad de jugadores del tablero: ");
        jugadores = input.nextInt();
        Tablero tablero = new Tablero(casillas, jugadores);
        tablero.agregarJugador();
        while (tablero.isVictoria() == false)
            tablero.cambiarJugador();
        System.out.println("\nEl jugador de color " + tablero.getGanador() + " es el ganador del juego");
    }

}
