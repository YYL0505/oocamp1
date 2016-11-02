/**
 * Created by ylyuan on 11/1/16.
 */
public class Length {
    private double length;
    private Unit unit;

    public Length(double length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public double getLength() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }

    public boolean equalTo(Length length2) {
        if (this.unit.equals(length2.getUnit())) {
            return this.getLength() == length2.getLength();
        } else {
            if (this.unit.equals(Unit.Meter)) {
                return this.length * 100 == length2.getLength();
            } else {
                return length2.getLength() * 100 == this.getLength();
            }
        }
    }

    enum Unit{
        Meter("meter"),
        CentiMeter("centerMeter");

        Unit(String unit) {
        }
    }


}
