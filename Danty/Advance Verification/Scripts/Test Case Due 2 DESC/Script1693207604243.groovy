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

WebUI.click(findTestObject('Sorting/Tombol_Due2'))
WebUI.click(findTestObject('Sorting/Tombol_Due2'))

//Ambil semua element dari last name
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Sorting/Data Due 2'), 10)

//Deklarasi dua array
Double[] arrLastNameOri = new Double[dataList.size()]

Double[] arrLastNameSort = new Double[dataList.size()]

//Isi Array yang Ori & Sort
for (int i = 0; i < dataList.size(); i++) {
    text = dataList.get(i).text

    //replace $ ke ''
    arrLastNameOri1 = text.replace('$', '')

    arrLastNameSort1 = text.replace('$', '')

    //Parsing String ke Double
    arrLastNameOri2 = Double.parseDouble(arrLastNameOri1)

    arrLastNameSort2 = Double.parseDouble(arrLastNameSort1)

    (arrLastNameOri[i]) = arrLastNameOri2

    (arrLastNameSort[i]) = arrLastNameSort2
}

//Sort Array
//Arrays.sort(arrLastNameSort)

Arrays.sort(arrLastNameSort,Collections.reverseOrder())
assert arrLastNameOri == arrLastNameSort

