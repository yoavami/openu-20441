/**
 * Class {@code Date} represents a date in the Gregorian calendar. The date is represented by a day, a month and a year. The class has a default date of 1/1/2000.
 * The class has a method to check if the date is valid. The class does not account for leap years.
 * @author Yoav Amit
 * @version 04-16-2023
 * @see <a href="https://en.wikipedia.org/wiki/Gregorian_calendar">Gregorian Calendar</a>
 */
public class Date {

    // instance variables
    private int _day;
    private int _month;
    private int _year;

    // default values - the default date is 1/1/2000 if the date is invalid
    private final int DEFAULT_DAY = 1;
    private final int DEFAULT_MONTH = 1;
    private final int DEFAULT_YEAR = 2000;

    // min and max values - the min and max values for the day, month and year
    private final int MIN_DAYS = 1;
    private final int MAX_DAYS = 31;
    private final int MIN_MONTHS = 1;
    private final int MAX_MONTHS = 12;
    private final int MIN_YEARS = 1000;
    private final int MAX_YEARS = 9999;

    // specific cases declarations - the max days for february (which has 28) and the months that have 30 days
    private final int FEBRUARY = 2;
    private final int MAX_DAYS_FEBRUARY = 28;
    private final int APRIL = 4;
    private final int JUNE = 6;
    private final int SEPTEMBER = 9;
    private final int NOVEMBER = 11;
    private final int MAX_DAYS_APRIL_JUNE_SEPTEMBER_NOVEMBER = 30;

    // conversion constants
    private final int DAYS_IN_A_YEAR = 365;

    // constructors
    /**
     * Default constructor for objects of class Date. Uses private method isValidDate to check if the date is valid.
     * The date is set to 1/1/2000 if the date is invalid.
     * @param day the day of the date
     * @param month the month of the date
     * @param year the year of the date
     */
    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            _day = day;
            _month = month;
            _year = year;
        } else {
            _day = DEFAULT_DAY;
            _month = DEFAULT_MONTH;
            _year = DEFAULT_YEAR;
        }
    }

    /**
     * Copy constructor for objects of class Date. Takes in another date and copies its day, month and year.
     * @param other the other date to copy
     */
    public Date(Date other) {
        if (other != null) {
            _day = other._day;
            _month = other._month;
            _year = other._year;
        }
    }

    /**
     * Checks if the date is valid. If it is, it returns true. Otherwise, it returns false. Private method used in the constructors.
     * @param day the day of the date
     * @param month the month of the date
     * @param year the year of the date
     * @return true if the date is valid, false otherwise
     */
    private boolean isValidDate(int day, int month, int year) {

        // check if the date is valid
        if (day > MIN_DAYS && day <= MAX_DAYS && month > MIN_MONTHS && month <= MAX_MONTHS && year > MIN_YEARS && year <= MAX_YEARS) {
            if (month == FEBRUARY && day > MAX_DAYS_FEBRUARY)
                return false;
            if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER && day > MAX_DAYS_APRIL_JUNE_SEPTEMBER_NOVEMBER)
                return false;
            return true;
        }
        return false;
    }

    // getters and setters
    /**
     * Returns the day of the date.
     * @return the day of the date
     */
    public int getDay() {
        return _day;
    }

    /**
     * Sets the day of the date. If the day is invalid, the day is not changed.
     * @param dayToSet the day to set
     */
    public void setDay(int dayToSet) {
        if (dayToSet >= MIN_DAYS && dayToSet <= MAX_DAYS) {
            _day = dayToSet;
        }
    }

    /**
     * Returns the month of the date.
     * @return the month of the date
     */
    public int getMonth() {
        return _month;
    }

    /**
     * Sets the month of the date. If the month is invalid, the month is not changed.
     * @param monthToSet the month to set
     */
    public void setMonth(int monthToSet) {
        if (monthToSet >= MIN_MONTHS && monthToSet <= MAX_MONTHS) {
            _month = monthToSet;
        }
    }

    /**
     * Returns the year of the date.
     * @return the year of the date
     */
    public int getYear() {
        return _year;
    }

    /**
     * Sets the year of the date. If the year is invalid, the year is not changed.
     * @param yearToSet the year to set
     */
    public void setYear(int yearToSet) {
        if (yearToSet >= MIN_YEARS && yearToSet <= MAX_YEARS) {
            _year = yearToSet;
        }
    }

    // methods
    /**
     * Checks if this date is equal to another date.
     * @param other the other date to check
     * @return true if the dates are equal, false otherwise
     */
    public boolean equals(Date other) {
        if (other != null) {
            return _day == other._day && _month == other._month && _year == other._year;
        }
        return false;
    }

    /**
     * Checks if this date is before another date.
     * @param other the other date to check
     * @return true if this date is before the other date, false otherwise
     */
    public boolean before(Date other) {
        if (other != null) {
            if (_year < other._year) {
                return true;
            }
            else if (_year == other._year) {
                if (_month < other._month) {
                    return true;
                }
                else if (_month == other._month) {
                    return _day < other._day;
                }
            }
        }
        return false;
    }

    /**
     * Checks if this date is after another date.
     * @param other the other date to check
     * @return true if this date is after the other date, false otherwise
     */
    public boolean after(Date other) {
        return other.before(this);
    }

    /**
     * Converts the date to the amount of days in the date. Private method used in the difference method.
     * @param day the day of the date
     * @param month the month of the date
     * @param year the year of the date
     * @return the amount of days in the date since the beginning of the Christian counting of years
     */
    private int calculateDate ( int day, int month, int year) {
        if (month < 3) { year--;
            month = month + 12; }
        return 365 * year + year/4 - year/100 + year/400 + ((month+1) * 306)/10 + (day - 62); }

    /**
     * Returns the difference between this date and another date in days.
     * Returns the absolute value of the difference.
     * @param other the other date to check
     * @return the difference between the dates in days
     */
    public int difference(Date other) {
        if (other != null) {
            return Math.abs(calculateDate(this._day, this._month, this._year) - calculateDate(other._day, other._month, other._year));
        }
        return 0;
    }

    /**
     * Returns a string representation of the date.
     * @return a string representation of the date
     */
    public String toString() {
        return _day + "/" + _month + "/" + _year;
    }

    /**
     * Returns a new date that is one day after this date.
     * @return a new date that is one day after this date
     */
    public Date tomorrow() {
        Date tomorrow = new Date(this);
        tomorrow.setDay(tomorrow.getDay() + 1);
        return tomorrow;
    }
}
