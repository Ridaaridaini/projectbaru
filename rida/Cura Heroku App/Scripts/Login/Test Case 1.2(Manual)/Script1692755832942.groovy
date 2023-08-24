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

WebUI.openBrowser(GlobalVariable.WEB_URL)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('h1_CURA Healthcare Service'), 10)

WebUI.click(findTestObject('i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('a_Login'))

WebUI.click(findTestObject('h2_Login'))

WebUI.setText(findTestObject('input_Username_username'), Username)

WebUI.setEncryptedText(findTestObject('input_Password_password'), Password)

WebUI.click(findTestObject('button_Login'))

WebUI.verifyElementText(findTestObject('Error_massage_Login failed'), 'Login failed! Please ensure the username and password are valid.')

WebUI.delay(5)

WebUI.closeBrowser()

