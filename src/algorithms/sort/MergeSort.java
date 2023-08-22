package algorithms.sort;

public class MergeSort {
  public static void main(String[] args) {
    int[] array = {9, 15, 21, 1, 3, 45, 78, 54};

    System.out.println("Unordered list:");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();

    mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted list:");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      // Find the middle point to divide the array into two halves
      int middle = (left  + right) / 2;

      // Recursively sort the left half of the array
      mergeSort(arr, left, middle);
      // Recursively sort the right half of the array
      mergeSort(arr, middle + 1, right);

      // Merge the two sorted halves
      merge(arr, left, middle, right);
    }
  }

  public static void merge(int[] arr, int left, int middle, int right) {
    // Calculate the sizes of the two halves to be merged
    int n1 = middle - left + 1;
    int n2 = right - middle;

    // Create temporary arrays to store the halves
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // Copy elements to the temporary arrays
    for (int i = 0; i < n1; i++) {
      leftArray[i] = arr[left + i];
    }

    for (int j = 0; j < n2; j++) {
      rightArray[j] = arr[middle + 1 + j];
    }

    // Initial indices to traverse the temporary arrays
    int i = 0, j = 0;
    // Initial index to insert into the final merged array
    int k = left;

    // Merge the two temporary arrays into ascending order
    while (i < n1 && j < n2) {
      if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements from the left array, if any
    while (i < n1) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    // Copy remaining elements from the right array, if any
    while (j < n2) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }
}
