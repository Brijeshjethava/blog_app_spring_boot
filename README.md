# blog_app_spring_boot
This is backend APIs for blogging application

## User CRUD APIs
#### Create User
POST - http://localhost:8080/api/users/
  - name
  - email
  - password
  - about

#### Get All Users
GET - http://localhost:8080/api/users/

#### Get single User
GET - http://localhost:8080/api/users/{userId}


#### Update User
PUT - http://localhost:8080/api/users/{userId}
  - name
  - email
  - password
  - about


#### Delete User
DELETE - http://localhost:8080/api/users/{userId}
