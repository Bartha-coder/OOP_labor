package lab8.queue;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{

    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        //lefoglalni az arraylistnek is
        this.items = new ArrayList<>(CAPACITY);
    }

    @Override
    public boolean IsEmpty() {
       return items.size()==0;
    }

    @Override
    public boolean IsFull() {
        return items.size() == CAPACITY;
        }

    @Override
    public void enQueue(Object obj) {
            if(!IsFull()){
                this.items.add(obj);
            }
        else {
                System.out.println("tele van vigyazz");
            }
    }

    @Override
    public Object deQueue() {
        if(!IsEmpty()){
            //ez egy segedvaltozo az aux
           Object aux= this.items.get(0);
           this.items.remove(0);
           return aux;
        }
        return null;
    }

    @Override
    public void printQueue() {
        for(Object i : items){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//csak referenciat nez//ugyanaz a referecia(cim)
        if (!(o instanceof ArrayListQueue)) return false;//instanceof-peldany- megnezi hogy o peldanya e az arraylistqueuenek
        ArrayListQueue that = (ArrayListQueue) o;//that a valtozo arraylistqueue tipus

        if(this.items.size() != that.items.size())return false;
        for(int i = 0; i < this.items.size(); ++i){
            if(this.items.get(i) != that.items.get(i))return false;
        }
        return true;
    }
    
}
