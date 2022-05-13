package _2_param_class;

public class Pair<K, V> {

    private final K k;
    private final V v;


    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }

    public void setK(K k){
    }

    public void setV(V v){
    }
}
