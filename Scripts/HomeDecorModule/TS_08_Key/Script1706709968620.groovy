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

WebUI.navigateToUrl('https://craferia.com/key-holders/')

WebUI.verifyElementText(findTestObject('Object Repository/TS_08_Key/Page_Handmade Key Holders by Craferia/h1_Key Holders'), 
    'Key Holders')

WebUI.verifyElementText(findTestObject('Object Repository/TS_08_Key/Page_Handmade Key Holders by Craferia/p_A key holder is an efficient and elegant _f0cd47'), 
    'A key holder is an efficient and elegant way to store your keys. Made with metal, this key holder will last for years to come and will make a wonderful addition to any home. The metal key holder makes a great gift idea for a friend or family member. They have 100+ designs available with showpiece decor as well. Each design represents Indian culture and the natural beauty of the country.')

WebUI.verifyElementPresent(findTestObject('Object Repository/TS_08_Key/Page_Handmade Key Holders by Craferia/img_attachment-woocommerce_thumbnail size-w_8f6098'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/TS_08_Key/Page_Handmade Key Holders by Craferia/a_Add to cart'))

WebUI.closeBrowser()

