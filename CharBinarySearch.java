package Day_01_05_2023;

public class CharBinarySearch {
    static int searching(char[] arr, char key) {
        int low = 0;
        int high = arr.length - 1;
        int ind = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                ind = mid + 1;
                high = mid - 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ind;
    }

    public static void main(String[] args) {
        char[] arr = {

                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        char key = 'U';
        int pageNumber = searching(arr, key);
        System.out.println("Page number is : " + pageNumber);
    }
}
