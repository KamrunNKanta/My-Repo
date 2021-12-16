package Selenium;

public class DynamicXPath {
	
	/*1. Tag with a single attribute. (mostly used) ****
 //htmltag[@attributeName='attributeValue']
example:
1.American family insurance logo: //head[@class='at-element-marker']
2.Geico logo: //a[@class='icon-geico']
3.Amazon search button: //input[@id='nav-search-submit-button']
4.Amazon logo- //a[@id='nav-logo-sprites']
5.search field= //input[@id='twotabsearchtextbox']

2. Tag with multiple attribute with 'or' logic (not used much) Example:
1.best buy seach field ://input[@id='gh-search-input' or @class='search-input']
2.liberty mitual insurance zipcode://input[@id='quote-zipCode-input' or class='lm-Field-input']

3) Tag with multiple attribute with 'and' logic ***Example:
1.cms.gov user id input :
//input[@id='cms-login-userId' and @ class='cms-login-field ng-untouched ng-pristine ng-invalid']

4) Tag with inner text [means complete text] **********

Formula:
//html tag [text() = 'inner text value' ] 
Example:
1.Amazon Find a gift: //a[text()='Find a Gift']
2.Amazon live: //a[text()='Amazon Live']
3.Amazon beauty and personal care: //a[text()='Beauty & Personal Care']
4.Amazon giftcards: //a[text()='Gift Cards']
5.Amazon Basics: //a[text()='Amazon Basics']


5)Tag with inner text [not actual text, means partial text as well as actual text] (most commonly used) 
example :1.title of mount sinai://h1[contains(text(),'Mount Sinai')]
2.access the portal (penn state health website)://p[contains(text() ,'A convenient, secure website that makes it easy')]
3.find care close to me(penn state website)://p[contains(text(), 'Penn State Health provides a full range of outpatient and inpatient diagnostic, medical and surgical ')]
4.get care now (penn state health)://p[contains(text(), 'Knowing where to seek treatment could save')]
5.looking for clinical trial(penn state health)://p[contains(text(), 'Participating in a clinical trial')]


6) Tag with attributes and use of contains (not commonly used)
Formula:
//html tag [contains(@attribute, 'attribute value') ]
Example:1.Mount sinai website /mount sinai title- //h1[contains(@class ,'title visible-xs')]
2.American family Insurance,heading Insurance build for you://span[contains(@class ,'heading-main text-center')]

7) Normalize space -- eliminates leading and trailing spaces. (high level)

Formula:
//html tag [normalize-space(text())='attribute value']
1.Mount sinai,request an appointment: //a[normalize-space(text())='Request an Appointment'  and @ class='hidden-xs dropdown']     
2.Mount Sinai,location: //a[normalize-space(text())= 'Our Locations' and @ class='visible-xs dropdown' ]      
3.Mount sinai,Patient care://a[normalize-space(text())= 'Patient Care' and @class='hidden-xs dropdown' ]   
4. Mount sinai ,About us://a[normalize-space(text())= 'About Us' and @class='hidden-xs dropdown' ] 

8. 8) Starts with text
Formula:
//html tag [starts-with(text(), 'attribute value')]
1.Hershey medical:p[starts - with(text()) , ' With top quality doctors in Berks, Hershey, Hampden, Lancaster and everywhere in between, Penn State Health experts are never far')]
2.Mount sinai Same day Appointment-//p[starts-with(text(),'You can connect with a Mount Sinai doctor')]

 9) Starts with attribute (not commonly used, no need to practice it)

Formula:
//html tag [starts-with(@attributes, 'attribute value']
example:Mount sinai Header 1. //h1[starts-with(@class, 'ng-binding')]

	 * 
	 */

}
