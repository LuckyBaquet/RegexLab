import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lucky on 2/21/16.
 */
public class DataValidator {

    //Only accepts between 3-25 lowercase characters as valid input
    public static boolean isValidUsername(String username){

        Matcher m = Pattern.compile("[a-z]{3,25}").matcher(username);
        return m.matches();
    }

    //Only accepts between 3-25 lowercase characters numbers and the underscore as valid input
    public static boolean isValidEnhancedUsername(String username){

        Matcher m = Pattern.compile("[a-z_\\d]{3,25}").matcher(username);
        return m.matches();
    }

    //Validates an IP Address
    public static boolean isValidIPAddress(String address){
        String patternForTheThreeDigits = "((25[0-5])|([0-1]?\\d?\\d)|(2[0-4]\\d))";
        String patternForTheWholeIPMatcher = "\\b" + patternForTheThreeDigits + "." + patternForTheThreeDigits + "." + patternForTheThreeDigits + "." + patternForTheThreeDigits + "\\b";

        Matcher m = Pattern.compile(patternForTheWholeIPMatcher).matcher(address);
        return m.matches();
    }
}
//(([2][5][0-5])|([0-1]?\d?\d)|([2][0-4]\d))\.(([2][5][0-5])|([0-1]?\d?\d)|([2][0-4]\d))\.(([2][5][0-5])|([0-1]?\d?\d)|([2][0-4]\d))\.(([2][5][0-5])|([0-1]?\d?\d)|([2][0-4]\d))