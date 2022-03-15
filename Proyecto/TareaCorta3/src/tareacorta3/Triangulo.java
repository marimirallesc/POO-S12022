package tareacorta3;

/**
 *
 * @author Mari
 */
public class Triangulo extends Figura implements Comparable<Triangulo> {

    private double base;
    private double altura;
    private int lados = 3;

    public Triangulo(double pBase, double pAltura) {
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public int obtenerLados() {
        return lados;
    }

//implementacion del metodo compareTo
    public int compareTo(Triangulo trianPorComparar) {
        double areaPorComparar = trianPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if (miArea == areaPorComparar) {
            int ladosTrian = trianPorComparar.obtenerLados();
            if (ladosTrian == lados) {
                return 0;
            } else if (lados > ladosTrian) {
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
