import java.util.ArrayList;


public class Property {
    private String Name;
    private String Address;
    private String PostalCode;
    private String City;
    private String Country;
    private double Area;
    private String MeterName;
    private ArrayList<Meter> meterList;

    public Property() {}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public String getMeterName() {
        return MeterName;
    }

    public void setMeterName(String meterName) {
        MeterName = meterName;
    }

    public ArrayList getMeterList() {
        return meterList;
    }

    public void setMeterList(ArrayList meterList) {
        this.meterList = meterList;
    }


    @Override
    public String toString() {
        return "Property{" +
                 meterList +
                '}';
    }
}
