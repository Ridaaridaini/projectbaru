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

WebUI.callTestCase(findTestCase('Products/TC-Product-Show-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product Button ATC Product 1'))

WebUI.verifyElementText(findTestObject('Product Button Remove Product 1'), 'Remove')

WebUI.verifyElementText(findTestObject('Product Label Icon Cart'), '1')

name = WebUI.getText(findTestObject('Product Text Name Product 1'))

desc = WebUI.getText(findTestObject('Product Text Desc Product 1'))

prize = WebUI.getText(findTestObject('Product Text Price Product 1'))

HashMap<String, Object> data = new HashMap<String, Object>()

data.put('product_name', name)

data.put('product_desc', desc)

data.put('product_price', prize)

return data

