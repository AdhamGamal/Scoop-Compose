package com.amg.scoop.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun getAppShapes() = Shapes(
    small = RoundedCornerShape(percent = AppTheme.dimens.shape_small), // percentage 50 %
    medium = RoundedCornerShape(AppTheme.dimens.shape_medium), // rectangle with 8dp radius
    large = RoundedCornerShape(AppTheme.dimens.shape_large), // rectangle with 4dp radius
)