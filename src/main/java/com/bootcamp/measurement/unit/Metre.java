package com.bootcamp.measurement.unit;

public class Metre extends Length {

    public Metre(float value) {
        super(value, 1000.0f);
    }

    @Override
    public Metre clone(float value) {
        return new Metre(value);
    }
}
