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

WebUI.selectOptionByValue(findTestObject('Make Appointment/Select Drop Down Facility'), facility, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('Make Appointment/Checkbox Hospital Readmission'))
}

if (health_care_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio Medicare Programs' //none
            ))
} else if (health_care_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio Medicaid Programs'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Radio None Programs'))
}

WebUI.setText(findTestObject('Make Appointment/Input Visit Date'), visit_date)

WebUI.setText(findTestObject('Make Appointment/Text Area Comment'), comment)

WebUI.click(findTestObject('Make Appointment/Button Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Make Appointment/Title Appointment Confirmation'), 0)

hasilFacility = WebUI.getText(findTestObject('Object Repository/Make Appointment/Hasil Facility'))

hasilReadmission = WebUI.getText(findTestObject('Make Appointment/Hasil Hospital Readmission'))

hasilHealthCare = WebUI.getText(findTestObject('Make Appointment/Hasil Healthcare Program'))

hasilVisitDate = WebUI.getText(findTestObject('Make Appointment/Hasil Visit Date'))

hasilComment = WebUI.getText(findTestObject('Make Appointment/Hasil Comment'))

assert hasilFacility.trim().equalsIgnoreCase(facility.trim())

assert hasilReadmission.trim().equalsIgnoreCase(hospital_readmission.trim())

assert hasilHealthCare.trim().toLowerCase().equalsIgnoreCase(health_care_program.trim().toLowerCase())

assert hasilVisitDate.trim().equalsIgnoreCase(visit_date.trim())

assert hasilComment.trim().equalsIgnoreCase(comment.trim())

