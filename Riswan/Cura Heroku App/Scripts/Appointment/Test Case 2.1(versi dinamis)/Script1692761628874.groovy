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

WebUI.callTestCase(findTestCase('Login/Test Case 1.1(Manual)'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/Select Drop down Facility'), facility, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('Make Appointment/Checkbox_Apply for hospital readmission'))
}

if (health_care_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio_Medicare_programs'))
} else if (health_care_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio_Medicaid_programs'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio_None_programs'))
}

WebUI.setText(findTestObject('Make Appointment/input_Visit Date'), visit_date)

WebUI.setText(findTestObject('Make Appointment/textarea_Comment'), comment)

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Make Appointment/Title_Appointment Confirmation'), 0)

hasilFacility = WebUI.getText(findTestObject('Make Appointment/Hasil Facility'))

hasilReadmission = WebUI.getText(findTestObject('Make Appointment/Hasil Hospital Readmission'))

hasilHealthCare = WebUI.getText(findTestObject('Make Appointment/hasil healthcare program'))

hasilVisitDate = WebUI.getText(findTestObject('Make Appointment/Hasil visit date'))

hasilComment = WebUI.getText(findTestObject('Make Appointment/hasil comment'))

assert hasilFacility.trim().equalsIgnoreCase(facility.trim())
assert hasilReadmission.trim().equalsIgnoreCase(hospital_readmission.trim())
assert hasilHealthCare.trim().equalsIgnoreCase(health_care_program.trim())
assert hasilVisitDate.trim().equalsIgnoreCase(visit_date.trim())
assert hasilComment.trim().equalsIgnoreCase(comment.trim())


