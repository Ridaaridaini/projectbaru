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

WebUI.callTestCase(findTestCase('Keranjang/TC-Cart-Show-002'), [:], FailureHandling.STOP_ON_FAILURE)

title = WebUI.getText(findTestObject('Cart Text Product 1 Title'))

desc = WebUI.getText(findTestObject('Cart Text Product 1 Desc'))

price = WebUI.getText(findTestObject('Cart Text Product 1 Price')).replace('Remove', '')

WebUI.click(findTestObject('Cart Text Product 1'))

WebUI.verifyElementText(findTestObject('Detail Product Text Name Product 1'), title)

WebUI.verifyElementText(findTestObject('Detail Product Text Desc Product 1'), desc)

WebUI.verifyElementText(findTestObject('Detail Product Text Price Product 1'), price)

