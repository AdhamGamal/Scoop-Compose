package com.amg.scoop.models

abstract class ListingContainer
abstract class DataItem
abstract class ListingSection(open val title: String, open val data: List<DataItem>) : ListingContainer()


data class Movie(val title: String, val imageUrl: String) : DataItem() {
    companion object {
        val default = Movie(
            "Top Gun: Maverick",
            "https://shahed4u.cfd/wp-content/uploads/2022/05/MV5BOWQwOTA1ZDQtNzk3Yi00ZmVmLWFiZGYtNjdjNThiYjJhNzRjXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_FMjpg_UX1000_.jpg"
        )
    }
}

data class MostPopular(override val title: String, override val data: List<Movie>) : ListingSection(title, data) {
    companion object {
        val default = MostPopular(
            "Section",
            listOf(Movie.default, Movie.default, Movie.default, Movie.default, Movie.default, Movie.default, Movie.default, Movie.default)
        )
    }
}