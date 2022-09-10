package com.amg.scoop.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.amg.scoop.models.DataItem
import com.amg.scoop.models.ListingContainer
import com.amg.scoop.models.Movie
import com.amg.scoop.models.PopularContainer
import com.amg.scoop.ui.custom.LandingToolBar
import com.amg.scoop.ui.listitems.MoviesListingListItem
import com.amg.scoop.ui.theme.AppTheme

@Composable
fun ListingScreen(container: ListingContainer) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        if (container is PopularContainer) {

            LandingToolBar(title = container.title)

            ListingList(containers = container.data)
        }
    }
}

@Composable
private fun ListingList(containers: List<DataItem>) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(AppTheme.dimens.padding_default),
        columns = GridCells.Fixed(2)
    ) {
        items(containers) { item ->
            if (item is Movie) {
                MoviesListingListItem(item)
            }
        }
    }
}
