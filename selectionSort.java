package sorting;

// Selection Sort
public class selectionSort {

    public static void main(String[] args) {
        
        int arr[] = {5, 8, 9, 10, 5, 12};

        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            for(int j = i + 1; j < n; j++) {

                if(arr[j] < arr[maxIndex]) {     // for descending: arr[j] > arr[maxIndex] 

                    maxIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Print array
        for(int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}

// TC: O(n²)