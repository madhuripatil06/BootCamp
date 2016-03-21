package Compare.Volume;

public class Volume {

    private  double value;
    private  VolumeUnits unit;

    public Volume(double value, VolumeUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public Volume add(Volume otherVolume) {
        double sum = unit.convetToBase(value) + otherVolume.unit.convetToBase(otherVolume.value);
        return new Volume(sum,VolumeUnits.LITRE);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume other = (Volume) o;
        double otherValue = other.unit.convetToBase(other.value);
        double thisValue = this.unit.convetToBase(value);
        return  otherValue == thisValue ;
    }
}
