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

WebUI.callTestCase(findTestCase('M08 - Employees - List and Add Employees/M08 - Employees - List and Add Employees - 003'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add Employee/input_first_name'), 'Aan')

first_name = WebUI.getAttribute(findTestObject('Add Employee/input_first_name'), 'value')

WebUI.setText(findTestObject('Add Employee/input_last_name'), 'Aridini')

last_name = WebUI.getAttribute(findTestObject('Add Employee/input_last_name'), 'value')

full_name = ((first_name + ' ') + last_name)

println(full_name)

WebUI.setText(findTestObject('Spy Add Employee/input_Employee Code_eid'), '01')

code = WebUI.getAttribute(findTestObject('Spy Add Employee/input_Employee Code_eid'), 'value')

WebUI.selectOptionByValue(findTestObject('Spy Add Employee/select_department'), '3', false)

WebUI.selectOptionByValue(findTestObject('Spy Add Employee/select_designation'), '5', false)

WebUI.selectOptionByValue(findTestObject('Spy Add Employee/select_role'), 'EMPLOYEE', false)

role = WebUI.getAttribute(findTestObject('new/select_role'), 'value')

println(role)

WebUI.selectOptionByValue(findTestObject('Spy Add Employee/select_gender'), 'MALE', false)

WebUI.selectOptionByValue(findTestObject('Spy Add Employee/select_blood'), 'O+', false)

WebUI.setText(findTestObject('new/input_NID_nid'), '0987654321')

WebUI.setText(findTestObject('new/input_Contact Number_contact'), '089878987656')

contact = WebUI.getAttribute(findTestObject('new/input_Contact Number_contact'), 'value')

WebUI.setText(findTestObject('new/input_Date Of Birth_dob'), '10/10/2000')

WebUI.setText(findTestObject('new/input_Date Of Joining_joindate'), '20/12/2020')

WebUI.setText(findTestObject('new/input_Date Of Leaving_leavedate'), '10/12/2020')

WebUI.setText(findTestObject('new/input_Username_username'), 'vinniv')

WebUI.setText(findTestObject('new/input_Email_email'), 'aaananaan@email.com')

email = WebUI.getAttribute(findTestObject('new/input_Email_email'), 'value')

WebUI.uploadFile(findTestObject('new/input_Image_image_url'), 'C:\\Users\\ASUS\\Downloads\\images.jpg')

WebUI.click(findTestObject('Add Employee/button_save'))

WebUI.delay(7)

WebUI.click(findTestObject('Add Employee/button_Employee List'))

WebUI.delay(5)

WebUI.click(findTestObject('Add Employee/th_Employee Name'))

table_name = WebUI.getText(findTestObject('Master/table_employee_name'))

table_pin = WebUI.getText(findTestObject('Master/table_pin'))

table_email = WebUI.getText(findTestObject('Master/table_email'))

table_contact = WebUI.getText(findTestObject('Master/table_contact'))

table_user = WebUI.getText(findTestObject('Master/table_user_type'))

WebUI.verifyMatch(table_name, full_name, false)

WebUI.verifyMatch(table_pin, code, false)

WebUI.verifyMatch(table_email, email, false)

WebUI.verifyMatch(table_contact, contact, false)

WebUI.verifyMatch(table_user, role, false)

