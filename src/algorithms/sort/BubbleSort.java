package algorithms.sort;

public class BubbleSort {
  /*
    The BubbleSort algorithm goes through the list several times comparing the array positions,
    checking if the previous position has a greater value than the next position,
    thus sorting the array in ascending order.

    Bubble Sort is not effective for large lists due to its quadratic time complexity, which can slow down the process
    with significant amounts of data. More efficient sorting algorithms like Merge Sort and Quick Sort are
    better suited for situations where performance is crucial.
  */
  public static void main(String[] args) {
    // Instantiating variables
    int[] array = {8, 15, 23, 3, 74, 22, 1};

    // Printing unordered list
    System.out.println("Unordered list:");
    printArray(array);

    System.out.println(" ");
    // Starting list sorting process
    sort(array);

    // Printing sorted list
    System.out.println("Sorted list:");
    printArray(array);
  }

  public static void printArray(int[] arr) {
    for (int i : arr) System.out.println(" " + i);
  }

  public static void sort(int[] arr) {
    /*
    - It starts an outer loop with the variable iterator, ranging from 0 to the length of the array (arr.length).
    - For each iteration of the outer loop, an inner loop is executed.
    - The inner loop, controlled by the variable j, ranges from 0 to the length of the array minus 1 (arr.length - 1).
    - Inside the inner loop, a comparison is made between two adjacent elements of the array: arr[j] and arr[j + 1].
    - If element arr[j] is greater than element arr[j + 1], this indicates that they are out of order, and they need to
    be swapped.
    - A temporary variable temp is used to temporarily store the value of arr[j].
    - The value of arr[j] is updated with the value of arr[j + 1].
    - The value of arr[j + 1] is updated with the value stored in temp, completing the swap.
    - The inner loop continues to check and swap adjacent elements until all elements are compared and the larger
    elements "bubble up" to their correct positions.
    - The outer loop continues to execute the inner loop for each position in the array, allowing larger elements to
    gradually "bubble up" to their correct positions.
    - After both loops are completed, the array is completely sorted in ascending order.
     */
    for (int iterator = 0; iterator < arr.length; iterator++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
