Feature: Verifying Adactin hotal page

  Scenario Outline: Fill the all details and get booking confirmation
    Given User on the adactin hotal page
    When User should enter the "<Username>"and "<Password>"
    And User should search hotal "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    And User should book the hotal "<First Name>","<Last Name>","<Billing Address>","<Credit Card No.>"
      | Credit Card No   | Credit Card Type | Expiry Month | Expiry Year | cvv Number |
      | 9876765456876545 | VISA             | January      |        2022 |        987 |
      | 9876765456876545 | Master card      | Febraury     |        2022 |        960 |
      | 9876765456876545 | American express | March        |        2022 |        878 |
      | 9876765456876545 | Other            | April        |        2022 |        457 |
    Then User should verify "Booking confirmation" message

    Examples: 
      | Username          | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No.  |
      | Prabhuthavasumani |   887083 | Sydney   | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       | 1 - One           | prabhu     | raj       | w street        | 0987654345678909 |

  Scenario Outline: Without fill the booking order details user get 7 error message
    Given User on the adactin hotal page
    When User should enter "Username" and "Password"
    And User should fill the serch hotal  "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    Then User should verify msg "Please Enter your First Name","Please Enter you Last Name"," Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"," Please Enter your Credit Card CVV Number"

    Examples: 
      | Username          | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No.  |
      | Prabhuthavasumani |   887083 | Sydney   | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       | 1 - One           | prabhu     | raj       | w street        | 0987654345678909 |
