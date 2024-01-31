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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://craferia.com/lamps-lightings/')

WebUI.verifyElementText(findTestObject('Object Repository/TS_06_Lamps/Page_Lamps  Lightings - Craferia/h1_Lamps  Lightings'), 
    'Lamps & Lightings')

WebUI.verifyElementText(findTestObject('Object Repository/TS_06_Lamps/Page_Lamps  Lightings - Craferia/p_Beautiful designer tealight candle holder_0c3278'), 
    'Beautiful designer tealight candle holder is a perfect gift for your loved ones. The metal handcrafted product is made of pure copper that is sturdy and luxurious at the same time. The design is eye-catching and will add a special touch to your living room.')

WebUI.verifyElementPresent(findTestObject('Object Repository/TS_06_Lamps/Page_Lamps  Lightings - Craferia/img_attachment-woocommerce_thumbnail size-w_8f6098'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/TS_06_Lamps/Page_Lamps  Lightings - Craferia/a_Add to cart'))

WebUI.closeBrowser()

