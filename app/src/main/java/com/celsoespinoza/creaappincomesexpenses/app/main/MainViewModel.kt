package com.celsoespinoza.creaappincomesexpenses.app.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val incomeInput = MutableLiveData<String>()
    val expenseInput = MutableLiveData<String>()

    private val _totalAmount = MutableLiveData<Float>().apply { value = 0f }
    val totalAmount: LiveData<Float>
        get() = _totalAmount

    fun recalculateTotal(flowType: Boolean) {

        val amount = if (flowType) convertToFloat(incomeInput) else convertToFloat(expenseInput) * -1
        _totalAmount.value = (_totalAmount.value ?: 0f) + amount

        incomeInput.value = ""
        expenseInput.value = ""
    }

    private fun convertToFloat(data: LiveData<String>): Float {
        return try {
            data.value?.toFloat() ?: 0f
        } catch (e: Exception) {
            0f
        }
    }
}