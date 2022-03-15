package tareacorta3;

/**
 *
 * @author Mari
 */
public class Rectangulo extends Figura implements Comparable<Rectangulo> {

    private double base;
    private double altura;
    private int lados = 4;

    public Rectangulo(double pBase, double pAltura) {
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public int obtenerLados() {
        return lados;
    }

    //implementacion del metodo compareTo
    public int compareTo(Rectangulo rectPorComparar) {
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if (miArea == areaPorComparar) {
            int ladosRect = rectPorComparar.obtenerLados();
            if (ladosRect == lados) {
                return 0;
            } else if (lados > ladosRect) {
                return 1;
            } else {
                return -1;
            }
        } else if (miArea > areaPorComparar) {
            return 1;
        } else {
            return -1;
        }
    }
}
