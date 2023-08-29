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
import org.openqa.selenium.Keys  as Keys
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Login/TC-Login-Success-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Products/dropdown_menu'), 'hilo', false)

//Ambil semua element dari last name
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Products/list_price'), 10)


//Deklarasi dua array
Double[] arrLastNameOri = new Double[dataList.size()]


Double[] arrLastNameSort = new Double[dataList.size()]

//Isi Array yang Ori & Sort
for (int i = 0; i < dataList.size(); i++) {
	text = dataList.get(i).text

	textRep = text.replace('$', '')
	
	double textRepParse = Double.parseDouble(textRep)
	
	arrLastNameOri[i] = textRepParse

	arrLastNameSort[i] = textRepParse
}
println arrLastNameSort
println arrLastNameOri

//Sort Array
//1. for ASC
//Arrays.sort(arrLastNameSort)

//2. for DESC
Arrays.sort(arrLastNameSort,Collections.reverseOrder())


//verifikasi arrayOri == arraySort
assert arrLastNameOri == arrLastNameSort