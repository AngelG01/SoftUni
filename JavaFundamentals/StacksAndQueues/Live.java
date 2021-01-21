import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Live {
    public static void main(String[] args) {

        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(12);
        priorityQueue.offer(312);
        priorityQueue.offer(11);
        priorityQueue.offer(4678);
        priorityQueue.offer(213);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}

