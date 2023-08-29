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

WebUI.callTestCase(findTestCase('Login/TC-Login-Success-001'), [('username') : 'standard_user', ('password') : 'qcu24s4901FyWDTwXGr6XA=='], 
    FailureHandling.STOP_ON_FAILURE)

nameProduct = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/nama item pos 1 (product page)'), 10).text
descProduct = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/desc item pos 1 (product)'), 10).text
priceProduct = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/price item pos 1 (product)'), 10).text

WebUI.click(findTestObject('Detail Product/detail produk name pos 1 backpack'))

nameDetail = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/nama item pos 1 (detail page)'), 10).text
descDetail = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/desc item pos 1 (detail)'), 10).text
priceDetail = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/price item pos 1 (detail)'), 10).text

assert nameProduct == nameDetail
assert descProduct == descDetail
assert priceProduct == priceDetail
