package com.example.libmanagment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.libmanagment.data.Book
import com.example.libmanagment.data.BookDatabase
import com.example.libmanagment.repository.BookRepository
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class LibraryViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = BookDatabase.getDatabase(application).bookDao()
    private val repository = BookRepository(dao)

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    val books: StateFlow<List<Book>> = _searchQuery
        .debounce(300)
        .flatMapLatest { query ->
            if (query.isBlank()) repository.allBooks else repository.search(query)
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun addBook(book: Book) = viewModelScope.launch { repository.insert(book) }
    fun updateBook(book: Book) = viewModelScope.launch { repository.update(book) }
    fun deleteBook(book: Book) = viewModelScope.launch { repository.delete(book) }
}
