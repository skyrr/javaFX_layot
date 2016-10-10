/**
 * Created by sky on 06.10.2016.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dispatcer {

    private static final String REGEX = "\\w{4,}\\b";
    private static final String INPUT = "cat cat cat cattie cat afdfdf adf 1 ,fa adfj;";
    private static final String REGEX1 = "\\w{1,3}\\b";

    public static void main( String args[] )  throws Exception {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // get a matcher object
        int count = 0;
        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
            //m.();
            String str = m.group();
            System.out.println(str);
//                System.out.println(str.(0, "y"));
        }
//            String str = "This is a great day...";
//            Pattern p = Pattern.compile("\\bis\\b", Pattern.CASE_INSENSITIVE);
//            Matcher m = p.matcher(str);
        StringBuffer strB = new StringBuffer();
//            String rep = m.group();

//            m.appendReplacement(strB, rep);
        String result = m.replaceAll("dog");
        System.out.println(result);
    }
}
