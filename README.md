# selenium-amazon
Selenium automation tests on Google Chrome, using Webdriver for the website amazon.com.

<b>V1.0 - Amazon Wish List - 07/11/2018:</b>

<b>Implementation of an automation test, using amazon.com wish lists, according to this test case in Gherkin:</b>

Feature: Insert searched item on Amazon whish list

<p>&ensp;Scenario: Search for a macbook Air, insert the correct user login, and add the item successfully to the wish list
<p>&ensp;&ensp;Given I am on the Amazon homepage</p>
<p>&ensp;&ensp;And I click in the "Sign In" button</p>
<p>&ensp;&ensp;And I enter "youremail@provider.com" into the field "Email"</p>
<p>&ensp;&ensp;And I enter "yourpw" into the field "Password"</p>
<p>&ensp;&ensp;And I click in the "Sign In" button</p>
<p>&ensp;&ensp;And I click in the "Search In" button selecting the "Computers" Category</p>
<p>&ensp;&ensp;And I enter "macBook Air" in the search box</p>
<p>&ensp;&ensp;And I click in the "Search" button</p>
<p>&ensp;&ensp;And I click in the image of the first result in the search list result page</p>
<p>&ensp;&ensp;And I click in the button "Add to List" in the item page</p>
<p>&ensp;&ensp;And I click in the button "View Your List" in the "Add to List" page</p>
<p>&ensp;&ensp;Then My wish list, should be populated with the item macBook Air</p>
</p>

<b>Requirements:</b>
<ul>
<li>Java - Version used was JAVA SE Version 8 Update 191</li>
<li>Selenium WebDriver - https://www.seleniumhq.org/download/</li>
<li>Chrome Driver - https://sites.google.com/a/chromium.org/chromedriver/</li>
</ul>

<b>Author:</b>
Miguel Vaz Silva (miguelvazsilva@gmail.com)
