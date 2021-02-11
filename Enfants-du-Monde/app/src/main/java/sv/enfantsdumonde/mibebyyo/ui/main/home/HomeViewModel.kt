package sv.enfantsdumonde.mibebyyo.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import sv.enfantsdumonde.mibebyyo.data.MODULES_LIST
import sv.enfantsdumonde.mibebyyo.data.models.Module

class HomeViewModel: ViewModel() {

    private val _modules = MutableLiveData<List<Module>>()
    val modules: LiveData<List<Module>>
        get() = _modules

    init {
        _modules.value = MODULES_LIST
    }

}