import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.DismissDirection
import androidx.compose.material.DismissValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.SwipeToDismiss
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.rememberDismissState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.libmanagment.data.Book
import com.example.libmanagment.ui.theme.components.BookCard

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BookList(
    books: List<Book>,
    onEdit: (Book) -> Unit,
    onDelete: (Book) -> Unit
) {
    LazyColumn {
        items(books, key = { it.id }) { book ->
            val dismissState = rememberDismissState()

            if (dismissState.isDismissed(DismissDirection.EndToStart)) {
                LaunchedEffect(book) {
                    onDelete(book)
                }
            }

            SwipeToDismiss(
                state = dismissState,
                directions = setOf(DismissDirection.EndToStart),
                background = {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete",
                            tint = MaterialTheme.colorScheme.error
                        )
                    }
                },
                dismissContent = {
                    BookCard(
                        book = book,
                        onEdit = { onEdit(book) },
                        onDelete = { onDelete(book) } // Optional if you want icon delete too
                    )
                }
            )
        }
    }
}
