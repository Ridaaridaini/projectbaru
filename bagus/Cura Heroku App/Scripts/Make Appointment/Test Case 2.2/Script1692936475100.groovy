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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Cara Manual)'), [('Username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/dropdown_menu'), dropdown_menu, false)

if (hospital_readmission.toString().equalsIgnoreCase('yes')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/checkbox_apply_for_hospital_readmission'))
}

if (healthcare_program.toString().equalsIgnoreCase('medicare')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/radio_button_input_Medicare'))
} else if (healthcare_program.toString().equalsIgnoreCase('medicaid')) {
    WebUI.check(findTestObject('Object Repository/Make Appointment/radio_button_input_Medicaid'))
} else {
    WebUI.check(findTestObject('Object Repository/Make Appointment/radio_button_input_None'))
}

WebUI.setText(findTestObject('Make Appointment/input_Visit Date (Required)_visit_date'), '')

WebUI.setText(findTestObject('Make Appointment/textarea_Comment_comment'), comment)

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

WebDriver driver = DriverFactory.getWebDriver()

//Ambil Xpath field nanti muncul error messagenya (coba xpath biasa atau fill full xpath)
field_username_element = driver.findElement(By.xpath('//input[@id="txt_visit_date"]'))

//Ambil Error Messagenya menggunakan perintah javascript
accept_button_message = ((driver) as JavascriptExecutor).executeScript('return arguments[0].validationMessage', field_username_element)

println(accept_button_message)

//Verifikasi apakah error message sesuai / ada
WebUI.verifyMatch(accept_button_message, 'Please fill out this field.', false)

WebUI.closeBrowser()

