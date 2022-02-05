
import java.util.*;
public class solution4DP {
    public static int maxSum(int[] num, int m, int k){
        int sum=0;
        List<Integer> sums = new ArrayList<Integer>();
        int sum1=0;
        for(int i=0; i<k; i++){
            sum1+=num[i];
        }
        sums.add(sum1);
        for(int i=k; i<num.length; i++){
            int sum2 = sum1-num[i-k]+num[i];
            sums.add(sum2);
            sum1 = sum2;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> li = new ArrayList<Integer>();
        rec(sums, 0, li, result, m, k);
        int sum2=0;
        for(int i=0; i<result.size(); i++){
            List<Integer> l= result.get(i);
            for(int j=0; j<l.size(); j++){
                sum2+=l.get(j);
            }
            sum = Math.max(sum2, sum);
            sum2=0;
        }
        return sum;
    }
    public static void rec(List<Integer> sums, int n, List<Integer> l, List<List<Integer>> result, int m, int k){
        if(l.size()==m){
            result.add(l);
            return;
        }
        if(n>sums.size()) return;
        for(int i=0; i<k; i++){
            if(n+i<sums.size()){
                List<Integer> lNew = new ArrayList<Integer>(l);
                lNew.add(sums.get(n+i));
                rec(sums, n+i+k, lNew, result, m, k);
            }else break;
        }
        rec(sums, n+k, l, result, m, k);
        return;
    }
    public static void main(String[] args){
        int[] num = { 2, 5, 1, 2, 7, 3, 0 };
        int m=2; int k=2;
        System.out.println(maxSum(num, m, k));
    }
}