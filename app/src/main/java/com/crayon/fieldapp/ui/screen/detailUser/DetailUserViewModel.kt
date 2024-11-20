package com.crayon.fieldapp.ui.screen.detailUser

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailUserViewModel(
    private val userRepository: UserRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    private val _user = MediatorLiveData<Resource<User>>()
    val user: LiveData<Resource<User>> get() = _user
    private var usersSource: LiveData<Resource<User>> = MutableLiveData()

    fun fetchDetailUser(agencyId: String, userId: String) =
        viewModelScope.launch(dispatchers.main) {
            _user.removeSource(usersSource)
            withContext(dispatchers.io) { usersSource = userRepository.getUser(agencyId, userId) }
            _user.addSource(usersSource) {
                _user.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }
}