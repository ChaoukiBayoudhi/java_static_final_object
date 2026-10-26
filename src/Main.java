void main(){
    //1- create an instance of Disk (d1)
    Disk d1= new Disk();

    //the values of x, y and radius are inputs (from the keyboard)
    Scanner sc = new Scanner(System.in);
    /*IO.println("Enter the Disk's center coordinates :");
    IO.println("x =");
    double x=sc.nextDouble();
    IO.println("y =");
    double y=sc.nextDouble();
    Point p1=new Point(x,y);
     */
    IO.println("Enter the center coordinates :");
    d1.getCenter().setX(sc.nextDouble());
    d1.getCenter().setY(sc.nextDouble());
    IO.println("Enter the radius =");
    d1.setRadius(sc.nextDouble());
    //2- print the instance
    IO.println("The disk 1 is");
    IO.println(d1);
    //3- create another instance of Disk (d2)
    //4- compare the 2 instances using ==
}