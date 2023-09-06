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

WebUI.click(findTestObject('Products/add_to_chart_product_2'))

name_product_2 = WebUI.getText(findTestObject('Products/name_product_2'))

description_product_2 = WebUI.getText(findTestObject('Products/description_product_2'))

price_product_2 = WebUI.getText(findTestObject('Products/price_product_2'))

List<String> name_product_list = new ArrayList()
name_product_list.add(data.get("name_product"))
name_product_list.add(name_product_2)

List<String> description_product_list = new ArrayList()
description_product_list.add(data.get("description_product"))
description_product_list.add(description_product_2)

List<String> price_product_list = new ArrayList()
price_product_list.add(data.get("product_price"))
price_product_list.add(price_product_2)

println name_product_list

data.put('name_product_list', name_product_list)
data.put("description_product_list", description_product_list)
data.put("price_product_list", price_product_list)

return data




