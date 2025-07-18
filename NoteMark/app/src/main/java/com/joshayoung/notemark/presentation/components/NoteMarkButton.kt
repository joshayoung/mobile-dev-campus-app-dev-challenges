package com.joshayoung.notemark.presentation.components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.joshayoung.notemark.ui.theme.NoteMarkTheme


@Composable
fun NoteMarkButton(
    text: String,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = false,
    onClick: () -> Unit
) {
    Button(
        onClick = {
            onClick()
        },
        enabled = isEnabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.tertiary,
            disabledContentColor = MaterialTheme.colorScheme.onTertiary
        ),
        shape = RoundedCornerShape(12f),
        modifier =
        Modifier
            .fillMaxWidth()
    ) {
        Text("Create Account")
    }
}

@Preview(showBackground = true)
@Composable
fun NoteMarkButtonPreview() {
    NoteMarkTheme {
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center) {
            NoteMarkButton(
                text = "Create Account",
                onClick = {},
                isEnabled = true
            )
            NoteMarkButton(
                text = "Create Account",
                onClick = {}
            )
        }
    }
}