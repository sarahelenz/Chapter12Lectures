public class TestRecursive {
    public static void main(String[] args) {
        System.out.println(10%2);
        String[] array = {"art", "dog", "cat"};
        System.out.println(array[0].compareTo(array[2]));
        String[] words = {"arc", "bat", "cat", "dog",

                "egg", "fit", "gap", "hat"};

        int index = bSearch(words, 0, words.length - 1, "hat");
        
    }
    public static int bSearch(String[] arr, int left, int right, String str)

    {

        if (right >= left)

        {

            int mid = (left + right) / 2;

            if (arr[mid].equals(str))

            {

                return mid;

            }

            else if (arr[mid].compareTo(str) > 0)

            {

                return bSearch(arr, left, mid - 1, str);

            }

            else

            {

                System.out.println("right");

                return bSearch(arr, mid + 1, right, str);

            }

        }

        return -1;

    }

}
