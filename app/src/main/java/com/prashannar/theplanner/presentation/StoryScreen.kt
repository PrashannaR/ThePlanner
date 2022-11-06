package com.prashannar.theplanner.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prashannar.theplanner.R

@Preview(showSystemUi = true)
@Composable
fun StoryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {

        Row(modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {
            Image(painter = painterResource(id = R.drawable.hehe), contentDescription = "<3")
            Text(
                text = "Hello Shreyachu <3",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 12.dp, top = 12.dp)
            )

        }

        Row(modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {

            Text(
                text = "I wanted to say\nthis for ekdum\nnei long time,\ntara I was not\nvery sure if you\nfelt the same\nbhanera",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 12.dp, top = 12.dp, end = 8.dp),
                textAlign = TextAlign.Justify
            )
            Image(
                painter = painterResource(id = R.drawable.sec),
                contentDescription = "<3",
                modifier = Modifier.padding(top = 12.dp, bottom = 12.dp)
            )

        }

        Row(modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {

            Image(
                painter = painterResource(id = R.drawable.resource_final),
                contentDescription = "<3",
                modifier = Modifier.padding(top = 12.dp, bottom = 12.dp)
            )

            Text(
                text = "Ahile, it feels right, aba es pachi malai hera, esbata ta bhandina yo kura:P",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 12.dp, top = 12.dp, end = 8.dp),
                textAlign = TextAlign.Justify
            )


        }
        var visible by remember {
            mutableStateOf(false)
        }

        Row() {


            if (visible == true) {
                Text(
                    text = "I wanted to put so much effort on this, ekdum nei fancy ra ramro animated story telling jastei app banauna khojeko they, tara couldn't wait any longer to say this :P.\nEsma bhanne aba, hehe, I LOVE YOU Shreyachu <3",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(
                        start = 12.dp,
                        top = 12.dp,
                        end = 12.dp,
                        bottom = 12.dp
                    ),
                    textAlign = TextAlign.Justify
                )

            }

            Image(
                painter = painterResource(id = R.drawable.cake),
                contentDescription = "<3",
                modifier = Modifier
                    .padding(start = 12.dp)
                    .clickable {
                        visible = true

                    }
            )

        }
        if (visible) {
            Image(
                painter = painterResource(id = R.drawable.ily),
                contentDescription = "<3",
                modifier = Modifier
                    .padding(bottom = 12.dp, start = 12.dp, end = 12.dp)
                    .align(CenterHorizontally)
            )

        }


    }

}