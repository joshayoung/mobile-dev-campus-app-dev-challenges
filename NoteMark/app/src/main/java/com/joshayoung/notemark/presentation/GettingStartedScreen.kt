package com.joshayoung.notemark.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joshayoung.notemark.R
import com.joshayoung.notemark.ui.theme.NoteMarkTheme

@Composable
fun GettingStartedScreen(
    onCreateAccountClick: () -> Unit
) {
    Column(modifier = Modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .paint(
                    painterResource(id = R.drawable.greeting),
                    contentScale = ContentScale.FillBounds
                )
        )
        Box(modifier = Modifier
            .fillMaxWidth()
            .drawBehind {
                drawRoundRect(
                    Color.White,
                    size = size)
            }
            .offset(y = (-50).dp)
            .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .padding(vertical = 20.dp, horizontal = 20.dp)
                    .fillMaxWidth()
            ) {
                Text(modifier = Modifier
                    ,
                    text = "Your Own Collection of Notes",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(modifier = Modifier
                    .padding(bottom = 20.dp)
                    ,
                    text = "Capture your thoughts and ideas."
                )
                Button(modifier = Modifier
                    .fillMaxWidth()
                    ,
                    onClick = {
                        onCreateAccountClick()
                    }
                ) {
                    Text("Get Started")
                }
                OutlinedButton(
                    modifier = Modifier
                        .fillMaxWidth()
                    ,
                    onClick = {
                    }
                ) {
                    Text("Log in")
                }
            }
        }
    }
}

@Preview
@Composable
private fun GettingStartedScreenPreview() {
    NoteMarkTheme {
        GettingStartedScreen(onCreateAccountClick = {})
    }
}