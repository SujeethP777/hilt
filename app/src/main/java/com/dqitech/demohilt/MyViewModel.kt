package com.dqitech.demohilt

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dqitech.demohilt.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: MyRepository) : ViewModel() {
    private val _data = MutableStateFlow<List<String>>(emptyList())
    val data: StateFlow<List<String>> = _data

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            _data.value = repository.getData()
        }
    }
}