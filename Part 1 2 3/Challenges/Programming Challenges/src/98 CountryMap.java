import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Map<String,String> countryMap = new HashMap<>();

        countryMap.put("Bangladesh","Dhaka");
        countryMap.put("India","New Delhi");
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("China","Beijing");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Country name : ");
        String countryName = input.next();

        if(countryMap.containsKey(countryName))    {
            System.out.printf("Capital of the %s is %s\n",countryName,countryMap.get(countryName));
        }else {
            System.out.println("Sorry, I don't know the Capital of the Country");
        }
    }
}
