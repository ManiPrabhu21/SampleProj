Feature: testing adactin hotal details page

  Scenario Outline: testing login page with valide credential
    Given we are on the Adactin Login page
    When we should enter the "<username>"and "<password>"
    And user should search hotal "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    And user should book the hotal "<First Name>","<Last Name>","<Billing Address>","<Credit Card No.>","<Credit Card Type>","<Expiry Month>","<Expiry Year>","<cvv Number>"
    And we should click the login button
    Then we should verify Title have Search Hotel or not

    Examples: 
      | username          | password | Location  | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No.  | Credit Card Type | Expiry Month | Expiry Year | cvv Number |
      | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       | 1 - One           | prabhu     | raj       | w street        | 0987654345678909 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Melbourne | Hotel Creek | Deluxe    | 2 - Two         | 14/01/2021    | 18/01/2021     | 3 - Three       | 1 - One           | kalai      | prabhu    | t street        | 3456888898765432 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Brisbane  | Hotel Creek | Deluxe    | 2 - Two         | 18/01/2021    | 19/01/2021     | 3 - Three       | 1 - One           | arul       | kalai     | g street        | 0987656865467897 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Brisbane  | Hotel Creek | Deluxe    | 2 - Two         | 13/01/2021    | 13/01/2021     | 3 - Three       | 1 - One           | kishon     | chinna    | e street        | 0987656498769876 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 16/01/2021    | 14/01/2021     | 3 - Three       | 1 - One           | rathan     | ram       | f street        | 0987642387654567 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Melbourne | Hotel Creek | Deluxe    | 2 - Two         | 10/01/2021    | 15/01/2021     | 3 - Three       | 1 - One           | shail      | sarathi   | v street        | 0987696787987656 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 14/01/2021    | 16/01/2021     | 3 - Three       | 1 - One           | chinna     | pugal     | z street        | 0987606798589756 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Melbourne | Hotel Creek | Deluxe    | 2 - Two         | 15/01/2021    | 18/01/2021     | 3 - Three       | 1 - One           | pugal      | mani      | m street        | 0987635656784789 | VISA             | February     |        2013 |        123 |
      | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 18/01/2021    | 10/01/2021     | 3 - Three       | 1 - One           | ram        | arul      | c street        | 0987156768907643 | VISA             | February     |        2013 |        123 |

      
     
      
      
      
      
      
      
      
      