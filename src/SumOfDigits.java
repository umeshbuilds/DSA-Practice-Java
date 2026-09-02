public class SumOfDigits {
    static void main(String[] args) {
        System.out.println(sum(1234));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        n= n/10;
        int sum = rem + sum(n);
        return sum;
    }

}
