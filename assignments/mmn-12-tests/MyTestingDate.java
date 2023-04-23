
public class MyTestingDate
{
    public static void main(String[] args)
    {
        System.out.println("Start testing for your class Date, good luck\n");
        System.out.println("1. Create new object by Date class \n2. Testing functions get set \n3. Testing over functions\n");
        System.out.println("=====================================");
        System.out.println("1. Create a new object, d1 (31, 12, 1925) d2 (30, 2, 2001) d3 (9, -11, 2001)");
        System.out.println("Expected Result d1 = 31/12/1925, d2 = 01/01/2000, d3 = 01/01/2000");
        Date d1 = new Date(31, 12, 1925);
        System.out.println("d1 is equals 31/12/1925 ?" + d1.equals(new Date(31, 12, 1925)));
        Date d2 = new Date(30, 2, 2001);
        System.out.println("d2 is equals 01/01/2000 ?" + d2.equals(new Date(1, 1, 2000)));
        Date d3 = new Date(9, -11, 2001);
        System.out.println("d3 is equals 01/01/2000 ?" + d3.equals(new Date(1, 1, 2000)));
        System.out.println("=====================================");
        System.out.println("2. Testing get set");
        System.out.println("Expected Result d1.getDay() == 31, d1.getMonth() == 12, d1.getYear() == 1925");
        System.out.println("d1.getDay() = " + d1.getDay() + " is " + (d1.getDay() == 31)); 
        System.out.println("d1.getMonth() = " + d1.getMonth() + " is " + (d1.getMonth() == 12));
        System.out.println("d1.getYear() = " + d1.getYear() + " is " + (d1.getYear() == 1925));
        System.out.println("=====================================");
        System.out.println("For further tests, create a new dates d2 = 25/04/1999, d3 = 14/02/2011");
        d2 = new Date(25, 4, 1999);
        d3 = new Date(14, 2, 2011);
        System.out.println("Expected Result d2.setDay(31) == 25/04/1999, d2.setDay(-4) == 25/04/1999, d2.setDay(30) == 30/04/1999");
        d2.setDay(31);
        System.out.println(d2 + " your new date is 25/04/1999 ? " + d2.equals(new Date(25, 4, 1999)));
        d2.setDay(-4);
        System.out.println(d2 + " your new date is 25/04/1999 ? " + d2.equals(new Date(25, 4, 1999)));
        d2.setDay(30);
        System.out.println(d2 + " your new date is 30/04/1999 ? " + d2.equals(new Date(30, 4, 1999)));
        System.out.println("=====================================");
        System.out.println("Expected Result d3.setDay(30) == 14/02/2011, d3.setDay(0) == 14/02/2011, d3.setDay(25) == 25/02/2011");
        d3.setDay(30);
        System.out.println(d3 + " your new date is 14/02/2011 ? " + d3.equals(new Date(14, 2, 2011)));
        d3.setDay(0);
        System.out.println(d3 + " your new date is 14/02/2011 ? " + d3.equals(new Date(14, 2, 2011)));
        d3.setDay(25);
        System.out.println(d3 + " your new date is 25/02/2011 ? " + d3.equals(new Date(25, 2, 2011)));
        System.out.println("=====================================");
        System.out.println("Expected Result d1.setMonth(2) == 31/12/1925, d1.setMonth(4) == 31/12/1925, d1.setMonth(1) == 31/01/1925");
        d1.setMonth(2);
        System.out.println(d1 + " your new date is 31/12/1925 ? " + d1.equals(new Date(31, 12, 1925)));
        d1.setMonth(4);
        System.out.println(d1 + " your new date is 31/12/1925 ? " + d1.equals(new Date(31, 12, 1925)));
        d1.setMonth(1);
        System.out.println(d1 + " your new date is 31/01/1925 ? " + d1.equals(new Date(31, 1, 1925)));
        System.out.println("=====================================");
        System.out.println("Expected Result d1.setYear(1967) == 31/01/1967, d1.setYear(999) == 31/01/1967");
        d1.setYear(1967);
        System.out.println(d1 + " your new date is 31/01/1967 ? " + d1.equals(new Date(31, 1, 1967)));
        d1.setYear(999);
        System.out.println(d1 + " your new date is 31/01/1967 ? " + d1.equals(new Date(31, 1, 1967)));
        System.out.println("=====================================");
        System.out.println("Expected Result d1.before(01/01/1968) == true, d1.before(31/01/1967) == false, d1.before(01/06/1965) == false");
        System.out.println(d1 + " is before 01/01/1968 ? " + d1.before(new Date(1, 1, 1968)));
        System.out.println(d1 + " is before 31/01/1967 ? " + d1.before(new Date(31, 1, 1967)));
        System.out.println(d1 + " is before 01/06/1965 ? " + d1.before(new Date(1, 6, 1965)));
        System.out.println("Expected Result d1.after(01/06/1965) == true, d1.after(31/01/1967) == false, d1.after(01/01/1968) == false");
        System.out.println(d1 + " is after 01/06/1965 ? " + d1.after(new Date(1, 6, 1965)));
        System.out.println(d1 + " is after 31/01/1967 ? " + d1.after(new Date(31, 1, 1967)));
        System.out.println(d1 + " is after 01/01/1968 ? " + d1.after(new Date(1, 1, 1968)));
        System.out.println("=====================================");
        System.out.println("3. Testing over functions");
        System.out.println("Expected Result for function d3.difference(25/02/2012) == 365");
        System.out.println(d3 + " difference 25/02/2012 = "+ d3.difference(new Date(25, 2, 2012)) + " is 365 ? " + (d3.difference(new Date(25, 2, 2012)) == 365));
        System.out.println("=====================================");
        System.out.println("For further tests, create a new dates d1 = 31/12/1999");
        d1 = new Date(31, 12, 1999);
        System.out.println("Expected Result for function d2.tomorrow() == 01/05/1999, d1.tomorrow() == 01/01/2000");
        Date newDate = d2.tomorrow();
        System.out.println(newDate + " is equal 01/05/1999 ? " + newDate.equals(new Date(1, 5, 1999)));
        newDate = d1.tomorrow();
        System.out.println(newDate + " is equal 01/01/2000 ? " + newDate.equals(new Date(1, 1, 2000)));
        System.out.println("The end for testing your class Date");
    }
}
