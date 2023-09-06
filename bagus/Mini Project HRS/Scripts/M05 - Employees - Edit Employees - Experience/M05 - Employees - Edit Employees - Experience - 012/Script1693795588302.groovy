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

WebUI.callTestCase(findTestCase('M05 - Employees - Edit Employees - Experience/M05 - Employees - Edit Employees - Experience - 006'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Edit Employee Experience/input_compay_name_modal'), 'PT Mencari Cinta Sejati')

WebUI.setText(findTestObject('Edit Employee Experience/input_position_modal'), 'Human Resource Department')

WebUI.setText(findTestObject('Edit Employee Experience/input_address_modal'), 'jalan')

WebUI.setText(findTestObject('Edit Employee Experience/input_working_duration_modal'), '1 year')

WebUI.click(findTestObject('Edit Employee Experience/button_submit_modal'))

WebUI.verifyElementText(findTestObject('Master/label_Please enter at least 7 characters_modal'), 'Please enter at least 7 characters.')

