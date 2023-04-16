public class PointStudentTester
{
    public static void main(String[] args) {
        System.out.println("********** Test Point - Started **********");
        System.out.println("\n1. Testing Constructors and toString:");
        Point p1=new Point(20,60);
        System.out.println("\tp1:"+p1);
        Point p2=new Point(p1);
        System.out.println("\tp2:"+p2);
        System.out.println("\n2. Testing accessors and mutators:");
        p1.setX(30);
        p1.setY(100);
        System.out.println("\tp1:"+p1);
        System.out.println("\tX coordinate of p1:"+p1.getX());
        System.out.println("\tY coordinate of p1:"+p1.getY());
        System.out.println("\n3. Testing equals method:");
        Point p3=new Point(50,70);
        Point p4=new Point(50,70);
        System.out.println("\tp3:"+p3);
        System.out.println("\tp4:"+p4);
        if(p3.equals(p4))
             System.out.println("\tp3 is the same point as p4");
        else 
             System.out.println("\tp3 isn't the same point as p4");
        System.out.println("\n4. Testing isAbove method:");
        if(p3.isAbove(p1))
             System.out.println("\tp3 is above p1");        
        else 
             System.out.println("\tp3 isn't above p1");     
        System.out.println("\n5. Testing isUnder method:");
        if(p3.isUnder(p1))
             System.out.println("\tp3 is under p1");        
        else 
             System.out.println("\tp3 isn't under p1");     
        System.out.println("\n6. Testing isLeft method:");
        if(p3.isLeft(p1))
             System.out.println("\tp3 is left of p1");
        else 
             System.out.println("\tp3 isn't left of p1");      
        System.out.println("\n7. Testing isRight method:");
        if(p3.isRight(p1))
             System.out.println("\tp3 is right of p1");
        else 
             System.out.println("\tp3 isn't right of p1");      
        System.out.println("\n8. Testing distance method:");
        System.out.println("\tThe distance between dates p1 and p3 is : "+p1.distance(p3));
        System.out.println("\n9. Testing move method:");
        p1.move(100,200);
        System.out.println("\tp1 after move (100,200):"+p1);
        System.out.println("\n10. Testing middle method:");
        System.out.println("\tThe middle between points p1 and p3 is : "+p1.middle(p3));
        System.out.println("\n********** Test Point - Finished **********\n");
    
    }
}
    
