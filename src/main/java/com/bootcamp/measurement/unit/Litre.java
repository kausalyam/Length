package com.bootcamp.measurement.unit;

public class Litre extends Volume {

    public Litre(float litreValue) {

        super(litreValue, 1000.0f);
    }

    public Litre clone(float value) {
        return new Litre(value);
    }
}
