package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        //데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        //데이터 단순 조회
        System.out.println("deque.peek() = " + deque.peek());

        //데이터 조회
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);




    }
}
