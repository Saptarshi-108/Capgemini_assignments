//Arrays

int[] arr = {1,2,3,4,5};
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}

int[] arr = {1,2,3,4,5};
for (int i = 0; i < arr.length; i++) {
    if (i % 2 == 0)
        System.out.print(arr[i] + " ");
}

int[] arr = {1,2,3,4,5};
for (int i = 0; i < arr.length; i++) {
    if (i % 2 != 0)
        System.out.print(arr[i] + " ");
}

int[] arr = {1,2,3,4,5};
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
System.out.println(sum);

int[] arr = {1,2,3,4};
int product = 1;
for (int i = 0; i < arr.length; i++) {
    product *= arr[i];
}
System.out.println(product);

int[] arr = {1,2,3,4,5};
int n = arr.length;
for (int i = 0; i < n/2; i++) {
    int temp = arr[i];
    arr[i] = arr[n-1-i];
    arr[n-1-i] = temp;
}

int[] arr = {1,2,3,4};
int[] copy = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    copy[i] = arr[i];
}

int[] arr = {1,2,3,4};
int[] rev = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    rev[i] = arr[arr.length - 1 - i];
}

int[] arr = {4,2,9,1};
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max)
        max = arr[i];
}
System.out.println(max);

int[] arr = {4,2,9,1,7};
int max = Integer.MIN_VALUE;
int smax = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        smax = max;
        max = arr[i];
    } else if (arr[i] > smax && arr[i] != max) {
        smax = arr[i];
    }
}
System.out.println(smax);

int[] arr = {1,2,2,3,1};
for (int i = 0; i < arr.length; i++) {
    int count = 1;
    if (arr[i] == -1) continue;

    for (int j = i+1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            count++;
            arr[j] = -1;
        }
    }
    System.out.println(arr[i] + " -> " + count);
}

int[] arr = {1,2,2,3,1};
for (int i = 0; i < arr.length; i++) {
    int count = 1;
    if (arr[i] == -1) continue;

    for (int j = i+1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            count++;
            arr[j] = -1;
        }
    }
    System.out.println(arr[i] + " -> " + count);
}

int[] arr = {1,2,2,3,1};
for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            System.out.print(arr[i] + " ");
            break;
        }
    }
}

int[] arr = {1,2,2,3,1};
for (int i = 0; i < arr.length; i++) {
    boolean unique = true;
    for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
            unique = false;
            break;
        }
    }
    if (unique)
        System.out.print(arr[i] + " ");
}

int[] arr = {1,2,2,3,1};
for (int i = 0; i < arr.length; i++) {
    int count = 0;
    for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j])
            count++;
    }
    if (count == 1)
        System.out.print(arr[i] + " ");
}

int[] arr = {2,3,4,5,6};
for (int i = 0; i < arr.length; i++) {
    int num = arr[i];
    if (num < 2) continue;
    boolean prime = true;
    for (int j = 2; j <= num/2; j++) {
        if (num % j == 0) {
            prime = false;
            break;
        }
    }
    if (prime)
        System.out.print(num + " ");
}

int[] arr = {0,1,2,3,5,8,9};
for (int i = 0; i < arr.length; i++) {
    int a = 0, b = 1, c;
    while (b < arr[i]) {
        c = a + b;
        a = b;
        b = c;
    }
    if (arr[i] == b || arr[i] == 0)
        System.out.print(arr[i] + " ");
}

int[] arr = {1,2,3,4};
int index = 2;
int value = 99;

int[] newArr = new int[arr.length + 1];
for (int i = 0, j = 0; i < newArr.length; i++) {
    if (i == index)
        newArr[i] = value;
    else
        newArr[i] = arr[j++];
}

int[] arr = {1,2,3,4};
int index = 1;

int[] newArr = new int[arr.length - 1];
for (int i = 0, j = 0; i < arr.length; i++) {
    if (i != index)
        newArr[j++] = arr[i];
}

int[] arr = {1,2,3,4,5};
int k = 1;
for (int r = 0; r < k; r++) {
    int last = arr[arr.length - 1];
    for (int i = arr.length - 1; i > 0; i--)
        arr[i] = arr[i - 1];
    arr[0] = last;
}

int[] arr = {1,2,3,4,5};
int k = 1;
for (int r = 0; r < k; r++) {
    int first = arr[0];
    for (int i = 0; i < arr.length - 1; i++)
        arr[i] = arr[i + 1];
    arr[arr.length - 1] = first;
}

int[] arr = {4,2,5,1,3};
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}

int[] arr = {4,2,9,7,5};
int n = 3;

for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
System.out.println(arr[n - 1]);

int[] arr = {4,2,9,7,5};
int n = 3;

for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
System.out.println(arr[n - 1]);

int[] arr = {2,3,5,3,7,2,4};

for (int i = 0; i < arr.length; i++) {
    int num = arr[i];
    if (num < 2) continue;

    boolean prime = true;
    for (int k = 2; k <= num / 2; k++) {
        if (num % k == 0) {
            prime = false;
            break;
        }
    }

    if (prime) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.print(arr[i] + " ");
                break;
            }
        }
    }
}

int[] arr = {1,3,5,7,9};
int key = 7;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == key) {
        System.out.println("Found at index " + i);
        break;
    }
}

int[] arr = {1,3,5,7,9};
int key = 5;
int low = 0, high = arr.length - 1;

while (low <= high) {
    int mid = (low + high) / 2;
    if (arr[mid] == key) {
        System.out.println("Found at index " + mid);
        break;
    } else if (arr[mid] < key)
        low = mid + 1;
    else
        high = mid - 1;
}

int[] arr = {5,3,2,4,1};

for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            int t = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = t;
        }
    }
}

int[] a = {1,2,3};
int[] b = {4,5,6};

int[] c = new int[a.length + b.length];
int k = 0;

for (int i = 0; i < a.length; i++)
    c[k++] = a[i];
for (int i = 0; i < b.length; i++)
    c[k++] = b[i];

int[] a = {1,3,5};
int[] b = {2,4,6};

int[] c = new int[a.length + b.length];
int i = 0, j = 0, k = 0;

while (i < a.length && j < b.length) {
    c[k++] = a[i++];
    c[k++] = b[j++];
}

int[] arr = {1,2,3,4,5};
int target = 6;

for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target)
            System.out.println(arr[i] + " " + arr[j]);
    }
}

