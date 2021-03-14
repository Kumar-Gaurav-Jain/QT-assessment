@Assessment
Feature: QT Assessment
  Placing an Order for T-shirt
  Sign-in during placing an Order
  Validate Order history for placed order

  @PlaceOrder
  Scenario: order t-shirt & validate order history
    Given launch automation practise site
    When select t-shirt tab and place an order
    And sign-in for successful checkout
    And accept the agreement & place order
    Then validate order status & the amount

  @Updateuserprofile
  Scenario: Update user profile
    Given launch automation practise site
    When sign-in to access the user account
    And update user name
    Then validate profile update status
