public class CityStudentTester
{
    public static void main(String[] args) {
        System.out.println("********** Test City - Started **********");
        System.out.println("\n1. Testing Constructors and toString:");
        City city1=new City("Dimona",15,9,1955,10,15,50,70, 36854,20);
        System.out.println("\tcity1:\n"+city1);
        City city2=new City(city1);
        System.out.println("\tcity2:\n"+city2);
        System.out.println("\n2. Testing accessors and mutators:");
        city1.setCityName("AnotherCity");
        Date d1 = new Date(1,9,1955);
        city1.setDateEstablished(d1);
        Point p1 = new Point(20,30);
        city1.setCityCenter(p1);
        city1.setCentralStation(p1);
        city1.setNumOfResidents(40000);
        city1.setNumOfNeighborhoods(50);
        System.out.println("\tcity1:\n"+city1);
        System.out.println("\tName of city1:"+city1.getCityName());
        System.out.println("\tDate established of city1:"+city1.getDateEstablished());
        System.out.println("\tCenter of city1:"+city1.getCityCenter());
        System.out.println("\tDCentral station of city1:"+city1.getCentralStation());
        System.out.println("\tNumber of residents of city1:"+city1.getNumOfResidents());
        System.out.println("\tNumber of neighborhoods of city1:"+city1.getNumOfNeighborhoods());
        System.out.println("\n3. Testing equals method:");
        City city3=new City("SomeCity",2,8,1000,10,20,30,40, 10000,50);
        City city4=new City("SomeCity",2,8,1000,10,20,30,40, 10000,50);
        System.out.println("\tcity3:\n"+city3);
        System.out.println("\tcity4:\n"+city4);
        if(city3.equals(city4))
             System.out.println("\tcity3 is the same date as city4");
        else 
             System.out.println("\tcity3 isn't the same date as city4");
        System.out.println("\n4. Testing addResidents method:");
        city1.addResidents(200);
        System.out.println("\tNumber of residents of city1 (after adding 200):"+city1.getNumOfResidents());
        System.out.println("\n5. Testing moveCentralStation method:");
        city1.moveCentralStation(100,200);
        System.out.println("\tCentral station of city1 after moving (100,200):"+city1.getCentralStation());
        System.out.println("\n6. Testing distanceBetweenCenterAndStation method:");
        System.out.println("\tDistance between center and central station of city1:"+city1.distanceBetweenCenterAndStation());
        System.out.println("\n6. Testing newCity method based on city1 parameters (method parameters are newCityName=\"newName\" dX=-50 and dY=-150):");
        City city5 = city1.newCity("newName",-50,-150);
        System.out.println("\tcity5 (the new city) is:\n"+city5);       
        System.out.println("\n7. Testing cityEstablishedBetweenDates method:");
        Date d2 = new Date(10,10,2020);
         if(city5.cityEstablishedBetweenDates(d1,d2))
             System.out.println("\tcity5 was established between " + d1 + " and " + d2);
        else 
             System.out.println("\tcity5 wasn't established between " + d1 + " and " + d2);
        System.out.println("\n8. Testing establishmentDateDiff method:");
        System.out.println("\tDiffernce of establishment dates between city5 and city3: " + city5.establishmentDateDiff(city3));
        System.out.println("\n********** Test City - Finished **********\n");
    
    }
}
    
