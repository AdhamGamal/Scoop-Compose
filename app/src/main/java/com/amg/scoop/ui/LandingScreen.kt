package com.amg.scoop.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.amg.scoop.models.ListingContainer
import com.amg.scoop.models.ListingSection
import com.amg.scoop.models.MostPopular
import com.amg.scoop.ui.custom.LandingToolBar
import com.amg.scoop.ui.custom.ListingSection
import com.amg.scoop.ui.theme.ScoopTheme

@Composable
fun LandingScreen(title: String, containers: List<ListingContainer>) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        LandingToolBar(title = title)

        LandingList(data = containers)
    }
}

@Composable
private fun LandingList(data: List<ListingContainer>) {
    LazyColumn {
        items(data) { item ->
            if (item is MostPopular) {
                ListingSection(
                    section = item,
                    seeAllAction = {}
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewHomeScreen() {
    ScoopTheme {
        LandingScreen(
            "Scoop",
            listOf<ListingSection>(
                MostPopular.default,
                MostPopular.default,
                MostPopular.default,
                MostPopular.default,
                MostPopular.default,
            )
        )
    }
}