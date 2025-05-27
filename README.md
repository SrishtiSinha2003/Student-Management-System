 # Student Management System

A simple and robust **Student Management System** built with **Java** and **Spring Boot**, using **Maven** for project management. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.

## 🚀 Features

- Add new student records
- View list of students
- Update student details
- Delete student entries


## 🛠️ Technologies Used

- Java 17+  
- Spring Boot  
- Maven  
- Spring MVC  
- Spring Data JPA / Hibernate  
- MySQL / H2 Database (depending on your configuration)  
- Thymeleaf (if web-based UI is included)


## 📁 Project Structure

```
student-management/
├── .mvn/                  # Maven wrapper files
├── src/                   # Source code
│   └── main/
│       ├── java/          # Java source files
│       └── resources/     # Application properties, templates, static files
├── test/                  # Test cases
├── pom.xml                # Maven dependencies and project config
├── README.md              # Project documentation
└── .gitignore
```


## ⚙️ Getting Started

### Prerequisites

- Java JDK 17+
- Maven
- MySQL (or H2 for in-memory testing)

### 🙌 Contribution
Contributions are welcome! Please fork the repository and submit a pull request.

### Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/Student-Management-System.git
   cd student-management
2. Run the application
 ```bash
   mvn spring-boot:run
