import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator {
     public static boolean isValidEmail(String email){

         String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@(?:[A-Za-z0-9-]+\\\\.)+[A-Za-z]{2,}$";
         Pattern pattern=Pattern.compile(regex);
         Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean isCompanyEmail(String email){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@company.com";
        String publicDomainsPattern = "^(.*@)(gmail\\.com|yahoo\\.com|outlook\\.com|hotmail\\.com)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
}




