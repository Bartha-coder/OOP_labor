package lab8.stack;

import java.util.ArrayList;
import java.util.Collection;

public class StackInheritance extends ArrayList<Object> {

    private final int capacity;

    public StackInheritance( int capacity) {
        super(capacity);
        this.capacity = capacity;
    }

    public boolean isFull(){
        if(super.size() == capacity){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(super.size() == 0 ){
            return true;
        }
        return false;
    }

    public int getSize(){
        return  super.size();
    }

    public void push(Object obj){
        if(super.size() != capacity){
            super.add(obj);
        }
    }

    public Object top() {
        if(!isEmpty()){
            return super.get(super.size()-1);
        }
        return null;
    }


    public void pop(){
        if(!isEmpty()){
            super.remove(super.size()-1);
        }
    }




}
