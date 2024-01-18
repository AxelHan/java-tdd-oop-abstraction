# Domain model Exercise Account 

1 As a system administrator,
I want my users to have to create a user account with an email address and a password.

2 I want them to receive an "invalid password" message if they provide a
password less than 8 characters in length.

3 I want them to receive an "invalid email" message if they provide an email
address without an @ symbol in it.

4 I want new accounts to be disabled by default until I manually set them as enabled.

5 I want users to know if they are able to log in or not based on whether their
account is enabled or disabled.

| Classes | Methods        | Member Variables  | Scenario            | Output/result   |
|---------|----------------|-------------------|---------------------|-----------------|
| Account |                | boolean isEnabled |                     |                 |
|         |                |                   |                     |                 |
|         |                |                   |                     |                 |
|         | changeStatus() |                   | if account enabled  | disable account |
|         |                |                   | if account disabled | enable account  |
|         |                |                   |                     |                 |
|         |                |                   |                     |                 |


| Classes | Methods                                      | Member Variables | Scenario                              | Output/result                 |
|---------|----------------------------------------------|------------------|---------------------------------------|-------------------------------|
| User    |                                              | Account account  |                                       |                               |
|         |                                              |                  |                                       |                               |
|         | createAccount(String email, String password) |                  | if email doesnt contain @             | Return "invalid email"        |
|         |                                              |                  | if password is less than 8 characters | Return "invalid password"     |
|         |                                              |                  |                                       |                               |
|         | Login(String email, String password)         |                  | If account not enabled                | Return "account not enabled"  |
|         |                                              |                  |                                       |                               |
         

