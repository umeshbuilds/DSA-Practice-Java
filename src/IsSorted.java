public class IsSorted {
    static void main(String[] args) {
    int[] arr = {1,2,3,6,5};
    int s = 0;

    System.out.println(sorted(arr,s));
    }
    static boolean sorted(int[] arr,int s){
        if(arr[s] == arr.length-1){
            return true;
        }
        return arr[s]<arr[s+1] && sorted(arr,s+1);
    }
}
