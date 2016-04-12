package com.bootcamp.measurement.unit;

public class Length extends Unit{

    public Length(float value, float conversionFactor){
        super(value, conversionFactor);
    }

    protected Length clone(float value) {
        return new Length(value, this.getConversionFactorForMillis());
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        return ((obj instanceof Length) && this.convertToMillis() == ((Length) obj).convertToMillis());
    }

    public Length add(Length unit) {
        float sumValueAsMillimetre = this.convertToMillis() + unit.convertToMillis();
        float sumValueAsOriginalUnit = this.convertMillisToOriginalUnit(sumValueAsMillimetre);
        return this.clone(sumValueAsOriginalUnit);
    }
}
