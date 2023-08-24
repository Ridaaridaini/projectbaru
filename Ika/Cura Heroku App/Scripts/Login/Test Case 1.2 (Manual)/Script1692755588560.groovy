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

WebUI.verifyElementPresent(findTestObject('login/title_home_page'), 10)

WebUI.click(findTestObject('login/menu burger'))

WebUI.click(findTestObject('login/menu Login'))

WebUI.verifyElementPresent(findTestObject('login/title_Login'), 10)

WebUI.setText(findTestObject('login/input_Username'), username)

WebUI.setEncryptedText(findTestObject('login/input_Password'), password)

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementText(findTestObject('login/error message login'), 'Login failed! Please ensure the username and password are valid.')

WebUI.delay(10)

WebUI.closeBrowser()

