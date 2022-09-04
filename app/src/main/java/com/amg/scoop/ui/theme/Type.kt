package com.amg.scoop.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle


@Composable
fun getAppTypography(): Typography {
    return Typography(
        // AppFont.H1
        h1 = TextStyle(
            fontSize = AppTheme.dimens.text_h1,
        ),
        // AppFont.H2
        h2 = TextStyle(
            fontSize = AppTheme.dimens.text_h2,
        ),
        // AppFont.H3
        h3 = TextStyle(
            fontSize = AppTheme.dimens.text_h3,
        ),
        // AppFont.H4
        h4 = TextStyle(
            fontSize = AppTheme.dimens.text_h4,
        ),
        // AppFont.H5
        h5 = TextStyle(
            fontSize = AppTheme.dimens.text_h5,
        ),
        // AppFont.H6
        h6 = TextStyle(
            fontSize = AppTheme.dimens.text_h6,
        ),
        // AppFont.body1
        subtitle1 = TextStyle(
            fontSize = AppTheme.dimens.text_subtitle1,
        ),
        // AppFont.body2
        subtitle2 = TextStyle(
            fontSize = AppTheme.dimens.text_subtitle2,
        ),
        // AppFont.body3
        body1 = TextStyle(
            fontSize = AppTheme.dimens.text_body1,
        ),
        // AppFont.body4
        body2 = TextStyle(
            fontSize = AppTheme.dimens.text_body2,
        ),
        // AppFont.body5
        caption = TextStyle(
            fontSize = AppTheme.dimens.text_caption,
        ),
        // AppFont.body6
        overline = TextStyle(
            fontSize = AppTheme.dimens.text_overline,
        ),
        // AppFont.button
        button = TextStyle(
            fontSize = AppTheme.dimens.text_button,
        ),
    )
}