public class HighestNumber {
    //array {12,45,7,23,56} highest number find
    static void main(String[] args) {
        int[] arr={12,45,7,23,56};
       // int ans =  highestNumber(arr,0, arr.length-1);
        int ans = highest(arr,0, arr.length-1);
        System.out.println(ans);
    }
    static int highest(int[] arr,int s,int e){
        int high = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>arr[0]){
                high = arr[i];
            }
        }
        return high;
    }

    static int highestNumber(int[] arr,int s,int e){
        for (int i = 0; i <=arr.length; i++) {
            for (int j = 0; j <= arr.length - i -1; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[e];
    }
}
