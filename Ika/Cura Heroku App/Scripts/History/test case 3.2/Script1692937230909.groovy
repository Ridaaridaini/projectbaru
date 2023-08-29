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

WebUI.callTestCase(findTestCase('appointment/Test Case 2.1 (versi dinamis)'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'
        , ('facility') : 'Tokyo CURA Healthcare Center', ('hospital_readmission') : 'Yes', ('healthcare_program') : 'Medicaid'
        , ('visit_date') : '23/08/2023', ('comment') : 'Hello World'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('history/a_Go to Homepage'))

WebUI.click(findTestObject('history/menu burger liat histori dan logout'))

WebUI.click(findTestObject('history/a_History'))

WebUI.verifyElementPresent(findTestObject('history/tulisan history di dalam history'), 3)

hasilFacility = WebUI.getText(findTestObject('Object Repository/history/p_Hongkong CURA Healthcare Center'))
hasilReadmission = WebUI.getText(findTestObject('Object Repository/history/p_Yes'))
hasilHealthcare = WebUI.getText(findTestObject('Object Repository/history/p_Medicaid'))
hasilBooking = WebUI.getText(findTestObject('Object Repository/history/hasil tanggal book'))
hasilComment = WebUI.getText(findTestObject('Object Repository/history/p_Hello world'))

assert hasilFacility.toString().trim().equalsIgnoreCase(facility.trim())
assert hasilReadmission.toString().trim().equalsIgnoreCase(hospital_readmission.trim())
assert hasilHealthcare.toString().trim().equalsIgnoreCase(healthcare_program.trim())
assert hasilBooking.toString().trim().equalsIgnoreCase(visit_date.trim())
assert hasilComment.toString().trim().equalsIgnoreCase(comment.trim())
