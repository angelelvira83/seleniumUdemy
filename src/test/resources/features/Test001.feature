Feature: Alexa is available
    As a costumer
    If I search for Alexa
    Want to see if the third option on the second page ia available for purchase and can be added to the cart
 

    @test
    Scenario: I can access the subpages through the navigation bar
      Given the user navigates to "https://www.amazon.com"
      And Searches for "Alexa"
      And navigates to the page number "2"
      And selects the third item
      Then assert that the item would be available for purchase

