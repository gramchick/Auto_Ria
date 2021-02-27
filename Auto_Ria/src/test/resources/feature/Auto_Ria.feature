Feature: User WTBAT use a search to find a used car, that suits a search criterias.



  Scenario: Find and open Advanced Search, choose certain parameters, start a search and opens a car, that suits a search criterias.
    Given User goes to Auto_Ria site
    And User clicks on Advanced Search button
    When User starts a search used cars with certain search criterias
    Then User opens a car's page
