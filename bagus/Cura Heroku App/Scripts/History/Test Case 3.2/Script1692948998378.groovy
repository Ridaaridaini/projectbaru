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

WebUI.callTestCase(findTestCase('Make Appointment/Test Case 2.1 (Versi Dinamis)'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'
        , ('dropdown_menu') : 'Tokyo CURA Healthcare Center', ('hospital_readmission') : 'Yes', ('healthcare_program') : 'Medicare'
        , ('visit_date') : '23/08/2023', ('comment') : 'mau berobat'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('History/button_burger_appointment_confirm'))

WebUI.click(findTestObject('History/button_history_appointment_confirm'))

facility_appointment = WebUI.getText(findTestObject('Make Appointment/facility_Tokyo CURA Healthcare Center'))

readmission_appointment = WebUI.getText(findTestObject('Make Appointment/checkbox_Yes'))

program_appointment = WebUI.getText(findTestObject('Make Appointment/program_Medicare'))

comment_appointment = WebUI.getText(findTestObject('Make Appointment/comment_sakit kepala'))

facility_history = WebUI.getText(findTestObject('History/history_facility'))

readmission_history = WebUI.getText(findTestObject('History/history_readmission'))

program_history = WebUI.getText(findTestObject('History/history_healthcare_program'))

comment_history = WebUI.getText(findTestObject('History/history_comment'))

WebUI.verifyMatch(facility_history, facility_appointment, false)

WebUI.verifyMatch(readmission_history, readmission_appointment, false)

WebUI.verifyMatch(program_history, program_appointment, false)

WebUI.verifyMatch(comment_history, comment_appointment, false)

WebUI.delay(3)

WebUI.closeBrowser()

