
Feature: Verifying Book Hotel Module

  Scenario Outline: Book hotel including GST-Card(debit card)-With special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Hari      | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Enter Registration No. | Enter Company Name     | Enter Company Address | Request              | Card Type  |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need extra bedsheets | Debit Card |

  Scenario Outline: Book hotel including GST-Card(debit card)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User doesnot add any special request
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Hari      | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type  |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Debit Card |

  Scenario Outline: Book hotel without GST-Card(debit card)-with special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User doesnot add Gst Details
    And User add Special Request "<Request>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Hari      | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Request              | Card Type  |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com | Need extra bedsheets | Debit Card |

  Scenario Outline: Book hotel without GST-Card(debit card)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User doesnot add Gst and SpecialRequest
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Hari      | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Card Type  |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com | Debit Card |

  Scenario Outline: Book hotel without entering any field , book field and verify all the error message
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User click credit card
    And User click submit without enetring payment details
    Then User should verify after payment details error message "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Enter Registration No. | Enter Company Name     | Enter Company Address | Request              |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need extra bedsheets |

  Scenario Outline: Book hotel including GST-(UPI ID)-With special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Enter Registration No. | Enter Company Name     | Enter Company Address | Request              | upiId                |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need extra bedsheets | seleniumtraining@vbc |

  Scenario Outline: Book hotel including GST-(UPI ID)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User doesnot add any special request
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Enter Registration No. | Enter Company Name     | Enter Company Address | upiId                |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc |

  Scenario Outline: Book hotel without GST-(UPI ID)-With special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User doesnot add Gst Details
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Request              | upiId                |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com | Need extra bedsheets | seleniumtraining@vbc |

  Scenario Outline: Book hotel without GST-(UPI ID)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User doesnot add Gst and SpecialRequest
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Request              | upiId                |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com | Need extra bedsheets | seleniumtraining@vbc |

  Scenario Outline: Book hotel without entering any field in upi field , book field and verify all the error message
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Hari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the Second hotel name and hotel price
    And User select the Select Second hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User click upi
    And User click submit without enetring payment details
    Then User should verify after payment details error message "Please provide your UPI ID"

    Examples: 
      | userName              | password   | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                 | Enter Registration No. | Enter Company Name     | Enter Company Address | Request              |
      | hprakash301@gmail.com | Hari@12345 | Tamil Nadu | Chennai | Suite    | 2024-12-20 | 2024-12-23 | 1-One      | 2-Two        |            2 | Mr.               | Hari       | Prakash   | 9488339212 | hprakash301@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need extra bedsheets |
