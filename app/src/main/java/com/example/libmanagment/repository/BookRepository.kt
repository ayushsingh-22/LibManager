package com.example.libmanagment.repository

import com.example.libmanagment.data.Book
import com.example.libmanagment.data.BookDao
import kotlinx.coroutines.flow.Flow

class BookRepository(private val dao: BookDao) {
    val allBooks: Flow<List<Book>> = dao.getAllBooks()

    suspend fun insert(book: Book) = dao.insertBook(book)
    suspend fun update(book: Book) = dao.updateBook(book)
    suspend fun delete(book: Book) = dao.deleteBook(book)
    fun search(query: String): Flow<List<Book>> = dao.searchBooks(query)
}
