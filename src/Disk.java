import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@EqualsAndHashCode(of={"center", "radius"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//compare Disk objects using the included fields or methods
//(the comparison is made using only the fields or methods
//annotated with @EqualsAndHashCode.Include)
public class Disk {
    //id is immutable field
    private final int id;
    private Point center;
    private double radius;
    private static int lastId=0;
    //pi is java constant
    private static final double pi=3.15;


    public Disk() {
        this(Point.of(0.0,0.0),0.0);
    }

    public Disk(Point center, double radius) {
        //this.id=lastId +1;
        //lastId++;
        //or
        this.id=++lastId;
        this.center = center;
        this.radius = radius;
    }
    @EqualsAndHashCode.Include
    public double area() {
        //return pi*radius*radius;
        //or
        return pi*Math.pow(radius,2);
    }

}
