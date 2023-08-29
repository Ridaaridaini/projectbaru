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

WebUI.callTestCase(findTestCase('Appointment/Test Case 2.1 (Versi Dinamis)'), [('username') : 'John Doe\r\n', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'
        , ('facility') : 'Tokyo CURA Healthcare Center', ('hospital_readmission') : 'yes', ('health_care_program') : 'medicaid'
        , ('visit_date') : '23/08/2023', ('comment') : 'Saya pesan'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/hamburger'))

WebUI.click(findTestObject('History/history'))

WebUI.verifyElementPresent(findTestObject('History/text_history'), 0)

getFasilityHistory = WebUI.getText(findTestObject('Object Repository/History/hasil_facility'))

getFasilityAppointment = WebUI.getText(findTestObject('Object Repository/Make Appointment/Hasil Fasility'))

getReadmissionHistory = WebUI.getText(findTestObject('History/hasil_readmission'))

getReadmissionAppointment = WebUI.getText(findTestObject('Make Appointment/Hasil Readmission'))

getVisitDateHistory = WebUI.getText(findTestObject('Make Appointment/Hasil Visit Date'))

getVisitDateAppointment = WebUI.getText(findTestObject('History/hasil_visitDate'))

getHealthCareHistory = WebUI.getText(findTestObject('History/hasil_healthcare'))

getHealthCareAppointment = WebUI.getText(findTestObject('Make Appointment/Hasil Healthcare'))

getCommentHistory = WebUI.getText(findTestObject('Make Appointment/Hasil Comment'))

getCommentAppointment = WebUI.getText(findTestObject('History/hasil_comment'))

assert getFasilityHistory.toString().equalsIgnoreCase(getFasilityAppointment.toString())

