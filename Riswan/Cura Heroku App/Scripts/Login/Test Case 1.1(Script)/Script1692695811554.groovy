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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//1. Open Browser
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/");

//2. Verifikasi Title Home Page
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Title_Home_Page'), 10)

//3. Click Burger
WebUI.click(findTestObject('Object Repository/Login/Menu Burger'));

//4. Click Menu Home
WebUI.click(findTestObject('Object Repository/Login/Menu Login'));

//5. Verifikasi Title Login Page
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Title_Home_Page'), 10)

//6. Input Username
WebUI.setText(findTestObject('Object Repository/Login/input_Username_Login'),"John Doe")

//7. Input Password
WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_Login'), "g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM")

//8. click tombol login
WebUI.click(findTestObject('Object Repository/Login/button_Login'))

//9. verifikasi Title make appoitment
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Title_Make Appointment'), 10);