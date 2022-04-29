import java.util.ArrayList;

public class Meter {
    private String name;
    private String date;
    private double usage;
    private String unit;

    public Meter() {}

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getUsage() {
        return usage;
    }

    public void setUsage(double usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "Meter{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", usage='" + usage + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
