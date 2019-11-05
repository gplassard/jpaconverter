package fr.gplassard.jpaconverter.jpaconverter.entity;

public class ToConvert {
    private boolean isLessThan100;

    public ToConvert() {
    }

    public ToConvert(boolean isLessThan100) {
        this.isLessThan100 = isLessThan100;
    }

    public boolean isLessThan100() {
        return isLessThan100;
    }

    public void setLessThan100(boolean lessThan100) {
        isLessThan100 = lessThan100;
    }
}
