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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://lms-undergrad.fpt.edu.vn/login/index.php')

WebUI.click(findTestObject('Object Repository/Page_LMS FPT University Log in to the site/div_Log in with mailfpt.edu.vn'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_fpt.edu.vn_identifier'), 'phuchgtse141133@fpt.edu.vn')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/div_Tip theo_VfPpkd-RLmnJb'))

WebUI.waitForElementVisible(findTestObject('Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), 30)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), 
    '8oS+ye/vE0ImnUSHihCDQQ==')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/div_Tip theo_VfPpkd-RLmnJb_1'))

WebUI.waitForElementVisible(findTestObject('Page_Dashboard/a_Show all courses'), 30)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Show all courses'))

WebUI.waitForElementVisible(findTestObject('Page_Dashboard/a_Software Quality Assurance and Testing - PhngLHK'), 30)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Software Quality Assurance and Testing - PhngLHK'))

WebUI.click(findTestObject('Object Repository/Page_Course Software Quality Assurance and _5fab52/span_Automation Test Quiz'))

WebUI.waitForElementVisible(findTestObject('Page_SWQ391 - PhngLHK Automation Test Quiz/input_Highest grade 10.00  10.00._yui_3_17__2de2a9'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_SWQ391 - PhngLHK Automation Test Quiz/input_Highest grade 10.00  10.00._yui_3_17__2de2a9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SWQ391 - PhngLHK Automation Test Quiz/input_Quiz password_quizpassword'), 
    'x8YlipdcAoW5zVw7zA6v7A==')

WebUI.waitForElementVisible(findTestObject('Page_SWQ391 - PhngLHK Automation Test Quiz/input_Timed quiz_submitbutton'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_SWQ391 - PhngLHK Automation Test Quiz/input_Timed quiz_submitbutton'))

WebUI.waitForElementVisible(findTestObject('Page_Automation Test Quiz/label_d. Option 1'), 30)

WebUI.click(findTestObject('Object Repository/Page_Automation Test Quiz/label_d. Option 1'))

WebUI.waitForElementVisible(findTestObject('Page_Automation Test Quiz/div_d. Option 1'), 30)

WebUI.click(findTestObject('Object Repository/Page_Automation Test Quiz/div_d. Option 1'))

WebUI.click(findTestObject('Object Repository/Page_Automation Test Quiz/span_Option 1'))

WebUI.waitForElementVisible(findTestObject('Page_Automation Test Quiz/label_c. Option 1'), 30)

WebUI.click(findTestObject('Page_Automation Test Quiz/label_c. Option 1'))


WebUI.waitForElementVisible(findTestObject('Page_Automation Test Quiz/span_Option 1_1'), 30)

WebUI.click(findTestObject('Page_Automation Test Quiz/span_Option 1_1'))

WebUI.waitForElementVisible(findTestObject('Page_Automation Test Quiz/input_Option 2_next'), 30)

WebUI.click(findTestObject('Object Repository/Page_Automation Test Quiz/input_Option 2_next'))

WebUI.click(findTestObject('Object Repository/Page_Automation Test Quiz/input_This attempt must be submitted by Sun_1f08ce'))

WebUI.click(findTestObject('Object Repository/Page_Automation Test Quiz/input_Once you submit, you will no longer b_bd6f16'))

WebUI.closeBrowser()

