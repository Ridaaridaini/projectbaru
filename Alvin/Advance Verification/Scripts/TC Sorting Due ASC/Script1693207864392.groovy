import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

WebUI.openBrowser('https://the-internet.herokuapp.com/tables')

WebUI.click(findTestObject('Object Repository/The Internet/TH Due 1'))

List<WebElement> list = WebUI.findWebElements(findTestObject('Object Repository/The Internet/TD kolom 1'), 5)

Double[] dueList = new Double[list.size()]
Double[] dueListAsc = new Double[list.size()]

for(int i = 0; i < list.size(); i++) {
	getNumber = list.get(i).text
	
	temp = Double.parseDouble(getNumber.replace('$', ''))
	dueList[i] = temp
	dueListAsc[i] = temp
}

Arrays.sort(dueListAsc)

assert dueList == dueListAsc