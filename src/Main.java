void main(){
//1- create an instance (d1) of Disk (x, y and radius
    // are inputs from the keyboard)
Disk d1=new Disk();
    Point p1=new Point(6.9,2.1,7.3);
    IO.println(p1);
    Scanner sc= new Scanner(System.in);
    IO.println("Enter thed center coordinates :");
    IO.println("x = ");
    double x=sc.nextDouble();
    IO.println("y = ");
    double y=sc.nextDouble();
    Point point=new Point(x,y);
    d1.setCenter(point);
    IO.println("Rayon = ");
    //double r=sc.nextDouble();
    //d1.setRadius(r);
    //or
    d1.setRadius(sc.nextDouble());

    //2- print the instance
    IO.println("The disk 1 is :");
    IO.println(d1);
    IO.println(d1.toString());
    //3- create a second instance (d2)
    Disk d2=new Disk(new Point(3.8,7.2),18.7);
    IO.println("The disk 2 is :");
    IO.println(d2);
    //4- compare the 2 instances using ==

    if (d1.equals(d2))
        IO.println("They are equal");
    else
        IO.println("They are not equal");


}