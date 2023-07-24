import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        // Create a HashSet to store the unique elements from the nums array
        Set<Integer> uniqueElements = new HashSet<>();

        // Iterate through the nums array
        for (int num : nums) {
            // If the HashSet already contains the current element, it means there is a duplicate
            if (uniqueElements.contains(num)) {
                // Return true as soon as a duplicate is found
                return true;
            }
            // Add the current element to the HashSet
            uniqueElements.add(num);
        }

        // If no duplicates were found, return false
        return false;
    }
}