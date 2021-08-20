 Feature: Verfiy Adactin details 
 Scenario Outline: Verifying Adactin login with valid credential 
Given User is on the adactin page
When User should enter"<username>" and "<password>"
And user Should click loghin button
Then verify the success message
When User should select booking detail "<Location>","<Hotels>","<Room Type>","<Number of rooms>","<Adult>" and "<Child Room>"
And user Should click Search button
Then click checkbox and select button
When User should enter their details "<Firstname>","<Lastname>","<BillingAddress>","<creditcard>","<credit card type>","<expiry month>","<expiry year>" and "<cvv>"
And user Should click book button
Then verify the success message


 Examples:

|username|password|Location|Hotels|Room Type|Number of rooms|Adult|Child Room|Firstname|Lastname|BillingAddress|creditcard|credit card type|expiry month|expiry year|cvv|
|naveen1612|3TGGMW|Sydney  |Hotel Creek|Standard|2|1|0|charu|sree|chennai thiruvallur|4571661027381607|Visa|August|2022|123|
|naveen1612|3TGGMW|London  |Hotel Creek|Standard|2|1|0|Aji|sree|delhi|4571661027381607|Visa|August|2026|789|
|naveen1612|3TGGMW|Paris   |Hotel Creek|Standard|4|1|0|sree|sree|chennai thiruvallur|4571661027381607|Visa|August|2025|456|
|naveen1612|3TGGMW|New York|Hotel Creek|Standard|2|1|0|Arun|sree|Redhills|4571661027381607|Visa|August|2023|963|
|naveen1612|3TGGMW|Melborune|Hotel Creek|Standard|2|1|0|sathish|sree|chennai thiruvallur|4571661027381607|Visa|August|2022|852|
|naveen1612|3TGGMW|Adlaide |Hotel Creek|Standard|2|1|0|Arjun|sree|thiruvallur|4571661027381607|Visa|August|2029|741|
|naveen1612|3TGGMW|Paris   |Hotel Creek|Standard|2|1|0|sree|sree|thiruvallur|4571661027381607|Visa|August|2023|147|
|naveen1612|3TGGMW|Sydney  |Hotel Creek|Standard|2|1|0|Vani|sree|chennai thiruvallur|4571661027381607|Visa|August|2028|258|
|naveen1612|3TGGMW|London  |Hotel Creek|Standard|2|1|0|Charu|sree|andhra|4571661027381607|Visa|August|2027|369|
|naveen1612|3TGGMW|Nwe york |Hotel Creek|Standard|2|1|0|Anu|sree|Maharastra|4571661027381607|Visa|August|2029|789|
 
 

 