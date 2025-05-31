package com.example.loginpage

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginpage.ui.theme.LoginPageTheme

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painterResource(R.drawable.image2),"Login image",
            modifier = Modifier.size(268.dp).padding(12.dp)
        )

//        Image(
//            painterResource(R.drawable.image),"Login image",
//            modifier = Modifier.size(200.dp)
//        )
//        Spacer(modifier = Modifier.height(24.dp)) // 12

        Text("Welcome Back!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text("Login to your account")

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(email, onValueChange = {email = it}, label = {
            Text("Email address")
        })

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(password, onValueChange = {password = it}, label = {
            Text("Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {
            Log.i("Credential", "Email : $email Password : $password")
        }) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(40.dp))

//        TextButton(onClick = {}) {
//            Text("Forgot password?")
//        }
        Text("Forgot password?",
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.clickable {  }
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text("Or sign in with:")

        Row(
            modifier = Modifier.fillMaxWidth().padding(
                horizontal = 36.dp,
                vertical = 20.dp
            ),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painterResource(R.drawable.facebook),"Facebook",
                modifier = Modifier
                    .size(44.dp)
                    .clickable {  }
            )
            Image(painterResource(R.drawable.google),"Google",
                modifier = Modifier
                    .size(44.dp)
                    .clickable {  }
            )
            Image(painterResource(R.drawable.microsoft),"Microsoft",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {  }
            )
            Image(painterResource(R.drawable.github),"GitHub",
                modifier = Modifier
                    .size(44.dp)
                    .clickable {  }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginPageTheme {
        LoginScreen()
    }
}

