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

//1. Open Browser
WebUI.openBrowser(" https://katalon-demo-cura.herokuapp.com/");

//2. Verivikasi Title home page
WebUI.verifyElementPresent(findTestObject('Object Repository/login/title_home_page'), 10);

//3. click burger
WebUI.click(findTestObject('Object Repository/login/menu burger'));

//4. click menu home
WebUI.click(findTestObject('Object Repository/login/menu Login'));

//5. verifikasi title login
WebUI.verifyElementPresent(findTestObject('Object Repository/login/title_Login'), 10);

//6. input username
WebUI.setText(findTestObject('Object Repository/login/input_Username'), "John Doe");

//7. input password
WebUI.setEncryptedText(findTestObject('Object Repository/login/input_Password'), "g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM");

//8. klik login
WebUI.click(findTestObject('Object Repository/login/button_Login'));

//9. verifikasi title make appoitment
WebUI.verifyElementPresent(findTestObject('Object Repository/login/Title_Make Appointment'), 10);