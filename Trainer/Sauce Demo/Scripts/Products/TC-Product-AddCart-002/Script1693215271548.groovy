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

HashMap<String,Object> data = WebUI.callTestCase(findTestCase('Products/TC-Product-AddCart-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product Button ATC Product 2'))

WebUI.verifyElementText(findTestObject('Product Button Remove Product 2'), 'Remove')

WebUI.verifyElementText(findTestObject('Product Label Icon Cart'), '2')

name = WebUI.getText(findTestObject('Product Text Name Product 2'))

desc = WebUI.getText(findTestObject('Product Text Desc Product 2'))

price = WebUI.getText(findTestObject('Product Text Price Product 2'))

//Deklarasi List/Array Kosong dengan nama variabel nameProductList
List<String> nameProductList = new ArrayList();
nameProductList.add(data.get("product_name"))
nameProductList.add(name)

//Ambil indeks ke 0
println nameProductList.get(0);

List<String> descProductList = new ArrayList();
descProductList.add(data.get("product_desc"))
descProductList.add(desc)

List<String> priceProductList = new ArrayList();
priceProductList.add(data.get("product_price"))
priceProductList.add(price)

data.put("product_name_list", nameProductList)
data.put("product_desc_list", descProductList)
data.put("product_price_list", priceProductList)

return data
