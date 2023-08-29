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

HashMap<String, String> itemProduct = WebUI.callTestCase(findTestCase('Product/TC-Product-AddCart-001'), [:], FailureHandling.STOP_ON_FAILURE)

nameProduct = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/nama item pos 2 (product)'), 5).text
descProduct = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/desc item pos 2 (product)'), 5).text
priceProduct = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/price item pos 2 (product)'), 5).text

itemProduct.put("nameProduct2", nameProduct)
itemProduct.put("descProduct2", descProduct)
itemProduct.put("priceProduct2", priceProduct)

WebUI.click(findTestObject('Product/button add to cart pos 2'))

WebUI.verifyElementPresent(findTestObject('selector for verify/button remove item pos 2'), 5)

WebUI.verifyElementPresent(findTestObject('selector for verify/verify jumlah item 2 (cart)'), 5)

return itemProduct