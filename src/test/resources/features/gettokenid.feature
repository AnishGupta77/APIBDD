Feature: Get product details using Id

@getproduct
Scenario Outline: Get the product with Id
  Given I have login test data "<testCaseId>"
  When I send the request with custid
  Then the response status code should match the expected status code

  Examples:
    | testCaseId      |
    | CustId1         |
    | CustId2         |
    | CustId5         |


  @addproduct
  Scenario Outline: Add a new product successfully
    Given I have add product test data "<testCaseId>"
    When I send the request to add the product
    Then the response status code should match the expected status code

    Examples:
      | testCaseId |
      | Pduct1   |
      | Pduct2   |
      | Pduct3   |
