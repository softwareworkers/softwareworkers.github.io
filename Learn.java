public class Learn {

   public static void main(String[] args) {
       System.out.println("111");
        int[] arr = {1, 3, 2, 5, 4};
       quickSort(arr, 0, 4);
         for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
         }
   }

   // quick sort
    public static void quickSort(int[] arr, int left, int right) {
         if (left >= right) {
              return;
         }
         int pivot = arr[left];
         int i = left;
         int j = right;
         while (i < j) {
              while (i < j && arr[j] >= pivot) {
                j--;
              }
              arr[i] = arr[j];
              while (i < j && arr[i] <= pivot) {
                i++;
              }
              arr[j] = arr[i];
         }
         arr[i] = pivot;
         quickSort(arr, left, i - 1);
         quickSort(arr, i + 1, right);
    }
}