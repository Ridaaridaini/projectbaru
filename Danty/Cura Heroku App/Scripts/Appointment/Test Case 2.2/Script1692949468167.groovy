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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Manual)'), [('Username') : username, ('Password') : password], FailureHandling.STOP_ON_FAILURE)

//Pilih facility
WebUI.selectOptionByValue(findTestObject('Object Repository/Make Appointment/select dropdown'), facility, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/Check Box Readmission'))
}

if (healthcare_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/input_Medicare_programs'))
} else if (healthcare_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/input_Medicaid_programs'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/input_None_programs'))
}

WebUI.setText(findTestObject('Make Appointment/Comment'), comment)

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

//Membuat objek Web driver
WebDriver webDriver = DriverFactory.getWebDriver()

//Mengambil Objek inputan usernamenya dulu
field_visitDate = webDriver.findElement(By.xpath('//input[@id="txt_visit_date"]'))

//Mengambil Error Message
error_message = ((webDriver) as JavascriptExecutor).executeScript('return arguments[0].validationMessage', field_visitDate)

println(error_message)

//verifikasi apakah error message sesuai
assert error_message == 'Please fill out this field.'

