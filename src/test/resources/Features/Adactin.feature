Feature: adaction hotel functional testing

Scenario Outline: adaction hotel all functional testing
Given user should enter "<username>","<password>"
When user should select rooms "<Location>","<Hotels>","<RoomType>","<NumberofRooms>",
"<CheckInDate>","<CheckOutDate>","<AdultsperRoom>","<ChildrenperRoom>"
And user should given personal details"<FirstName>","<LastName>","<BillingAddress>"
And user should given cc details"<CreditCardNo>","<CreditCardType>","<ExpiryMonth>","<ExpiryYear>",
"<CVVNumber>"
Then user get conform message
And user should cancel booking
Then user get conform message


Examples: 
|username|password|Location|Hotels|RoomType|NumberofRooms|CheckInDate|CheckOutDate|AdultsperRoom|ChildrenperRoom|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpiryMonth|ExpiryYear|CVVNumber|
|Dineshkumar6593|dinesh|Melbourne|Hotel Sunshine|Super Deluxe|2|05/07/2020|06/07/2020|3|1|dinesh|kumar|dinesh kumar, palani|1234567890153486|VISA|8|2022|456|
|Dineshkumar6593|inesh| Melbourne|Hotel Sunshine|Super Deluxe|2|05/07/2020|06/07/2020|3|1|dinesh|kumar|dinesh kumar, palani|1234567890153486|VISA|8|2022|456|