import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Connexion/Connexion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.delay(10)

//WebUI.click(findTestObject('Page_Recherche/a_Management de CPEs'))
//WebUI.click(findTestObject('Page_Recherche/a_Recherche CPE'))
if (WebUI.waitForElementClickable(findTestObject('Page_Recherche/a_Management de CPEs'), 10)) {
    WebUI.click(findTestObject('Page_Recherche/a_Management de CPEs'))
}

if (WebUI.waitForElementVisible(findTestObject('Page_Recherche/a_Recherche CPE'), 10)) {
    WebUI.click(findTestObject('Page_Recherche/a_Recherche CPE'))
}

