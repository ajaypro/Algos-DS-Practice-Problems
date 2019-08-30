package practice.heap;

/**
 * @author AjayDeepakSrinivasan on 26-08-2019, 12:22
 * @project Algos&Ds
 *
 * Solution:
 * Build max heap DS from input data
 * Now we have largest item at root, replace it with last item of heap followed by reducing size by 1 ( Heap sort)
 * finally heapify the root of tree, repeat the steps while heap > 1.
 */
public class HeapSort {

    public static void main(String []args){

        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        heapSort(arr, n);

        System.out.println("Sorted array is");
        printArray(arr);
    }

    static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i] + " ");

        }
    }

    static void heapSort(int arr[], int n){

        for(int i =  arr.length/2 -1; i >= 0;  i--){
            heapify(arr,arr.length, i);
        }

        for(int i = arr.length -1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,i,0);
        }

    }

    static void heapify(int arr[], int arrLength, int rootIdx){

        int largest = rootIdx;
        int leftChildIdx = 2*rootIdx + 1;
        int rightChildIdx = 2*rootIdx + 2;

        // if left child is smaller than root, if not largest is leftchild
        if( leftChildIdx < arrLength && arr[leftChildIdx] > arr[largest] ){
            largest = leftChildIdx;
        }

        // if right child is smaller than root, if not largest is rightchild
        if( rightChildIdx < arrLength && arr[rightChildIdx] > arr[largest] ){
            largest = rightChildIdx;
        }

        // if largest is not root, we replace rootIdx with largest

        if(largest != rootIdx){
            int swap = arr[rootIdx];
            arr[rootIdx] = arr[largest];
            arr[largest] = swap;

            heapify(arr, arrLength, rootIdx);

        }

        System.out.println(" Heapify array : ");

        for (int i = 1; i <= (arrLength / 2) -1; i++) {
            System.out.print(" PARENT : " + arr[i] + " LEFT CHILD : " +
                    arr[2 * i] + " RIGHT CHILD :" + arr[2 * i + 1]);
            System.out.println();
        }





    }
}
