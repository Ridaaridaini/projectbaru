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

HashMap<String, String> data = WebUI.callTestCase(findTestCase('Keranjang/TC-Cart-Show-002'), [:], FailureHandling.STOP_ON_FAILURE)

name_product_cart = data.get('name_product')

description_product_cart = data.get('description_product')

price_product_cart = data.get('product_price')

WebUI.click(findTestObject('Keranjang/title_product'))

detail_name_product = WebUI.getText(findTestObject('Detail Product/detail_name_product'))

detail_description_product = WebUI.getText(findTestObject('Products/detail_description_product'))

detail_price_product = WebUI.getText(findTestObject('Products/detail_product_price'))

WebUI.verifyMatch(detail_name_product, name_product_cart, false)

WebUI.verifyMatch(detail_description_product, description_product_cart, false)

WebUI.verifyMatch(detail_price_product, price_product_cart, false)

