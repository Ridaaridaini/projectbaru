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
import org.openqa.selenium.WebElement as WebElement

HashMap<String, String> itemProduct = WebUI.callTestCase(findTestCase('Product/TC-Product-AddCart-002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout/cart icon'))

WebUI.verifyElementPresent(findTestObject('Checkout/span_Your Cart'), 5)

List<WebElement> nameCart = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/cart item pos 1 name'), 
    5)

List<WebElement> descCart = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/cart item pos 1 desc'), 
    5)

List<WebElement> priceCart = WebUI.findWebElements(findTestObject('Object Repository/selector for verify/cart item pos 1 price'), 
    5)

List<WebElement> nameProduct = new ArrayList()

List<WebElement> descProduct = new ArrayList()

List<WebElement> priceProduct = new ArrayList()

for (int i = 0; i < nameCart.size(); i++) {
    tempNameCart = nameCart.get(i).text

    tempDescCart = descCart.get(i).text

    tempPriceCart = priceCart.get(i).text

    nameProduct.add(tempNameCart)

    descProduct.add(tempDescCart)

    priceProduct.add(tempPriceCart)
}

assert itemProduct.get('listNameProduct') == nameProduct

assert itemProduct.get('listDescProduct') == descProduct

assert itemProduct.get('listPriceProduct') == priceProduct

return itemProduct

