import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
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
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Recherche/AccesRecherche'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)




WebUI.waitForElementClickable(findTestObject('Page_Recherche/select_ADSLEthernetGPON'), 10)

int NbreElement = WebUI.getNumberOfTotalOption(findTestObject('Page_Recherche/select_ADSLEthernetGPON'))

println('Total element : ' + NbreElement)

WebUI.selectOptionByLabel(findTestObject('Page_Recherche/select_ADSLEthernetGPON'), 'GPON', false)


//WebUI.selectOptionByIndex(findTestObject('Page_Recherche/select_ZTEFanvilALCATEL'), 0)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Recherche/button_Rechercher'), 5)

WebUI.click(findTestObject('Page_Recherche/button_Rechercher'))

WebUI.delay(15)


WebUI.waitForElementPresent(findTestObject('null'), 5)


String ExpectedValue = 'ALCLF'

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement table = driver.findElement(By.xpath('id("content")/div[@class="row"]/div[@class="col-md-12"]/div[@class="panel panel-default"]/div[@class="panel-body"]/table[@class="table table-bordered table-hover"]'))


//WebElement table = driver.findElement(By.xpath('id("content")/div[@class="row"]/div[@class="col-md-12"]/div[@class="panel panel-default"]/div[@class="panel-body"]/table[@class="table table-bordered table-hover"]'))





'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

println('Nbre de Device :'+(rows_count-2))


'Loop will execute for all the rows of the table'
Loop:
for (int row = 2; row < rows_count; row++) {
	
	List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
	//int columns_count = Columns_row.size()
	
	String celltext = Columns_row.get(3).getText()
	String  codeconstructeur = celltext.substring(0 , 5)
	println((('SN de la ligne ' + row) + ' est ') + celltext)
	if (codeconstructeur != ExpectedValue) {
		println((('le code constructeur de la ligne ' + row) + ' est ') + codeconstructeur)
		throw new com.kms.katalon.core.exception.StepFailedException('Constructeur incorrect pour le device '+celltext)
	}
	
}





