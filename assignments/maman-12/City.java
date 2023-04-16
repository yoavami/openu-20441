/**
 * Class {@code City} Represents a city.
 * City is represented by its name, the date it was established, center, central station, number of residents (non-negative) and number of neighborhoods (positive).
 * @author Yoav Amit
 * @version 04-16-2023
 * @see Point
 * @see Date
 */
public class City {

    // instance variables
    private String _cityName;
    private Date _dateEstablished;
    private Point _cityCenter;
    private Point _centralStation;
    private long _numOfResidents;
    private int _numOfNeighborhoods;

    // default values
    private final int MIN_RESIDENTS = 0;
    private final int MIN_NEIGHBORHOODS = 1;

    // constructors
    /**
     * Default constructor for objects of class City.
     * @param cityName the name of the city
     * @param dateEstablished the date the city was established
     * @param cityCenter the location of the city center
     * @param centralStation the location of the central station
     * @param numOfResidents the number of residents in the city
     * @param numOfNeighborhoods the number of neighborhoods in the city
     */
    public City(String cityName, Date dateEstablished, Point cityCenter, Point centralStation, long numOfResidents, int numOfNeighborhoods) {
        _cityName = cityName;
        _dateEstablished = dateEstablished;
        _cityCenter = cityCenter;
        _centralStation = centralStation;
        _numOfResidents = Math.max(numOfResidents, MIN_RESIDENTS);
        _numOfNeighborhoods = Math.max(numOfNeighborhoods, MIN_NEIGHBORHOODS);
    }

    /**
     * Copy constructor for objects of class City. Takes in another city and copies its name, date established, center, central station, number of residents and number of neighborhoods.
     * @param other the other city to copy
     */
    public City(City other) {
        if (other != null) {
            _cityName = other._cityName;
            _dateEstablished = other._dateEstablished;
            _cityCenter = other._cityCenter;
            _centralStation = other._centralStation;
            _numOfResidents = other._numOfResidents;
            _numOfNeighborhoods = other._numOfNeighborhoods;
        }
    }

    // getters and setters
    /**
     * Returns the name of the city.
     * @return the name of the city
     */
    String getCityName() {
        return _cityName;
    }

    /**
     * Sets the name of the city.
     * @param cityName the name of the city
     */
    void setCityName(String cityName) {
        _cityName = cityName;
    }

    /**
     * Returns the date the city was established.
     * @return the date the city was established
     */
    Date getDateEstablished() {
        return _dateEstablished;
    }

    /**
     * Sets the date the city was established.
     * @param dateEstablished the date the city was established
     */
    void setDateEstablished(Date dateEstablished) {
        _dateEstablished = dateEstablished;
    }

    /**
     * Returns the location of the city center.
     * @return the location of the city center
     */
    Point getCityCenter() {
        return _cityCenter;
    }

    /**
     * Sets the location of the city center.
     * @param cityCenter the location of the city center
     */
    void setCityCenter(Point cityCenter) {
        _cityCenter = cityCenter;
    }

    /**
     * Returns the location of the central station.
     * @return the location of the central station
     */
    Point getCentralStation() {
        return _centralStation;
    }

    /**
     * Sets the location of the central station.
     * @param centralStation the location of the central station
     */
    void setCentralStation(Point centralStation) {
        _centralStation = centralStation;
    }

    /**
     * Returns the number of residents in the city.
     * @return the number of residents in the city
     */
    long getNumOfResidents() {
        return _numOfResidents;
    }

    /**
     * Sets the number of residents in the city.
     * @param numOfResidents the number of residents in the city
     */
    void setNumOfResidents(long numOfResidents) {
        _numOfResidents = Math.max(numOfResidents, MIN_RESIDENTS);
    }

    /**
     * Returns the number of neighborhoods in the city.
     * @return the number of neighborhoods in the city
     */
    int getNumOfNeighborhoods() {
        return _numOfNeighborhoods;
    }

