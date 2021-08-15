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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://hub.docker.com/')

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub Container Image Library  App Containerization/a_Sign In'))

WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker/Username'), 'hmada96')

WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker/Password'), 'Weezyfbaby1')

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker/Sign In_button'))

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/VerifyHomePage'))

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Create Repository'))

WebUI.sendKeys(findTestObject('Object Repository/ggg/Page_Docker Hub/input_Name_name'), 'docker_1')

WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker Hub/input_Description'), 'Test repo')

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Create_button'))

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Settings_button'))

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Page_Docker Hub/VerifySetting'))

WebUI.scrollToElement(findTestObject('Object Repository/1st spy/Page_Docker Hub/Delete_button'), 0)

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Delete_button'))

WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker Hub/imageNameField'), 'docker_1')

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Delete_button (1)'))

WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/VerifyHomePage'))

WebUI.closeBrowser()