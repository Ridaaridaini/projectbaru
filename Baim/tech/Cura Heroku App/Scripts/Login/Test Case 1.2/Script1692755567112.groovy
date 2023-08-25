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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.WEB_URL)

WebUI.verifyElementPresent(findTestObject('Login/title_home_page'), 0)

WebUI.click(findTestObject('Object Repository/Login_negatif/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Login_negatif/login'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login_negatif/input_Username_username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Login_negatif/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Login_negatif/button_Login'))

WebUI.verifyElementText(findTestObject('Login_negatif/p_Login failed Please ensure the username a_eb55b5'), 'Login failed! Please ensure the username and password are valid.')

WebUI.delay(3)

WebUI.closeBrowser()

