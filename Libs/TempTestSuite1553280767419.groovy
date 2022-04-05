import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Recherche/ALCATEL(G-240W-A)')

suiteProperties.put('name', 'ALCATEL(G-240W-A)')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/FRAFA-PC/Katalon Studio/ORANGE-ACS/Reports/Recherche/ALCATEL(G-240W-A)/20190322_185247/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Recherche/ALCATEL(G-240W-A)', suiteProperties, [new TestCaseBinding('Test Cases/Recherche/ALCL (G-240W-A)/1-LOGIN', 'Test Cases/Recherche/ALCL (G-240W-A)/1-LOGIN',  null), new TestCaseBinding('Test Cases/Recherche/ALCL (G-240W-A)/2-SN', 'Test Cases/Recherche/ALCL (G-240W-A)/2-SN',  null), new TestCaseBinding('Test Cases/Recherche/ALCL (G-240W-A)/3-MAC', 'Test Cases/Recherche/ALCL (G-240W-A)/3-MAC',  null), new TestCaseBinding('Test Cases/Recherche/ALCL (G-240W-A)/4-ND', 'Test Cases/Recherche/ALCL (G-240W-A)/4-ND',  null), new TestCaseBinding('Test Cases/Recherche/ALCL (G-240W-A)/6-CONSTRUCTEUR', 'Test Cases/Recherche/ALCL (G-240W-A)/6-CONSTRUCTEUR',  null)])
