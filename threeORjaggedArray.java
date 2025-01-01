public class threeORjaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][] ;
        // 3 indicates 3 columns means there will be 3 columns
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[5];
        // Assigning values to the array

        for(int i = 0 ; i < jaggedArray.length; i++ ){
            for(int j = 0 ; j < jaggedArray[i].length ; j++ ){

                jaggedArray[i][j] = (int) (Math.random() * 100);

            }
        }

        for(int n[] : jaggedArray){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
/*
 * Drawbacks of array
 * 1. Array is fixed size
 * 2. Time consuming
 * 3. Memory consuming
 * 4. Not flexible as we can define only similar datatype elements
 * 5. Not suitable for large data
 */