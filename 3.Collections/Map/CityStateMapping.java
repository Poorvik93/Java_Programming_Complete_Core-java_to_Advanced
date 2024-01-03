import java.util.HashMap;
import java.util.Map;

public class CityStateMapping {

    public static void main(String[] args) {
        // Sample data: City to State mapping
        Map<String, String> cityStateMap = new HashMap<>();
        cityStateMap.put("New York", "New York");
        cityStateMap.put("Los Angeles", "California");
        cityStateMap.put("Chicago", "Illinois");
        cityStateMap.put("Houston", "Texas");
        cityStateMap.put("Phoenix", "Arizona");
        cityStateMap.put("Philadelphia", "Pennsylvania");
        cityStateMap.put("San Antonio", "Texas");
        cityStateMap.put("San Diego", "California");

        // Function to find pairs of cities with the same state
        Map<String, String> cityPairs = findCityPairs(cityStateMap);

        // Display the result
        System.out.println("Pairs of cities with the same state:");
        for (Map.Entry<String, String> entry : cityPairs.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static Map<String, String> findCityPairs(Map<String, String> cityStateMap) {
        Map<String, String> cityPairs = new HashMap<>();

        // Iterate through the entries of the cityStateMap
        for (Map.Entry<String, String> entry : cityStateMap.entrySet()) {
            String city = entry.getKey();
            String state = entry.getValue();

            // Check if other cities have the same state
            for (Map.Entry<String, String> otherEntry : cityStateMap.entrySet()) {
                String otherCity = otherEntry.getKey();
                String otherState = otherEntry.getValue();

                // If cities are different and states are the same, add to the result
                if (!city.equals(otherCity) && state.equals(otherState)) {
                    String pairKey = city + " - " + otherCity;
                    cityPairs.put(pairKey, state);
                }
            }
        }
        return cityPairs;
    }
}
