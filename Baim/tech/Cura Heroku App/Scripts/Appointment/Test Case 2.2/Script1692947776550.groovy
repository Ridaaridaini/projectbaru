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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Manual)'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()


WebUI.selectOptionByValue(findTestObject('Make Appointment/Select Drop Down Facility'), 'Seoul CURA Healthcare Center', 
    false)

WebUI.check(findTestObject('Make Appointment/Checkbox hospital readmission'))

WebUI.check(findTestObject('Make Appointment/Radio Medicaid Programs'))

// Mendapatkan elemen input menggunakan XPath
WebElement field_username_element = driver.findElement(By.xpath("/html/body/section/div/div/form/div[4]/div/div/input"))

// Menjalankan skrip JavaScript untuk mendapatkan pesan validasi
String accept_button_message = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage", field_username_element)

WebUI.setText(findTestObject('Make Appointment/Textarea Comment'), 'ini komen')

WebUI.click(findTestObject('Make Appointment/Button Book Appointment'))

assert accept_button_message.equalsIgnoreCase("Please fill out this field.")

WebUI.closeBrowser()

