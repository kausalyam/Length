package com.bootcamp.measurement.unit;


public class MilliLitre extends Volume{

    public MilliLitre(float milliLitreValue) {
        super(milliLitreValue, 1.0f);
    }

    public MilliLitre clone(float value) {
        return new MilliLitre(value);
    }
}
