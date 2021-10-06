Feature: Verifying Adactin Hotel page

  Scenario Outline: User should cancel the booking order
    Given User are on the Adactin Login page
    When User should enter "<Username>","<Password>"
    And User should search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>","<ChildrenperRoom>"
    And User should select the hotel
    And User should book the hotel "<FirstName>","<LastName>","<BillingAddress>"
      | CreditCardNo     | CreditCardType   | ExpiryMonth | ExpiryYear | CVVNumber |
      | 9876765456876545 | American express | January     |       2022 |       987 |
      | 7865765456768765 | VISA             | April       |       2022 |       960 |
      | 9876543423456765 | Master card      | March       |       2022 |       878 |
      | 8098765465434567 | Other            | April       |       2022 |       457 |
    Then User should verify "The booking has been cancelled." message

    Examples: 
      | Username          | Password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName | BillingAddress |
      | Prabhuthavasumani |   887083 | Sydney   | Hotel Creek | Deluxe   | 2 - Two       | 12/01/2021  | 17/01/2021   | 3 - Three     | 1 - One         | prabhu    | raj      | w street       |
