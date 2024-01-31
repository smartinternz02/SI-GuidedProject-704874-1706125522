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

WebUI.navigateToUrl('https://craferia.com/showpieces-figurines/')

WebUI.doubleClick(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/h1_Showpieces  Figurines'))

WebUI.click(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/h1_Showpieces  Figurines'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/h1_Showpieces  Figurines'), 
    'Showpieces & Figurines')

WebUI.doubleClick(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/div_We offer an extensive selection of hand_2ca61d'))

WebUI.click(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/div_We offer an extensive selection of hand_2ca61d'))

WebUI.click(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/div_We offer an extensive selection of hand_2ca61d'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/div_We offer an extensive selection of hand_2ca61d'), 
    'We offer an extensive selection of handicraft items for tables, shelves, and decor, such as table-top showpieces and figurines made of wrought iron and wood. These high-quality, colorfully designed products will add a touch of royalty to any space. They are handcrafted by skilled artisans and make perfect gifts or home decor items')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/img_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Showpieces  Figurines  Craferia/div_dswbm-sliders-28216 .slider-section-tit_b60c98'), 
    0)

WebUI.closeBrowser()

