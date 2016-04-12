package com.bootcamp.measurement.unit;

public class Volume {

    private float value;

    private float conversionFactorForMilliLitre;

    public float getValue() {
        return value;
    }

    public float getConversionFactorForMilliLitre() {
        return conversionFactorForMilliLitre;
    }

    public Volume(float value, float conversionFactor){
        this.value = value;
        conversionFactorForMilliLitre = conversionFactor;
    }

    private float convertToMilliLitres() {
        return this.value * this.conversionFactorForMilliLitre;
    }

    private float convertMilliLitresToOriginalUnit(float milliMetreValue) {
        return milliMetreValue / this.conversionFactorForMilliLitre;
    }


    protected Volume clone(float value) {
        return new Volume(value, this.conversionFactorForMilliLitre);
    }

    @Override
    public boolean equals(Object obj) {
        return this.convertToMilliLitres() == ((Volume) obj).convertToMilliLitres();
    }

    public Volume add(Volume volume) {
        float sumValueAsMilliLitres = this.convertToMilliLitres() + volume.convertToMilliLitres();
        float sumValueAsOriginalUnit = this.convertMilliLitresToOriginalUnit(sumValueAsMilliLitres);
        return this.clone(sumValueAsOriginalUnit);
    }
}
