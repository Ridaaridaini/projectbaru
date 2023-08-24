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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Objek dari record TC 1.2/verifikasi_halaman_home'), 10)

WebUI.click(findTestObject('Object Repository/Objek dari record TC 1.2/click_hamburger'))

WebUI.click(findTestObject('Object Repository/Objek dari record TC 1.2/click_menu_login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Objek dari record TC 1.2/verifikasi_halaman_login'), 10)

WebUI.setText(findTestObject('Object Repository/Objek dari record TC 1.2/username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Objek dari record TC 1.2/password'), '8SQVv/p9jVQlAgA5jBHJwQ==')

WebUI.click(findTestObject('Object Repository/Objek dari record TC 1.2/click_login'))

WebUI.verifyElementText(findTestObject('Object Repository/Objek dari record TC 1.2/verify_error_message'), 'Login failed! Please ensure the username and password are valid.')

WebUI.closeBrowser()

