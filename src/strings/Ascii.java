package strings;

import java.util.ArrayList;
import java.util.List;

public class Ascii {
    static void main(String[] args) {
        System.out.println(subsetAscii("","abc"));
    }
    static ArrayList<String> subsetAscii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
         char ch = up.charAt(0);
        ArrayList<String> first = subsetAscii(p+ch,up.substring(1));
        ArrayList<String> second = subsetAscii(p,up.substring(1));
        ArrayList<String> third = subsetAscii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }


}
