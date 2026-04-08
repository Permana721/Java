package _21_AbstactCollection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;
/*
Struktur data collection di Java selalu berkembang, namun biasanya algoritma dasarnya selamu sama antar jenis collection
Hampir semua interface collection di Java sudah disediakan abstract class nya sebagai dasar algoritma nya, dan hampir semua implementasi class konkrit nya selalu extends abstract class collection
Hal ini mempermudah kita, jika ingin membuat collection manual, kita tidak perlu membuat dari awal, kita bisa menggunakan abstract class yang sudah disediakan
 */
public class SingleQueue <E> extends AbstractQueue<E> {

    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(E e) {
        if(data == null){
            data = e;
            return true;
        }
        return false;
    }

    @Override
    public E poll() {
        E temp = data;
        data = null;
        return temp;
    }

    @Override
    public E peek() {
        return data;
    }
}