    /**
     * Sets the number of neighborhoods in the city.
     * @param numOfNeighborhoods the number of neighborhoods in the city
     */
    void setNumOfNeighborhoods(int numOfNeighborhoods) {
        _numOfNeighborhoods = Math.max(numOfNeighborhoods, MIN_NEIGHBORHOODS);
    }

    // methods
    /**
     * Returns a string representation of the city.
     * @return a string representation of the city
     */
    public String toString() {
        return "City name: " + _cityName + "\nDate established: " + _dateEstablished + "\nCity center: " + _cityCenter + "\nCentral station: " + _centralStation + "\nNumber of residents: " + _numOfResidents + "\nNumber of neighborhoods: " + _numOfNeighborhoods;
    }

    /**
     * Returns true if the city is equal to the other city, false otherwise.
     * @param other the other city to compare to
     * @return true if the city is equal to the other city, false otherwise
     */
    public boolean equals(City other) {
        return other != null && _cityName.equals(other._cityName) && _dateEstablished.equals(other._dateEstablished) && _cityCenter.equals(other._cityCenter) && _centralStation.equals(other._centralStation) && _numOfResidents == other._numOfResidents && _numOfNeighborhoods == other._numOfNeighborhoods;
    }

    /**
     * Adds or subtracts residents from the city. Returns true if the number of residents is greater than or equal to the minimum number of residents, false otherwise.
     * If the number of residents is less than the minimum number of residents, the number of residents is set to the minimum number of residents (0).
     * @param residentsUpdate the number of residents to add or subtract
     * @return true if the number of residents is greater than or equal to the minimum number of residents, false otherwise
     */
    public boolean addResidents(long residentsUpdate) {
        if (_numOfResidents - residentsUpdate < MIN_RESIDENTS) {
            _numOfResidents = MIN_RESIDENTS;
            return false;
        }
        _numOfResidents += residentsUpdate;
        return true;
    }

    /**
     * Moves the central station by the given delta x and delta y.
     * @param DeltaX the delta x to move the central station by
     * @param DeltaY the delta y to move the central station by
     */
    public void moveCentralStation(int DeltaX, int DeltaY) {
        _centralStation.move(DeltaX, DeltaY);
    }

    /**
     * Returns the distance between the city center and the central station.
     * @return the distance between the city center and the central station
     */
    public double distanceBetweenCenterAndStation() {
        return _cityCenter.distance(_centralStation);
    }

    /**
     * Returns a new city with the given name.
     * The new city is moved by the given delta x and delta y from the original city and so is the central station.
     * The date established is set to the day after the original city's date established.
     * The number of residents is set to the minimum number of residents.
     * The number of neighborhoods is set to the minimum number of neighborhoods.
     * @param newCityName the name of the new city
     * @param dX the delta x to move the new city by
     * @param dY the delta y to move the new city by
     * @return a new city with the given name
     */
    public City newCity(String newCityName, int dX, int dY) {
        City newCity = new City(this);
        newCity.setCityName(newCityName);
        newCity.setCityCenter(new Point(_cityCenter.getX() + dX, _cityCenter.getY() + dY));
        newCity.setCentralStation(new Point(_centralStation.getX() + dX, _centralStation.getY() + dY));
        newCity.setDateEstablished(_dateEstablished.tomorrow());
        newCity.setNumOfResidents(MIN_RESIDENTS);
        newCity.setNumOfNeighborhoods(MIN_NEIGHBORHOODS);
        return newCity;
    }

    /**
     * Returns true if the city was established between the two given dates, false otherwise.
     * @param date1 the first date
     * @param date2 the second date
     * @return true if the city was established between the two given dates, false otherwise
     */
    public boolean cityEstablishedBetweenDates(Date date1, Date date2) {
        if (date1.after(date2)) {
            return (_dateEstablished.after(date1) && _dateEstablished.before(date2));
        }
        return (_dateEstablished.after(date2) && _dateEstablished.before(date1));
    }

    /**
     * Returns the difference between the city's establishment date and the other city's establishment date.
     * @param other the other city
     * @return the difference between the city's establishment date and the other city's establishment date
     */
    public int establishmentDateDiff(City other) {
    	return _dateEstablished.difference(other._dateEstablished);
    }
}
