package Heap;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        HeapWithTree<Integer> heap = new HeapWithTree<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }

}