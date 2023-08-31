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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

HashMap<String,Object> data = WebUI.callTestCase(findTestCase('Products/TC-Product-AddCart-002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product Icon Cart'))

List<WebElement> sourceProductTitleList = WebUI.findWebElements(findTestObject('Object Repository/Cart Product Title List'),10)
List<WebElement> sourceProductDescList = WebUI.findWebElements(findTestObject('Object Repository/Cart Product Desc List'),10)
List<WebElement> sourceProductPriceList = WebUI.findWebElements(findTestObject('Object Repository/Cart Product Price List'),10)

List<String> oriProductTitleList = new ArrayList();
List<String> oriProductDescList = new ArrayList();
List<String> oriProductPriceList = new ArrayList();

for(int i = 0; i < sourceProductTitleList.size(); i++) {
	productTitleText = sourceProductTitleList.get(i).text.trim()
	productDescText = sourceProductDescList.get(i).text.trim()
	productPriceText = sourceProductPriceList.get(i).text.replace('Remove','').trim()
	
	oriProductTitleList.add(productTitleText)
	oriProductDescList.add(productDescText)
	oriProductPriceList.add(productPriceText)
}

assert data.get("product_name_list") == oriProductTitleList
assert data.get("product_desc_list") == oriProductDescList
assert data.get("product_price_list") == oriProductPriceList

return data