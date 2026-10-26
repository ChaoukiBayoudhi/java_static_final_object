import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //generates all getter methods for all non-public fields
@Setter //generates all setter methods for all non-public fields
@NoArgsConstructor //generates a constructor without parameters
@AllArgsConstructor
public class Point {
    private double x;
    private double y;

}
