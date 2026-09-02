import javax.xml.parsers.SAXParser;

public class SB {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        sb.insert(0,'c');
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
