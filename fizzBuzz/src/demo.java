import java.util.*;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        List<String> users = Arrays.asList("foo", "bar", "baz", "bira" );
        List<String> result = new ArrayList<>();

        for (String user : users) {
            for (int i = 0; i < user.length(); i++) {
                for (int j = 0; j < user.length() ; j++) {
                    if (user.charAt(j)<user.charAt(i)){
                        result.add("YES");
                    }else result.add("NO");
                }
            }
        }
        for (String s : result) {
            System.out.println(s);
        }


    }
}
