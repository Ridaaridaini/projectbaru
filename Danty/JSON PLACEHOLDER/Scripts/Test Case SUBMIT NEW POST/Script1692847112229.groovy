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


//Panggil object SUBMIT NEW POST
response = WS.sendRequest(findTestObject('Object Repository/SUBMIT NEW POST API', ["var_id" : id, 
	"varTitle" : title, "varBody" : body]))

//Verifikasi id,title, body sesuai
WS.verifyElementPropertyValue(response, "id", id)
WS.verifyElementPropertyValue(response, "title", title)
WS.verifyElementPropertyValue(response, "body", body)

//Mengambil value variabel
id_new = WS.getElementPropertyValue(response, "id")
title_new = WS.getElementPropertyValue(response, "title")
body_new = WS.getElementPropertyValue(response, "body")

assert id_new == id;
assert title_new.toString().equalsIgnoreCase(title);
assert body_new.toString().equalsIgnoreCase(body);

//Verifikasi response 200
WS.verifyResponseStatusCode(response, 201)
























