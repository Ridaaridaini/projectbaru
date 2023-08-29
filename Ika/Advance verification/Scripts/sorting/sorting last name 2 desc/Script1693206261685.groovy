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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement


WebUI.openBrowser('https://the-internet.herokuapp.com/tables')

WebUI.click(findTestObject('sorting/last name 2'))
WebUI.click(findTestObject('sorting/last name 2'))

//ambil semua element dari last name
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/sorting/data list nama 2'), 10)

//deklarasi dua array
String[] arrLastName2Ori = new String[dataList.size()]
String[] arrLastName2Sort = new String[dataList.size()]

//isi Array yang oori dan sort
for(int i=0 ; i<dataList.size() ; i++) {
	text = dataList.get(i).text
	arrLastName2Ori[i] = text
	arrLastName2Sort[i] = text
}

//sort array
Arrays.sort(arrLastName2Sort, Collections.reverseOrder())

//verifikasi apakah 
assert arrLastName2Ori == arrLastName2Sort









