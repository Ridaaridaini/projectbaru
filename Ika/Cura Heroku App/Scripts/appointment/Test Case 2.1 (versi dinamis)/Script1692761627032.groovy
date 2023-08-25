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

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Manual)'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('make_appointment/dropdown facility'), facility, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('make_appointment/chekbox hospital readmission'))
}

if (healthcare_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('make_appointment/input_Medicare_programs'))
} else if (healthcare_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('make_appointment/input_Medicaid_programs'))
} else {
    WebUI.check(findTestObject('make_appointment/input_None_programs'))
}

WebUI.setText(findTestObject('make_appointment/tanggal booking'), visit_date)

WebUI.setText(findTestObject('make_appointment/comment'), comment)

WebUI.click(findTestObject('make_appointment/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('make_appointment/title_Appointment Confirmation'), 0)

hasilFacility = WebUI.getText(findTestObject('Object Repository/make_appointment/hasil dropdown facility'))

hasilReadmission = WebUI.getText(findTestObject('make_appointment/hasil hospital readmission'))

hasilProgram = WebUI.getText(findTestObject('make_appointment/hasil healthcare program'))

hasilVisit = WebUI.getText(findTestObject('make_appointment/hasil tanggal dipilih'))

hasilComment = WebUI.getText(findTestObject('make_appointment/hasil comment'))

assert hasilFacility.toString().equalsIgnoreCase(facility)
assert hasilReadmission.toString().equalsIgnoreCase(hospital_readmission)
assert hasilProgram.toString().equalsIgnoreCase(healthcare_program)
assert hasilVisit.toString().equalsIgnoreCase(visit_date)
assert hasilComment.toString().equalsIgnoreCase(comment)


