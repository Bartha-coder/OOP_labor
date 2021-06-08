/*
import java.util.ArrayList;

public class StackAggregation {
    {

        protected ArrayList<Object> items;
        private final int capacity;


        public StackAggregation( int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

        public boolean isFull () {
        if (items.size() == capacity) {
            return true;
        }
        return false;
    }

        public boolean isEmpty () {
        if (items.size() == 0) {
            return true;
        }
        return false;
    }

        public int getSize () {
        return this.items.size();
    }

        public void push (Object obj){
        if (!isFull()) {
            items.add(obj);
        }
    }

        public Object top () {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        }
        return null;
    }


        public void pop () {
        if (!isEmpty()) {
            items.remove(items.size() - 1);
        }
    }


        @Override
        public String toString () {
        return "StackAggregation{" + "items=" + items + ", capacity=" + capacity + '}';
    }
    }
}
*/