public class IterativevsRecursive {
    public static void main(String[] args) {
        recursive2(3);
    }

    public static int iterative(int n){
        int total = 1;
        for(int x = n; x > 1; x--){
            total *= x;
        }
        return total;
    }

    public static int recursive(int n){
        if(n == 1){
            return n;
        }else{
            return n * recursive(n - 1);
        }
    }

    public static void recursive2(int n){
        if(n != 1)
            recursive2(n - 1);
        System.out.println(n);
    }
}
