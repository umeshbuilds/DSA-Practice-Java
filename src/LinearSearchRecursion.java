public class LinearSearchRecursion {
    static void main(String[] args) {
     int[] arr = {2,5,7,9};
     int target = 9;
     System.out.println(search(arr,target,0));
    }
    static int search(int[] arr,int target,int index){
        if(arr[index] == target){
            return index;
        }
        index++;
        return search(arr,target,index);
    }
}
