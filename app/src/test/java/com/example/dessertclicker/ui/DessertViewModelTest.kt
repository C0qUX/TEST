package com.example.dessertclicker.ui

import com.example.dessertclicker.R
import org.junit.Assert.assertEquals
import org.junit.Test

class DessertViewModelTest {

    @Test
    fun initialState_isCupcakeWithNoSales() {
        val state = DessertViewModel().uiState.value

        assertEquals(0, state.dessertsSold)
        assertEquals(0, state.revenue)
        assertEquals(5, state.currentDessertPrice)
        assertEquals(R.drawable.cupcake, state.currentDessertImageId)
    }

    @Test
    fun twelveClicks_updateRevenueAndUnlockDonut() {
        val viewModel = DessertViewModel()

        repeat(12) { viewModel.onDessertClicked() }
        val state = viewModel.uiState.value

        assertEquals(12, state.dessertsSold)
        assertEquals(95, state.revenue)
        assertEquals(10, state.currentDessertPrice)
        assertEquals(R.drawable.donut, state.currentDessertImageId)
    }
}
