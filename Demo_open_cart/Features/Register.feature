Feature: To verify Register Functionality

Scenario:  To validate Registering an account By Providing only the mandatory fields 

Given Launch the Application
Then click on'My Account'Drop menu
Then click on'Register 'option
Then Enter new Account Details into the mandatory fields with the following details
|nandan|Guupta|
Then click on continue button 
And click on continue button that is displayed in the Account Succes  


Scenario: valiadate Thanku for regestering email is sent to the registerd email 
          addres as a confirmation for  registering the account
          
Given Launch the Application 
Then click on'My Account'Drop menu
Then click on'Register 'option
Then Enter new Account Details into the mandatory fields(First name ,Last Name etc)  
|nandan|Gupta|                                               
Then click on continue button 
And check the email adress used for registering the account 
Then click on the Login Page link from the email body                                                           
                                        
                                                                