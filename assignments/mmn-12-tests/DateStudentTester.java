public class DateStudentTester
{
    public static void main(String[] args) {
        System.out.println("********** Test Date - Started **********");
        System.out.println("\n1. Testing Constructors and toString:");
        Date d1=new Date(13,10,1998);
        System.out.println("\td1:"+d1);
        Date d2=new Date(d1);
        System.out.println("\td2:"+d2);
        System.out.println("\n2. Testing accessors and mutators:");
        d1.setDay(8);
        d1.setMonth(10);
        d1.setYear(2016);
        System.out.println("\td1:"+d1);
        System.out.println("\tday of d1:"+d1.getDay());
        System.out.println("\tmonth of d1:"+d1.getMonth());
        System.out.println("\tyear of d1:"+d1.getYear());
        System.out.println("\n3. Testing equals method:");
        Date d3=new Date(3,5,1998);
        Date d4=new Date(3,5,1998);
        System.out.println("\td3:"+d3);
        System.out.println("\td4:"+d4);
        if(d3.equals(d4))
             System.out.println("\td3 is the same date as d4");
        else 
             System.out.println("\td3 isn't the same date as d4");
        System.out.println("\n4. Testing before method:");
        if(d3.before(d1))
             System.out.println("\td3 is before d1");        
        else 
             System.out.println("\td3 isn't before d1");     
        System.out.println("\n5. Testing after method:");
        if(d3.after(d1))
             System.out.println("\td3 is after d1");
        else 
             System.out.println("\td3 isn't after d1");      
        System.out.println("\n6. Testing difference method:");
        System.out.println("\tThe difference in days between dates d1 and d3 is : "+d1.difference(d3));
        System.out.println("\n7. Testing tomorrow method:");
        Date d6=new Date(6,11,2016);
        System.out.println("\t" + d6+" tomorrow is : "+d6.tomorrow());
        Date d7=new Date(31,12,2019);
        System.out.println("\t" + d7+" tomorrow is : "+d7.tomorrow());
        System.out.println("\n********** Test Date - Finished **********\n");
    
    }
}
    
