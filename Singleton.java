
import java.util.*;
public class Singleton {

		// TODO Auto-generated method stub
		    // Step 1: Create a private static instance (Eager Initialization)
		    private static final Singleton instance = new Singleton();

		    // Step 2: Private constructor
		    private Singleton() {
		        System.out.println("Singleton Logger Initialized...");
		    }

		    // Step 3: Public accessor to get the singleton instance
		    public static Singleton getInstance() {
		        return instance;
		    }

		    // Log method
		    public void log(String message) {
		        System.out.println("[LOG] " + message);
		    }

		    // DSA 1: Frequency Count
		    public Map<Integer, Integer> countFrequency(int[] array) {
		        log("Counting frequency of array elements...");
		        Map<Integer, Integer> frequencyMap = new HashMap<>();
		        for (int num : array) {
		            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		        }
		        return frequencyMap;
		    }

		    // DSA 2: Sorting
		    public void sortArray(int[] array) {
		        log("Sorting array in ascending order...");
		        Arrays.sort(array);
		    }

		    // DSA 3: Find Maximum
		    public int findMax(int[] array) {
		        log("Finding maximum element...");
		        int max = array[0];
		        for (int num : array) {
		            if (num > max) max = num;
		        }
		        return max;
		    }

		    // DSA 4: Find Minimum
		    public int findMin(int[] array) {
		        log("Finding minimum element...");
		        int min = array[0];
		        for (int num : array) {
		            if (num < min) min = num;
		        }
		        return min;
		    }
		}

		public class Singleton {
		    public static void main(String[] args) {
		        // Get Singleton instance
		        Singleton logger = Singleton.getInstance();

		        // Sample array (no command line input)
		        int[] numbers = {5, 3, 9, 3, 7, 1, 9, 3, 5};

		        // Frequency Count
		        Map<Integer, Integer> freq = logger.countFrequency(numbers);
		        logger.log("Frequency of Elements:");
		        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
		            System.out.println("Element: " + entry.getKey() + " => Count: " + entry.getValue());
		        }

		        // Sorting
		        logger.sortArray(numbers);
		        logger.log("Sorted Array: " + Arrays.toString(numbers));

		        // Max and Min
		        int max = logger.findMax(numbers);
		        int min = logger.findMin(numbers);

		        logger.log("Maximum Element: " + max);
		        logger.log("Minimum Element: " + min);

		        logger.log("All DSA operations completed successfully.");
		    }
		}

