public class Date 
{
    private int month;
    private int day;
    private int year;

    public Date()
    {
        setMonth(0);
        setDay(0);
        setYear(0);
    }

    public Date(int month, int day, int year)
    {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getMonth()
    {
        return this.month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getDay()
    {
        return this.day;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return this.year;
    }

    public String toString()
    {
        return ( "day " + getDay());
    }
}