# 🍽️ SmartCanteen

*A Java & JavaFX-based Smart Canteen Management System*

SmartCanteen is a desktop application designed to simplify and automate the student canteen experience.
It allows students to **register, log in, view menus, place orders**, and helps admins manage items efficiently.

---

## 🚀 Features

### 👩‍🎓 **For Students**

* Register with USN, name, email, and password
* Login securely
* View available food items
* Place orders
* View order history *(if implemented)*

### 🛠️ **For Admin**

* Add/update/delete menu items
* View total orders
* Manage inventory *(optional)*

### 🎨 **Tech Stack**

| Component    | Technology                              |
| ------------ | --------------------------------------- |
| Language     | Java 17                                 |
| UI           | JavaFX                                  |
| Build Tool   | Maven                                   |
| IDE          | Visual Studio Code / IntelliJ / Eclipse |
| Architecture | MVC (Model–View–Controller)             |

---

## 📁 Project Structure

```
SmartCanteen/
│── src/main/java/
│   ├── application/      # Main entry + JavaFX UI
│   ├── model/            # Data models (Student, Item, Orders)
│   ├── service/          # Business logic
│   ├── student/          # Login, Register controllers
│
│── src/main/resources/   # FXML & assets (icons/images)
│── pom.xml               # Maven dependencies & build config
│── README.md
```

---

## ▶ How to Run the Project

### ✔ Prerequisites

* Java 17 installed
* Maven installed
* JavaFX SDK downloaded
* VS Code with:

  * Java Extension Pack
  * JavaFX Extension (optional)

---

### 🔧 Run Using Maven

```
mvn clean install
mvn javafx:run
```

---

### ▶ Run Using VS Code

1. Open the project folder in VS Code
2. Ensure JavaFX library is configured in **launch.json**
3. Click **Run → Start Debugging**

---

## 📦 Maven Dependencies (JavaFX)

Your `pom.xml` already contains:

```xml
<dependencies>
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-controls</artifactId>
        <version>17</version>
    </dependency>
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-fxml</artifactId>
        <version>17</version>
    </dependency>
</dependencies>
```
