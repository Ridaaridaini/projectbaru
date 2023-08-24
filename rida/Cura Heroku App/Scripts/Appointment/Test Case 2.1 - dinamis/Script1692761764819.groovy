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

WebUI.callTestCase(findTestCase('Login/Test Case 1.1(Record)'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/dropdown_facility'), facility, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('Make Appointment/chk_box'))
}

if (healthcare_program.toString().equalsIgnoreCase('Medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio_Medicare_programs'))
} else if (healthcare_program.toString().equalsIgnoreCase('Medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio_Medicaid_programs'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio_None_programs'))
}

WebUI.setText(findTestObject('Make Appointment/input_Visit Date (Required)'), visit_date)

WebUI.setText(findTestObject('Make Appointment/textarea_Comment'), comment)

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Make Appointment/title_Appointment Confirmation'), 0)


hasil_facility = WebUI.getText(findTestObject('Object Repository/Make Appointment/hasil_facility'))
hasil_healthcare_program = WebUI.getText(findTestObject('Object Repository/Make Appointment/hasil_healtycare_program'))
hasil_visit_date = WebUI.getText(findTestObject('Object Repository/Make Appointment/hasil_visit_date'))
hasil_commend =WebUI.getText(findTestObject('Object Repository/Make Appointment/hasil_commend'))
hasil_chkbox =WebUI.getText(findTestObject('Object Repository/Make Appointment/hasil_chkbox'))

assert hasil_facility.toString().equalsIgnoreCase(facility)
assert hasil_healthcare_program.toString().equalsIgnoreCase(healthcare_program)
assert hasil_visit_date.toString().equalsIgnoreCase(visit_date)
assert hasil_commend.toString().equalsIgnoreCase(comment)
assert hasil_chkbox.toString().equalsIgnoreCase(hospital_readmission)
