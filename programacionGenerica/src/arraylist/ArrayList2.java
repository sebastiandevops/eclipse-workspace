package arraylist;

/**
 * @author sebastian
 *
 */
public class ArrayList2 {

    /**
     * @param z
     */
    public ArrayList2 (int z) {
        datosElemento = new Object[z];
    }

    /**
     * @param i
     * @return
     */
    public Object get(int i) {
        return datosElemento[i];
    }

    /**
     * @param o
     */
    public void add(Object o) {
        datosElemento[i] = o;
        i++;
    }

    private Object[] datosElemento;
    private int i = 0;
}
