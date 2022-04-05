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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Recherche/AccesRecherche'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Recherche/input_Adresse MAC_form-control'), GlobalVariable.MAC_ZTE)

WebUI.delay(5)


WebUI.waitForElementClickable(findTestObject('Page_Recherche/button_Rechercher'), 5)

WebUI.click(findTestObject('Page_Recherche/button_Rechercher'))

WebUI.delay(15)

WebUI.waitForElementPresent(findTestObject('null'), 5)

String ExpectedValue = GlobalVariable.MAC_ZTE

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement table = driver.findElement(By.xpath('id("content")/div[@class="row"]/div[@class="col-md-12"]/div[@class="panel panel-default"]/div[@class="panel-body"]/table[@class="table table-bordered table-hover"]'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

println('Nbre de Device :'+(rows_count-2))


if ((rows_count -2)!=1) {
	throw new com.kms.katalon.core.exception.StepFailedException('Le nombre de device trouvé est incorrect')
}else{
  
'Loop will execute for all the rows of the table'
Loop:
for (int row = 0; row < rows_count; row++) {
'To locate columns(cells) of that specific row'
List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
 
'To calculate no of columns(cells) In that specific row'
int columns_count = Columns_row.size()
 
println((('Number of cells In Row ' + row) + ' are ') + columns_count)
 
'Loop will execute till the last cell of that specific row'
for (int column = 0; column < columns_count; column++) {
'It will retrieve text from each cell'
String celltext = Columns_row.get(column).getText()
 
println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
 
'Checking if Cell text is matching with the expected value'
if (celltext == ExpectedValue) {
'Getting the Country Name if cell text i.e Company name matches with Expected value'
println('Le MAC adress recherché est : ' + Columns_row.get(column).getText())
 
'After getting the Expected value from Table we will Terminate the loop'
break Loop;
}
//else{
//throw new com.kms.katalon.core.exception.StepFailedException('Le MAC recherché nest pas celui qui à été trouvé')
//}
}
}

}


