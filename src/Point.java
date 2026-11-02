import lombok.*;

@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor //generates a constructor with
// required fields values as parameters (x and y in our case)
@AllArgsConstructor
@ToString
public class Point {
    @NonNull // x is required
    private double x;
    @NonNull //y is required
    private double y;
    private double z;


}
