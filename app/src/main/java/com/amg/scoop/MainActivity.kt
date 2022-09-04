package com.amg.scoop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.amg.scoop.ui.MainScreen
import com.amg.scoop.ui.theme.ScoopTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoopTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScoopTheme {
        MainScreen()
    }
}

//onNavigateToFriends = { navController.navigate(Screen.FriendsList.route) },
//@Composable
//fun ProfileScreen(onNavigateToFriends: () -> Unit, resourceId: Int) {
//    Button(onClick = onNavigateToFriends) {
//        Text(text = stringResource(id = resourceId))
//    }
//}
