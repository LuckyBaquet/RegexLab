import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by lucky on 2/21/16.
 */
public class DataValidatorTest {



    @Test
    public void isValidUsernameTestValidDataThreeLowerCaseLetters(){
        assertTrue(DataValidator.isValidUsername("abc"));
    }
    @Test
    public void isValidUsernameTestValidDataTwentyFiveLowerCaseLetters(){
        assertTrue(DataValidator.isValidUsername("jacobsladdertwainbushelsf"));
    }
    @Test
    public void isValidUsernameTestValidDataTedLowerCaseLetters(){
        assertTrue(DataValidator.isValidUsername("jnbushelsf"));
    }
    @Test
    public void isValidUsernameTestInvalidDataWithCapitalLetter(){
        assertFalse(DataValidator.isValidUsername("JacobLrtwainBelsf"));
    }
    @Test
    public void isValidUsernameTestInvalidDataWithNumbers(){
        assertFalse(DataValidator.isValidUsername("acobrtwainelsf99"));
    }
    @Test
    public void isValidUsernameTestInvalidDataWithUnderscore(){
        assertFalse(DataValidator.isValidUsername("jacoblrtwain_belsf"));
    }

    @Test
    public void isValidEnhancedUserNameTestValidDataWithNumbers(){
        assertTrue(DataValidator.isValidEnhancedUsername("acobrtwainelsf99"));
    }
    @Test
    public void isValidEnhancedUserNameTestValidDataWithUnderscore(){
        assertTrue(DataValidator.isValidEnhancedUsername("jacoblrtwain_belsf"));
    }
    @Test
    public void isValidEnhancedUsernameTestInvalidDataWithCapitalLetter(){
        assertFalse(DataValidator.isValidEnhancedUsername("JacobLrtwainBelsf"));
    }
    @Test
    public void isValidEnhancedUsernameTestValidDataTwentyFiveLowerCaseLetters(){
        assertTrue(DataValidator.isValidEnhancedUsername("jacobsladdertwainbushelsf"));
    }
    @Test
    public void isValidEnhancedUsernameTestInvalidDataWithSpecialCharacter(){
        assertFalse(DataValidator.isValidEnhancedUsername("JacobLrtwain#sf"));
    }

    @Test
    public void isValidIPAddressTestValidData1(){
        assertTrue(DataValidator.isValidIPAddress("111.255.99.01"));
    }
    @Test
    public void isValidIPAddressTestValidData2(){
        assertTrue(DataValidator.isValidIPAddress("1.100.99.55"));
    }
    @Test
    public void isValidIPAddressTestValidData3(){
        assertTrue(DataValidator.isValidIPAddress("001.099.08.255"));
    }
    @Test
    public void isValidIPAddressTestInvalidData1(){
        assertFalse(DataValidator.isValidIPAddress("259.255.99.01"));
    }
    @Test
    public void isValidIPAddressTestInvalidData2(){
        assertFalse(DataValidator.isValidIPAddress("111.999.99.01"));
    }
    @Test
    public void isValidIPAddressTestInvalidData3(){
        assertFalse(DataValidator.isValidIPAddress("111.255.350.01"));
    }
    @Test
    public void isValidIPAddressTestInvalidData4(){
        assertFalse(DataValidator.isValidIPAddress("0111.255.350.01"));
    }
    @Test
    public void isValidIPAddressTestInvalidData5(){
        assertFalse(DataValidator.isValidIPAddress("111.255.350.0100"));
    }
}
