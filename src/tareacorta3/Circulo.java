package tareacorta3;

/**
 *
 * @author Mari
 */
public class Circulo extends Figura implements Comparable<Circulo> {

    private double radio;
    private int lados = 1;

    public Circulo(double pRadio) {
        radio = pRadio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }
    
    public int obtenerLados(){
        return lados;
    }

//implementacion del metodo compareTo
    public int compareTo(Circulo circPorComparar) {
        double areaPorComparar = circPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if (miArea == areaPorComparar) {
            int ladosCirc = circPorComparar.obtenerLados();
            if (ladosCirc == lados) {
                return 0;
            } else if (lados > ladosCirc) {
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
