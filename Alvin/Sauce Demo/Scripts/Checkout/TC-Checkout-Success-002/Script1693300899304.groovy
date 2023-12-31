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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

HashMap<String, Object> cartItems = WebUI.callTestCase(findTestCase('Keranjang/TC-Cart-Show-003'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout/button_Checkout'))

WebUI.verifyElementPresent(findTestObject('Checkout/span_Checkout Your Information'), 5)

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_firstName'), firstName)

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_lastName'), lastName)

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_postalCode'), postalCode)

WebUI.click(findTestObject('Checkout/input_Cancel_continue'))

WebUI.verifyElementPresent(findTestObject('Checkout/span_Checkout Overview'), 5)

// objek dari halaman checkout overview
List<WebElement> cartName = WebUI.findWebElements(findTestObject('Object Repository/Checkout/overview item pos 1 name'), 5)
List<WebElement> cartDesc = WebUI.findWebElements(findTestObject('Object Repository/Checkout/overview item pos 1 desc'), 5)
List<WebElement> cartPrice = WebUI.findWebElements(findTestObject('Object Repository/Checkout/overview item pos 1 price'), 5)

// objek tentang harga dari halaman checkout overview
overviewItemTotal = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview Item total'), 5).text
overviewTax = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview tax'), 5).text
overviewTotal = WebUI.findWebElement(findTestObject('Object Repository/Checkout/overview total'), 5).text

// buat nampung tentang harga
String[] arrOverviewItemTotal = overviewItemTotal.split('\\$')
String[] arrOverviewTax = overviewTax.split('\\$')
String[] arrOverviewTotal = overviewTotal.split('\\$')

// buat nampung text dari objek yang berasal dari halaman checkout overview
List<String> productName = new ArrayList()
List<String> productDesc = new ArrayList()
List<String> productPrice = new ArrayList()

//DecimalFormat df = new DecimalFormat("#.##");

totalHargaBarang = 0

for(int i = 0; i < cartName.size(); i++) {
	tempProductName = cartName.get(i).text
	tempProductDesc = cartDesc.get(i).text
	tempProductPrice = cartPrice.get(i).text
	
	productName.add(tempProductName)
	productDesc.add(tempProductDesc)
	productPrice.add(tempProductPrice)
	
	totalHargaBarang += Double.parseDouble(cartPrice.get(i).text.replace('$', ''))
}

tax = Math.round((totalHargaBarang * 0.08) * 100) / 100
totals = Math.round((totalHargaBarang + tax) * 100) / 100

assert cartItems.get("listNameProduct") == productName
assert cartItems.get("listDescProduct") == productDesc
assert cartItems.get("listPriceProduct") == productPrice

assert Double.parseDouble(arrOverviewItemTotal[1]) == totalHargaBarang
assert Double.parseDouble(arrOverviewTax[1]) == tax
assert Double.parseDouble(arrOverviewTotal[1]) == totals

WebUI.click(findTestObject('Checkout/button_Finish'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/span_Checkout Complete'), 5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/present thankyou for your order'), 5)
