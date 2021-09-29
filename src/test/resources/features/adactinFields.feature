Feature: login adactinhotal website 

Scenario Outline: fill all the details and check whether search hotal is displayed
Given User is on adactinhotal home page
When user should enter "<username>"and "<password>" and click login
And user should enter "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
Then user should confirm whether "select hotal" in displayed in next page 

Examples: 
      | username          | password | Location  | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | 
      | prabhuthavasumani |   887083 | Sydney    | Hotel Creek | Deluxe    | 2 - Two         | 12/01/2021    | 17/01/2021     | 3 - Three       | 1 - One           | 

Scenario Outline: verifying adactin hotal page by selecting only mandatary fields
Given user is on adactin hotal page 
When user should login using  "<username>"and "<password>" and click login
And user should search hotal using "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>"and"<Adults>"
Then user should verify  "select hotal" msg

 
Examples: 
      |Location |Number of Rooms|Check In Date|Check Out Date|Adults per Room |
      |Sydney   | 2 - Two       |12/01/2021   |17/01/2021    | 3 - Three      |
      

Scenario Outline: verifying the adactin hotal page with invalid check in and check out dates
Given user is on adactin hotal page 
When user should login using  "<username>"and "<password>" 
And user should search hotal using  "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>"and"<Adults>"
Then user should verify " Check-In Date shall be before than Check-Out Date" and " Check-Out Date shall be after than Check-In Date"

     Examples: 
     |Location |Number of Rooms|Check In Date|Check Out Date|Adults per Room |
     |Sydney   | 2 - Two       |18/01/2021   |17/01/2021    | 3 - Three      |
     
Scenario Outline: verifying the adactin hotal without any details and need to velidate Please Select a Location error msg is displayed
Given user is on adactin hotal page 
When user should login  "<username>"and "<password>" 
And  user should  click the search btn
Then need to validate whether warrning msg " Please Select a Location" is displayed

     
     
     
     
     
     
     
     
     
     
     
                     







