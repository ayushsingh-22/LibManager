# 📚 Library Book Management Application

This is a contemporary Android application developed using **Kotlin**, **Jetpack Compose**, and **Room Database**. The app enables users to efficiently manage a personal library by adding, editing, deleting, and searching books. It is architected using the **MVVM pattern**, providing a smooth and responsive user experience with persistent data storage.

---

## 🛠️ Features

- Add new books with details including title, author, and availability status.
- Browse a scrollable list displaying all stored books.
- Modify existing book information.
- Swipe-to-delete functionality accompanied by smooth animations.
- Search and filter books by title or author.
- Navigate seamlessly between Home and Add/Edit screens.
- Modern user interface designed with Material 3 components in Jetpack Compose.
- Offline data persistence utilizing Room database.

---

## 📸 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/a37069f4-7d1c-499e-9e1d-04103f272cc8" width="250" alt="Screenshot 1" />
  <img src="https://github.com/user-attachments/assets/87e15795-1c74-46fa-be03-30808f7760cb" width="250" alt="Screenshot 2" />
  <img src="https://github.com/user-attachments/assets/53fb8fab-cb28-4fca-9fb1-081cc592e6cd" width="250" alt="Screenshot 3" />
  <img src="https://github.com/user-attachments/assets/7cc7ab2e-6ae1-485c-b613-f3929f7e33ba" width="250" alt="Screenshot 4" />
</p>

---

## 📂 Project Structure

```

com.example.libmanagment/
├── data/
│   ├── Book.kt               // Entity class representing a Book
│   ├── BookDao.kt            // Data Access Object for database operations
│   └── BookDatabase.kt       // Room database configuration
│
├── repository/
│   └── BookRepository.kt     // Repository handling data operations
│
├── ui/
│   └── theme/
│       ├── components/
│       │   ├── BookForm.kt
│       │   ├── BookCard.kt
│       │   ├── BookList.kt
│       │   ├── SearchBar.kt
│       │   ├── HomeScreen.kt
│       │   └── AddEditScreen.kt
│
├── LibraryViewModel.kt       // ViewModel managing UI-related data
├── MainActivity.kt           // Application entry point
└── Screen.kt                 // Navigation routes definition

````

---

## 🧠 Technology Stack

- **Programming Language:** Kotlin  
- **UI Framework:** Jetpack Compose (Material 3)  
- **Architecture Pattern:** MVVM (Model-View-ViewModel)  
- **Database:** Room (SQLite)  
- **Navigation:** Jetpack Navigation Compose  
- **State Management:** StateFlow with ViewModel  

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (Giraffe version or later)  
- Kotlin 1.9 or higher  
- Gradle 8.0 or higher  
- Android SDK version 33 or higher  

### Clone the Repository

```bash
git clone https://github.com/your-username/LibraryBookManager.git
cd LibraryBookManager
````

### Running the Application

1. Open the project in **Android Studio**.
2. Allow Gradle to synchronize the project dependencies.
3. Execute the app on an Android emulator or a physical device.

---

## 📌 Planned Enhancements

* Implement Undo functionality for delete actions using Snackbar.
* Add support for Dark Mode to enhance usability in low-light conditions.
* Incorporate comprehensive form validation to improve data integrity.
* Enable cloud synchronization and backup via Firebase.
* Develop unit and UI tests to ensure application reliability.

---

## 🙋‍♂️ Author

**Ayush Kumar**
📧 [ayushkumar2205@gmail.com](mailto:ayushkumar2205@gmail.com)
🔗 [LinkedIn Profile](https://linkedin.com/in/ayush-kumar-a2880a258)
💻 [GitHub Profile](https://github.com/ayushsingh-22)

