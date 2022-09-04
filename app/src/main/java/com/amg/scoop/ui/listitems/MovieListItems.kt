package com.amg.scoop.ui.listitems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.SubcomposeAsyncImage
import com.amg.scoop.models.Movie
import com.amg.scoop.ui.custom.CustomText
import com.amg.scoop.ui.theme.AppTheme
import com.amg.scoop.ui.theme.BlackTransparent
import com.amg.scoop.ui.theme.ScoopTheme

@Composable
fun MoviesSectionListItem(movie: Movie) {
    Box(
        modifier = Modifier
            .width(width = AppTheme.dimens.movie_image_width)
            .height(height = AppTheme.dimens.movie_image_height)
            .padding(AppTheme.dimens.padding_small),
    ) {

        MovieImage(imageUrl = movie.imageUrl)

        MovieTitle(title = movie.title, modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun MoviesListingListItem(movie: Movie) {
    Box(
        modifier = Modifier.padding(AppTheme.dimens.padding_small),
    ) {

        MovieImage(imageUrl = movie.imageUrl)

        MovieTitle(title = movie.title, modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
private fun MovieImage(imageUrl: String) {
    SubcomposeAsyncImage(
        modifier = Modifier.fillMaxSize(),
        model = imageUrl,
        loading = {
            LoadingLayout()
        },
        contentScale = ContentScale.FillBounds,
        contentDescription = null,
    )
}

@Composable
private fun LoadingLayout() {
    Box {
        CircularProgressIndicator(
            color = Color.White,
            modifier = Modifier
                .size(AppTheme.dimens.icon_small)
                .align(Alignment.Center)
        )
    }
}

@Composable
private fun MovieTitle(title: String, modifier: Modifier = Modifier) {
    CustomText(
        text = title,
        style = MaterialTheme.typography.body1,
        modifier = modifier
            .fillMaxWidth()
            .background(BlackTransparent)
            .padding(AppTheme.dimens.padding_small)
    )
}

@Preview
@Composable
private fun PreviewMovieListItem() {
    ScoopTheme {
        MoviesSectionListItem(
            movie = Movie.default
        )
    }
}