package com.example.libmanagment.ui.theme.components

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.libmanagment.data.Book

@Composable
fun BookForm(
    book: Book?,
    onSubmit: (Book) -> Unit,
    onCancel: () -> Unit
) {
    var title by remember { mutableStateOf(book?.title ?: "") }
    var author by remember { mutableStateOf(book?.author ?: "") }
    var status by remember { mutableStateOf(book?.status ?: "Available") }

    Column {
        OutlinedTextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
        OutlinedTextField(value = author, onValueChange = { author = it }, label = { Text("Author") })
        DropdownMenuField(
            label = "Status",
            options = listOf("Available", "Borrowed"),
            selected = status,
            onSelected = { status = it }
        )
        Row(modifier = Modifier.padding(top = 8.dp)) {
            Button(onClick = {
                if (title.isNotBlank() && author.isNotBlank()) {
                    onSubmit(Book(id = book?.id ?: 0, title = title, author = author, status = status))
                }
            }) {
                Text(if (book != null) "Update" else "Add")
            }
            if (book != null) {
                Spacer(Modifier.width(8.dp))
                OutlinedButton(onClick = onCancel) { Text("Cancel") }
            }
        }
    }
}

@Composable
fun DropdownMenuField(label: String, options: List<String>, selected: String, onSelected: (String) -> Unit) {
    var expanded by remember { mutableStateOf(false) }

    Box {
        OutlinedTextField(
            value = selected,
            onValueChange = {},
            readOnly = true,
            label = { Text(label) },
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
                }
            }
        )
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            options.forEach {
               DropdownMenuItem(
                    text = { Text(it) },
                    onClick = {
                        expanded = false
                        onSelected(it)
                    }
                )
            }
        }
    }
}
