package OneDimensionalArrays;

//Count how many numbers in an Array are bigger than a target value.

public class ArrayCountAbove {
    public static void main(String[] args){
        int[] nums = {2, 8, 5, 11, 4, 9};
        int target = 5;
        int count = 0;
        for (int n : nums){
            if (n > target){
                count = count + 1;
            }
        }
        System.out.println("Numbers bigger than " + target + ": " + count);
    }
}
