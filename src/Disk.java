import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Disk {
    //id is immutable field
    private final int id;
    private Point center;
    private double radius;
    private static int lastId=0;
    //pi is java constant
    private static final double pi=3.15;


    public Disk() {
        this(new Point(),0.0);
    }

    public Disk(Point center, double radius) {
        //this.id=lastId +1;
        //lastId++;
        //or
        this.id=++lastId;
        this.center = center;
        this.radius = radius;
    }

}
