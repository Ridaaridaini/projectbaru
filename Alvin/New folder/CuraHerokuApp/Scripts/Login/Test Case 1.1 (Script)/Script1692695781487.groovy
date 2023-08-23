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

//open browser
WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

//verifikasi masuk halaman home
WebUI.verifyElementPresent(findTestObject('Object Repository/Objek untuk login/title_homepage'), 10)

//tekan tombol hamburger
WebUI.click(findTestObject('Object Repository/Objek untuk login/menu_burger'))

//tekan menu login sidebar
WebUI.click(findTestObject('Object Repository/Objek untuk login/menu_login'))

//verifikasi masuk halaman login
WebUI.verifyElementPresent(findTestObject('Object Repository/Objek untuk login/verifikasi_masuk_halaman_login'), 10)

//memasukan username
WebUI.setText(findTestObject('Object Repository/Objek untuk login/input_form_username'), username)

//memasukan password
WebUI.setEncryptedText(findTestObject('Object Repository/Objek untuk login/input_form_password'), password)

//tekan tombol login
WebUI.click(findTestObject('Object Repository/Objek untuk login/button_form_Login'))

//verifikasi user berhasil login dan masuk halaman appointment
WebUI.verifyElementPresent(findTestObject('Object Repository/Objek untuk login/title_make _appointment'), 10)

