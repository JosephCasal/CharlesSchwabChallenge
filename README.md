# CharlesSchwabChallenge
Charles Schwab Challenge - Pizza Me android app

Instructions:
Complete the Charles Schwab challenge in MVP with Dagger and RxJava
All requirements in each challenge should be 100% complete.
The applications should have 100% test coverage for business logic, at least 50% for other.
Proper documentation of classes/methods

Charles Schwab challenge:

Coding Challenge - PizzaMe

User Story

 As a user I want to find the nearest pizza places to me so that I can select the closest one.

 Acceptance Criteria

    Using the GPS on my device, it should present a list of nearby pizza places

   The list should show basic information such as Name, Address, City, State, distance(in miles), phone number

   Selecting an entry from the list shows a detail page for that location.

   From the detail page I should be able to open it in maps, or call the number.

 Technical Requirements

 Rest query : apihttps://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20local.search%20where%20zip%3D%2778759%27%20and%20query%3D%27pizza%27&format=json&diagnostics=true&callback=>


 (Note: you will need to modify the API to use your device's geo location instead of a hardcoded zip code ref: https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20local.search%20where%20zip%3D%2794085%27%20and%20query%3D%27pizza%27&format=json&diagnostics=true&callback=)


Android Technology to be used

   RecyclerView

   Should be developed in MVVM style and include automated unit tests

Additional technology may be used as the developer sees fit, however be prepared to discuss each items inclusion.