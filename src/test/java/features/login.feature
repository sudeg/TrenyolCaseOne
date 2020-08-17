Feature: LoginFeature
  First mission is login with registered user

  Scenario: Login with registered user
    Given Go to website
    And Enter login button
    And Enter email as "sudegonul95@gmail.com" and password as "123358"
    And Click login button
    Then Main page should be refreshed