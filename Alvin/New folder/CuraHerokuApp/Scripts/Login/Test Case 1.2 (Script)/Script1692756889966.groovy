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

WebUI.verifyElementPresent(findTestObject('Object Repository/Objek untuk login/title_homepage'), 10)

WebUI.click(findTestObject('Object Repository/Objek untuk login/menu_burger'))

WebUI.click(findTestObject('Object Repository/Objek untuk login/menu_login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Objek untuk login/verifikasi_masuk_halaman_login'), 10)

WebUI.setText(findTestObject('Object Repository/Objek untuk login/input_form_username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Objek untuk login/input_form_password'), password)

WebUI.click(findTestObject('Object Repository/Objek untuk login/button_form_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Objek untuk login/verifikasi_error_message_login'), error_message)

