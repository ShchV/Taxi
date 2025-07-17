package com.laba.taxi.interfaces;

public interface Schedulable {
    boolean conflictsWith(Schedulable other);
}
