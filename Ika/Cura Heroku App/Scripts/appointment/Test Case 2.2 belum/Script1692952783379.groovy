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

WebUI.selectOptionByValue(findTestObject('make_appointment/dropdown facility'), 'Hongkong CURA Healthcare Center', false)

WebUI.check(findTestObject('make_appointment/chekbox hospital readmission'))

if (hospital_readmission.toString().equalsIgnoreCase('Yes')) {
    WebUI.check(findTestObject('Object Repository/make_appointment/chekbox hospital readmission'))
}

if (healthcare_program.toString().equalsIgnoreCase('MedicaId')) {
    WebUI.check(findTestObject('Object Repository/make_appointment/input_Medicaid_programs'))
} else if (healthcare_program.toString().equalsIgnoreCase('Medicare')) {
    WebUI.check(findTestObject('Object Repository/make_appointment/input_Medicare_programs'))
} else if (healthcare_program.toString().equalsIgnoreCase('none')) {
    WebUI.check(findTestObject('Object Repository/make_appointment/input_None_programs'))
}

WebUI.setText(findTestObject('make_appointment/comment'), '')

WebUI.click(findTestObject('make_appointment/button_Book Appointment'))

