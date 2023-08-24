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

//panggil API
response = WS.sendRequest(findTestObject('Object Repository/GET 100 POST API'))

//verifikasi response code
WS.verifyResponseStatusCode(response, 200) // parameter 1 : untuk responsenya, parameter 2 : expected response

//verifikasi jumlah post
WS.verifyElementsCount(response, "", 100)

//verifikasi data tidak boleh kosong atau null
//ambil jumlah post
jumlah_post = WS.getElementsCount(response, "")

for(int i = 0; i < 5; i++) {
	
	// 1. ambil value data
	userId = WS.getElementPropertyValue(response, "["+i+"].userId")
	id = WS.getElementPropertyValue(response, "["+i+"].id")
	title = WS.getElementPropertyValue(response, "["+i+"].title")
	body = WS.getElementPropertyValue(response, "["+i+"].body")
	
	// 2. verifikasi menggunakan assert
	assert userId != null && userId != "";
	assert id != null && id != "";
	assert title != null && title != "";
	assert body != null && body != "";
}
 



