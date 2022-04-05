package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object login
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object urlProd
     
    /**
     * <p></p>
     */
    public static Object urlDev
     
    /**
     * <p></p>
     */
    public static Object SN_ALCL
     
    /**
     * <p></p>
     */
    public static Object ND_ALCL
     
    /**
     * <p></p>
     */
    public static Object MAC_ALCL
     
    /**
     * <p></p>
     */
    public static Object LOGIN_ALCL
     
    /**
     * <p></p>
     */
    public static Object SN_ZTE
     
    /**
     * <p></p>
     */
    public static Object ND_ZTE
     
    /**
     * <p></p>
     */
    public static Object MAC_ZTE
     
    /**
     * <p></p>
     */
    public static Object LOGIN_ZTE
     
    /**
     * <p></p>
     */
    public static Object MAC_LIVEBOX2
     
    /**
     * <p></p>
     */
    public static Object SN_FANVIL
     
    /**
     * <p></p>
     */
    public static Object ND_FANVIL
     
    /**
     * <p></p>
     */
    public static Object ND_FANVIL_2
     
    /**
     * <p></p>
     */
    public static Object LOGIN_FANVIL
     
    /**
     * <p></p>
     */
    public static Object MAC_FANVIL
     
    /**
     * <p></p>
     */
    public static Object loginZ
     
    /**
     * <p></p>
     */
    public static Object passwordz
     
    /**
     * <p></p>
     */
    public static Object LOGIN_ALCL_2
     
    /**
     * <p></p>
     */
    public static Object MAC_ZTE_F680
     
    /**
     * <p></p>
     */
    public static Object SN_F660
     
    /**
     * <p></p>
     */
    public static Object MAC_F660
     
    /**
     * <p></p>
     */
    public static Object SN_F680
     
    /**
     * <p></p>
     */
    public static Object LOGIN_F680
     
    /**
     * <p></p>
     */
    public static Object ND_F680
     
    /**
     * <p></p>
     */
    public static Object LOGIN_F660
     
    /**
     * <p></p>
     */
    public static Object ND_F660
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            login = selectedVariables['login']
            password = selectedVariables['password']
            urlProd = selectedVariables['urlProd']
            urlDev = selectedVariables['urlDev']
            SN_ALCL = selectedVariables['SN_ALCL']
            ND_ALCL = selectedVariables['ND_ALCL']
            MAC_ALCL = selectedVariables['MAC_ALCL']
            LOGIN_ALCL = selectedVariables['LOGIN_ALCL']
            SN_ZTE = selectedVariables['SN_ZTE']
            ND_ZTE = selectedVariables['ND_ZTE']
            MAC_ZTE = selectedVariables['MAC_ZTE']
            LOGIN_ZTE = selectedVariables['LOGIN_ZTE']
            MAC_LIVEBOX2 = selectedVariables['MAC_LIVEBOX2']
            SN_FANVIL = selectedVariables['SN_FANVIL']
            ND_FANVIL = selectedVariables['ND_FANVIL']
            ND_FANVIL_2 = selectedVariables['ND_FANVIL_2']
            LOGIN_FANVIL = selectedVariables['LOGIN_FANVIL']
            MAC_FANVIL = selectedVariables['MAC_FANVIL']
            loginZ = selectedVariables['loginZ']
            passwordz = selectedVariables['passwordz']
            LOGIN_ALCL_2 = selectedVariables['LOGIN_ALCL_2']
            MAC_ZTE_F680 = selectedVariables['MAC_ZTE_F680']
            SN_F660 = selectedVariables['SN_F660']
            MAC_F660 = selectedVariables['MAC_F660']
            SN_F680 = selectedVariables['SN_F680']
            LOGIN_F680 = selectedVariables['LOGIN_F680']
            ND_F680 = selectedVariables['ND_F680']
            LOGIN_F660 = selectedVariables['LOGIN_F660']
            ND_F660 = selectedVariables['ND_F660']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
