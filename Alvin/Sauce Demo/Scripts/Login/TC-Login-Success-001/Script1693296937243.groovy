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

WebUI.openBrowser(GlobalVariable.webSauceDemo)

WebUI.verifyElementPresent(findTestObject('Login Page Object/Swag Labs Text (tanda masuk home)'), 5)

WebUI.setText(findTestObject('Login Page Object/username login'), username)

WebUI.setEncryptedText(findTestObject('Login Page Object/password login'), password)

WebUI.click(findTestObject('Login Page Object/button login'))

WebUI.verifyElementPresent(findTestObject('Product/span_Products'), 5)

nameProduct = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/nama item pos 1 (product page)'), 5).text
descProduct = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/desc item pos 1 (product)'), 5).text
priceProduct = WebUI.findWebElement(findTestObject('Object Repository/selector for verify/price item pos 1 (product)'), 5).text

HashMap<String, String> item = new HashMap()

item.put("nameProduct", nameProduct)
item.put("descProduct", descProduct)
item.put("priceProduct", priceProduct)

return item