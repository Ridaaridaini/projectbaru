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

//1. open browser
WebUI.openBrowser(' https://katalon-demo-cura.herokuapp.com/')

//2. Verifikasi Title Home Page
WebUI.verifyElementPresent(findTestObject('Object Repository/Login Manual/title_homepage'), 10)

//3. Click Burger
WebUI.click(findTestObject('Object Repository/Login Manual/burger_button'))

//4.klik menu home
WebUI.click(findTestObject('Object Repository/Login Manual/burger_button_login'))

//5. verifikasi title login page
WebUI.verifyElementPresent(findTestObject('Object Repository/Login Manual/Title_Login'), 0)

//6. input username
WebUI.setText(findTestObject('Object Repository/Login Manual/input_Username'), 'John Doe')

//7.input password
WebUI.setEncryptedText(findTestObject('Object Repository/Login Manual/input_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

//8.klik button ligin
WebUI.click(findTestObject('Object Repository/Login Manual/button_Login (1)'))

//verifikasi user berhasil login
WebUI.verifyElementPresent(findTestObject('Object Repository/Login Manual/title_Make Appointment'), 0)

