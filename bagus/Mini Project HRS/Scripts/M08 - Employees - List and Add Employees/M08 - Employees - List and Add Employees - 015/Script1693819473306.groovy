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
WebUI.callTestCase(findTestCase('M08 - Employees - List and Add Employees/M08 - Employees - List and Add Employees - 002'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add Employee/th_User Type'))

WebUI.click(findTestObject('Add Employee/th_User Type'))

//Ambil semua element dari last name
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Master/pin'), 10)

//Deklarasi dua array
String[] arrOri = new String[dataList.size()]

String[] arrSort = new String[dataList.size()]

//Isi Array yang Ori & Sort
for (int i = 0; i < dataList.size(); i++) {
	text = dataList.get(i).text

	arrOri[i] = text

	arrSort[i] = text
}

//Sort Array
//Arrays.sort(arrSort)

Arrays.sort(arrSort,Collections.reverseOrder())



//verifikasi arrayOri == arraySort
assert arrOri == arrSort
