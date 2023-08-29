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

HashMap<String, String> itemProduct = WebUI.callTestCase(findTestCase('Product/TC-Product-AddCart-002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout/cart icon'))

WebUI.verifyElementPresent(findTestObject('Checkout/span_Your Cart'), 5)

nameCart = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/cart item pos 1 name'), 5).text
descCart = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/cart item pos 1 desc'), 5).text
priceCart = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/cart item pos 1 price'), 5).text
nameCart2 = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/cart item pos 2 name'), 5).text
descCart2 = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/cart item pos 2 desc'), 5).text
priceCart2 = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/cart item pos 2 price'), 5).text

assert nameCart == itemProduct.get("nameProduct")
assert descCart == itemProduct.get("descProduct")
assert priceCart == itemProduct.get("priceProduct")
assert nameCart2 == itemProduct.get("nameProduct2")
assert descCart2 == itemProduct.get("descProduct2")
assert priceCart2 == itemProduct.get("priceProduct2")