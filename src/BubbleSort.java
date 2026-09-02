import java.util.Arrays;

public class BubbleSort  {
    public  static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
    bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<=  arr.length-i-1;j++){
                //swap if the element[j-1]>element[j] or item is smaller then the previous item
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
