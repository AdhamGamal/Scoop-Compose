package com.amg.scoop.ui.custom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.amg.scoop.ui.theme.AppTheme

@Composable
fun LandingToolBar(title: String) {
    Box(
        modifier = Modifier
            .height(AppTheme.dimens.toolbar_size)
            .background(MaterialTheme.colors.primary)
    ) {
        CustomText(
            text = title,
            style = MaterialTheme.typography.h1,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart)
                .padding(AppTheme.dimens.padding_default)
        )
    }
}

