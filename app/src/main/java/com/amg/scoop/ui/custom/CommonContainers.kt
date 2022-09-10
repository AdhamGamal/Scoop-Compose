package com.amg.scoop.ui.custom

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.amg.scoop.R.string
import com.amg.scoop.models.DataItem
import com.amg.scoop.models.ListingSection
import com.amg.scoop.models.Movie
import com.amg.scoop.models.PopularContainer
import com.amg.scoop.ui.listitems.MoviesSectionListItem
import com.amg.scoop.ui.theme.AppTheme
import com.amg.scoop.ui.theme.ScoopTheme

@Composable
fun ListingSection(
    section: ListingSection,
    seeAllAction: () -> Unit,
    seeAllIsVisible: Boolean = true,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(AppTheme.dimens.padding_container_top))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = AppTheme.dimens.padding_normal),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {

            SectionTitle(title = section.title, modifier = Modifier.weight(1f))

            if (seeAllIsVisible) {
                Spacer(modifier = Modifier.width(AppTheme.dimens.padding_normal))

                SeeAllText(seeAllAction)
            }
        }

        HorizontalList(data = section.data)
    }
}

@Composable
private fun SectionTitle(title: String, modifier: Modifier) {
    CustomText(
        text = title,
        style = MaterialTheme.typography.h2,
        modifier = modifier,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
private fun SeeAllText(onClick: () -> Unit, modifier: Modifier = Modifier) {
    CustomText(
        text = stringResource(string.see_all),
        style = MaterialTheme.typography.body2,
        modifier = modifier
            .clickable(onClick = onClick)
            .padding(AppTheme.dimens.padding_tiny)
    )
}

@Composable
private fun HorizontalList(data: List<DataItem>) {
    LazyRow(contentPadding = PaddingValues(AppTheme.dimens.padding_small)) {
        items(data) { item ->
            if (item is Movie) {
                MoviesSectionListItem(item)
            }
        }
    }
}

@Preview
@Composable
private fun PreviewListingSection() {
    ScoopTheme {
        ListingSection(
            section = PopularContainer(
                title = "Home Home Home Home Home Ho Ho Ho Ho",
                data = listOf(Movie.default, Movie.default, Movie.default)
            ),
            seeAllAction = {}
        )
    }
}