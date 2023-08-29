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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\mda-2.0.0-21.apk', false)

Mobile.tap(findTestObject('Login 1.2/burger_button'), 0)

Mobile.tap(findTestObject('Login 1.2/login_menu'), 0)

Mobile.setText(findTestObject('Login 1.2/input_username'), 'alice@example.com', 0)

Mobile.setEncryptedText(findTestObject('Login 1.2/input_password'), 'dbXIBZ66cuht4KTRMDozZw==', 0)

Mobile.tap(findTestObject('Login 1.2/login_button'), 0)

Mobile.verifyElementText(findTestObject('Login 1.2/alert_message'), 'Sorry this user has been locked out.')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

