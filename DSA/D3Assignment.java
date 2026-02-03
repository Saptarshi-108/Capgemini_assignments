// Part A: Searching Techniques

// 1. Linear Search in unsorted array
class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int target = 22;
        int result = linearSearch(arr, target);
        System.out.println("Linear Search: Element found at index " + result);
    }
}

// 2. Binary Search (Iterative) in sorted array
class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, target);
        System.out.println("Binary Search: Element found at index " + result);
    }
}

// 3. Square root without inbuilt functions (Binary Search approach)
class SquareRoot {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1, right = x, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int x = 25;
        System.out.println("Square root of " + x + " is: " + sqrt(x));
    }
}

// 4. Maximum element in Bitonic Array
class BitonicMax {
    public static int findBitonicMax(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        System.out.println("Maximum in bitonic array: " + findBitonicMax(arr));
    }
}

// Part B: Sorting Techniques

// 1. Bubble Sort
class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

// 2. Selection Sort
class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.print("Selection Sort: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

// 3. Insertion Sort
class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.print("Insertion Sort: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

// Part C: Sorting-Based Problems

// 1. Waveform Array Sort (arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ...)
class WaveformSort {
    public static void sortWaveform(int[] arr) {
        Arrays.sort(arr); 
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 20, 2};
        sortWaveform(arr);
        System.out.print("Waveform: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

// 2. Duplicates within distance k
class DuplicatesWithinK {
    public static boolean hasDuplicateWithinK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && i - map.get(arr[i]) <= k) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5};
        int k = 3;
        System.out.println("Duplicates within " + k + ": " + hasDuplicateWithinK(arr, k));
    }
}

// 3. Sort 0s, 1s, 2s (Dutch National Flag)
class Sort012 {
    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 2) {
                swap(arr, mid, high--);
            } else {
                mid++;
            }
        }
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        System.out.print("Sorted 0,1,2: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

// 4. Kth Smallest Element (QuickSelect)
class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k);
    }
    
    static int quickSelect(int[] arr, int low, int high, int k) {
        int pivotIdx = partition(arr, low, high);
        if (pivotIdx == k - 1) return arr[pivotIdx];
        else if (pivotIdx > k - 1) return quickSelect(arr, low, pivotIdx - 1, k);
        else return quickSelect(arr, pivotIdx + 1, high, k);
    }
    
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest (" + k + "): " + kthSmallest(arr, k));
    }
}

// 5. Kth Largest Element (can use min-heap or modify kthSmallest)
class KthLargest {
    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth largest (" + k + "): " + kthLargest(arr, k));
    }
}
