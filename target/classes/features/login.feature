Feature: Login for leaftaps

Scenario Outline: Login for leaftaps positive
And enter the username as <uname>
And enter the password as <pwd>
When click on login button
Then verify login is successfull
When click on crmsfa link
And click on leads
And click on create lead
And enter the company name as <cname>
And enter the first name as <fname>
And enter the last name as <lname>
When click on submit button
Then Verify the name of the created lead
Examples:
|uname|pwd|cname|fname|lname|
|DemoSalesManager|crmsfa|wipro|ramya|a|
|DemoCSR|crmsfa|wipro|janavi|m|
