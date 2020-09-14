package com.celsoespinoza.creaappincomesexpenses.data.entity

data class CategoryEntity(
    val id: Int,
    val name: String,
    val code: String,
    val typeFlow: Boolean //1: ingreso, 2: egreso
)