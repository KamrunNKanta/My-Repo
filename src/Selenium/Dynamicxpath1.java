package Selenium;

public class Dynamicxpath1 {/*
10) Tag with parents (you must know)

Formula:
 //html tag[@attributeName='attributeValue']//parent::html tag[@attributeName='attributeValue']
Examples:
1.Amazon logo-//a[@class='nav-logo-link nav-progressive-attribute']//parent ::div[@id='nav-logo']
2.4.Amazon All-//i[@class='hm-icon nav-sprite']// parent :: a[@id='nav-hamburger-menu']
3.MountSinai our location: //a[@class='hidden-xs dropdown']//parent::li[@class='open']
4.best buy -credit card.://a[text()='Credit Cards']//parent :: li
5.Penn state logo: //div[@id='block-mobilesystemlogo']//parent ::div[@class='  col-xs-8 col-sm-4 col-md-12']

													
11) Tag with child (not common)
	
Formula:
 //html tag[@attributeName='attributeValue']//child::html tag[@attributeName='attributeValue']
Examples:
1.
Vita Coco Coconut Water, Pure Organic | Refreshing Coconut Taste | Natural Electrolytes | Vital Nutrients | 11.1 Oz (Pack Of 120:
//div[@id='titleSection']//child ::h1[@id='title']

2.
ZICO, Natural 100% Coconut Water Drink, Hydrating Electrolytes, No Sugar Added, Gluten Free, 16.9 Fl Oz (Pack of 12)(Amazon)
//div[@class='celwidget']//child :: div[@id='titleSection']
3.Vita Coco Coconut Water, Pressed Sampler Pack | Impossible To Hate | Smooth, Refreshing Coconut Taste | Naturally Hydrating | Gluten Free | 16.9 Oz Slim Bottle (Pack Of 4)
//div[@class='a-section a-spacing-none']//child ::span[@id='titleEDPPlaceHolder']
4.SheIn Women's Elegant Mesh Contrast Bishop Sleeve Bodycon Pencil Dress(Amazon)
//h1[@class='a-size-large a-spacing-none a-color-secondary']//child::span[@class='a-size-large product-title-word-break'
5.
Osmo - Coding Family Bundle for iPad & Fire Tablet - 3 Educational Learning Games - Ages 5-10+ - Coding Jam, Coding Awbie, Coding Duo - STEM Toy (Osmo Base Required) (Amazon Exclusive)
//h1[@class='a-size-large a-spacing-none']

12)Tag with following sibling {younger brother} (you must know, very important)

Formula:
 //html tag[@attributeName='attributeValue']//following-sibling::html tag[@attributeName='attributeValue']
Example:
1.Penn state health,find a doctor- //li[@class='level-1']//following-sibling ::li[@class='level-1']
2.Mount Sinai -Our location:
//a[@class='hidden-xs dropdown'//following-sibling : : a[@class='visible-xs dropdown']

3.Cmc portion:
Check box ---> //label[@class='checkbox sr-only']//following-sibling::input[@id='checkd']
4.services and treatment penn state health-
//li[@class='level-1']//following-sibling ::li[@class='level-1 parent']
5.Cms user id field:
//label[@id='userid-label']//following-sibling ::input[@id='cms-login-userId']

13) Tag with preceding sibling {elder brother} (you must know)
Formula:
 //html tag[@attributeName='attributeValue']//preceding-sibling::html tag[@attributeName='attributeValue']
Example:1.Expedia logo: //nav[@id='header-toolbar-nav']//preceding-sibling ::a[@class='header-logo uitk-cell all-cell-shrink all-y-padding-two all-r-padding-six']

2. Amazon-//div[@class='row full-bleed-row']// preceding-sibling : :div [@class='row full-bleed-row full-bleed-row-max grey-background']

source:https://portaldev.cms.gov/portal/

3.//input[@type='checkbox']//preceding-sibling::label[@class='checkbox sr-only' and @for='checkd' ]
4.expedia,list your property://div[@class='support-cs__icon']//preceding-sibling ::div[@class='listYourProperty__icon']
5.Expedia trips://div[@class='uitk-menu uitk-menu-mounted']//preceding-sibling :: div[@class='itinerary__icon']
*/

}
