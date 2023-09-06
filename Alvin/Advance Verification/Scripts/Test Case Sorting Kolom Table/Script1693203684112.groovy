import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.List

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
import java.util.List

WebUI.openBrowser('https://the-internet.herokuapp.com/tables')
WebUI.scrollToElement(findTestObject('Object Repository/The Internet/h4_Example 2'), 10)
WebUI.click(findTestObject('The Internet/kolom 2'))

List<WebElement> kolomList = WebUI.findWebElements(findTestObject('Object Repository/The Internet/kolom last name 2'), 10);

String[] dataKolom = new String[kolomList.size()]
String[] dataValid = new String[kolomList.size()]

for(int i = 0; i < kolomList.size(); i++) {
	temp = kolomList.get(i).toString()
	dataKolom[i] = temp
	dataValid[i] = temp
}

Arrays.sort(dataValid)

assert dataKolom == dataValid
