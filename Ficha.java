package tareacorta2;

/**
 *
 * @author Mari
 */
public class Ficha {

    private int posicion;
    private String color;
    
    private Dado dado;

    Ficha(String colorP, int carasP) {
        setColor(colorP);
        setPosicion(0);
        dado = new Dado(carasP);
    }
    
    void avanzar(){
        int pasos = dado.lanzar();
        
        setPosicion(getPosicion() + pasos);
        
        System.out.println("Usted sacó " + pasos + " en el dado.");
        System.out.println("Su posición en el tablero es " + getPosicion());
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }
    
    
}
