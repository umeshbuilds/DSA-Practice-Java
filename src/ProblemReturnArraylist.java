import java.util.ArrayList;

public class ProblemReturnArraylist {
    static void main(String[] args) {
     int[] arr = {1,2,3,4,4,5};
     System.out.println(findAllIndex2(arr,4,0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
      if(index == arr.length){
       return list;
       }
      if(arr[index] == target){
          list.add(index);
      }
      return  findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return  findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this  will contain list for that method call only
        if(arr[index] == target){
            list.add(index);
        }
        //answer from belowcalls
        ArrayList<Integer> answerfrombelowcalls = findAllIndex2(arr,target,index+1);
        list.addAll(answerfrombelowcalls);
        return list;

    }

}
