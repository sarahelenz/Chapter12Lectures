public class SearchExamples {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        String[] array2 = {"hi", "Sarah", "lol"};

        System.out.println(linearSearchInt(array,  8));
        System.out.println(linearSearchString(array2, "Sarah"));
    }

    public static int linearSearchInt(int[] a, int target){
        for(int x = 0; x < a.length; x++){
            if(a[x] == target){
                return x;
            }
        }
        return -1;
    }
    public static int linearSearchString(String[] a, String target){
        for(int  x = 0; x < a.length; x++){
            if(a[x].equals(target)){
                return x;
            }
        }
        return -1;
    }

}
