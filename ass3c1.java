import java.util.*; 
class CitySTD {
    public static void main(String[] args) {
        Hashtable<String, String> citySTD = new Hashtable<String, String>();

        citySTD.put("Mumbai", "022");
        citySTD.put("Delhi", "011");
        citySTD.put("Pune", "020");
        citySTD.put("Chennai", "044");
        citySTD.put("Shrirampur", "02422");

        System.out.println("City and STD Code Details:");
        for (Map.Entry<String, String> entry : citySTD.entrySet()) {
            System.out.println("City: " + entry.getKey() + ", STD Code: " + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter city name to search: ");
        String searchCity = sc.nextLine();

        if (citySTD.containsKey(searchCity)) {
            System.out.println("STD Code of " + searchCity + " is " + citySTD.get(searchCity));
        } else {
            System.out.println("City " + searchCity + " not found.");
        }
    }
}
