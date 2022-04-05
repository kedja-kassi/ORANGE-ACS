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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.18.0.87/#!/login')

WebUI.setText(findTestObject('Object Repository/Test/Page_Orange Acs/input_Login_name'), 'c_fekouame')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Orange Acs/input_Mot de passe_password'), 'au1y5rkc9PnbeKKjb6dUoA==')

WebUI.click(findTestObject('Object Repository/Test/Page_Orange Acs/button_Se connecter'))

WebUI.click(findTestObject('Test/Page_Orange Acs/span_Management de CPEs'))

WebUI.click(findTestObject('Test/Page_Orange Acs/a_Recherche CPE'))

WebUI.selectOptionByValue(findTestObject('Page_Recherche/select_ZTEFanvilALCATEL'), 'ALCL', true)

WebUI.click(findTestObject('Test/Page_Orange Acs/button_Rechercher'))

