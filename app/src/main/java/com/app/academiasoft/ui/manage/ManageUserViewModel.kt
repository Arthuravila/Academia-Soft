package com.app.academiasoft.ui.manage

import androidx.lifecycle.ViewModel

class ManageUserViewModel : ViewModel() {

/*    private val _viewStateLiveData: MutableLiveData<ViewState<Results>> = MutableLiveData()
    val viewStateLiveData = Transformations.map(_viewStateLiveData) { it }

    fun fetchFinances() {
        _viewStateLiveData.value = ViewState.Loading
        val coroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
            onError(exception.message)
        }
        viewModelScope.launch(coroutineExceptionHandler) {
            withContext(Dispatchers.IO) {
                val result = homeRepository.getFinances()
                withContext(Dispatchers.Main) {
                    _viewStateLiveData.value = result
                }
            }
        }
    }

    private fun onError(message: String?) {
        _viewStateLiveData.value = ViewState.Error(message)
    }*/
}