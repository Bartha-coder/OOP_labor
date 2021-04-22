package lab8.dictionary;

import java.util.ArrayList;

public class ArrayLIstDictionary implements IDictionary{
    
    private ArrayList<String> words;
    private static ArrayLIstDictionary instance;

    public ArrayLIstDictionary(ArrayList<String> words) {
        this.words = words;
    }
/*
    public  static ArrayLIstDictionary newInstance() {

        android.os.Bundle args = new Bundle();

        ArrayLIstDictionary fragment = new ArrayLIstDictionary();
        fragment.setArguments(args);
        return fragment;
    }
    */
    @Override
    public boolean add(String a) {
        return false;
    }

    @Override
    public boolean find(String b) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
