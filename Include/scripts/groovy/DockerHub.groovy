import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class DockerHub {

	@Given("Open Browser")
	def OpenBrowser() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
	}

	@And("Navigate to URL")
	def navigateToURL() {
		WebUI.navigateToUrl('https://hub.docker.com/')
	}


	@Then("Click on sign-in button")
	def navigateToSignInPage() {
		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub Container Image Library  App Containerization/a_Sign In'))
	}


	@And("Sign-in with your credintials")
	def singIn() {
		WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker/Username'), 'hmada96')

		WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker/Password'), 'Weezyfbaby1')

		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker/Sign In_button'))
	}

	@When("Verify the homePage")
	def verifyHomePage() {
		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/VerifyHomePage'))
	}


	@Then("Create new repo")
	def createNewRepo() {
		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Create Repository'))
	}
	@And ("Fill repo info")
	def fillRepoInfo() {
		WebUI.sendKeys(findTestObject('Object Repository/ggg/Page_Docker Hub/input_Name_name'), 'docker')

		WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker Hub/input_Description'), 'Test repo')
	}
	@Then ("Create repo button")
	def createRepo() {
		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Create_button'))
	}

	@And ("Navigate to settings")
	def navigateToSettings() {
		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Settings_button'))
	}
	@When("Verify the setting page")
	def verifySettingPage() {
		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Page_Docker Hub/VerifySetting'))
	}
	@Then("Delete the repo")
	def deleteTheRepo() {
		WebUI.scrollToElement(findTestObject('Object Repository/1st spy/Page_Docker Hub/Delete_button'), 0)

		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Delete_button'))

		WebUI.sendKeys(findTestObject('Object Repository/1st spy/Page_Docker Hub/imageNameField'), 'docker')

		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/Delete_button (1)'))
	}
	@Then("Verify home page")
	def verifyHome(){
		WebUI.click(findTestObject('Object Repository/1st spy/Page_Docker Hub/VerifyHomePage'))
	}
	@Then("Close browser")
	def closeBrowser() {
		WebUI.closeBrowser()
	}
}







