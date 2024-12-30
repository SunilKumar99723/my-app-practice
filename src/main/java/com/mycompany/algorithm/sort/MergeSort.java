package com.mycompany.algorithm.sort;

/* Java program for Merge Sort */
class MergeSort 
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int mid, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = mid - l + 1; // Left side size
        int n2 = r - mid; 	// Right side size
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) { // 0<5
            // Find the middle point
            int mid =l+ (r-l)/2; // 0+ 5/2
  
            // Sort first and second halves
            sort(arr, l, mid); // first Halves
            sort(arr, mid + 1, r); // second halves
  
            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }
  
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };// 6 elements
  
        System.out.println("Given Array");
        printArray(arr);
        int x = arr.length - 1;
        System.out.println("Given Array length -- "+x);
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);// arr.length - 1 = 5
  
        System.out.println("\nSorted array");
        printArray(arr);
    }
}