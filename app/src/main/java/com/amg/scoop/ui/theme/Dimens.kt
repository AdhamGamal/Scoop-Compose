package com.amg.scoop.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Immutable
data class Dimensions(

    // text sizes
    val text_default: TextUnit = 14.sp,
    val text_h1: TextUnit,
    val text_h2: TextUnit,
    val text_h3: TextUnit,
    val text_h4: TextUnit,
    val text_h5: TextUnit,
    val text_h6: TextUnit,
    val text_subtitle1: TextUnit,
    val text_subtitle2: TextUnit,
    val text_body1: TextUnit,
    val text_body2: TextUnit,
    val text_caption: TextUnit,
    val text_overline: TextUnit,
    val text_button: TextUnit,

    // paddings
    val padding_tiny: Dp = 4.dp,
    val padding_small: Dp = 8.dp,
    val padding_default: Dp = 16.dp,
    val padding_normal: Dp = 20.dp,
    val padding_medium: Dp = 24.dp,
    val padding_large: Dp = 48.dp,
    val padding_container_top: Dp = 18.dp,

    // icons
    val icon_tiny: Dp = 18.dp,
    val icon_small: Dp = 24.dp,
    val icon_normal: Dp = 36.dp,
    val icon_size: Dp = 48.dp,
    val icon_large: Dp = 60.dp,
    val icon_xlarge: Dp = 72.dp,
    val icon_padding: Dp = 12.dp,

    // shapes
    val shape_small: Int = 50,
    val shape_medium: Dp = 8.dp,
    val shape_large: Dp = 4.dp,

    // Common
    val toolbar_size: Dp = 80.dp,

    // listItem movie
    val movie_image_width: Dp = 170.dp,
    val movie_image_height: Dp = 250.dp,
)


val defaultDimens = Dimensions(
    text_h1 = 34.sp,
    text_h2 = 24.sp,
    text_h3 = 20.sp,
    text_h4 = 18.sp,
    text_h5 = 16.sp,
    text_h6 = 14.sp,
    text_subtitle1 = 24.sp,
    text_subtitle2 = 20.sp,
    text_body1 = 16.sp,
    text_body2 = 14.sp,
    text_caption = 12.sp,
    text_overline = 10.sp,
    text_button = 14.sp,
)

val sw320dp = Dimensions(
    text_h1 = 24.sp,
    text_h2 = 18.sp,
    text_h3 = 16.sp,
    text_h4 = 14.sp,
    text_h5 = 12.sp,
    text_h6 = 10.sp,
    text_subtitle1 = 20.sp,
    text_subtitle2 = 16.sp,
    text_body1 = 14.sp,
    text_body2 = 12.sp,
    text_caption = 10.sp,
    text_overline = 8.sp,
    text_button = 12.sp,
)

val sw360dp = Dimensions(
    text_h1 = 29.sp,
    text_h2 = 21.sp,
    text_h3 = 18.sp,
    text_h4 = 16.sp,
    text_h5 = 14.sp,
    text_h6 = 12.sp,
    text_subtitle1 = 22.sp,
    text_subtitle2 = 18.sp,
    text_body1 = 15.sp,
    text_body2 = 13.sp,
    text_caption = 11.sp,
    text_overline = 9.sp,
    text_button = 13.sp,
)