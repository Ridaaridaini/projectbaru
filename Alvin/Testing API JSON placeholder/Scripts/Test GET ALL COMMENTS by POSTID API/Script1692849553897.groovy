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

response = WS.sendRequest(findTestObject('Object Repository/GET ALL COMMENTS by POSTID API', ["varPostId" : postId]))

// verify response code
WS.verifyResponseStatusCode(response, 200)

jumlah_comments = WS.getElementsCount(response, "")

for(int i = 0; i < jumlah_comments; i++) {
	
	// verify id is same
	WS.verifyElementPropertyValue(response, "["+i+"].postId", postId)
	
	// get value of property
	isiId = WS.getElementPropertyValue(response, "["+i+"].id")
	isiName = WS.getElementPropertyValue(response, "["+i+"].name")
	isiEmail = WS.getElementPropertyValue(response, "["+i+"].email")
	isiBody = WS.getElementPropertyValue(response, "["+i+"].body")
	
	
	// verify value is not null
	assert isiId != null && isiId != "";
	assert isiName != null && isiName != "";
	assert isiEmail != null && isiEmail != "";
	assert isiBody != null && isiBody != "";
	
}