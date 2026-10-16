package com.example.dessertclicker.data

import androidx.annotation.DrawableRes

/**
 * Estado inmutable que necesita la interfaz de Dessert Clicker.
 */
data class DessertUiState(
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertPrice: Int = Datasource.dessertList.first().price,
    @DrawableRes val currentDessertImageId: Int = Datasource.dessertList.first().imageId
)
