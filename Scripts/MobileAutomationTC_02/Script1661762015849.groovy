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

Mobile.startApplication('C:\\Users\\TX\\Downloads\\eribank.apk', true)

Mobile.setText(findTestObject('Object Repository/SaveScript/android.widget.EditText - Username (1)'), Username, 0)

Mobile.setText(findTestObject('Object Repository/SaveScript/android.widget.EditText - Password (1)'), Password, 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.Button - Login (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.Button - Mortgage Request'), 0)

Mobile.setText(findTestObject('Object Repository/SaveScript/android.widget.EditText - First Name'), 'Mehak', 0)

Mobile.setText(findTestObject('Object Repository/SaveScript/android.widget.EditText - Last Name'), 'Malhotra', 0)

Mobile.setText(findTestObject('Object Repository/SaveScript/android.widget.EditText - Age'), '22', 0)

Mobile.setText(findTestObject('Object Repository/SaveScript/android.widget.EditText - Address 1'), 'Chandigarh', 0)

Mobile.setText(findTestObject('Object Repository/SaveScript/android.widget.EditText - Address 2'), 'Chandigarh', 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.Button - Select (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.TextView - India (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.CheckedTextView - Education'), 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.CheckedTextView - 5'), 0)

Mobile.tap(findTestObject('Object Repository/SaveScript/android.widget.CheckedTextView - None'), 0)

Mobile.closeApplication()

