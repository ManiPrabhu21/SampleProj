Feature: adactin hotal page testing
Scenario Outline: need to fill all details and get booking conformation
 Given we should enter the "<username>"and "<password>"
 When user should search hotal "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
 And user should book the hotal "<First Name>","<Last Name>","<Billing Address>","<Credit Card No.>"
 Then need to get validate user " get booking Order No"
 
 Examples: 
 | username          | password | Location  | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No.  |
 | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       | 1 - One           | prabhu     | raj       | w street        | 0987654345678909 |      
 
 
 Scenario Outline: without fill the booking order details user get 7 error msg
 Given user in adactin hotal page
 When user should enter "username" and "password" 
 And user should fill the serch hotal  "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
 Then user should enter without details click on booking order btn user got 7 error msg "Please Enter your First Name","Please Enter you Last Name"," Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"," Please Enter your Credit Card CVV Number"
 
 
 Examples: 
 | username          | password | Location  | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No.  | Credit Card Type | Expiry Month | Expiry Year | cvv Number |
 | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       | 1 - One           | prabhu     | raj       | w street        | 0987654345678909 | VISA             | February     |        2013 |        123 |
 
 
  
 
  