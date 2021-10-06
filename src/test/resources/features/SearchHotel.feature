Feature: Login Adactinhotel website

  Scenario Outline: Fill all the details and check whether search hotel is displayed
    Given User is on adactinhotal home page
    When User should enter "<Username>"and "<Password>" and login
    And User should enter "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    Then User should confirm whether "Select hotel" in displayed in next page

    Examples: 
      | Username          | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | Prabhuthavasumani |   887083 | Sydney   | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     |                 | 1 - One           |

  Scenario Outline: verifying adactin hotal page by select only mandatary fields
    Given User is on adactin hotal page
    When User should login using  "<Username>"and "<Password>" and login
    And User should search hotal using "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>"and"<Adults>"
    Then User should verify  "Select hotel" message

    Examples: 
      | Location | Number of Rooms | Check In Date | Check Out Date | Adults per Room |
      | Sydney   | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       |

  Scenario Outline: Verifying the adactin hotal page with invalid check in and check out dates
    Given User is on adactin hotal page
    When User should login using  "<Username>"and "<Password>"
    And User should search hotal using  "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>"and"<Adults>"
    Then User should verify " Check-In Date shall be before than Check-Out Date" and " Check-Out Date shall be after than Check-In Date"

    Examples: 
      | Username          | Password | Location | Number of Rooms | Check In Date | Check In Date | Check Out Date | Adults per Room |
      | prabhuthavasumani |   887083 | Sydney   | 2 - Two         | 18/01/2021    | 17/01/2021    | 3 - Three      |                 |

  Scenario Outline: Verifying the adactin hotal without any details and need to velidate Please Select a Location error msg is displayed
    Given User is on adactin hotal page
    When User should login  "<Username>"and "<Password>"
    And User should  click the search button
    Then Validate whether warrning message " Please Select a Location" is displayed
