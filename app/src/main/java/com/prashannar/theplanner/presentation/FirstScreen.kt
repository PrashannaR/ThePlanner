package com.prashannar.theplanner.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prashannar.theplanner.R
import com.prashannar.theplanner.ui.theme.Orange
import com.prashannar.theplanner.ui.theme.Purple

@Preview(showSystemUi = true)
@Composable
fun FirstScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "",
            modifier = Modifier.align(CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Keep it",
            modifier = Modifier.align(CenterHorizontally),
            color = Purple,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(0.dp))

        Text(
            text = "Easy!",
            modifier = Modifier.align(CenterHorizontally),
            color = Purple,
            fontSize = 65.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .align(CenterHorizontally)
                .fillMaxWidth(.80f)
                .height(70.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Orange,
                contentColor = Color.White
            )
        ) {
            Text(text = "Let's Go!", fontSize = 20.sp)

        }

        Spacer(modifier = Modifier.height(12.dp))


    }

}