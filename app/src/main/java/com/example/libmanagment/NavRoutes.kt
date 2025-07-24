package com.example.libmanagment

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object AddEdit : Screen("add_edit?bookId={bookId}") {
        fun passId(id: Int?) = "add_edit?bookId=${id ?: -1}"
    }
}
