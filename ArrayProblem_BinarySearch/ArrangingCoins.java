package ArrayProblem_BinarySearch;

public class ArrangingCoins {
    public static int arrangeCoins(int n){
        int start = 0;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            long k = (long) mid *(mid +1)/2;
            if(k == n) return mid;
            else if (k < n) start = mid+1;
            else end = mid-1;
        }
        return end;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
