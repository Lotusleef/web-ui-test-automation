@login
Feature: Login functionality

  @valid-login
  Scenario: successful login with valid credentials
      given that user is on the login page
      when user enters valid username and password
      and user clicks the login button
      then user should be redirected to homepage

  @invalid-login
  Scenario: failed login with invalid credentials
      given that user is on the login page
      when user enters invalid username and password
      and user clicks the login button
      then user should see an error message