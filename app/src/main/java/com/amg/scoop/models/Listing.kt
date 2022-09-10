package com.amg.scoop.models

abstract class ListingContainer
abstract class DataItem
abstract class ListingSection(open val title: String, open val data: List<DataItem>) : ListingContainer()