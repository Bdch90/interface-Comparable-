package ComparableCircle;
import java.lang.Comparable;

public class ComparableC extends Circle implements Comparable<ComparableC> { 
    public ComparableC(){}
    public ComparableC(int radius)
    {
        super(radius);
    }
    public ComparableC(int radius, String color){
        super(radius, color);
    }

    // @Override
    // public int compareTo(ComparableC o) {
    //     return this.getColor().compareTo(o.getColor());
    // }
    @Override
    public int compareTo(ComparableC o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
