import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://praetemptatus.agilehealthinsurance.com/')

WebUI.click(findTestObject('Object Repository/Page_Find Health Insurance for 2018/a_Quote  Save Today'))

WebUI.setText(findTestObject('Object Repository/Page_2018 Health Insurance Get a Sh/input_zip-input'), '35215')

WebUI.setText(findTestObject('Object Repository/Page_2018 Health Insurance Get a Sh/input_dob-0'), '12/21/1969')

WebUI.click(findTestObject('Object Repository/Page_2018 Health Insurance Get a Sh/label_Male'))

WebUI.click(findTestObject('Object Repository/Page_2018 Health Insurance Get a Sh/label_Compare Plans'))

WebUI.click(findTestObject('Object Repository/Page_Short Term Health Insurance Qu/label_quote-filter-faux-input'))

WebUI.click(findTestObject('Object Repository/Page_Short Term Health Insurance Qu/a_LifeShield Flex 500020900075'))

WebUI.click(findTestObject('Object Repository/Page_LifeShield Flex 50002090007500/a_Apply for This Plan'))

WebUI.click(findTestObject('Object Repository/Page_LifeShield Flex 50002090007500/span_Start Secure Application'))

WebUI.click(findTestObject('Object Repository/Page_App Page 1 - LifeShield Flex 5/a_Autofill App Info'))

WebUI.click(findTestObject('Object Repository/Page_App Page 1 - LifeShield Flex 5/a_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_App Page 2 - LifeShield Flex 5/input_email'), 'test.arGztUhR@suryani.cn')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App Page 2 - LifeShield Flex 5/select_01020304050607'), 
    '06', true)

WebUI.click(findTestObject('Object Repository/Page_App Page 2 - LifeShield Flex 5/a_Continue to Step 3 - Payment'))

WebUI.click(findTestObject('Object Repository/Page_App Page 3 - LifeShield Flex 5/label_My billing address is th'))

WebUI.click(findTestObject('Object Repository/Page_App Page 3 - LifeShield Flex 5/button_Credit Card'))

WebUI.click(findTestObject('Object Repository/Page_App Page 3 - LifeShield Flex 5/label_I Accept Authorization f'))

WebUI.click(findTestObject('Object Repository/Page_App Page 3 - LifeShield Flex 5/label_My billing address is th'))

WebUI.click(findTestObject('Object Repository/Page_App Page 3 - LifeShield Flex 5/a_Continue to Step 4 - Review'))

WebUI.click(findTestObject('Object Repository/Page_App Page 3 - LifeShield Flex 5/a_Add'))

WebUI.click(findTestObject('Object Repository/Page_App Page 4 - LifeShield Flex 5/label'))

WebUI.click(findTestObject('Object Repository/Page_App Page 4 - LifeShield Flex 5/p_'))

WebUI.click(findTestObject('Object Repository/Page_App Page 4 - LifeShield Flex 5/a_Submit Your Application'))

