package com.amg.scoop.models

data class Movie(val title: String, val imageUrl: String) : DataItem() {
    companion object {
        val default = Movie(
            "Top Gun: Maverick",
            "https://shahed4u.cfd/wp-content/uploads/2022/05/MV5BOWQwOTA1ZDQtNzk3Yi00ZmVmLWFiZGYtNjdjNThiYjJhNzRjXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_FMjpg_UX1000_.jpg"
        )
    }
}