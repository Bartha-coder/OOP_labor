package lab8.queue;

import static java.lang.Long.SIZE;

public class CircularQueue implements IQueue{

    private Object[] items;
    private final int CAPACITY;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public boolean IsEmpty() {
        return items.length==0;
    }

    @Override
    public boolean IsFull() {
        if (front == 0 && rear == CAPACITY-1)return true;
        if(rear +1 == front )return true;
        return false;
    }

    @Override
    public void enQueue(Object obj) {
        if(!IsFull()){
            if(front == -1){
                front = 0;
            }
            rear = (rear +1)%CAPACITY;
            items[rear] = obj;
        }
        else{
            System.out.println("a lista tele van vigyazz");
        }
    }

    @Override
    public Object deQueue() {
    int element;
        if(!IsEmpty()){
            element=front;
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{front =(front +1 ) % SIZE;}
            return (element);
        }
        return null;
    }

    @Override
    public void printQueue()
    {
        for(Object i : items){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
