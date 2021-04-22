package lab8;

import lab8.queue.ArrayListQueue;
import lab8.queue.IQueue;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IQueue q1 = new ArrayListQueue(5);
        IQueue q2 = new ArrayListQueue(10);
        for( int i=0; i<5; ++i){
            q1.enQueue( i );
            q2.enQueue( i );
        }
        System.out.println( q1.equals( q2 ));
    }
}
