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

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Manual)'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/Select Drop Down Facility'), facility, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('Make Appointment/Checkbox hospital readmission'))
}

if (health_care_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio Medicare Programs'))
} else if (health_care_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio Medicaid Programs'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio None Programs'))
}

WebUI.setText(findTestObject('Make Appointment/Input Visit Date'), visit_date)

WebUI.setText(findTestObject('Make Appointment/Textarea Comment'), comment)

WebUI.click(findTestObject('Make Appointment/Button Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Make Appointment/Title Appointment Confirmation'), 0)

hasilFacility = WebUI.getText(findTestObject('Object Repository/Make Appointment/Hasil Fasility'))

hasilReadMission = WebUI.getText(findTestObject('Make Appointment/Hasil Readmission'))

hasilHealthCare = WebUI.getText(findTestObject('Make Appointment/Hasil Healthcare'))

hasilVisitDate = WebUI.getText(findTestObject('Make Appointment/Hasil Visit Date'))

hasilComment = WebUI.getText(findTestObject('Make Appointment/Hasil Comment'))

assert hasilFacility.toString().equalsIgnoreCase(facility)

assert hasilReadMission.toString().equalsIgnoreCase(hospital_readmission)

assert hasilHealthCare.toString().equalsIgnoreCase(health_care_program)

assert hasilVisitDate.toString().equalsIgnoreCase(visit_date)

assert hasilComment.toString().equalsIgnoreCase(comment)

WebUI.closeBrowser()

