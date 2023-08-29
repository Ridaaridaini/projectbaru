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

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Manual)'), [('Username') : username, ('Password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/select dropdown'), facility, false)

if (healthcare_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/input_Medicare_programs'))
} else if (healthcare_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/input_Medicaid_programs'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/input_None_programs'))
}

WebUI.setText(findTestObject('Make Appointment/input_Visit Date'), visit_date)

WebUI.setText(findTestObject('Make Appointment/Comment'), comment)

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Make Appointment/Appointment Confirmation'), 10)

hasilFacility = WebUI.getText(findTestObject('Object Repository/Make Appointment/Facility'))

hasilHealthPro = WebUI.getText(findTestObject('Make Appointment/Program Healthcare'))

hasilVisitDate = WebUI.getText(findTestObject('Make Appointment/Visit_Date'))

hasilComment = WebUI.getText(findTestObject('Make Appointment/isi comment'))

assert hasilFacility.trim().equalsIgnoreCase(facility.trim())

assert hasilHealthPro.trim().equalsIgnoreCase(healthcare_program.trim())

assert hasilVisitDate.trim().equalsIgnoreCase(visit_date.trim())

assert hasilComment.trim().equalsIgnoreCase(comment.trim())

