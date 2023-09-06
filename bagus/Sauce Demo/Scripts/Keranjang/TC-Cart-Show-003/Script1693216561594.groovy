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
import org.openqa.selenium.Keys  as Keys
import org.openqa.selenium.WebElement

HashMap<String, Object> data = WebUI.callTestCase(findTestCase('Products/TC-Product-AddCart-002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Keranjang/icon_cart'))

List<WebElement> name_product_list = WebUI.findWebElements(findTestObject('Object Repository/Keranjang/product_list_cart'),10)
List<WebElement> description_product_list = WebUI.findWebElements(findTestObject('Object Repository/Keranjang/description_product_list'),10)
List<WebElement> price_product_list = WebUI.findWebElements(findTestObject('Object Repository/Keranjang/price_product_price'),10)

List<String> defult_name_product_list = new ArrayList()
List<String> defult_description_product_list = new ArrayList()
List<String> defult_price_product_list = new ArrayList()

for(i = 0; i<name_product_list.size();i++) {
	text_name_product = name_product_list.get(i).text.trim()
	text_decription_product = description_product_list.get(i).text.trim()
	text_price_product = price_product_list.get(i).text.trim()
	
	defult_name_product_list.add(text_name_product)
	defult_description_product_list.add(text_decription_product)
	defult_price_product_list.add(text_price_product)
	
}




assert data.get("name_product_list") == defult_name_product_list
assert data.get("description_product_list") == defult_description_product_list
assert data.get("price_product_list") == defult_price_product_list

return data
