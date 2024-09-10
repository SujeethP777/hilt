package com.dqitech.demohilt.repository

import javax.inject.Inject

class MyRepository @Inject constructor() {
    fun getData(): List<String> {
        return listOf("Item 1", "Item 2", "Item 3", "Item 4")
    }
}