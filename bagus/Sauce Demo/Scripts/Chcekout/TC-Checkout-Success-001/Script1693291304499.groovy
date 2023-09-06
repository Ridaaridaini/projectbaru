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

HashMap<String, Object> data = WebUI.callTestCase(findTestCase('Products/TC-Product-AddCart-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Keranjang/icon_cart'))

name_product_cart = data.get('name_product')

description_product_cart = data.get('description_product')

price_product_cart = data.get('product_price')

WebUI.click(findTestObject('Checkout/button_checkout'))

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_firstName'), 'nama depan pembeli')

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_lastName'), 'nama belakang pembeli')

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_postalCode'), 'alamat pos')

WebUI.click(findTestObject('Checkout/input_continue'))

name_overview = WebUI.getText(findTestObject('Checkout/name_overview'))

description_overview = WebUI.getText(findTestObject('Checkout/description_overview'))

price_overview = WebUI.getText(findTestObject('Checkout/price_overview'))

price_overview_rep = price_overview.replace('$', '')

Double harga_barang = Double.parseDouble(price_overview_rep)

println(price_overview_rep)

WebUI.verifyMatch(name_overview, name_product_cart, false)

WebUI.verifyMatch(description_overview, description_product_cart, false)

WebUI.verifyMatch(price_overview, price_product_cart, false)

//manipulasi total harga
item_total = WebUI.getText(findTestObject('Checkout/item_total'))

item_total_fix = item_total.replace('Item total: $', '').trim()

Double price = Double.parseDouble(item_total_fix)

//verify total harga
assert price == harga_barang

//manipulasi tax
tax_ori = WebUI.getText(findTestObject('Checkout/tax'))

tax_rep = tax_ori.replace('Tax: $', '').trim()

Double pajak = Double.parseDouble(tax_rep)

//ngitung tax
tax = (Math.round((price * 0.08) * 100) / 100)

println(tax)

//verify tax
assert pajak == tax

//total harga + tax
Double total = price + pajak

println(total)

//manipulasi total harga
total_price = WebUI.getText(findTestObject('Checkout/total_harga'))
total_price_rep = total_price.replace('Total: $', '').trim()
Double total_price_double = Double.parseDouble(total_price_rep)

//verify total harga
assert total == total_price_double


WebUI.click(findTestObject('Checkout/button_Finish'))

