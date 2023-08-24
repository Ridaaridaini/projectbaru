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

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Cara Manual)'), [('Username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/dropdown_menu'), dropdown_menu, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/checkbox_apply_for_hospital_readmission'))
}

if (healthcare_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/radio_button_input_Medicare'))
} else if (healthcare_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/radio_button_input_Medicaid'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/radio_button_input_None'))
}

WebUI.setText(findTestObject('Make Appointment/input_Visit Date (Required)_visit_date'), visit_date)

WebUI.setText(findTestObject('Make Appointment/textarea_Comment_comment'), comment)

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/title_Appointment Confirmation'))

hasil_facility = WebUI.getText(findTestObject('Object Repository/Make Appointment/facility_Tokyo CURA Healthcare Center'))

hasil_readmission = WebUI.getText(findTestObject('Make Appointment/checkbox_Yes'))

hasil_program = WebUI.getText(findTestObject('Make Appointment/program_Medicare'))

hasil_date = WebUI.getText(findTestObject('Make Appointment/visit_date'))

hasil_comment = WebUI.getText(findTestObject('Make Appointment/comment_sakit kepala'))

WebUI.verifyMatch(hasil_facility, dropdown_menu, false)

WebUI.verifyMatch(hasil_readmission, hospital_readmission, false)

WebUI.verifyMatch(hasil_program, healthcare_program, false)

WebUI.verifyMatch(hasil_date, visit_date, false)

WebUI.verifyMatch(hasil_comment, comment, false)

