# Binary Search

### Logic
- Input: ordered list of elements.
- At each step, half of the list is eliminated.
- Complexity: **O(log n)**.

### Java Code

``` java
public class BinarySearch {
    public static int search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(search(myList, 3));   // 1
        System.out.println(search(myList, -1));  // -1
    }
}
```

### Exercices

1 - ***Suppose you have a sorted list of 128 names, and you’re searching
through it using binary search. What’s the maximum number of
steps it would take?***
- **Answer: Maximun 7 attempts**

1.2 - ***Suppose you double the size of the list. What’s the maximum
number of steps now?***

- **Answer: Maximun 8 attempts**