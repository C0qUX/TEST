package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.data.DessertUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Conserva el estado y concentra la logica de negocio de Dessert Clicker.
 */
class DessertViewModel : ViewModel() {

    private val desserts = Datasource.dessertList
    private val _uiState = MutableStateFlow(DessertUiState())
    val uiState: StateFlow<DessertUiState> = _uiState.asStateFlow()

    fun onDessertClicked() {
        _uiState.update { currentState ->
            val updatedDessertsSold = currentState.dessertsSold + 1
            val dessertToShow = desserts.last { dessert ->
                updatedDessertsSold >= dessert.startProductionAmount
            }

            currentState.copy(
                dessertsSold = updatedDessertsSold,
                revenue = currentState.revenue + currentState.currentDessertPrice,
                currentDessertPrice = dessertToShow.price,
                currentDessertImageId = dessertToShow.imageId
            )
        }
    }
}
