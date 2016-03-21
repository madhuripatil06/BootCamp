package Compare.Length;

public class Length {

    private final double value;
    private final LengthUnits scale;

    public Length(double value, LengthUnits scale) {
        this.value = value;
        this.scale = scale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length other = (Length) o;
        double otherValue = other.scale.convertToBase(other.value);
        double thisValue = this.scale.convertToBase(value);
        return  otherValue == thisValue ;
    }

    public Length add(Length other) {
        double sum = other.scale.convertToBase(other.value)+scale.convertToBase(value);
        return new Length(sum, LengthUnits.Inch);
    }
}
