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

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_Fall 2022_P101_COMPANY'))

WebUI.setText(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_Fall 2022_P101_COMPANY'), 'KAT')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setText(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_New_P101_PASSWORD'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_New_P101_PASSWORD'), 
    'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/a_Inbox'))

WebUI.getWindowTitle()

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/button_katalon_admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/a_My Profile'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/a_Logout'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/button_Help'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/button_Help'))

WebUI.verifyElementText(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/span_Support'), 'Support')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/a_Documentation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/select_OpenCanceledClosed'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/select_OpenCanceledClosed'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/select_OpenCanceledClosed'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/select_OpenCanceledClosed'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Home/select_OpenCanceledClosed'))

WebUI.delay(3)

