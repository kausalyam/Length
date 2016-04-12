package com.bootcamp.measurement.unit;

/**
 * Created by kausalyamani on 12/04/16.
 */
public abstract class Unit {

    private float value;

    private float conversionFactorToMillis;

    public Unit(float value, float conversionFactor) {
        this.value = value;
        conversionFactorToMillis = conversionFactor;
    }

    public float getValue() {
        return value;
    }

    public float getConversionFactorForMillis() {
        return conversionFactorToMillis;
    }

    protected float convertToMillis() {
        return this.value * this.conversionFactorToMillis;
    }

    protected float convertMillisToOriginalUnit(float milliValue) {
        return milliValue / this.conversionFactorToMillis;
    }

    @Override
    public abstract boolean equals(Object obj) ;

    protected abstract Unit clone(float value);

}
