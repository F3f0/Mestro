import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

//Följande är indata till uppgiften:

//Name, Address, PostalCode, City, Country, Area, MeterName.
        ArrayList<String> propertyList = new ArrayList<>();
        propertyList.add("Adonis 2, Sveavägen 64, 113 51, Stockholm, Sverige, 2533, HV-HM-EL-A1");
        propertyList.add("Fatburssjön 10, Magnus Ladulåsgatan 65, 118 28, Stockholm, Sverige, 56213, HV-HM-EL1-ML65");
        propertyList.add("Grävlingen 12, Regeringsgatan 59, 111 56, Stockholm, Sverige, 51272, HV-HM-El-4057-STH650792");
        propertyList.add("Marievik 14, Årstaängsvägen 31, 117 43, Stockholm, Sverige, 19816, HV-HM-El-4052-ID7458");

//MeterName, Date, Usage, Unit.
        ArrayList<String> meterList = new ArrayList<>();
        meterList.add("HV-HM-EL-A1, 2021-01-01, 4 533.58, kWh");
        meterList.add("HV-HM-EL-A1, 2021-02-01, 4 420.31, kWh");
        meterList.add("HV-HM-EL-A1, 2021-03-01, 4 343.64, kWh");
        meterList.add("HV-HM-EL-A1, 2021-04-01, 3 602.47, kWh");
        meterList.add("HV-HM-EL-A1, 2021-05-01, 3 973.21, kWh");
        meterList.add("HV-HM-EL-A1, 2021-06-01, 3 601.15, kWh");
        meterList.add("HV-HM-EL-A1, 2021-07-01, 4 029.05, kWh");
        meterList.add("HV-HM-EL-A1, 2021-08-01, 3 991.16, kWh");
        meterList.add("HV-HM-EL-A1, 2021-09-01, 3 727.40, kWh");
        meterList.add("HV-HM-EL-A1, 2021-10-01, 4 037.57, kWh");
        meterList.add("HV-HM-EL-A1, 2021-11-01, 3 494.36, kWh");
        meterList.add("HV-HM-EL-A1, 2021-12-01, 3 242.22, kWh");

        meterList.add("HV-HM-EL1-ML65, 2021-01-01, 26 103.71, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-02-01, 21 814.40, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-03-01, 22 514.38, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-04-01, 21 269.47, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-05-01, 21 696.73, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-06-01, 21 408.92, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-07-01, 21 560.66, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-08-01, 22 144.56, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-09-01, 20 565.82, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-10-01, 21 904.80, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-11-01, 21 673.80, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-12-01, 21 430.54, kWh");

        meterList.add("HV-HM-El-4054-A1, 2021-01-01, 51 332.94, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-02-01, 47 240.20, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-03-01, 49 694.92, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-04-01, 44 181.64, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-05-01, 40 549.16, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-06-01, 38 286.18, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-07-01, 43 440.34, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-08-01, 42 284.54, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-09-01, 39 969.92, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-10-01, 44 315.36, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-11-01, 44 761.52, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-12-01, 44 009.16, kWh");

        meterList.add("HV-HM-El-4052-ID7458, 2021-01-01, 224 890.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-02-01, 194 476.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-03-01, 216 072.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-04-01, 136 496.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-05-01, 114 504.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-06-01, 94 598.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-07-01, 79 142.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-08-01, 97 464.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-09-01, 103 376.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-10-01, 114 400.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-11-01, 116 894.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-12-01, 109 014.00, kWh");

//Jag skapat klassmodeller för entitet Fastighet och Meter, följande kod omvandlar strängar från
//listorna till mina objekt:

        ArrayList<Property> propertyObj = new ArrayList();

        for(String str : propertyList){
            String[] meterStr = str.split(", ");
            Property prop = new Property();
            prop.setName(meterStr[0]);
            prop.setAddress(meterStr[1]);
            prop.setPostalCode(meterStr[2]);
            prop.setCity(meterStr[3]);
            prop.setCountry(meterStr[4]);
            prop.setArea(Double.parseDouble(meterStr[5]));
            prop.setMeterName(meterStr[6]);
            ArrayList<Meter> meterListObj = new ArrayList<>();
            prop.setMeterList(meterListObj);
            propertyObj.add(prop);
        }

        ArrayList<Meter> meterObj = new ArrayList();

        for(String str : meterList){
            String[] meterStr = str.split(", ");
            String[] Str = meterStr[2].split(" ");
            Meter meter = new Meter();
            meter.setName(meterStr[0]);
            meter.setDate(meterStr[1]);
            meter.setUsage(Double.parseDouble(Str[0]+Str[1]));
            meter.setUnit(meterStr[3]);
            meterObj.add(meter);
            for(Property prop : propertyObj) {
                if (meterStr[0].equals(prop.getMeterName())) {
                    prop.getMeterList().add(meter);
                }
            }
        }

//Uppgift 1:

        Gson totalAnvänding = new Gson();
        System.out.println(totalAnvänding.toJson(propertyObj));
        System.out.println();

//Uppgift 2-3:

        Map<Property, Double> usageMap = new HashMap();
        Map<Property, Double> usageAvgMap = new HashMap();

        for(Property prop : propertyObj){
            ArrayList<Meter> list = prop.getMeterList();

            Double sum = list.stream().map(Meter::getUsage).reduce((double) 0, (acc, number) -> acc + number);
            usageMap.put(prop, sum);

            double avg = sum/prop.getArea();
            usageAvgMap.put(prop, avg);
        }

        Map<Property, Double> totalUsageProperty = usageMap.entrySet().stream()
                .sorted(Map.Entry.<Property, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        totalUsageProperty.forEach((k,v)->System.out.println("Fastighet: "+ k.getName()+" enhet: " + k.getMeterName() + " har ett total användning på: " +v));
        System.out.println();

        Map<Property, Double> averageUsageByYear = usageAvgMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        averageUsageByYear.forEach((k,v)->System.out.println("Fastighet: "+ k.getName()+" har ett medelanvändning per år på: " +v));
    }
}
