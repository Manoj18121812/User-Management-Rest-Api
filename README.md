# 📌 User Management REST API

A simple Spring Boot REST API for managing users with full CRUD operations 👤✨
Built using Spring Boot, JPA, and MySQL — easy to test using Postman 🚀

---

## 🚀 Features

* ➕ Create User
* 📄 Get All Users
* 🔍 Get User by ID
* ✏️ Update User
* ❌ Delete User

---

## 🛠 Tech Stack

* ☕ **Java**
* 🌱 **Spring Boot**
* 🗄 **MySQL**
* 📡 **REST API**
* 🧪 **Postman** (Testing)

---

## 📦 Spring Initializr Dependencies

**Required**

* Spring Web
* Spring Data JPA
* MySQL Driver

**Optional (Recommended)**

* Lombok
* Spring Boot DevTools


---

## 🧪 Postman Testing

### 📸 Testing Screenshots (Postman)

Add your Postman testing screenshots here:

* Create User Test
* Get All Users Test
* Update User Test
* Delete User Test

---

### ➤ Create User (POST)

`http://localhost:8080/api/users`

Body:

```
{
  "name": "Manoj",
  "email": "manoj@gmail.com",
  "city": "Pune"
}
```

### ➤ Get All Users (GET)

`http://localhost:8080/api/users`

### ➤ Update User (PUT)

`http://localhost:8080/api/users/1`

Body:

```
{
  "name": "Manoj Gavhane",
  "email": "mg@gmail.com",
  "city": "Mumbai"
}
```

### ➤ Delete User (DELETE)

`http://localhost:8080/api/users/1`

---

## ⭐ Show Support

If you like this project, give it a ⭐ on GitHub!

---

## 🙌 Author

**Manoj** — Java | Spring Boot Developer 🚀
