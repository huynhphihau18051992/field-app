package com.crayon.fieldapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crayon.fieldapp.databinding.ActivityMainBindingImpl;
import com.crayon.fieldapp.databinding.DialogPickPhotoBindingImpl;
import com.crayon.fieldapp.databinding.FragmentAddCustomerBindingImpl;
import com.crayon.fieldapp.databinding.FragmentAddMemberProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentAddOrderBindingImpl;
import com.crayon.fieldapp.databinding.FragmentAddReportBindingImpl;
import com.crayon.fieldapp.databinding.FragmentApplicationApprovedBindingImpl;
import com.crayon.fieldapp.databinding.FragmentApplicationBindingImpl;
import com.crayon.fieldapp.databinding.FragmentAttendanceBindingImpl;
import com.crayon.fieldapp.databinding.FragmentAvatarBindingImpl;
import com.crayon.fieldapp.databinding.FragmentBankBindingImpl;
import com.crayon.fieldapp.databinding.FragmentCalendarBindingImpl;
import com.crayon.fieldapp.databinding.FragmentChangeGiftBindingImpl;
import com.crayon.fieldapp.databinding.FragmentContactBindingImpl;
import com.crayon.fieldapp.databinding.FragmentCreateApplicationBindingImpl;
import com.crayon.fieldapp.databinding.FragmentCreateJobBindingImpl;
import com.crayon.fieldapp.databinding.FragmentCreateTaskBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailAttachmentBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailAttendanceAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailAttendanceBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailCustomerBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailGroupStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailGroupUserBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailManagementJobBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailNotificationBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailPicJobBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailReportCompetitorAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailReportSalesAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailReportTrackingAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailTaskAttendanceBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailTaskBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailUpdateStatusAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentDetailUserBindingImpl;
import com.crayon.fieldapp.databinding.FragmentExportGiftBindingImpl;
import com.crayon.fieldapp.databinding.FragmentFilterJobBindingImpl;
import com.crayon.fieldapp.databinding.FragmentForgotBindingImpl;
import com.crayon.fieldapp.databinding.FragmentHomeBindingImpl;
import com.crayon.fieldapp.databinding.FragmentHomeContainerBindingImpl;
import com.crayon.fieldapp.databinding.FragmentImportGiftBindingImpl;
import com.crayon.fieldapp.databinding.FragmentInfoBindingImpl;
import com.crayon.fieldapp.databinding.FragmentInputBillBindingImpl;
import com.crayon.fieldapp.databinding.FragmentInputNameBindingImpl;
import com.crayon.fieldapp.databinding.FragmentJobBindingImpl;
import com.crayon.fieldapp.databinding.FragmentJobContainerBindingImpl;
import com.crayon.fieldapp.databinding.FragmentJobProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListAttendanceAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListAttributesBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListEmployeeBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListGroupBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListGroupEmployeeBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListImageBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListJobRequestBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListManagementApplicationsBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListMyJobBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListPicApplicationsBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListPicNotificationBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListProductBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListReportCompetitorAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListReportSalesAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListReportTrackingAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentListUpdateStatusAtStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentLoadmoreRefreshBindingImpl;
import com.crayon.fieldapp.databinding.FragmentLoadmoreRefreshToolbarBindingImpl;
import com.crayon.fieldapp.databinding.FragmentLoginBindingImpl;
import com.crayon.fieldapp.databinding.FragmentMainBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageApplicationBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageAttendanceBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageEmployeeBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageNotificationBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageReportCompetitorBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageReportSalesBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageReportTrackingBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageStoreBindingImpl;
import com.crayon.fieldapp.databinding.FragmentManageUpdateStatusBindingImpl;
import com.crayon.fieldapp.databinding.FragmentMemberGroupUserBindingImpl;
import com.crayon.fieldapp.databinding.FragmentMemberProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentMonitorBindingImpl;
import com.crayon.fieldapp.databinding.FragmentNotificationBindingImpl;
import com.crayon.fieldapp.databinding.FragmentNotificationContainerBindingImpl;
import com.crayon.fieldapp.databinding.FragmentNotificationSentBindingImpl;
import com.crayon.fieldapp.databinding.FragmentPrivacyBindingImpl;
import com.crayon.fieldapp.databinding.FragmentProfileBindingImpl;
import com.crayon.fieldapp.databinding.FragmentProfileContainerBindingImpl;
import com.crayon.fieldapp.databinding.FragmentProjectInProgressBindingImpl;
import com.crayon.fieldapp.databinding.FragmentRegisterBindingImpl;
import com.crayon.fieldapp.databinding.FragmentReportBindingImpl;
import com.crayon.fieldapp.databinding.FragmentReportCompetitorBindingImpl;
import com.crayon.fieldapp.databinding.FragmentReportEndshiftBindingImpl;
import com.crayon.fieldapp.databinding.FragmentReportProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentReportSalesBindingImpl;
import com.crayon.fieldapp.databinding.FragmentReportTimeBindingImpl;
import com.crayon.fieldapp.databinding.FragmentReportUpdateStatusBindingImpl;
import com.crayon.fieldapp.databinding.FragmentRequireLoginBindingImpl;
import com.crayon.fieldapp.databinding.FragmentResetPasswordBindingImpl;
import com.crayon.fieldapp.databinding.FragmentSelectProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentSelectPromotionBindingImpl;
import com.crayon.fieldapp.databinding.FragmentSplashBindingImpl;
import com.crayon.fieldapp.databinding.FragmentStoreProjectBindingImpl;
import com.crayon.fieldapp.databinding.FragmentTermBindingImpl;
import com.crayon.fieldapp.databinding.FragmentVerifyOtpBindingImpl;
import com.crayon.fieldapp.databinding.FragmentVerifyOtpStep2BindingImpl;
import com.crayon.fieldapp.databinding.ItemAddMemberToProjectBindingImpl;
import com.crayon.fieldapp.databinding.ItemAttendanceBindingImpl;
import com.crayon.fieldapp.databinding.ItemDetailGroupBindingImpl;
import com.crayon.fieldapp.databinding.ItemFilterStoreBindingImpl;
import com.crayon.fieldapp.databinding.ItemGroupStoreBindingImpl;
import com.crayon.fieldapp.databinding.ItemGroupUserBindingImpl;
import com.crayon.fieldapp.databinding.ItemManagementApplicationBindingImpl;
import com.crayon.fieldapp.databinding.ItemManagementTaskBindingImpl;
import com.crayon.fieldapp.databinding.ItemMemberBindingImpl;
import com.crayon.fieldapp.databinding.ItemMemberRequestBindingImpl;
import com.crayon.fieldapp.databinding.ItemNotificationBindingImpl;
import com.crayon.fieldapp.databinding.ItemOrderBindingImpl;
import com.crayon.fieldapp.databinding.ItemPicApplicationBindingImpl;
import com.crayon.fieldapp.databinding.ItemProjectBindingImpl;
import com.crayon.fieldapp.databinding.ItemSelectProductBindingImpl;
import com.crayon.fieldapp.databinding.ItemSelectStoreBindingImpl;
import com.crayon.fieldapp.databinding.ItemSelectUserBindingImpl;
import com.crayon.fieldapp.databinding.ItemStoreBindingImpl;
import com.crayon.fieldapp.databinding.ItemStoreGroupStoreBindingImpl;
import com.crayon.fieldapp.databinding.ItemSwitchShiftRequestBindingImpl;
import com.crayon.fieldapp.databinding.ItemTodayJobBindingImpl;
import com.crayon.fieldapp.databinding.ItemUserBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGPICKPHOTO = 2;

  private static final int LAYOUT_FRAGMENTADDCUSTOMER = 3;

  private static final int LAYOUT_FRAGMENTADDMEMBERPROJECT = 4;

  private static final int LAYOUT_FRAGMENTADDORDER = 5;

  private static final int LAYOUT_FRAGMENTADDREPORT = 6;

  private static final int LAYOUT_FRAGMENTAPPLICATION = 7;

  private static final int LAYOUT_FRAGMENTAPPLICATIONAPPROVED = 8;

  private static final int LAYOUT_FRAGMENTATTENDANCE = 9;

  private static final int LAYOUT_FRAGMENTAVATAR = 10;

  private static final int LAYOUT_FRAGMENTBANK = 11;

  private static final int LAYOUT_FRAGMENTCALENDAR = 12;

  private static final int LAYOUT_FRAGMENTCHANGEGIFT = 13;

  private static final int LAYOUT_FRAGMENTCONTACT = 14;

  private static final int LAYOUT_FRAGMENTCREATEAPPLICATION = 15;

  private static final int LAYOUT_FRAGMENTCREATEJOB = 16;

  private static final int LAYOUT_FRAGMENTCREATETASK = 17;

  private static final int LAYOUT_FRAGMENTDETAILATTACHMENT = 18;

  private static final int LAYOUT_FRAGMENTDETAILATTENDANCE = 19;

  private static final int LAYOUT_FRAGMENTDETAILATTENDANCEATSTORE = 20;

  private static final int LAYOUT_FRAGMENTDETAILCUSTOMER = 21;

  private static final int LAYOUT_FRAGMENTDETAILGROUPSTORE = 22;

  private static final int LAYOUT_FRAGMENTDETAILGROUPUSER = 23;

  private static final int LAYOUT_FRAGMENTDETAILMANAGEMENTJOB = 24;

  private static final int LAYOUT_FRAGMENTDETAILNOTIFICATION = 25;

  private static final int LAYOUT_FRAGMENTDETAILPICJOB = 26;

  private static final int LAYOUT_FRAGMENTDETAILPROJECT = 27;

  private static final int LAYOUT_FRAGMENTDETAILREPORTCOMPETITORATSTORE = 28;

  private static final int LAYOUT_FRAGMENTDETAILREPORTSALESATSTORE = 29;

  private static final int LAYOUT_FRAGMENTDETAILREPORTTRACKINGATSTORE = 30;

  private static final int LAYOUT_FRAGMENTDETAILSTORE = 31;

  private static final int LAYOUT_FRAGMENTDETAILTASK = 32;

  private static final int LAYOUT_FRAGMENTDETAILTASKATTENDANCE = 33;

  private static final int LAYOUT_FRAGMENTDETAILUPDATESTATUSATSTORE = 34;

  private static final int LAYOUT_FRAGMENTDETAILUSER = 35;

  private static final int LAYOUT_FRAGMENTEXPORTGIFT = 36;

  private static final int LAYOUT_FRAGMENTFILTERJOB = 37;

  private static final int LAYOUT_FRAGMENTFORGOT = 38;

  private static final int LAYOUT_FRAGMENTHOME = 39;

  private static final int LAYOUT_FRAGMENTHOMECONTAINER = 40;

  private static final int LAYOUT_FRAGMENTIMPORTGIFT = 41;

  private static final int LAYOUT_FRAGMENTINFO = 42;

  private static final int LAYOUT_FRAGMENTINPUTBILL = 43;

  private static final int LAYOUT_FRAGMENTINPUTNAME = 44;

  private static final int LAYOUT_FRAGMENTJOB = 45;

  private static final int LAYOUT_FRAGMENTJOBCONTAINER = 46;

  private static final int LAYOUT_FRAGMENTJOBPROJECT = 47;

  private static final int LAYOUT_FRAGMENTLISTATTENDANCEATSTORE = 48;

  private static final int LAYOUT_FRAGMENTLISTATTRIBUTES = 49;

  private static final int LAYOUT_FRAGMENTLISTEMPLOYEE = 50;

  private static final int LAYOUT_FRAGMENTLISTGROUP = 51;

  private static final int LAYOUT_FRAGMENTLISTGROUPEMPLOYEE = 52;

  private static final int LAYOUT_FRAGMENTLISTIMAGE = 53;

  private static final int LAYOUT_FRAGMENTLISTJOBREQUEST = 54;

  private static final int LAYOUT_FRAGMENTLISTMANAGEMENTAPPLICATIONS = 55;

  private static final int LAYOUT_FRAGMENTLISTMYJOB = 56;

  private static final int LAYOUT_FRAGMENTLISTPICAPPLICATIONS = 57;

  private static final int LAYOUT_FRAGMENTLISTPICNOTIFICATION = 58;

  private static final int LAYOUT_FRAGMENTLISTPRODUCT = 59;

  private static final int LAYOUT_FRAGMENTLISTPROJECT = 60;

  private static final int LAYOUT_FRAGMENTLISTREPORTCOMPETITORATSTORE = 61;

  private static final int LAYOUT_FRAGMENTLISTREPORTSALESATSTORE = 62;

  private static final int LAYOUT_FRAGMENTLISTREPORTTRACKINGATSTORE = 63;

  private static final int LAYOUT_FRAGMENTLISTSTORE = 64;

  private static final int LAYOUT_FRAGMENTLISTUPDATESTATUSATSTORE = 65;

  private static final int LAYOUT_FRAGMENTLOADMOREREFRESH = 66;

  private static final int LAYOUT_FRAGMENTLOADMOREREFRESHTOOLBAR = 67;

  private static final int LAYOUT_FRAGMENTLOGIN = 68;

  private static final int LAYOUT_FRAGMENTMAIN = 69;

  private static final int LAYOUT_FRAGMENTMANAGEAPPLICATION = 70;

  private static final int LAYOUT_FRAGMENTMANAGEATTENDANCE = 71;

  private static final int LAYOUT_FRAGMENTMANAGEEMPLOYEE = 72;

  private static final int LAYOUT_FRAGMENTMANAGENOTIFICATION = 73;

  private static final int LAYOUT_FRAGMENTMANAGEPROJECT = 74;

  private static final int LAYOUT_FRAGMENTMANAGEREPORTCOMPETITOR = 75;

  private static final int LAYOUT_FRAGMENTMANAGEREPORTSALES = 76;

  private static final int LAYOUT_FRAGMENTMANAGEREPORTTRACKING = 77;

  private static final int LAYOUT_FRAGMENTMANAGESTORE = 78;

  private static final int LAYOUT_FRAGMENTMANAGEUPDATESTATUS = 79;

  private static final int LAYOUT_FRAGMENTMEMBERGROUPUSER = 80;

  private static final int LAYOUT_FRAGMENTMEMBERPROJECT = 81;

  private static final int LAYOUT_FRAGMENTMONITOR = 82;

  private static final int LAYOUT_FRAGMENTNOTIFICATION = 83;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONCONTAINER = 84;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONSENT = 85;

  private static final int LAYOUT_FRAGMENTPRIVACY = 86;

  private static final int LAYOUT_FRAGMENTPROFILE = 87;

  private static final int LAYOUT_FRAGMENTPROFILECONTAINER = 88;

  private static final int LAYOUT_FRAGMENTPROJECTINPROGRESS = 89;

  private static final int LAYOUT_FRAGMENTREGISTER = 90;

  private static final int LAYOUT_FRAGMENTREPORT = 91;

  private static final int LAYOUT_FRAGMENTREPORTCOMPETITOR = 92;

  private static final int LAYOUT_FRAGMENTREPORTENDSHIFT = 93;

  private static final int LAYOUT_FRAGMENTREPORTPROJECT = 94;

  private static final int LAYOUT_FRAGMENTREPORTSALES = 95;

  private static final int LAYOUT_FRAGMENTREPORTTIME = 96;

  private static final int LAYOUT_FRAGMENTREPORTUPDATESTATUS = 97;

  private static final int LAYOUT_FRAGMENTREQUIRELOGIN = 98;

  private static final int LAYOUT_FRAGMENTRESETPASSWORD = 99;

  private static final int LAYOUT_FRAGMENTSELECTPROJECT = 100;

  private static final int LAYOUT_FRAGMENTSELECTPROMOTION = 101;

  private static final int LAYOUT_FRAGMENTSPLASH = 102;

  private static final int LAYOUT_FRAGMENTSTOREPROJECT = 103;

  private static final int LAYOUT_FRAGMENTTERM = 104;

  private static final int LAYOUT_FRAGMENTVERIFYOTP = 105;

  private static final int LAYOUT_FRAGMENTVERIFYOTPSTEP2 = 106;

  private static final int LAYOUT_ITEMADDMEMBERTOPROJECT = 107;

  private static final int LAYOUT_ITEMATTENDANCE = 108;

  private static final int LAYOUT_ITEMDETAILGROUP = 109;

  private static final int LAYOUT_ITEMFILTERSTORE = 110;

  private static final int LAYOUT_ITEMGROUPSTORE = 111;

  private static final int LAYOUT_ITEMGROUPUSER = 112;

  private static final int LAYOUT_ITEMMANAGEMENTAPPLICATION = 113;

  private static final int LAYOUT_ITEMMANAGEMENTTASK = 114;

  private static final int LAYOUT_ITEMMEMBER = 115;

  private static final int LAYOUT_ITEMMEMBERREQUEST = 116;

  private static final int LAYOUT_ITEMNOTIFICATION = 117;

  private static final int LAYOUT_ITEMORDER = 118;

  private static final int LAYOUT_ITEMPICAPPLICATION = 119;

  private static final int LAYOUT_ITEMPROJECT = 120;

  private static final int LAYOUT_ITEMSELECTPRODUCT = 121;

  private static final int LAYOUT_ITEMSELECTSTORE = 122;

  private static final int LAYOUT_ITEMSELECTUSER = 123;

  private static final int LAYOUT_ITEMSTORE = 124;

  private static final int LAYOUT_ITEMSTOREGROUPSTORE = 125;

  private static final int LAYOUT_ITEMSWITCHSHIFTREQUEST = 126;

  private static final int LAYOUT_ITEMTODAYJOB = 127;

  private static final int LAYOUT_ITEMUSER = 128;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(128);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.dialog_pick_photo, LAYOUT_DIALOGPICKPHOTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_add_customer, LAYOUT_FRAGMENTADDCUSTOMER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_add_member_project, LAYOUT_FRAGMENTADDMEMBERPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_add_order, LAYOUT_FRAGMENTADDORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_add_report, LAYOUT_FRAGMENTADDREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_application, LAYOUT_FRAGMENTAPPLICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_application_approved, LAYOUT_FRAGMENTAPPLICATIONAPPROVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_attendance, LAYOUT_FRAGMENTATTENDANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_avatar, LAYOUT_FRAGMENTAVATAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_bank, LAYOUT_FRAGMENTBANK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_calendar, LAYOUT_FRAGMENTCALENDAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_change_gift, LAYOUT_FRAGMENTCHANGEGIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_create_application, LAYOUT_FRAGMENTCREATEAPPLICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_create_job, LAYOUT_FRAGMENTCREATEJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_create_task, LAYOUT_FRAGMENTCREATETASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_attachment, LAYOUT_FRAGMENTDETAILATTACHMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_attendance, LAYOUT_FRAGMENTDETAILATTENDANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_attendance_at_store, LAYOUT_FRAGMENTDETAILATTENDANCEATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_customer, LAYOUT_FRAGMENTDETAILCUSTOMER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_group_store, LAYOUT_FRAGMENTDETAILGROUPSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_group_user, LAYOUT_FRAGMENTDETAILGROUPUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_management_job, LAYOUT_FRAGMENTDETAILMANAGEMENTJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_notification, LAYOUT_FRAGMENTDETAILNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_pic_job, LAYOUT_FRAGMENTDETAILPICJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_project, LAYOUT_FRAGMENTDETAILPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_report_competitor_at_store, LAYOUT_FRAGMENTDETAILREPORTCOMPETITORATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_report_sales_at_store, LAYOUT_FRAGMENTDETAILREPORTSALESATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_report_tracking_at_store, LAYOUT_FRAGMENTDETAILREPORTTRACKINGATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_store, LAYOUT_FRAGMENTDETAILSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_task, LAYOUT_FRAGMENTDETAILTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_task_attendance, LAYOUT_FRAGMENTDETAILTASKATTENDANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_update_status_at_store, LAYOUT_FRAGMENTDETAILUPDATESTATUSATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_detail_user, LAYOUT_FRAGMENTDETAILUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_export_gift, LAYOUT_FRAGMENTEXPORTGIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_filter_job, LAYOUT_FRAGMENTFILTERJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_forgot, LAYOUT_FRAGMENTFORGOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_home_container, LAYOUT_FRAGMENTHOMECONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_import_gift, LAYOUT_FRAGMENTIMPORTGIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_info, LAYOUT_FRAGMENTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_input_bill, LAYOUT_FRAGMENTINPUTBILL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_input_name, LAYOUT_FRAGMENTINPUTNAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_job, LAYOUT_FRAGMENTJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_job_container, LAYOUT_FRAGMENTJOBCONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_job_project, LAYOUT_FRAGMENTJOBPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_attendance_at_store, LAYOUT_FRAGMENTLISTATTENDANCEATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_attributes, LAYOUT_FRAGMENTLISTATTRIBUTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_employee, LAYOUT_FRAGMENTLISTEMPLOYEE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_group, LAYOUT_FRAGMENTLISTGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_group_employee, LAYOUT_FRAGMENTLISTGROUPEMPLOYEE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_image, LAYOUT_FRAGMENTLISTIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_job_request, LAYOUT_FRAGMENTLISTJOBREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_management_applications, LAYOUT_FRAGMENTLISTMANAGEMENTAPPLICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_my_job, LAYOUT_FRAGMENTLISTMYJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_pic_applications, LAYOUT_FRAGMENTLISTPICAPPLICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_pic_notification, LAYOUT_FRAGMENTLISTPICNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_product, LAYOUT_FRAGMENTLISTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_project, LAYOUT_FRAGMENTLISTPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_report_competitor_at_store, LAYOUT_FRAGMENTLISTREPORTCOMPETITORATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_report_sales_at_store, LAYOUT_FRAGMENTLISTREPORTSALESATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_report_tracking_at_store, LAYOUT_FRAGMENTLISTREPORTTRACKINGATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_store, LAYOUT_FRAGMENTLISTSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_list_update_status_at_store, LAYOUT_FRAGMENTLISTUPDATESTATUSATSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_loadmore_refresh, LAYOUT_FRAGMENTLOADMOREREFRESH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_loadmore_refresh_toolbar, LAYOUT_FRAGMENTLOADMOREREFRESHTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_application, LAYOUT_FRAGMENTMANAGEAPPLICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_attendance, LAYOUT_FRAGMENTMANAGEATTENDANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_employee, LAYOUT_FRAGMENTMANAGEEMPLOYEE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_notification, LAYOUT_FRAGMENTMANAGENOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_project, LAYOUT_FRAGMENTMANAGEPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_report_competitor, LAYOUT_FRAGMENTMANAGEREPORTCOMPETITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_report_sales, LAYOUT_FRAGMENTMANAGEREPORTSALES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_report_tracking, LAYOUT_FRAGMENTMANAGEREPORTTRACKING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_store, LAYOUT_FRAGMENTMANAGESTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_manage_update_status, LAYOUT_FRAGMENTMANAGEUPDATESTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_member_group_user, LAYOUT_FRAGMENTMEMBERGROUPUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_member_project, LAYOUT_FRAGMENTMEMBERPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_monitor, LAYOUT_FRAGMENTMONITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_notification, LAYOUT_FRAGMENTNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_notification_container, LAYOUT_FRAGMENTNOTIFICATIONCONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_notification_sent, LAYOUT_FRAGMENTNOTIFICATIONSENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_privacy, LAYOUT_FRAGMENTPRIVACY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_profile_container, LAYOUT_FRAGMENTPROFILECONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_project_in_progress, LAYOUT_FRAGMENTPROJECTINPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_report, LAYOUT_FRAGMENTREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_report_competitor, LAYOUT_FRAGMENTREPORTCOMPETITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_report_endshift, LAYOUT_FRAGMENTREPORTENDSHIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_report_project, LAYOUT_FRAGMENTREPORTPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_report_sales, LAYOUT_FRAGMENTREPORTSALES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_report_time, LAYOUT_FRAGMENTREPORTTIME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_report_update_status, LAYOUT_FRAGMENTREPORTUPDATESTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_require_login, LAYOUT_FRAGMENTREQUIRELOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_reset_password, LAYOUT_FRAGMENTRESETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_select_project, LAYOUT_FRAGMENTSELECTPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_select_promotion, LAYOUT_FRAGMENTSELECTPROMOTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_store_project, LAYOUT_FRAGMENTSTOREPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_term, LAYOUT_FRAGMENTTERM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_verify_otp, LAYOUT_FRAGMENTVERIFYOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.fragment_verify_otp_step2, LAYOUT_FRAGMENTVERIFYOTPSTEP2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_add_member_to_project, LAYOUT_ITEMADDMEMBERTOPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_attendance, LAYOUT_ITEMATTENDANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_detail_group, LAYOUT_ITEMDETAILGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_filter_store, LAYOUT_ITEMFILTERSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_group_store, LAYOUT_ITEMGROUPSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_group_user, LAYOUT_ITEMGROUPUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_management_application, LAYOUT_ITEMMANAGEMENTAPPLICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_management_task, LAYOUT_ITEMMANAGEMENTTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_member, LAYOUT_ITEMMEMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_member_request, LAYOUT_ITEMMEMBERREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_notification, LAYOUT_ITEMNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_order, LAYOUT_ITEMORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_pic_application, LAYOUT_ITEMPICAPPLICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_project, LAYOUT_ITEMPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_select_product, LAYOUT_ITEMSELECTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_select_store, LAYOUT_ITEMSELECTSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_select_user, LAYOUT_ITEMSELECTUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_store, LAYOUT_ITEMSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_store_group_store, LAYOUT_ITEMSTOREGROUPSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_switch_shift_request, LAYOUT_ITEMSWITCHSHIFTREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_today_job, LAYOUT_ITEMTODAYJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crayon.fieldapp.R.layout.item_user, LAYOUT_ITEMUSER);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGPICKPHOTO: {
        if ("layout/dialog_pick_photo_0".equals(tag)) {
          return new DialogPickPhotoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_pick_photo is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDCUSTOMER: {
        if ("layout/fragment_add_customer_0".equals(tag)) {
          return new FragmentAddCustomerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_customer is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDMEMBERPROJECT: {
        if ("layout/fragment_add_member_project_0".equals(tag)) {
          return new FragmentAddMemberProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_member_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDORDER: {
        if ("layout/fragment_add_order_0".equals(tag)) {
          return new FragmentAddOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_order is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDREPORT: {
        if ("layout/fragment_add_report_0".equals(tag)) {
          return new FragmentAddReportBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_report is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTAPPLICATION: {
        if ("layout/fragment_application_0".equals(tag)) {
          return new FragmentApplicationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_application is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTAPPLICATIONAPPROVED: {
        if ("layout/fragment_application_approved_0".equals(tag)) {
          return new FragmentApplicationApprovedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_application_approved is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTATTENDANCE: {
        if ("layout/fragment_attendance_0".equals(tag)) {
          return new FragmentAttendanceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_attendance is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTAVATAR: {
        if ("layout/fragment_avatar_0".equals(tag)) {
          return new FragmentAvatarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_avatar is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBANK: {
        if ("layout/fragment_bank_0".equals(tag)) {
          return new FragmentBankBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bank is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCALENDAR: {
        if ("layout/fragment_calendar_0".equals(tag)) {
          return new FragmentCalendarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_calendar is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHANGEGIFT: {
        if ("layout/fragment_change_gift_0".equals(tag)) {
          return new FragmentChangeGiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_change_gift is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONTACT: {
        if ("layout/fragment_contact_0".equals(tag)) {
          return new FragmentContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCREATEAPPLICATION: {
        if ("layout/fragment_create_application_0".equals(tag)) {
          return new FragmentCreateApplicationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_create_application is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCREATEJOB: {
        if ("layout/fragment_create_job_0".equals(tag)) {
          return new FragmentCreateJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_create_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCREATETASK: {
        if ("layout/fragment_create_task_0".equals(tag)) {
          return new FragmentCreateTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_create_task is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILATTACHMENT: {
        if ("layout/fragment_detail_attachment_0".equals(tag)) {
          return new FragmentDetailAttachmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_attachment is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILATTENDANCE: {
        if ("layout/fragment_detail_attendance_0".equals(tag)) {
          return new FragmentDetailAttendanceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_attendance is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILATTENDANCEATSTORE: {
        if ("layout/fragment_detail_attendance_at_store_0".equals(tag)) {
          return new FragmentDetailAttendanceAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_attendance_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILCUSTOMER: {
        if ("layout/fragment_detail_customer_0".equals(tag)) {
          return new FragmentDetailCustomerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_customer is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILGROUPSTORE: {
        if ("layout/fragment_detail_group_store_0".equals(tag)) {
          return new FragmentDetailGroupStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_group_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILGROUPUSER: {
        if ("layout/fragment_detail_group_user_0".equals(tag)) {
          return new FragmentDetailGroupUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_group_user is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILMANAGEMENTJOB: {
        if ("layout/fragment_detail_management_job_0".equals(tag)) {
          return new FragmentDetailManagementJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_management_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILNOTIFICATION: {
        if ("layout/fragment_detail_notification_0".equals(tag)) {
          return new FragmentDetailNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILPICJOB: {
        if ("layout/fragment_detail_pic_job_0".equals(tag)) {
          return new FragmentDetailPicJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_pic_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILPROJECT: {
        if ("layout/fragment_detail_project_0".equals(tag)) {
          return new FragmentDetailProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILREPORTCOMPETITORATSTORE: {
        if ("layout/fragment_detail_report_competitor_at_store_0".equals(tag)) {
          return new FragmentDetailReportCompetitorAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_report_competitor_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILREPORTSALESATSTORE: {
        if ("layout/fragment_detail_report_sales_at_store_0".equals(tag)) {
          return new FragmentDetailReportSalesAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_report_sales_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILREPORTTRACKINGATSTORE: {
        if ("layout/fragment_detail_report_tracking_at_store_0".equals(tag)) {
          return new FragmentDetailReportTrackingAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_report_tracking_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILSTORE: {
        if ("layout/fragment_detail_store_0".equals(tag)) {
          return new FragmentDetailStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILTASK: {
        if ("layout/fragment_detail_task_0".equals(tag)) {
          return new FragmentDetailTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_task is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILTASKATTENDANCE: {
        if ("layout/fragment_detail_task_attendance_0".equals(tag)) {
          return new FragmentDetailTaskAttendanceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_task_attendance is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILUPDATESTATUSATSTORE: {
        if ("layout/fragment_detail_update_status_at_store_0".equals(tag)) {
          return new FragmentDetailUpdateStatusAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_update_status_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILUSER: {
        if ("layout/fragment_detail_user_0".equals(tag)) {
          return new FragmentDetailUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_user is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEXPORTGIFT: {
        if ("layout/fragment_export_gift_0".equals(tag)) {
          return new FragmentExportGiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_export_gift is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFILTERJOB: {
        if ("layout/fragment_filter_job_0".equals(tag)) {
          return new FragmentFilterJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_filter_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGOT: {
        if ("layout/fragment_forgot_0".equals(tag)) {
          return new FragmentForgotBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forgot is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOMECONTAINER: {
        if ("layout/fragment_home_container_0".equals(tag)) {
          return new FragmentHomeContainerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home_container is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTIMPORTGIFT: {
        if ("layout/fragment_import_gift_0".equals(tag)) {
          return new FragmentImportGiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_import_gift is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTINFO: {
        if ("layout/fragment_info_0".equals(tag)) {
          return new FragmentInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_info is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTINPUTBILL: {
        if ("layout/fragment_input_bill_0".equals(tag)) {
          return new FragmentInputBillBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_input_bill is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTINPUTNAME: {
        if ("layout/fragment_input_name_0".equals(tag)) {
          return new FragmentInputNameBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_input_name is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTJOB: {
        if ("layout/fragment_job_0".equals(tag)) {
          return new FragmentJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTJOBCONTAINER: {
        if ("layout/fragment_job_container_0".equals(tag)) {
          return new FragmentJobContainerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_job_container is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTJOBPROJECT: {
        if ("layout/fragment_job_project_0".equals(tag)) {
          return new FragmentJobProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_job_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTATTENDANCEATSTORE: {
        if ("layout/fragment_list_attendance_at_store_0".equals(tag)) {
          return new FragmentListAttendanceAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_attendance_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTATTRIBUTES: {
        if ("layout/fragment_list_attributes_0".equals(tag)) {
          return new FragmentListAttributesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_attributes is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTEMPLOYEE: {
        if ("layout/fragment_list_employee_0".equals(tag)) {
          return new FragmentListEmployeeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_employee is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_FRAGMENTLISTGROUP: {
        if ("layout/fragment_list_group_0".equals(tag)) {
          return new FragmentListGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_group is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTGROUPEMPLOYEE: {
        if ("layout/fragment_list_group_employee_0".equals(tag)) {
          return new FragmentListGroupEmployeeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_group_employee is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTIMAGE: {
        if ("layout/fragment_list_image_0".equals(tag)) {
          return new FragmentListImageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_image is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTJOBREQUEST: {
        if ("layout/fragment_list_job_request_0".equals(tag)) {
          return new FragmentListJobRequestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_job_request is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTMANAGEMENTAPPLICATIONS: {
        if ("layout/fragment_list_management_applications_0".equals(tag)) {
          return new FragmentListManagementApplicationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_management_applications is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTMYJOB: {
        if ("layout/fragment_list_my_job_0".equals(tag)) {
          return new FragmentListMyJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_my_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTPICAPPLICATIONS: {
        if ("layout/fragment_list_pic_applications_0".equals(tag)) {
          return new FragmentListPicApplicationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_pic_applications is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTPICNOTIFICATION: {
        if ("layout/fragment_list_pic_notification_0".equals(tag)) {
          return new FragmentListPicNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_pic_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTPRODUCT: {
        if ("layout/fragment_list_product_0".equals(tag)) {
          return new FragmentListProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_product is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTPROJECT: {
        if ("layout/fragment_list_project_0".equals(tag)) {
          return new FragmentListProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTREPORTCOMPETITORATSTORE: {
        if ("layout/fragment_list_report_competitor_at_store_0".equals(tag)) {
          return new FragmentListReportCompetitorAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_report_competitor_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTREPORTSALESATSTORE: {
        if ("layout/fragment_list_report_sales_at_store_0".equals(tag)) {
          return new FragmentListReportSalesAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_report_sales_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTREPORTTRACKINGATSTORE: {
        if ("layout/fragment_list_report_tracking_at_store_0".equals(tag)) {
          return new FragmentListReportTrackingAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_report_tracking_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTSTORE: {
        if ("layout/fragment_list_store_0".equals(tag)) {
          return new FragmentListStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTUPDATESTATUSATSTORE: {
        if ("layout/fragment_list_update_status_at_store_0".equals(tag)) {
          return new FragmentListUpdateStatusAtStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_update_status_at_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOADMOREREFRESH: {
        if ("layout/fragment_loadmore_refresh_0".equals(tag)) {
          return new FragmentLoadmoreRefreshBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_loadmore_refresh is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOADMOREREFRESHTOOLBAR: {
        if ("layout/fragment_loadmore_refresh_toolbar_0".equals(tag)) {
          return new FragmentLoadmoreRefreshToolbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_loadmore_refresh_toolbar is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGIN: {
        if ("layout/fragment_login_0".equals(tag)) {
          return new FragmentLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMAIN: {
        if ("layout/fragment_main_0".equals(tag)) {
          return new FragmentMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEAPPLICATION: {
        if ("layout/fragment_manage_application_0".equals(tag)) {
          return new FragmentManageApplicationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_application is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEATTENDANCE: {
        if ("layout/fragment_manage_attendance_0".equals(tag)) {
          return new FragmentManageAttendanceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_attendance is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEEMPLOYEE: {
        if ("layout/fragment_manage_employee_0".equals(tag)) {
          return new FragmentManageEmployeeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_employee is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGENOTIFICATION: {
        if ("layout/fragment_manage_notification_0".equals(tag)) {
          return new FragmentManageNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEPROJECT: {
        if ("layout/fragment_manage_project_0".equals(tag)) {
          return new FragmentManageProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEREPORTCOMPETITOR: {
        if ("layout/fragment_manage_report_competitor_0".equals(tag)) {
          return new FragmentManageReportCompetitorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_report_competitor is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEREPORTSALES: {
        if ("layout/fragment_manage_report_sales_0".equals(tag)) {
          return new FragmentManageReportSalesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_report_sales is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEREPORTTRACKING: {
        if ("layout/fragment_manage_report_tracking_0".equals(tag)) {
          return new FragmentManageReportTrackingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_report_tracking is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGESTORE: {
        if ("layout/fragment_manage_store_0".equals(tag)) {
          return new FragmentManageStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_store is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMANAGEUPDATESTATUS: {
        if ("layout/fragment_manage_update_status_0".equals(tag)) {
          return new FragmentManageUpdateStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_manage_update_status is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMEMBERGROUPUSER: {
        if ("layout/fragment_member_group_user_0".equals(tag)) {
          return new FragmentMemberGroupUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_member_group_user is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMEMBERPROJECT: {
        if ("layout/fragment_member_project_0".equals(tag)) {
          return new FragmentMemberProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_member_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMONITOR: {
        if ("layout/fragment_monitor_0".equals(tag)) {
          return new FragmentMonitorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_monitor is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNOTIFICATION: {
        if ("layout/fragment_notification_0".equals(tag)) {
          return new FragmentNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNOTIFICATIONCONTAINER: {
        if ("layout/fragment_notification_container_0".equals(tag)) {
          return new FragmentNotificationContainerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_notification_container is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNOTIFICATIONSENT: {
        if ("layout/fragment_notification_sent_0".equals(tag)) {
          return new FragmentNotificationSentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_notification_sent is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPRIVACY: {
        if ("layout/fragment_privacy_0".equals(tag)) {
          return new FragmentPrivacyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_privacy is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILECONTAINER: {
        if ("layout/fragment_profile_container_0".equals(tag)) {
          return new FragmentProfileContainerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile_container is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROJECTINPROGRESS: {
        if ("layout/fragment_project_in_progress_0".equals(tag)) {
          return new FragmentProjectInProgressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_project_in_progress is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTER: {
        if ("layout/fragment_register_0".equals(tag)) {
          return new FragmentRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORT: {
        if ("layout/fragment_report_0".equals(tag)) {
          return new FragmentReportBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTCOMPETITOR: {
        if ("layout/fragment_report_competitor_0".equals(tag)) {
          return new FragmentReportCompetitorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_competitor is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTENDSHIFT: {
        if ("layout/fragment_report_endshift_0".equals(tag)) {
          return new FragmentReportEndshiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_endshift is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTPROJECT: {
        if ("layout/fragment_report_project_0".equals(tag)) {
          return new FragmentReportProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTSALES: {
        if ("layout/fragment_report_sales_0".equals(tag)) {
          return new FragmentReportSalesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_sales is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTTIME: {
        if ("layout/fragment_report_time_0".equals(tag)) {
          return new FragmentReportTimeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_time is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORTUPDATESTATUS: {
        if ("layout/fragment_report_update_status_0".equals(tag)) {
          return new FragmentReportUpdateStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report_update_status is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREQUIRELOGIN: {
        if ("layout/fragment_require_login_0".equals(tag)) {
          return new FragmentRequireLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_require_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTRESETPASSWORD: {
        if ("layout/fragment_reset_password_0".equals(tag)) {
          return new FragmentResetPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_reset_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSELECTPROJECT: {
        if ("layout/fragment_select_project_0".equals(tag)) {
          return new FragmentSelectProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_select_project is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_FRAGMENTSELECTPROMOTION: {
        if ("layout/fragment_select_promotion_0".equals(tag)) {
          return new FragmentSelectPromotionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_select_promotion is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSPLASH: {
        if ("layout/fragment_splash_0".equals(tag)) {
          return new FragmentSplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTOREPROJECT: {
        if ("layout/fragment_store_project_0".equals(tag)) {
          return new FragmentStoreProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_store_project is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTERM: {
        if ("layout/fragment_term_0".equals(tag)) {
          return new FragmentTermBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_term is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTVERIFYOTP: {
        if ("layout/fragment_verify_otp_0".equals(tag)) {
          return new FragmentVerifyOtpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_verify_otp is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTVERIFYOTPSTEP2: {
        if ("layout/fragment_verify_otp_step2_0".equals(tag)) {
          return new FragmentVerifyOtpStep2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_verify_otp_step2 is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMADDMEMBERTOPROJECT: {
        if ("layout/item_add_member_to_project_0".equals(tag)) {
          return new ItemAddMemberToProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_add_member_to_project is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMATTENDANCE: {
        if ("layout/item_attendance_0".equals(tag)) {
          return new ItemAttendanceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_attendance is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDETAILGROUP: {
        if ("layout/item_detail_group_0".equals(tag)) {
          return new ItemDetailGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_detail_group is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFILTERSTORE: {
        if ("layout/item_filter_store_0".equals(tag)) {
          return new ItemFilterStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_filter_store is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMGROUPSTORE: {
        if ("layout/item_group_store_0".equals(tag)) {
          return new ItemGroupStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_group_store is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMGROUPUSER: {
        if ("layout/item_group_user_0".equals(tag)) {
          return new ItemGroupUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_group_user is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMANAGEMENTAPPLICATION: {
        if ("layout/item_management_application_0".equals(tag)) {
          return new ItemManagementApplicationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_management_application is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMANAGEMENTTASK: {
        if ("layout/item_management_task_0".equals(tag)) {
          return new ItemManagementTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_management_task is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMEMBER: {
        if ("layout/item_member_0".equals(tag)) {
          return new ItemMemberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_member is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMEMBERREQUEST: {
        if ("layout/item_member_request_0".equals(tag)) {
          return new ItemMemberRequestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_member_request is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNOTIFICATION: {
        if ("layout/item_notification_0".equals(tag)) {
          return new ItemNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMORDER: {
        if ("layout/item_order_0".equals(tag)) {
          return new ItemOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_order is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPICAPPLICATION: {
        if ("layout/item_pic_application_0".equals(tag)) {
          return new ItemPicApplicationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_pic_application is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPROJECT: {
        if ("layout/item_project_0".equals(tag)) {
          return new ItemProjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_project is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSELECTPRODUCT: {
        if ("layout/item_select_product_0".equals(tag)) {
          return new ItemSelectProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_select_product is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSELECTSTORE: {
        if ("layout/item_select_store_0".equals(tag)) {
          return new ItemSelectStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_select_store is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSELECTUSER: {
        if ("layout/item_select_user_0".equals(tag)) {
          return new ItemSelectUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_select_user is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTORE: {
        if ("layout/item_store_0".equals(tag)) {
          return new ItemStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_store is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTOREGROUPSTORE: {
        if ("layout/item_store_group_store_0".equals(tag)) {
          return new ItemStoreGroupStoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_store_group_store is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSWITCHSHIFTREQUEST: {
        if ("layout/item_switch_shift_request_0".equals(tag)) {
          return new ItemSwitchShiftRequestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_switch_shift_request is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTODAYJOB: {
        if ("layout/item_today_job_0".equals(tag)) {
          return new ItemTodayJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_today_job is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMUSER: {
        if ("layout/item_user_0".equals(tag)) {
          return new ItemUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_user is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
        case 2: {
          return internalGetViewDataBinding2(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(128);

    static {
      sKeys.put("layout/activity_main_0", com.crayon.fieldapp.R.layout.activity_main);
      sKeys.put("layout/dialog_pick_photo_0", com.crayon.fieldapp.R.layout.dialog_pick_photo);
      sKeys.put("layout/fragment_add_customer_0", com.crayon.fieldapp.R.layout.fragment_add_customer);
      sKeys.put("layout/fragment_add_member_project_0", com.crayon.fieldapp.R.layout.fragment_add_member_project);
      sKeys.put("layout/fragment_add_order_0", com.crayon.fieldapp.R.layout.fragment_add_order);
      sKeys.put("layout/fragment_add_report_0", com.crayon.fieldapp.R.layout.fragment_add_report);
      sKeys.put("layout/fragment_application_0", com.crayon.fieldapp.R.layout.fragment_application);
      sKeys.put("layout/fragment_application_approved_0", com.crayon.fieldapp.R.layout.fragment_application_approved);
      sKeys.put("layout/fragment_attendance_0", com.crayon.fieldapp.R.layout.fragment_attendance);
      sKeys.put("layout/fragment_avatar_0", com.crayon.fieldapp.R.layout.fragment_avatar);
      sKeys.put("layout/fragment_bank_0", com.crayon.fieldapp.R.layout.fragment_bank);
      sKeys.put("layout/fragment_calendar_0", com.crayon.fieldapp.R.layout.fragment_calendar);
      sKeys.put("layout/fragment_change_gift_0", com.crayon.fieldapp.R.layout.fragment_change_gift);
      sKeys.put("layout/fragment_contact_0", com.crayon.fieldapp.R.layout.fragment_contact);
      sKeys.put("layout/fragment_create_application_0", com.crayon.fieldapp.R.layout.fragment_create_application);
      sKeys.put("layout/fragment_create_job_0", com.crayon.fieldapp.R.layout.fragment_create_job);
      sKeys.put("layout/fragment_create_task_0", com.crayon.fieldapp.R.layout.fragment_create_task);
      sKeys.put("layout/fragment_detail_attachment_0", com.crayon.fieldapp.R.layout.fragment_detail_attachment);
      sKeys.put("layout/fragment_detail_attendance_0", com.crayon.fieldapp.R.layout.fragment_detail_attendance);
      sKeys.put("layout/fragment_detail_attendance_at_store_0", com.crayon.fieldapp.R.layout.fragment_detail_attendance_at_store);
      sKeys.put("layout/fragment_detail_customer_0", com.crayon.fieldapp.R.layout.fragment_detail_customer);
      sKeys.put("layout/fragment_detail_group_store_0", com.crayon.fieldapp.R.layout.fragment_detail_group_store);
      sKeys.put("layout/fragment_detail_group_user_0", com.crayon.fieldapp.R.layout.fragment_detail_group_user);
      sKeys.put("layout/fragment_detail_management_job_0", com.crayon.fieldapp.R.layout.fragment_detail_management_job);
      sKeys.put("layout/fragment_detail_notification_0", com.crayon.fieldapp.R.layout.fragment_detail_notification);
      sKeys.put("layout/fragment_detail_pic_job_0", com.crayon.fieldapp.R.layout.fragment_detail_pic_job);
      sKeys.put("layout/fragment_detail_project_0", com.crayon.fieldapp.R.layout.fragment_detail_project);
      sKeys.put("layout/fragment_detail_report_competitor_at_store_0", com.crayon.fieldapp.R.layout.fragment_detail_report_competitor_at_store);
      sKeys.put("layout/fragment_detail_report_sales_at_store_0", com.crayon.fieldapp.R.layout.fragment_detail_report_sales_at_store);
      sKeys.put("layout/fragment_detail_report_tracking_at_store_0", com.crayon.fieldapp.R.layout.fragment_detail_report_tracking_at_store);
      sKeys.put("layout/fragment_detail_store_0", com.crayon.fieldapp.R.layout.fragment_detail_store);
      sKeys.put("layout/fragment_detail_task_0", com.crayon.fieldapp.R.layout.fragment_detail_task);
      sKeys.put("layout/fragment_detail_task_attendance_0", com.crayon.fieldapp.R.layout.fragment_detail_task_attendance);
      sKeys.put("layout/fragment_detail_update_status_at_store_0", com.crayon.fieldapp.R.layout.fragment_detail_update_status_at_store);
      sKeys.put("layout/fragment_detail_user_0", com.crayon.fieldapp.R.layout.fragment_detail_user);
      sKeys.put("layout/fragment_export_gift_0", com.crayon.fieldapp.R.layout.fragment_export_gift);
      sKeys.put("layout/fragment_filter_job_0", com.crayon.fieldapp.R.layout.fragment_filter_job);
      sKeys.put("layout/fragment_forgot_0", com.crayon.fieldapp.R.layout.fragment_forgot);
      sKeys.put("layout/fragment_home_0", com.crayon.fieldapp.R.layout.fragment_home);
      sKeys.put("layout/fragment_home_container_0", com.crayon.fieldapp.R.layout.fragment_home_container);
      sKeys.put("layout/fragment_import_gift_0", com.crayon.fieldapp.R.layout.fragment_import_gift);
      sKeys.put("layout/fragment_info_0", com.crayon.fieldapp.R.layout.fragment_info);
      sKeys.put("layout/fragment_input_bill_0", com.crayon.fieldapp.R.layout.fragment_input_bill);
      sKeys.put("layout/fragment_input_name_0", com.crayon.fieldapp.R.layout.fragment_input_name);
      sKeys.put("layout/fragment_job_0", com.crayon.fieldapp.R.layout.fragment_job);
      sKeys.put("layout/fragment_job_container_0", com.crayon.fieldapp.R.layout.fragment_job_container);
      sKeys.put("layout/fragment_job_project_0", com.crayon.fieldapp.R.layout.fragment_job_project);
      sKeys.put("layout/fragment_list_attendance_at_store_0", com.crayon.fieldapp.R.layout.fragment_list_attendance_at_store);
      sKeys.put("layout/fragment_list_attributes_0", com.crayon.fieldapp.R.layout.fragment_list_attributes);
      sKeys.put("layout/fragment_list_employee_0", com.crayon.fieldapp.R.layout.fragment_list_employee);
      sKeys.put("layout/fragment_list_group_0", com.crayon.fieldapp.R.layout.fragment_list_group);
      sKeys.put("layout/fragment_list_group_employee_0", com.crayon.fieldapp.R.layout.fragment_list_group_employee);
      sKeys.put("layout/fragment_list_image_0", com.crayon.fieldapp.R.layout.fragment_list_image);
      sKeys.put("layout/fragment_list_job_request_0", com.crayon.fieldapp.R.layout.fragment_list_job_request);
      sKeys.put("layout/fragment_list_management_applications_0", com.crayon.fieldapp.R.layout.fragment_list_management_applications);
      sKeys.put("layout/fragment_list_my_job_0", com.crayon.fieldapp.R.layout.fragment_list_my_job);
      sKeys.put("layout/fragment_list_pic_applications_0", com.crayon.fieldapp.R.layout.fragment_list_pic_applications);
      sKeys.put("layout/fragment_list_pic_notification_0", com.crayon.fieldapp.R.layout.fragment_list_pic_notification);
      sKeys.put("layout/fragment_list_product_0", com.crayon.fieldapp.R.layout.fragment_list_product);
      sKeys.put("layout/fragment_list_project_0", com.crayon.fieldapp.R.layout.fragment_list_project);
      sKeys.put("layout/fragment_list_report_competitor_at_store_0", com.crayon.fieldapp.R.layout.fragment_list_report_competitor_at_store);
      sKeys.put("layout/fragment_list_report_sales_at_store_0", com.crayon.fieldapp.R.layout.fragment_list_report_sales_at_store);
      sKeys.put("layout/fragment_list_report_tracking_at_store_0", com.crayon.fieldapp.R.layout.fragment_list_report_tracking_at_store);
      sKeys.put("layout/fragment_list_store_0", com.crayon.fieldapp.R.layout.fragment_list_store);
      sKeys.put("layout/fragment_list_update_status_at_store_0", com.crayon.fieldapp.R.layout.fragment_list_update_status_at_store);
      sKeys.put("layout/fragment_loadmore_refresh_0", com.crayon.fieldapp.R.layout.fragment_loadmore_refresh);
      sKeys.put("layout/fragment_loadmore_refresh_toolbar_0", com.crayon.fieldapp.R.layout.fragment_loadmore_refresh_toolbar);
      sKeys.put("layout/fragment_login_0", com.crayon.fieldapp.R.layout.fragment_login);
      sKeys.put("layout/fragment_main_0", com.crayon.fieldapp.R.layout.fragment_main);
      sKeys.put("layout/fragment_manage_application_0", com.crayon.fieldapp.R.layout.fragment_manage_application);
      sKeys.put("layout/fragment_manage_attendance_0", com.crayon.fieldapp.R.layout.fragment_manage_attendance);
      sKeys.put("layout/fragment_manage_employee_0", com.crayon.fieldapp.R.layout.fragment_manage_employee);
      sKeys.put("layout/fragment_manage_notification_0", com.crayon.fieldapp.R.layout.fragment_manage_notification);
      sKeys.put("layout/fragment_manage_project_0", com.crayon.fieldapp.R.layout.fragment_manage_project);
      sKeys.put("layout/fragment_manage_report_competitor_0", com.crayon.fieldapp.R.layout.fragment_manage_report_competitor);
      sKeys.put("layout/fragment_manage_report_sales_0", com.crayon.fieldapp.R.layout.fragment_manage_report_sales);
      sKeys.put("layout/fragment_manage_report_tracking_0", com.crayon.fieldapp.R.layout.fragment_manage_report_tracking);
      sKeys.put("layout/fragment_manage_store_0", com.crayon.fieldapp.R.layout.fragment_manage_store);
      sKeys.put("layout/fragment_manage_update_status_0", com.crayon.fieldapp.R.layout.fragment_manage_update_status);
      sKeys.put("layout/fragment_member_group_user_0", com.crayon.fieldapp.R.layout.fragment_member_group_user);
      sKeys.put("layout/fragment_member_project_0", com.crayon.fieldapp.R.layout.fragment_member_project);
      sKeys.put("layout/fragment_monitor_0", com.crayon.fieldapp.R.layout.fragment_monitor);
      sKeys.put("layout/fragment_notification_0", com.crayon.fieldapp.R.layout.fragment_notification);
      sKeys.put("layout/fragment_notification_container_0", com.crayon.fieldapp.R.layout.fragment_notification_container);
      sKeys.put("layout/fragment_notification_sent_0", com.crayon.fieldapp.R.layout.fragment_notification_sent);
      sKeys.put("layout/fragment_privacy_0", com.crayon.fieldapp.R.layout.fragment_privacy);
      sKeys.put("layout/fragment_profile_0", com.crayon.fieldapp.R.layout.fragment_profile);
      sKeys.put("layout/fragment_profile_container_0", com.crayon.fieldapp.R.layout.fragment_profile_container);
      sKeys.put("layout/fragment_project_in_progress_0", com.crayon.fieldapp.R.layout.fragment_project_in_progress);
      sKeys.put("layout/fragment_register_0", com.crayon.fieldapp.R.layout.fragment_register);
      sKeys.put("layout/fragment_report_0", com.crayon.fieldapp.R.layout.fragment_report);
      sKeys.put("layout/fragment_report_competitor_0", com.crayon.fieldapp.R.layout.fragment_report_competitor);
      sKeys.put("layout/fragment_report_endshift_0", com.crayon.fieldapp.R.layout.fragment_report_endshift);
      sKeys.put("layout/fragment_report_project_0", com.crayon.fieldapp.R.layout.fragment_report_project);
      sKeys.put("layout/fragment_report_sales_0", com.crayon.fieldapp.R.layout.fragment_report_sales);
      sKeys.put("layout/fragment_report_time_0", com.crayon.fieldapp.R.layout.fragment_report_time);
      sKeys.put("layout/fragment_report_update_status_0", com.crayon.fieldapp.R.layout.fragment_report_update_status);
      sKeys.put("layout/fragment_require_login_0", com.crayon.fieldapp.R.layout.fragment_require_login);
      sKeys.put("layout/fragment_reset_password_0", com.crayon.fieldapp.R.layout.fragment_reset_password);
      sKeys.put("layout/fragment_select_project_0", com.crayon.fieldapp.R.layout.fragment_select_project);
      sKeys.put("layout/fragment_select_promotion_0", com.crayon.fieldapp.R.layout.fragment_select_promotion);
      sKeys.put("layout/fragment_splash_0", com.crayon.fieldapp.R.layout.fragment_splash);
      sKeys.put("layout/fragment_store_project_0", com.crayon.fieldapp.R.layout.fragment_store_project);
      sKeys.put("layout/fragment_term_0", com.crayon.fieldapp.R.layout.fragment_term);
      sKeys.put("layout/fragment_verify_otp_0", com.crayon.fieldapp.R.layout.fragment_verify_otp);
      sKeys.put("layout/fragment_verify_otp_step2_0", com.crayon.fieldapp.R.layout.fragment_verify_otp_step2);
      sKeys.put("layout/item_add_member_to_project_0", com.crayon.fieldapp.R.layout.item_add_member_to_project);
      sKeys.put("layout/item_attendance_0", com.crayon.fieldapp.R.layout.item_attendance);
      sKeys.put("layout/item_detail_group_0", com.crayon.fieldapp.R.layout.item_detail_group);
      sKeys.put("layout/item_filter_store_0", com.crayon.fieldapp.R.layout.item_filter_store);
      sKeys.put("layout/item_group_store_0", com.crayon.fieldapp.R.layout.item_group_store);
      sKeys.put("layout/item_group_user_0", com.crayon.fieldapp.R.layout.item_group_user);
      sKeys.put("layout/item_management_application_0", com.crayon.fieldapp.R.layout.item_management_application);
      sKeys.put("layout/item_management_task_0", com.crayon.fieldapp.R.layout.item_management_task);
      sKeys.put("layout/item_member_0", com.crayon.fieldapp.R.layout.item_member);
      sKeys.put("layout/item_member_request_0", com.crayon.fieldapp.R.layout.item_member_request);
      sKeys.put("layout/item_notification_0", com.crayon.fieldapp.R.layout.item_notification);
      sKeys.put("layout/item_order_0", com.crayon.fieldapp.R.layout.item_order);
      sKeys.put("layout/item_pic_application_0", com.crayon.fieldapp.R.layout.item_pic_application);
      sKeys.put("layout/item_project_0", com.crayon.fieldapp.R.layout.item_project);
      sKeys.put("layout/item_select_product_0", com.crayon.fieldapp.R.layout.item_select_product);
      sKeys.put("layout/item_select_store_0", com.crayon.fieldapp.R.layout.item_select_store);
      sKeys.put("layout/item_select_user_0", com.crayon.fieldapp.R.layout.item_select_user);
      sKeys.put("layout/item_store_0", com.crayon.fieldapp.R.layout.item_store);
      sKeys.put("layout/item_store_group_store_0", com.crayon.fieldapp.R.layout.item_store_group_store);
      sKeys.put("layout/item_switch_shift_request_0", com.crayon.fieldapp.R.layout.item_switch_shift_request);
      sKeys.put("layout/item_today_job_0", com.crayon.fieldapp.R.layout.item_today_job);
      sKeys.put("layout/item_user_0", com.crayon.fieldapp.R.layout.item_user);
    }
  }
}
