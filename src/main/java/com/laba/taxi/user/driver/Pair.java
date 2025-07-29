package com.laba.taxi.user.driver;

<<<<<<< HEAD
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
=======
import com.laba.taxi.annotations.EntityInfo;

@EntityInfo(passenger = "Victoria", date = "2025-07-25")
public record Pair<K, V>(K key, V value) {
    @Override
    public String toString() {
        return "Pair " +
                "key=" + key +
                ", value=" + value +
                ' ';
>>>>>>> 7e46d72 (Final project)
    }
}
