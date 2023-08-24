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

respons = WS.sendRequest(findTestObject('Object Repository/Get All Comments By Post id', ["varCommentId" : CommentId]))
WS.verifyResponseStatusCode(respons, 200)
jmlCommentId = WS.getElementsCount(respons, "")
for (int i=0; i<jmlCommentId; i++) {
	WS.verifyElementPropertyValue(respons, "["+i+"].postId", CommentId)
	id = WS.getElementPropertyValue(respons, "["+i+"].id")
	name = WS.getElementPropertyValue(respons, "["+i+"].name")
	email = WS.getElementPropertyValue(respons, "["+i+"].email")
	body = WS.getElementPropertyValue(respons, "["+i+"].body")
	assert id != null && id!="";
	assert name != null && name!="";
	assert email != null && email!="";
	assert body != null && body!="";
}

