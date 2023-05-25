Feature: Search functionality

Background: User successfully open main page
Given user open "chrome" browser with exe as "F:\\Automation Support Folder\\chromedriver.exe"
Given user enter url as "http://primusbank.qedgetech.com/"
When user enter "Admin" as username
When user enter "Admin" as password
When user click on login button

@SmokeTest
Scenario: Search functionality for mumbai city
When user click on branches
When user select "INDIA" as country
When user select "MAHARASTRA" as state
When user select "MUMBAI" as city
When user click on search button
Then application shows list of branches of mumbai city



