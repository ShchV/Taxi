package com.laba.taxi.ride;

import java.util.LinkedList;
import java.util.List;

public class HistoryBase<T> {
    protected final List<T> historyList = new LinkedList<>();

    public void addItem(T item) {
        historyList.add(item);
    }

    public T getItem(int index) {
        if (index >= 0 && index < historyList.size()) {
            return historyList.get(index);
        }
        return null;
    }

    public List<T> getAllItems() {
        return historyList;
    }
}
