public class bubbleSort {
    public static void main(String[] args) {
        int[] testArray = new int[]{-12345,567,44,8,2,6,32,56,4,70,21,-56,-7,-100,8,-709,-190};
        bubbleSorting(testArray);
        for (int i:testArray) {
            System.out.println(i);
        }
    }

    public static void bubbleSorting(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
