package com.amg.scoop.ui.listeners

import com.amg.scoop.models.ListingSection

interface ListingSectionListener {
    fun onSeeAllClicked(section: ListingSection)
}