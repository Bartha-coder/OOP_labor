package lab8.queue;

public interface IQueue {

    boolean IsEmpty();
    boolean IsFull();
    void enQueue (Object obj);
    Object deQueue();
    void printQueue();

}
