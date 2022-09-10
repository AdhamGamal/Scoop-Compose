package com.amg.scoop.models

data class PopularContainer(override val title: String, override val data: List<Movie>) : ListingSection(title, data) {
    companion object {
        val default = PopularContainer(
            "Section",
            listOf(Movie.default, Movie.default, Movie.default, Movie.default, Movie.default, Movie.default, Movie.default, Movie.default)
        )
    }
}