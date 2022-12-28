package com.crayon.fieldapp.ui.screen.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.MemberRequestResponse
import com.crayon.fieldapp.data.remote.response.NotificationResponse
import com.crayon.fieldapp.data.repository.MemberInvitationRepository
import com.crayon.fieldapp.data.repository.NotificationRepository
import com.crayon.fieldapp.data.repository.SwitchShiftRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class NotificationViewModel(
    private val memberInvitationRepository: MemberInvitationRepository,
    private val switchShiftRepository: SwitchShiftRepository,
    private val notificationRepository: NotificationRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _memberRequests = MediatorLiveData<Event<Resource<List<MemberRequestResponse>>>>()
    val memberRequests: LiveData<Event<Resource<List<MemberRequestResponse>>>> get() = _memberRequests

    fun getMemberRequest(status: String) {
        viewModelScope.launch {
            _memberRequests.postValue(Event(Resource.loading(null)))
            try {
                val result = memberInvitationRepository.getPicMembers(status)
                _memberRequests.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }


    private val _notifications = MediatorLiveData<Event<Resource<List<NotificationResponse>>>>()
    val notifications: LiveData<Event<Resource<List<NotificationResponse>>>> get() = _notifications

    fun getNotifications() = viewModelScope.launch(dispatchers.main) {
        _notifications.postValue(Event(Resource.loading(null)))
        try {
            val result = notificationRepository.getPicNotifications()
            _notifications.postValue(Event(Resource.success(result.data)))
        } catch (e: Exception) {
            onLoadFail(e)
        }
    }


    private val _switchShiftRequests =
        MediatorLiveData<Event<Resource<List<ApplicationResponse>>>>()
    val switchShiftRequests: LiveData<Event<Resource<List<ApplicationResponse>>>> get() = _switchShiftRequests

    fun getSwitchShift(status: String) = viewModelScope.launch(dispatchers.main) {
        _switchShiftRequests.postValue(Event(Resource.loading(null)))
        try {
            val result = switchShiftRepository.getSwitchShift(status)
            _switchShiftRequests.postValue(Event(Resource.success(result.data)))
        } catch (e: Exception) {
            onLoadFail(e)
        }
    }

    private val _isAcceptSwitchShiftRequestSuccess =
        MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val isAcceptSwitchShiftRequestSuccess: LiveData<Event<Resource<GetMessageResponse>>> get() = _isAcceptSwitchShiftRequestSuccess
    fun acceptSwitchShiftRequest(ids: ArrayList<String>) = viewModelScope.launch(dispatchers.main) {
        _isAcceptSwitchShiftRequestSuccess.postValue(Event(Resource.loading(null)))
        try {
            val result = switchShiftRepository.acceptSwitchShift(ids)
            _isAcceptSwitchShiftRequestSuccess.postValue(Event(Resource.success(result.data)))
        } catch (e: Exception) {
            onLoadFail(e)
        }
    }

    private val _isRejectSwitchShiftRequestSuccess =
        MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val isRejectSwitchShiftRequestSuccess: LiveData<Event<Resource<GetMessageResponse>>> get() = _isRejectSwitchShiftRequestSuccess

    fun rejectSwitchShiftRequest(ids: ArrayList<String>) = viewModelScope.launch(dispatchers.main) {
        _isRejectSwitchShiftRequestSuccess.postValue(Event(Resource.loading(null)))
        try {
            val result = switchShiftRepository.rejectSwitchShift(ids)
            _isRejectSwitchShiftRequestSuccess.postValue(Event(Resource.success(result.data)))
        } catch (e: Exception) {
            onLoadFail(e)
        }
    }


    private val _isAcceptMemberRequestSuccess =
        MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val isAcceptMemberRequestSuccess: LiveData<Event<Resource<GetMessageResponse>>> get() = _isAcceptMemberRequestSuccess
    fun acceptMemberRequest(memberRequestId: String) = viewModelScope.launch(dispatchers.main) {
        _isAcceptMemberRequestSuccess.postValue(Event(Resource.loading(null)))
        try {
            val result = memberInvitationRepository.acceptPicMember(memberRequestId)
            _isAcceptMemberRequestSuccess.postValue(Event(Resource.success(result.data)))
        } catch (e: Exception) {
            onLoadFail(e)
        }
    }

    private val _isRejectMemberRequestSuccess =
        MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val isRejectMemberRequestSuccess: LiveData<Event<Resource<GetMessageResponse>>> get() = _isRejectMemberRequestSuccess

    fun rejectMemberRequest(memberRequestId: String) = viewModelScope.launch(dispatchers.main) {
        _isRejectMemberRequestSuccess.postValue(Event(Resource.loading(null)))
        try {
            val result = memberInvitationRepository.rejectPicMember(memberRequestId)
            _isRejectMemberRequestSuccess.postValue(Event(Resource.success(result.data)))
        } catch (e: Exception) {
            onLoadFail(e)
        }
    }

}