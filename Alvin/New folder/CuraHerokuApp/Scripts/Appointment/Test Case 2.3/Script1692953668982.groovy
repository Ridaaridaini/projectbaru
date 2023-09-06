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

WebUI.callTestCase(findTestCase('Login/Test Case 1.1 (Script)'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/select_facility'), 'Hongkong CURA Healthcare Center', false)

WebUI.check(findTestObject('Make Appointment/apply_hospital_readmission'))

WebUI.check(findTestObject('Make Appointment/option_medicaid'))

WebUI.setText(findTestObject('Make Appointment/visit_date_appointment'), '20/05/2023')

WebUI.setText(findTestObject('Make Appointment/comment_appointment'), 'Dalam era digital saat ini, teknologi telah mengubah cara kita hidup dan berinteraksi. Internet telah memungkinkan akses cepat ke informasi dari seluruh dunia, menghubungkan orang-orang melalui platform media sosial, dan membuka pintu bagi inovasi di berbagai bidang. Namun, dengan semua manfaatnya, teknologi juga membawa tantangan baru. Privasi online menjadi isu yang semakin penting, sementara dampak teknologi terhadap pekerjaan dan ekonomi menghasilkan diskusi tentang otomatisasi dan penggantian pekerja manusia oleh mesin. Kita perlu menjaga keseimbangan antara pemanfaatan teknologi untuk kemajuan dan mengatasi risiko serta perubahan yang muncul.')

WebUI.click(findTestObject('Make Appointment/button_book_appointment'))

WebUI.verifyTextPresent('comment to long', false)

WebUI.closeBrowser()

