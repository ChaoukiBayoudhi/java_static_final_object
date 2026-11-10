import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.lang.reflect.AccessFlag;
import java.util.Objects;
@Builder

@Data //replaces the 5 Lombok's annotations:
//@Getter, @Setter, @RequiredArgsConstructor, @ToString and @EqualsAndHashCode
//@Getter
//@Setter
//@NoArgsConstructor
//@RequiredArgsConstructor //generates a constructor with
@RequiredArgsConstructor(staticName = "of")
//provide the possibility to create an instance using of
//like this Point p1=Point.of(5.2, 6.1)
// required fields values as parameters (x and y in our case)
@AllArgsConstructor(staticName = "of")
//@ToString //returns all fields values as String (x, y and z values)
//@ToString(of={"x", "y"}) //returns only x and y values
@ToString(exclude = "z") //returns only x and y values
//@EqualsAndHashCode //2 points are equal if they have the same coordinates values(x,y and z)
@EqualsAndHashCode(of={"x","y"}) // compares Points using x and y only
@FieldDefaults(level=AccessLevel.PRIVATE)
//all fields are declared private without need to specify it explicitly
//@FieldDefaults(level = AccessLevel.PROTECTED,makeFinal = true)
//all fields are protected by default and are final
@Accessors(fluent = true, chain=true)
public class Point {
    @NonNull // x is required
     double x;
    @NonNull //y is required
     double y;
     double z;


}
