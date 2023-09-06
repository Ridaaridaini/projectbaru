import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.text.DecimalFormat

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

HashMap<String, String> cartItems = WebUI.callTestCase(findTestCase('Keranjang/TC-Cart-Show-002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout/button_Checkout'))

WebUI.verifyElementPresent(findTestObject('Checkout/span_Checkout Your Information'), 5)

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_firstName'), firstName)

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_lastName'), lastName)

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_postalCode'), postalCode)

WebUI.click(findTestObject('Checkout/input_Cancel_continue'))

WebUI.verifyElementPresent(findTestObject('Checkout/span_Checkout Overview'), 5)

cartName = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview item pos 1 name'), 5).text
cartDesc = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview item pos 1 desc'), 5).text
cartPrice = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview item pos 1 price'), 5).text

taxElement = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview tax'), 5).text
itemTotalElement = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview Item total'), 5).text
totalElement = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview total'), 5).text

// verifikasi item pada product page dan overview page
assert cartName == cartItems.get("nameProduct")
assert cartDesc == cartItems.get("descProduct")
assert cartPrice == cartItems.get("priceProduct")
// verifikasi item pada cart page dan overview page
assert cartName == cartItems.get("nameCart")
assert cartDesc == cartItems.get("descCart")
assert cartPrice == cartItems.get("priceCart")

//DecimalFormat df = new DecimalFormat('#.##')

//hitung tax, item total dan total dengan matematis
//tax = Double.parseDouble(df.format(Double.parseDouble(cartPrice.replace('$', '')) * 0.08))
tax = Math.round((Double.parseDouble(cartPrice.replace('$', '')) * 0.08) * 100) / 100
itemTotal = Double.parseDouble(cartPrice.replace('$', ''))
total = tax+itemTotal

String[] arrItemTotalElement = itemTotalElement.split('\\$')
String[] arrTaxElement = taxElement.split('\\$')
String[] arrTotalElement = totalElement.split('\\$')

//verifikasi hitung hitungan harga
assert tax == Double.parseDouble(arrTaxElement[1])
assert itemTotal == Double.parseDouble(arrItemTotalElement[1])
assert total == Double.parseDouble(arrTotalElement[1])

WebUI.click(findTestObject('Checkout/button_Finish'))

