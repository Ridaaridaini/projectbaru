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

HashMap<String, Object> data = WebUI.callTestCase(findTestCase('Keranjang/TC-Cart-Show-002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Cart Button Checkout'))

WebUI.verifyElementPresent(findTestObject('Checkout Step 1 Title'), 0)

WebUI.setText(findTestObject('Checkout Input First Name'), first_name)

WebUI.setText(findTestObject('Checkout Input Last Name'), last_name)

WebUI.setText(findTestObject('Checkout Input Postal Code'), postal_code)

WebUI.click(findTestObject('Checkout Button Continue'))

WebUI.verifyElementPresent(findTestObject('Checkout Step 2 Title'), 0)

//Verifikasi Barang yang dicheckout
productTitle = WebUI.getText(findTestObject('Object Repository/Checkout Title Product 1'))
productDesc = WebUI.getText(findTestObject('Object Repository/Checkout Desc Product 1'))
productPrice = WebUI.getText(findTestObject('Object Repository/Checkout Price Product 1'))

assert productTitle == data.get("product_name")
assert productDesc == data.get("product_desc")
assert productPrice == data.get("product_price")

//Verifikasi Harga Produk
price_product = WebUI.getText(findTestObject('Checkout Price Product 1')).replace('$', '').trim()
price_product = Double.parseDouble(price_product)

total_price_product = (WebUI.getText(findTestObject('Checkout Text Total Product Price')).split(':')[1]).replace('$', '').trim()
total_price_product = Double.parseDouble(total_price_product)

//Verifikasi price_product == total_price_product
assert price_product == total_price_product

tax = (WebUI.getText(findTestObject('Checkout Text Tax 8 Percent')).split(':')[1]).replace('$', '').trim()

tax = Double.parseDouble(tax)

assert (Math.round((tax / total_price_product) * 100.0) / 100.0) == 0.08

total_price_plus_tax = (WebUI.getText(findTestObject('Checkout Text Total Price Plus Tax')).split(':')[1]).replace('$', 
    '').trim()

total_price_plus_tax = Double.parseDouble(total_price_plus_tax)

assert total_price_plus_tax == (total_price_product + tax)

WebUI.click(findTestObject('Checkout Button Finish'))

WebUI.verifyElementPresent(findTestObject('Checkout Title Complete'), 0)

