package com;

interface Compare<T>{
    int compare(T a, T b);
}

interface KeyExtractor<T, K>{ 
    K extract(T obj); 
}

class MyComparator {
    static int compare(Object a, Object b) {
        if (a == b) return 0;
        if (a == null) return -1;
        if (b == null) return 1;

        if (a instanceof Integer && b instanceof Integer) {
            return Integer.compare((Integer) a, (Integer) b);
        }

        if (a instanceof String && b instanceof String) {
            return ((String) a).compareTo((String) b);
        }

        throw new RuntimeException("Unsupported Type");
    }
}

class Sorter<T>{
    T[] arr;
    KeyExtractor<T,?> extractor;
    boolean ascending = true;

    public Sorter(T[] arr, KeyExtractor<T,?> extractor) {
        this.arr = arr;
        this.extractor = extractor;
    }

    Sorter<T> asc() {
        this.ascending = true;
        sort();
        return this;
    }

    Sorter<T> desc() {
        this.ascending = false;
        sort();
        return this;
    }

    void sort() {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                Object v1 = extractor.extract(arr[j]);
                Object v2 = extractor.extract(arr[j + 1]);

                int cmp = MyComparator.compare(v1, v2);
                if ((ascending && cmp > 0) || (!ascending && cmp < 0)) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class ArrayWrapper<T>{
    T[] arr;

    public ArrayWrapper(T[] arr) {
        this.arr = arr;
    }

    Sorter<T> sort(KeyExtractor<T,?> extractor){
        return new Sorter<>(arr, extractor);
    }
}

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = {
            new Student(1,"Dharani",23),
            new Student(2,"Arjun",21),
            new Student(3,"Bala",25)
        };

        ArrayWrapper<Student> arrayWrapper = new ArrayWrapper<>(students);

        arrayWrapper.sort(s -> s.name).asc();

        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
