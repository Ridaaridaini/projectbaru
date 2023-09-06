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

WebUI.callTestCase(findTestCase('Appointment/Test Case 2.1 (dinamis)'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'
        , ('facility') : 'Hongkong CURA Healthcare Center', ('readmission') : 'yes', ('healthcare_program') : 'medicaid'
        , ('date') : '04/06/2023', ('comment') : 'Hello World'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CURA Healthcare Service/go_to_homepage_halaman_appointment_confirm'))

WebUI.click(findTestObject('Objek dari record TC 1.2/click_hamburger'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/menu_history'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/verify_halaman_history'), 10)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/card_history'), 10)

WebUI.closeBrowser()

