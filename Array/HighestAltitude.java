//https://leetcode.com/problems/find-the-highest-altitude/description/
public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);  // Update maxAltitude if currentAltitude is higher than maxAltitude.  // Add g to currentAltitude.  // Return maxAltitude.  // Example: gain = [-5, 1, 5, 0, -7] -> maxAltitude = 5, currentAltitude = 5, maxAltitude = 5, currentAltitude = 10, maxAltitude = 10, currentAltitude = 15, maxAltitude = 15, currentAltitude = 15, maxAltitude = 15.  // Note: The currentAltitude should be the sum of the previous gain and the current gain.  // The maxAltitude should be the maximum value among all the current altitudes.  // The return value should be the maximum altitude.
        }
        return maxAltitude;
    }
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }
}
