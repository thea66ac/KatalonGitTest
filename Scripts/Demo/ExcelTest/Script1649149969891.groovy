import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

testData = findTestData("Data Files//SampleData")

for (int i = 1; i <= testData.getRowNumbers(); i++)
	WebUI.comment(testData.getValue(2, i));
