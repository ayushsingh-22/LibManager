# 📚 Library Book Management App

A modern Android application built with **Kotlin**, **Jetpack Compose**, and **Room Database** that allows users to manage a personal library of books. The app is designed using the **MVVM architecture**, offering features like adding, editing, deleting, searching, and swiping books from a persistent list.

---

## 🛠️ Features

- ✅ Add new books with title, author, and availability status
- ✅ View a scrollable list of all added books
- ✅ Edit existing book details
- ✅ Swipe-to-delete books (with animation)
- ✅ Search/filter books by title or author
- ✅ Navigation between Home and Add/Edit screens
- ✅ Modern UI using Material 3 and Jetpack Compose
- ✅ Offline persistence with Room database

---

## 📸 Screenshots

<img width="1080" height="2392" alt="Screenshot_20250724-165635" src="https://github.com/user-attachments/assets/a37069f4-7d1c-499e-9e1d-04103f272cc8" />
<img width="1080" height="2392" alt="Screenshot_20250724-165657" src="https://github.com/user-attachments/assets/87e15795-1c74-46fa-be03-30808f7760cb" />
<img width="1080" height="2392" alt="Screenshot_20250724-165650" src="https://github.com/user-attachments/assets/53fb8fab-cb28-4fca-9fb1-081cc592e6cd" />
<img width="1080" height="2392" alt="Screenshot_20250724-165709" src="https://github.com/user-attachments/assets/7cc7ab2e-6ae1-485c-b613-f3929f7e33ba" />


## 📂 Project Structure

```

com.example.libmanagment/
├── data/
│   ├── Book.kt               // Entity
│   ├── BookDao.kt            // DAO
│   └── BookDatabase.kt       // Room DB
│
├── repository/
│   └── BookRepository.kt     // Repository
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
├── LibraryViewModel.kt       // ViewModel
├── MainActivity.kt           // Entry point
└── Screen.kt                 // Navigation routes

````

---

## 🧠 Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose (Material 3)
- **Architecture**: MVVM
- **Database**: Room (SQLite)
- **Navigation**: Jetpack Navigation Compose
- **State Management**: StateFlow + ViewModel

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Giraffe or later
- Kotlin 1.9+
- Gradle 8.0+
- Android SDK 33+

### Clone the Repository

```bash
git clone https://github.com/your-username/LibraryBookManager.git
cd LibraryBookManager
````

### Run the App

1. Open project in **Android Studio**
2. Let Gradle sync
3. Run on emulator or physical device

---

## 📌 TODO / Future Improvements

* 🔄 Undo delete with Snackbar
* 🌙 Dark mode support
* ✅ Form validation
* ☁️ Firebase sync / cloud backup
* 🧪 Unit tests & UI tests

---

## 🙋‍♂️ Author

**Ayush Kumar**
📧 [ayushkumar2205@gmail.com](mailto:ayushkumar2205@gmail.com)
🔗 [LinkedIn](https://linkedin.com/in/ayush-kumar-a2880a258)
💻 [GitHub](https://github.com/ayushsingh-22)

---
