package lab8.queue;

public interface IQueue {
    boolean IsEmpty(); // ures
    boolean IsFull();  //tele
    void enQueue (Object obj);   // add a new element to the queue--hozzaad egy uj elemet a sorhoz
    Object deQueue();   //removes the first element of the queue and returns it--kiveszi az elso elemet a sorbol es visszateriti azt
    void printQueue();  //prints the content of the queue--kiirja a sort

}
