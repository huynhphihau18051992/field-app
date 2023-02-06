package com.crayon.fieldapp.di

import com.crayon.fieldapp.ui.navigation.home_container.HomeContainerViewModel
import com.crayon.fieldapp.ui.navigation.job_container.JobContainerViewModel
import com.crayon.fieldapp.ui.navigation.notification_container.NotificationContainerViewModel
import com.crayon.fieldapp.ui.navigation.profile_container.ProfileContainerViewModel
import com.crayon.fieldapp.ui.screen.application.ApplicationViewModel
import com.crayon.fieldapp.ui.screen.application.list.ListPicApplicationViewModel
import com.crayon.fieldapp.ui.screen.attendance.AttendanceViewModel
import com.crayon.fieldapp.ui.screen.avatar.AvatarViewModel
import com.crayon.fieldapp.ui.screen.bank.BankViewModel
import com.crayon.fieldapp.ui.screen.calendar.CalendarViewModel
import com.crayon.fieldapp.ui.screen.contact.ContactViewModel
import com.crayon.fieldapp.ui.screen.createApplication.CreateApplicationViewModel
import com.crayon.fieldapp.ui.screen.detailAttachment.DetailAttachmentViewModel
import com.crayon.fieldapp.ui.screen.detailAttachment.image.ListImageViewModel
import com.crayon.fieldapp.ui.screen.detailAttachment.product.ListProductViewModel
import com.crayon.fieldapp.ui.screen.detailAttendance.DetailAttendanceViewModel
import com.crayon.fieldapp.ui.screen.detailGroupStore.DetailGroupStoreViewModel
import com.crayon.fieldapp.ui.screen.detailGroupUser.DetailGroupUserViewModel
import com.crayon.fieldapp.ui.screen.detailManagementJob.DetailManagementJobViewModel
import com.crayon.fieldapp.ui.screen.detailNotification.DetailNotificationViewModel
import com.crayon.fieldapp.ui.screen.detailPicJob.DetailPicJobViewModel
import com.crayon.fieldapp.ui.screen.detailProject.DetailProjectViewModel
import com.crayon.fieldapp.ui.screen.detailProject.addMember.AddMemberProjectViewModel
import com.crayon.fieldapp.ui.screen.detailProject.addStore.StoreProjectViewModel
import com.crayon.fieldapp.ui.screen.detailProject.createJob.CreateJobViewModel
import com.crayon.fieldapp.ui.screen.detailProject.createTask.CreateTaskViewModel
import com.crayon.fieldapp.ui.screen.detailProject.manageJob.ManageJobProjectViewModel
import com.crayon.fieldapp.ui.screen.detailProject.member.MemberProjectViewModel
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.detailCustomer.DetailCustomerViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1.InputNameViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2.VerifyOtpStep2ViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.InputBillViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.SelectPromotionViewModel
import com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.ReportCompetitorViewModel
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.ReportSalesViewModel
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder.AddOrderViewModel
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.detailOrder.DetailOrderViewModel
import com.crayon.fieldapp.ui.screen.detailUser.DetailUserViewModel
import com.crayon.fieldapp.ui.screen.forgot.ForgotPasswordViewModel
import com.crayon.fieldapp.ui.screen.home.HomeViewModel
import com.crayon.fieldapp.ui.screen.info.InfoViewModel
import com.crayon.fieldapp.ui.screen.job.JobViewModel
import com.crayon.fieldapp.ui.screen.job.listJob.ListJobViewModel
import com.crayon.fieldapp.ui.screen.job.request.ListJobRequestViewModel
import com.crayon.fieldapp.ui.screen.login.LoginViewModel
import com.crayon.fieldapp.ui.screen.main.MainViewModel
import com.crayon.fieldapp.ui.screen.monitor.MonitorViewModel
import com.crayon.fieldapp.ui.screen.monitor.application.ManageApplicationViewModel
import com.crayon.fieldapp.ui.screen.monitor.application.list.ListManagementApplicationViewModel
import com.crayon.fieldapp.ui.screen.monitor.attendance.detailTask.DetailAttendacneAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.attendance.listTask.ListAttendanceAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.changeGift.ManageChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.monitor.changeGift.detailTask.DetailChangeGiftAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.changeGift.listTask.ListChangeGiftAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.employee.ManageEmployeeViewModel
import com.crayon.fieldapp.ui.screen.monitor.employee.listGroupMember.ListGroupEmployeeViewModel
import com.crayon.fieldapp.ui.screen.monitor.employee.listMembers.ListEmployeeViewModel
import com.crayon.fieldapp.ui.screen.monitor.listProject.ListProjectViewModel
import com.crayon.fieldapp.ui.screen.monitor.notification.ManageNotificationViewModel
import com.crayon.fieldapp.ui.screen.monitor.notification.sent.NotificationSentViewModel
import com.crayon.fieldapp.ui.screen.monitor.project.ManageProjectViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.ManageReportCompetitorViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.detailTask.DetailReportCompetitorAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.listTask.ListReportCompetitorAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportSales.ManageReportSalesViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportSales.detailTask.DetailReportSalesAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportSales.listTask.ListReportSalesAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportTracking.ManageReportTrackingViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportTracking.detailTask.DetailReportTrackingAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportTracking.history.HistoryTrackingAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask.ListReportTrackingAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.store.ManageStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.store.listGroup.ListGroupViewModel
import com.crayon.fieldapp.ui.screen.monitor.store.listStore.ListStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail.DetailStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.updateStatus.ManageUpdateStatusViewModel
import com.crayon.fieldapp.ui.screen.monitor.updateStatus.detailTask.DetailUpdateStatusAtStoreViewModel
import com.crayon.fieldapp.ui.screen.monitor.updateStatus.listTask.ListUpdateStatusAtStoreViewModel
import com.crayon.fieldapp.ui.screen.notification.NotificationViewModel
import com.crayon.fieldapp.ui.screen.privacy.PrivacyViewModel
import com.crayon.fieldapp.ui.screen.profile.ProfileViewModel
import com.crayon.fieldapp.ui.screen.register.RegisterViewModel
import com.crayon.fieldapp.ui.screen.report.ReportViewModel
import com.crayon.fieldapp.ui.screen.report.project.ReportProjectViewModel
import com.crayon.fieldapp.ui.screen.report.time.ReportTimeViewModel
import com.crayon.fieldapp.ui.screen.requireLogin.RequireLoginViewModel
import com.crayon.fieldapp.ui.screen.resetPassword.ResetPasswordViewModel
import com.crayon.fieldapp.ui.screen.selectProject.SelectProjectViewModel
import com.crayon.fieldapp.ui.screen.splash.SplashViewModel
import com.crayon.fieldapp.ui.screen.term.TermViewModel
import com.crayon.fieldapp.ui.screen.verifyOtp.VerifyOtpViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SplashViewModel() }
    viewModel { HomeContainerViewModel() }
    viewModel { JobContainerViewModel() }
    viewModel { ProfileContainerViewModel() }
    viewModel { NotificationContainerViewModel() }
    viewModel { MainViewModel(get(), get(), get(), get()) }
    viewModel { LoginViewModel(get()) }
    viewModel { VerifyOtpViewModel(get(), get(), get()) }
    viewModel { RequireLoginViewModel() }
    viewModel { RegisterViewModel(get(), get(), get()) }
    viewModel { AvatarViewModel(get(), get(), get()) }
    viewModel { ProfileViewModel(get()) }
    viewModel { InfoViewModel(get(), get(), get()) }
    viewModel { BankViewModel(get(), get(), get()) }
    viewModel { ApplicationViewModel(get()) }
    viewModel { TermViewModel() }
    viewModel { PrivacyViewModel() }
    viewModel { ContactViewModel() }
    viewModel { HomeViewModel(get(), get(), get()) }
    viewModel { ReportViewModel(get(), get()) }
    viewModel { CalendarViewModel(get(), get()) }
    viewModel { AttendanceViewModel(get(), get(), get(), get()) }
    viewModel { MonitorViewModel(get(), get()) }
    viewModel { JobViewModel(get()) }
    viewModel { NotificationViewModel(get(), get(), get(), get()) }
    viewModel { ReportProjectViewModel(get(), get(), get()) }
    viewModel { ReportTimeViewModel(get(), get()) }
    viewModel { SelectProjectViewModel(get(), get()) }
    viewModel { ManageEmployeeViewModel(get(), get()) }
    viewModel { ManageApplicationViewModel(get()) }
    viewModel { ManageNotificationViewModel(get()) }
    viewModel { ManageStoreViewModel(get()) }
    viewModel { ManageProjectViewModel(get()) }
    viewModel { ListStoreViewModel(get(), get()) }
    viewModel { ListGroupViewModel(get(), get()) }
    viewModel { ListProjectViewModel(get(), get()) }
    viewModel { NotificationSentViewModel(get()) }
    viewModel { ListManagementApplicationViewModel(get(), get()) }
    viewModel { ListJobViewModel(get(), get()) }
    viewModel { DetailGroupStoreViewModel(get(), get()) }
    viewModel { DetailGroupUserViewModel(get(), get()) }
    viewModel { DetailStoreViewModel(get(), get()) }
    viewModel { ListPicApplicationViewModel(get(), get()) }
    viewModel { DetailUserViewModel(get(), get()) }
    viewModel { DetailPicJobViewModel(get(), get(), get()) }
    viewModel { DetailTaskViewModel(get(), get(), get(), get()) }
    viewModel { DetailProjectViewModel(get(), get(), get(), get()) }
    viewModel { DetailAttendanceViewModel(get(), get()) }
    viewModel { DetailNotificationViewModel(get()) }
    viewModel { ListEmployeeViewModel(get(), get()) }
    viewModel { ListGroupEmployeeViewModel(get(), get()) }
    viewModel { StoreProjectViewModel(get(), get(), get()) }
    viewModel { AddMemberProjectViewModel(get(), get(), get()) }
    viewModel { MemberProjectViewModel(get(), get()) }
    viewModel { ManageJobProjectViewModel(get(), get()) }
    viewModel { CreateJobViewModel(get(), get(), get()) }
    viewModel { DetailManagementJobViewModel(get(), get(), get()) }
    viewModel { ListJobRequestViewModel(get(), get()) }
    viewModel { CreateTaskViewModel(get(), get()) }
    viewModel { CreateApplicationViewModel(get(), get(), get(), get(), get()) }
    viewModel { DetailAttachmentViewModel(get(), get()) }
    viewModel { ListImageViewModel(get(), get()) }
    viewModel { ListProductViewModel(get(), get()) }
    viewModel { ForgotPasswordViewModel(get(), get()) }
    viewModel { ResetPasswordViewModel(get(), get()) }
    viewModel { DetailAttendacneAtStoreViewModel(get(), get()) }
    viewModel { ListAttendanceAtStoreViewModel(get(), get()) }
    viewModel { DetailUpdateStatusAtStoreViewModel(get(), get()) }
    viewModel { ListUpdateStatusAtStoreViewModel(get(), get()) }
    viewModel { ManageUpdateStatusViewModel(get(), get(), get()) }
    viewModel { ManageReportCompetitorViewModel(get(), get(), get()) }
    viewModel { ManageReportSalesViewModel(get(), get(), get()) }
    viewModel { ManageReportTrackingViewModel(get(), get(), get()) }
    viewModel { ManageChangeGiftViewModel(get(), get(), get()) }
    viewModel { ChangeGiftViewModel(get()) }
    viewModel { InputNameViewModel(get(), get()) }
    viewModel { VerifyOtpStep2ViewModel(get(), get()) }
    viewModel { InputBillViewModel(get(), get()) }
    viewModel { SelectPromotionViewModel(get(), get()) }
    viewModel { ReportCompetitorViewModel(get()) }
    viewModel { ReportSalesViewModel(get()) }
    viewModel { ListReportCompetitorAtStoreViewModel(get(), get()) }
    viewModel { ListReportSalesAtStoreViewModel(get(), get()) }
    viewModel { ListReportTrackingAtStoreViewModel(get(), get()) }
    viewModel { ListChangeGiftAtStoreViewModel(get(), get()) }
    viewModel { DetailReportCompetitorAtStoreViewModel(get(), get()) }
    viewModel { DetailReportSalesAtStoreViewModel(get(), get()) }
    viewModel { DetailReportTrackingAtStoreViewModel(get(), get()) }
    viewModel { DetailChangeGiftAtStoreViewModel(get(), get()) }
    viewModel { HistoryTrackingAtStoreViewModel(get(), get()) }
    viewModel { DetailOrderViewModel() }
    viewModel { AddOrderViewModel(get()) }
    viewModel { DetailCustomerViewModel(get(), get()) }
}