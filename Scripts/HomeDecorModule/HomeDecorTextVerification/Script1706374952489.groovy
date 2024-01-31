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

WebUI.navigateToUrl('https://craferia.com/home-decor/')

WebUI.doubleClick(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/h1_Home Decor - Items  Gifts'))

WebUI.click(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/h1_Home Decor - Items  Gifts'))

WebUI.verifyElementText(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/h1_Home Decor - Items  Gifts'), 
    'Home Decor - Items & Gifts')

WebUI.click(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/img_category_banner_image'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/img_category_banner_image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/h2_Milkman Cycle with Real Rotating Wheels _67fd96'), 
    0)

WebUI.click(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/p_Handicrafts related to home decor and gif_be683f'))

WebUI.verifyElementText(findTestObject('Object Repository/HomeDecorTextVerification/Page_Buy Home Decor Items of Handicrafts an_da8078/p_Handicrafts related to home decor and gif_be683f'), 
    'Handicrafts related to home decor and gifts have a unique charm that adds a personal touch and a sense of artistry to any space. Whether it\'s hand-painted pottery, intricately woven tapestries, or hand-carved wooden sculptures, these handicrafts showcase the skill and creativity of talented artisans from around the world.')

WebUI.closeBrowser()

