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
import internal.GlobalVariable

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

WebUI.openBrowser('https://octopus-portal-sit.digipay.dev/login')
WebUI.click(findTestObject('Page DigiPay Sawadikap/button_'))

// membuat/memanggil objek Web Driver
WebDriver driver = DriverFactory.getWebDriver()

// ambil objek yang jadi tempat muncul error message
field_username = driver.findElement(By.xpath('//input[@id="username"]'))
field_password = driver.findElement(By.xpath('//input[@id="password"]'))

// ambil error message
error_message_username = ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage", field_username)
error_message_password = ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage", field_password)

// verifikasi error message
assert error_message_username == "Please fill out this field."
assert error_message_password == "Please fill out this field."
WebUI.closeBrowser()