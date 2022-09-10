package com.amg.scoop.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle


@Composable
fun getAppTypography(): Typography {
    return Typography(
        h1 = TextStyle(
            fontSize = AppTheme.dimens.text_h1,
        ),
        h2 = TextStyle(
            fontSize = AppTheme.dimens.text_h2,
        ),
        h3 = TextStyle(
            fontSize = AppTheme.dimens.text_h3,
        ),
        h4 = TextStyle(
            fontSize = AppTheme.dimens.text_h4,
        ),
        h5 = TextStyle(
            fontSize = AppTheme.dimens.text_h5,
        ),
        h6 = TextStyle(
            fontSize = AppTheme.dimens.text_h6,
        ),
        subtitle1 = TextStyle(
            fontSize = AppTheme.dimens.text_subtitle1,
        ),
        subtitle2 = TextStyle(
            fontSize = AppTheme.dimens.text_subtitle2,
        ),
        body1 = TextStyle(
            fontSize = AppTheme.dimens.text_body1,
        ),
        body2 = TextStyle(
            fontSize = AppTheme.dimens.text_body2,
        ),
        caption = TextStyle(
            fontSize = AppTheme.dimens.text_caption,
        ),
        overline = TextStyle(
            fontSize = AppTheme.dimens.text_overline,
        ),
        button = TextStyle(
            fontSize = AppTheme.dimens.text_button,
        ),
    )
}