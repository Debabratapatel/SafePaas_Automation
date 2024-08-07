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

WebUI.comment('Login to IQA with the URL - https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.comment('Enter Company as KAT')

WebUI.setText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.comment('Enter Username as KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter password')

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/button_Login'))

WebUI.comment('click on Login button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_Manage Snapshot - 328'))

WebUI.comment('Verify the DataProbe navigation dropwdown is present')

WebUI.click(findTestObject('deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_Manage Snapshot - 328'))

WebUI.comment('click on the DataProbe Navigation dropdown option')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_d4dded'))

WebUI.comment('Verify the ObjectSet element is clickable')

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_d4dded'), 
    'KTLN_OBJECT_SET', true, FailureHandling.OPTIONAL)

WebUI.comment('select the Object set : KTLN_ObjSet')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/button_Extract Data'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/button_Extract Data'))

WebUI.comment('click on Extract Data')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/select_EBiz_JDBC_DS'))

WebUI.comment('Verify the Datasource field is clickable')

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/select_EBiz_JDBC_DS'), 
    'KTLN_DEV22', true, FailureHandling.OPTIONAL)

WebUI.comment('select the value : KTLN_Dev22')

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/h1_Job'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/input_P30_SCHEDULER_JOB_NAME'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/input_P30_SCHEDULER_JOB_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/input_P30_SCHEDULER_JOB_NAME'), 
    GlobalVariable.DTP_CloudERP_SSName)

WebUI.comment('Provide a unique Scheduler name')

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/button_Create'))

WebUI.comment('click on create button')

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

