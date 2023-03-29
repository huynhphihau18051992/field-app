package com.crayon.fieldapp.data.remote.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u00d5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0006\u0012\u0004\u0018\u00010\u00030:J\f\u0010<\u001a\u00020;*\u0004\u0018\u00010\u0003R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f\u00a8\u0006="}, d2 = {"Lcom/crayon/fieldapp/data/remote/request/UpdateProfileForm;", "", "firstName", "", "lastName", "birthDay", "email", "password", "confirmPassword", "phone", "gender", "tax", "bank_number", "bank_name", "bank_brand", "heigth", "weigth", "id", "city", "district", "temporary_city", "temporary_district", "temporary_address", "avatar", "Landroid/net/Uri;", "full_body", "id_front", "id_back", "address", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAvatar", "()Landroid/net/Uri;", "getBank_brand", "getBank_name", "getBank_number", "getBirthDay", "getCity", "getConfirmPassword", "getDistrict", "getEmail", "getFirstName", "getFull_body", "getGender", "getHeigth", "getId", "getId_back", "getId_front", "getLastName", "getPassword", "getPhone", "getTax", "getTemporary_address", "getTemporary_city", "getTemporary_district", "getWeigth", "validate", "Lcom/crayon/fieldapp/utils/Duplex;", "", "isValidEmail", "app_debug"})
public final class UpdateProfileForm {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String birthDay = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String confirmPassword = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bank_number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bank_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bank_brand = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String heigth = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weigth = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String district = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String temporary_city = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String temporary_district = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String temporary_address = null;
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri avatar = null;
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri full_body = null;
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri id_front = null;
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri id_back = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.utils.Duplex<java.lang.Boolean, java.lang.String> validate() {
        return null;
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isValidEmail) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConfirmPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBank_number() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBank_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBank_brand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeigth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeigth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemporary_city() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemporary_district() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemporary_address() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getFull_body() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getId_front() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getId_back() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public UpdateProfileForm(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String birthDay, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    java.lang.String tax, @org.jetbrains.annotations.NotNull()
    java.lang.String bank_number, @org.jetbrains.annotations.NotNull()
    java.lang.String bank_name, @org.jetbrains.annotations.NotNull()
    java.lang.String bank_brand, @org.jetbrains.annotations.NotNull()
    java.lang.String heigth, @org.jetbrains.annotations.NotNull()
    java.lang.String weigth, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String district, @org.jetbrains.annotations.NotNull()
    java.lang.String temporary_city, @org.jetbrains.annotations.NotNull()
    java.lang.String temporary_district, @org.jetbrains.annotations.NotNull()
    java.lang.String temporary_address, @org.jetbrains.annotations.Nullable()
    android.net.Uri avatar, @org.jetbrains.annotations.Nullable()
    android.net.Uri full_body, @org.jetbrains.annotations.Nullable()
    android.net.Uri id_front, @org.jetbrains.annotations.Nullable()
    android.net.Uri id_back, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        super();
    }
}