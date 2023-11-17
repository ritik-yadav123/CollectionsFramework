package SetInterface;

import java.util.*;

public class QueueInterfaceExamples {
    static void priorityQueueExamples(){
      //  PriorityQueue<Integer> pq=new PriorityQueue<>();  // by default min priority q
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//max q
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll()); // on remove automatically min element comes first
        System.out.println(pq);
    }
    static void queueExamples(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(5);
        q.offer(9);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }
  static void arrayDequeExamples(){
      Deque<Integer> dq=new ArrayDeque<>();
      dq.addFirst(3);
      dq.addFirst(5);
      dq.addLast(7);
      dq.addLast(9);
      System.out.println(dq.peekFirst());
      System.out.println(dq.peekLast());
      System.out.println(dq);

  }
    public static void main(String[] args) {
       // priorityQueueExamples();
        //queueExamples();
        arrayDequeExamples();
    }
}
