package Homework.OOP.MyDict;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary<K, V> {
    private List<Pair<K, V>> dict;

    public MyDictionary() {
        this.dict = new ArrayList<>();
    }

    public void add(K key, V value){
        Pair<K, V> pair = new Pair<>(key, value);
        dict.add(pair);
    }

    public V get(K key){
        for (Pair<K, V> pair: dict) {
            if(pair.getKey().equals(key)){
                return pair.getValue();
            }
        }
        return null;
    }

    public int getSize(){
        return dict.size();
    }

    private static class Pair<K, V>{
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public Pair<K, V> setKey(K key) {
            this.key = key;
            return this;
        }

        public V getValue() {
            return value;
        }

        public Pair<K, V> setValue(V value) {
            this.value = value;
            return this;
        }
    }
}
