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

WebUI.callTestCase(findTestCase('M05 - Employees - Edit Employees - Experience/M05 - Employees - Edit Employees - Experience - 004'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Edit Employee Experience/input_company_name'), company_name)

input_company_name = WebUI.getAttribute(findTestObject('Edit Employee Experience/input_company_name'), 'value')

WebUI.setText(findTestObject('Edit Employee Experience/input_position'), position)

input_position = WebUI.getAttribute(findTestObject('Edit Employee Experience/input_position'), 'value')

WebUI.setText(findTestObject('Edit Employee Experience/input_address'), address)

input_address = WebUI.getAttribute(findTestObject('Edit Employee Experience/input_address'), 'value')

WebUI.setText(findTestObject('Edit Employee Experience/input_working_duration'), working_duration)

input_working_duration = WebUI.getAttribute(findTestObject('Edit Employee Experience/input_working_duration'), 'value')

WebUI.click(findTestObject('Edit Employee Experience/save_button'))

WebUI.verifyElementText(findTestObject('Edit Employee Experience/message_success'), 'Successfully Updated')

WebUI.delay(10)

WebUI.click(findTestObject('Edit Employee Experience/experience'))

table_company_name = WebUI.getText(findTestObject('Edit Employee Experience/table_company_name'))

table_position = WebUI.getText(findTestObject('Edit Employee Experience/table_position'))

table_working_duration = WebUI.getText(findTestObject('Edit Employee Experience/table_working_duration'))

WebUI.verifyMatch(table_company_name, input_company_name, false)

WebUI.verifyMatch(table_position, input_position, false)

WebUI.verifyMatch(table_working_duration, input_working_duration, false)

