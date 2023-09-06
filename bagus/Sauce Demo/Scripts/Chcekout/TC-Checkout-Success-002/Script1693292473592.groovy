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
import org.openqa.selenium.WebElement as WebElement

HashMap<String, Object> data = WebUI.callTestCase(findTestCase('Products/TC-Product-AddCart-002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Keranjang/icon_cart'))

WebUI.click(findTestObject('Checkout/button_checkout'))

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_firstName'), 'nama depan pembeli')

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_lastName'), 'nama belakang pembeli')

WebUI.setText(findTestObject('Checkout/input_Checkout Your Information_postalCode'), 'alamat pos')

WebUI.click(findTestObject('Checkout/input_continue'))

List<WebElement> name_list = WebUI.findWebElements(findTestObject('Object Repository/Checkout/name_list'), 10)

List<WebElement> desc_list = WebUI.findWebElements(findTestObject('Object Repository/Checkout/desc_list'), 10)

List<WebElement> price_list = WebUI.findWebElements(findTestObject('Object Repository/Checkout/price_list'), 10)

List<WebElement> defult_name_product_list = new ArrayList()

List<WebElement> defult_description_product_list = new ArrayList()

List<WebElement> defult_price_product_list = new ArrayList()

total_harga = 0.0

for (i = 0; i < name_list.size(); i++) {
    text_name_product = name_list.get(i).text.trim()

    text_decription_product = desc_list.get(i).text.trim()

    text_price_product = price_list.get(i).text.trim()

    defult_name_product_list.add(text_name_product)

    defult_description_product_list.add(text_decription_product)

    defult_price_product_list.add(text_price_product)

    price_product_rep = text_price_product.replace('$', '').trim()

    Double text_price_product_double = Double.parseDouble(price_product_rep)

    total_harga = (total_harga + text_price_product_double)
}

println(total_harga)

//manipulasi total harga
price = WebUI.getText(findTestObject('Checkout/item_total'))

price_rep = price.replace('Item total: $', '').trim()

Double price_double = Double.parseDouble(price_rep)

//verify total harga
assert total_harga == price_double

//cari tax
tax = (Math.round((price_double * 0.08) * 100) / 100)

//manipulasi tax
tax_ori = WebUI.getText(findTestObject('Checkout/tax'))

tax_rep = tax_ori.replace('Tax: $', '').trim()

Double tax_double = Double.parseDouble(tax_rep)


//verify tax
assert tax == tax_double


//manipulasi total harga
total_harga_semua = WebUI.getText(findTestObject('Checkout/total_harga'))
total_harga_rep = total_harga_semua.replace('Total: $', '').trim()
Double total_double = Double.parseDouble(total_harga_rep)


//verify total harga
total_harga_total = total_harga + tax
assert total_harga_total == total_double

assert data.get('name_product_list') == defult_name_product_list

assert data.get('description_product_list') == defult_description_product_list

assert data.get('price_product_list') == defult_price_product_list

WebUI.mouseOver(findTestObject('Checkout/button_Finish'))

WebUI.click(findTestObject('Checkout/button_Finish'))

return data

