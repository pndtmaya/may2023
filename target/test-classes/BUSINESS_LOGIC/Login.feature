Feature: login functionality

Background: User successfully open main page
Given user open "chrome" browser with exe as "F:\\Automation Support Folder\\chromedriver.exe"
Given user enter url as "http://primusbank.qedgetech.com/"

@SmokeTest 
Scenario Outline: Login functionality with valid username and password
When user enter <username> as username 
When user enter <password> as password
When user click on login button
Then application shows Admin page to user

Examples: 
					|username|password|
					|Admin|Admin| 
					|Admin123|admin|
					|AdminB|admin|



