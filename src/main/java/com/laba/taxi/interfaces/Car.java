package com.laba.taxi.interfaces;

public interface Car {
    String getModel();
    String getColor();
    int getCarNumber();
    boolean isAvailable();
    void setAvailable(boolean available);

}
