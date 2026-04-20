
Feature: Verifying Select Hotel Module
@select
  Scenario Outline: Select Second hotel name and verify navigate to Book Hotel page
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 |

  Scenario Outline: Select last hotel name and verify navigate to Book Hotel page
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 |

  Scenario Outline: Select the first Hotel name and dismiss the alert
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and dismiss the alert
    Then User should verify after Search success message "Select Hotel"

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 |
