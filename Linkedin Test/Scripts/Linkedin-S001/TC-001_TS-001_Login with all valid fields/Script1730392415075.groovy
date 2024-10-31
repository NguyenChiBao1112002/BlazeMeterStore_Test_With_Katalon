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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys


'Login with valid email and valid password'
WebUI.click(findTestObject('Object Repository/Pages/Home Page Not Logged In/sign_in_with_email_button'))

WebUI.setText(findTestObject('Object Repository/Pages/Login Page/username'), 'baob2012178@student.ctu.edu.vn')

WebUI.setEncryptedText(findTestObject('Object Repository/Pages/Login Page/password'), 'fqtYo3MQ70nJDCgIF1alyA==')

WebUI.click(findTestObject('Object Repository/Pages/Login Page/signin_button'))

WebUI.delay(3)

'Verify login successfully'
WebUI.verifyElementPresent( findTestObject('Object Repository/Pages/Home Page/Start A Post Avatar'), 10)
WebUI.delay(3)
//username.equals("Bao Nguyen")? KeywordUtil.logInfo("Login Successfully!"): KeywordUtil.markFailedAndStop("Login failed!")





