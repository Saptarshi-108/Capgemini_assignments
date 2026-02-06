package dsa;

public class FractionalKnapsack {
 
    // Method to calculate maximum value
    static double getMaxValue(int[] weight, int[] value, int capacity) {
 
        int n = weight.length;
 
        // Step 1: Create array to store value per weight
        double[] ratio = new double[n];
 
        // Calculate value per weight for each item
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) value[i] / weight[i];
        }
 
        // Step 2: Sort items based on ratio (descending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ratio[i] < ratio[j]) {
 
                    // swap ratio
                    double temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;
 
                    // swap weight
                    int tempW = weight[i];
                    weight[i] = weight[j];
                    weight[j] = tempW;
 
                    // swap value
                    int tempV = value[i];
                    value[i] = value[j];
                    value[j] = tempV;
                }
            }
        }
 
        double totalValue = 0.0;
 
        // Step 3: Put items into knapsack
        for (int i = 0; i < n; i++) {
 
            // If full item can be taken
            if (capacity >= weight[i]) {
                capacity -= weight[i];
                totalValue += value[i];
            }
            // If only fraction can be taken
            else {
                totalValue += ratio[i] * capacity;
                break; // knapsack is full
            }
        }
 
        return totalValue;
    }
 
    public static void main(String[] args) {
 
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;
 
        System.out.println("Maximum value = " + getMaxValue(weight, value, capacity));
    }
}
