public class Main {
    public static void main(String[] args) {
        CompareArrays object = new CompareArrays();
        int []arr = {1,2,3,4};
        int []arr2 = {3,4,1,4};
        System.out.printf("It is: %s",object.assertArraysEquals(arr,arr2));

    }
}
