import java.util.Arrays;


//program to compare two arrays
//Program uses a boolean method that's prints true when the two arrays are identical
//Prints false when the two arrays are not identical


    class CompareArrays {

        public boolean assertArraysEquals(int[]arr,int[]arr2) {
            Arrays.sort(arr);
            Arrays.sort(arr2);

            int counter = 0;

            for(int i = 0;i< arr.length;i++){
                if(arr[i] == arr2[i])
                    counter++;
            }

            if(counter== arr.length) {
                return true;
            }else return false;


        }
    }

