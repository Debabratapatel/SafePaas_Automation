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

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.click(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba3/Sample1/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 801'))

WebUI.click(findTestObject('deba3/Sample1/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 801'))

WebUI.verifyElementText(findTestObject('deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 802'), 
    '')

WebUI.setText(findTestObject('deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 802'), 'KTLN_SODTest_Jan21_V1')

WebUI.sendKeys(findTestObject('deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 802'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name (2)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name (2)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Approve Payables Invoice vs. Asset Config_964ad3 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Approve Payables Invoice vs. Asset Config_964ad3 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Start Entry Name (2)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Start Entry Name (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/body_Inbox                ktln_eam_user1   _471806'))

WebUI.setText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field (1)'), 
    'Asset Accounting Manager[ORA_FA_ASSET_ACCOUNTING_MANAGER_JOB]', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field (1)'), 
    Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/Page_Manage Violation/span_1 -                   14 of           _0f7191 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Manage Violation/span_1 -                   14 of           _0f7191 (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/td_Open (2)'), 0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'), '8441', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'), '8441', 
    true)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'), 
    'L', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'), 
    'L', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/input_f01'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/input_f01'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Submit (2)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Submit (2)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Submit (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), 'Test')

WebUI.scrollToElement(findTestObject('deba1/Page_Add Exception/span_1 -                   14 of           _0f7191'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Add Exception/span_1 -                   14 of           _0f7191'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Add Exception/td_Role  Fixed Asset Transaction Management_73f36a'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/h2_Action Processed (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Manage Exception (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Manage Exception (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Manage Exception (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Exception/td_Approve Payables Invoice vs. Asset Confi_1e684b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Exception/td_Role'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Exception/td_In Approval Progress'), 0)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/a_Logout'))

