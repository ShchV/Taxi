package com.laba.taxi.user.driver;

import com.laba.taxi.annotations.EntityInfo;

@EntityInfo(passenger = "Victoria", date = "2025-07-25")
public record Pair<K, V>(K key, V value) {
    @Override
    public String toString() {
        return "Pair " +
                "key=" + key +
                ", value=" + value +
                ' ';
    }
}