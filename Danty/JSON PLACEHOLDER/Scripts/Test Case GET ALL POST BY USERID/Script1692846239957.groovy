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

//Panggil Object GET ALL POSTS BY USERID (PAKAI PERULANGAN KARENA ALL POST BERARTI LEBIH DARI SATU)
response = WS.sendRequest(findTestObject('Object Repository/GET ALL POST BY USERID', ["varUserId" : user_id]))

//Verifikasi user id sesuai
WS.verifyElementPropertyValue(response, "[0].userId", user_id)

//Verifikasi jumlah user id (karena ingin mengeluarkan data dengan user id yang diinputkan di variabel)
//misal input variabel user id = 2, maka output yg harus dikeluarkan data2 dengan user id = 2

jmlUserid = WS.getElementsCount(response, "")


//Verifikasi data tidak null dan tidak kosong
for (int i = 0; i < jmlUserid; i++) {
	
	id = WS.getElementPropertyValue(response, "["+ i +"].id")
	title = WS.getElementPropertyValue(response, "["+ i +"].title")
	body = WS.getElementPropertyValue(response, "["+ i +"].body")
	
	assert id != 0 && id != "";
	assert title != 0 && title != "";
	assert body != 0 && body != "";
	
	
}


//Verifikasi response 200
WS.verifyResponseStatusCode(response, 200)









