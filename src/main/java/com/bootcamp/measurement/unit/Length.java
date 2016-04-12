package com.bootcamp.measurement.unit;

public class Length {

    public float getValue() {
        return value;
    }

    private float value;

    public float getConversionFactorForMillimetre() {
        return conversionFactorForMillimetre;
    }

    private float conversionFactorForMillimetre;

    public Length(float value, float conversionFactor){
        this.value = value;
        conversionFactorForMillimetre = conversionFactor;
    }

    protected Length clone(float value) {
        return new Length(value, this.conversionFactorForMillimetre);
    }

    private float convertToMilliMetres() {
        return this.value * this.conversionFactorForMillimetre;
    }

    private float convertMilliMetreToOriginalUnit(float milliMetreValue) {
        return milliMetreValue / this.conversionFactorForMillimetre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.convertToMilliMetres() == ((Length) obj).convertToMilliMetres();
    }

    public Length add(Length length) {
        float sumValueAsMillimetre = this.convertToMilliMetres() + length.convertToMilliMetres();
        float sumValueAsOriginalUnit = this.convertMilliMetreToOriginalUnit(sumValueAsMillimetre);
        return this.clone(sumValueAsOriginalUnit);
    }
}
