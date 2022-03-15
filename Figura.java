package tareacorta3;

/**
 *
 * @author Mari
 */

//figura es abstracta porque tiene al menos un metodo abstracto
public abstract class Figura{
    //el siguiente metodo es abstracto porque no podemos calcular el area
    //sin saber de que figura se trata
    public abstract double calcularArea();
    public abstract int obtenerLados();
}
