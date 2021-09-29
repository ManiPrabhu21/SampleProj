Feature: adactin hotal page testing work
Scenario Outline: user should chancel the booking order
Given user on the adactin hotal page
When user should enter "<username>"and"<password>"
And  user should search hotel "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
And user should select the hotel by  click
And user should book the hotel "<First Name>","<Last Name>","<Billing Address>","<Credit Card No.>"
|Credit Card Type|Expiry Month|Expiry Year|cvv Number|
|VISA            |january     |2022       |987       |
|master card     |febraury    |2022       |960       |
|American express|march       |2022       |878       |
|other           |april       |2022       |457       |

Then user should got booking id number

Examples: 
 | username          | password | Location  | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No.  | Credit Card Type | Expiry Month | Expiry Year | cvv Number |
 | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       | 1 - One           | prabhu     | raj       | w street        | 0987654345678909 | VISA             | February     |        2013 |        123 |
      




Scenario Outline: 

Scenario Outline: user should chancel the booking order
Given user in adactin page
When user should enter "<username>"and"<password>" and click login btn
And user should going to booking itinenary then cancel the booking user got "The booking has been cancelled."

Examples: 
|username         |passord|
|prabhuthavasumani|887083 |
 