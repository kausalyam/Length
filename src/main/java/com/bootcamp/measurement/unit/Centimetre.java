package com.bootcamp.measurement.unit;

public class Centimetre extends Length {

    public Centimetre(float centiMetreValue) {
        super(centiMetreValue, 10.0f);
    }

    @Override
    public Centimetre clone(float value) {
        return new Centimetre(value);
    }
}
