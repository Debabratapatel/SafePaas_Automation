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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.click(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba3/Sample1/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 801'))

WebUI.click(findTestObject('deba3/Sample1/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 801'))

WebUI.verifyElementText(findTestObject('deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 802'), 
    '')

WebUI.setText(findTestObject('deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 802'), 'KTLN_SODTest_Mar22_V1')

WebUI.sendKeys(findTestObject('deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 802'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_AR vs. GL Rule'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_AR vs. GL Rule'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/td_AR vs. GL Rule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_User Name'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_User Name'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), 'Akhil')

WebUI.sendKeys(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/label_Toggle'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Manage Violation/span_User Name  Akhil'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Manage Violation/span_Rule Name  AR vs. GL Rule'))

WebUI.scrollToElement(findTestObject('deba1/Page_Manage Violation/span_1 -                   15 of           _8bc35e'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Manage Violation/span_1 -                   15 of           _8bc35e'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/Page_Manage Violation/span_16 -                   30 of          _e84f20'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Manage Violation/span_16 -                   30 of          _e84f20'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/span_a-TreeView-toggle_1 - Copy'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/span_a-TreeView-toggle_1 - Copy'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_User Listing and access'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/a_User Listing and access - Copy'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 - Copy'))

WebUI.selectOptionByLabel(findTestObject('deba1/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 - Copy'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_User Listing/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_User Listing/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_User Listing/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_User Listing/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_User Listing/select_User NameFirst NameLast NameDisplay _0c373b'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_User Listing/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_User Listing/input_p_ignore_10'), 'Akhil')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_User Listing/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Page_User Listing/button_Apply'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_User Listing/a_Akhil'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_User Listing/td_Yes'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_User Listing/td_Akhil'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_User Listing/td_Akhil Mohd'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('deba/Page_Home/span_Analytics_a-TreeView-toggle - Copy'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Home/a_Manage Rules - Copy'))

WebUI.click(findTestObject('deba1/Page_Home/a_Manage Rules - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter False - Positives'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter False - Positives'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Users'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Users'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/button_Actions'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/select_ExcludedApplication NameEmailUser Na_94b5ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/select_ExcludedApplication NameEmailUser Na_94b5ab'), 
    'USER_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/input_p_ignore_10'), 
    'Akhil')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRules_FalsePositive_UserNamefilter/Page_Filter False-Positives/button_Apply'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Filter False-Positives/span_User Name  Akhil'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Rough/Page_Filter False-Positives/inputuserCheck'))

WebUI.click(findTestObject('Object Repository/deba1/Rough/Page_Filter False-Positives/inputuserCheck'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Filter False-Positives/h2_Action Processed'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Toggle'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/Page_Filter False-Positives/span_1 -                    1 of           _e353a0'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Filter False-Positives/span_1 -                    1 of           _e353a0'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

