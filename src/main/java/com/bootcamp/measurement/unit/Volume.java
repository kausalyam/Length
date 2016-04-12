package com.bootcamp.measurement.unit;

public class Volume extends Unit{

    public Volume (float value, float conversionFactor){
        super(value, conversionFactor);
    }

    @Override
    protected Volume clone(float value) {
        return new Volume(value, this.getConversionFactorForMillis());
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        return ((obj instanceof Volume) && this.convertToMillis() == ((Volume) obj).convertToMillis());
    }

    public Volume add(Volume unit) {
        float sumValueAsMillimetre = this.convertToMillis() + unit.convertToMillis();
        float sumValueAsOriginalUnit = this.convertMillisToOriginalUnit(sumValueAsMillimetre);
        return this.clone(sumValueAsOriginalUnit);
    }
}
