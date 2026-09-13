package stringRecursion;

public class SkipCharacter {
    public static void main(String[] args) {
     skip("","baccdah");
     String ans = skipWord("helloappleUmesh");
        System.out.println(ans);
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skipWord(String word){
        if(word.isEmpty()){
            return "";
        }
        if(word.startsWith("apple")){
            return skipWord(word.substring(5));
        }else{
         return  word.charAt(0) + skipWord(word.substring(1));
        }
    }
}
