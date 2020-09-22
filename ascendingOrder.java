public class ascendingOrder {

    public static void main(String[] args) {

        int[] arr = {  4, 20, -1, -65};
        System.out.println("Array elements after sorting:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) { //swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.println(arr[i]);
        }
    }
}