package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

//제네릭 도입
public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<E>[] buckets;
    private int size;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
       initBuckets();
    }

    public MyHashSetV3(int Capacity) {
        this.capacity = Capacity;
        initBuckets();
    }

    private void initBuckets(){
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add( E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket  = buckets[hashIndex];

        //중복체크 O(n)
        if(bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue); //O(1)
        LinkedList<E> bucket  = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //최악 O(n) -> 평균 O(1)
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket  = buckets[hashIndex];
        boolean result = bucket.remove(value);

        if(result) {
            size--;
            return true;
        }else{
            return false;
        }
    }

    private int hashIndex(E value) {
        //해시 코드의 결과로 음수가 나올 수 있으므로 절댓값 사용
        return Math.abs(value.hashCode()) % capacity ;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
