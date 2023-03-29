package com.crayon.fieldapp.data.remote.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00b1\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00b5\u0002\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020WH\u00d6\u0001J\t\u0010X\u001a\u00020YH\u00d6\u0001R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f\u00a8\u0006Z"}, d2 = {"Lcom/crayon/fieldapp/data/remote/request/CreateUserRequest;", "", "firstName", "Lokhttp3/RequestBody;", "lastName", "birthDay", "email", "password", "confirmPassword", "phone", "gender", "tax", "bank_number", "bank_name", "bank_brand", "heigth", "weigth", "id", "city", "temporary_city", "district", "temporary_district", "avatar", "Lokhttp3/MultipartBody$Part;", "full_body", "id_front", "id_back", "address", "temporary_address", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;)V", "getAddress", "()Lokhttp3/RequestBody;", "getAvatar", "()Lokhttp3/MultipartBody$Part;", "getBank_brand", "getBank_name", "getBank_number", "getBirthDay", "getCity", "getConfirmPassword", "getDistrict", "getEmail", "getFirstName", "getFull_body", "getGender", "getHeigth", "getId", "getId_back", "getId_front", "getLastName", "getPassword", "getPhone", "getTax", "getTemporary_address", "getTemporary_city", "getTemporary_district", "getWeigth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class CreateUserRequest {
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody firstName = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody lastName = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody birthDay = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody email = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody password = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody confirmPassword = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody phone = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody gender = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody tax = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody bank_number = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody bank_name = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody bank_brand = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody heigth = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody weigth = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody id = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody city = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody temporary_city = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody district = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody temporary_district = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.MultipartBody.Part avatar = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.MultipartBody.Part full_body = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.MultipartBody.Part id_front = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.MultipartBody.Part id_back = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody address = null;
    @org.jetbrains.annotations.Nullable()
    private final okhttp3.RequestBody temporary_address = null;
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getBirthDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getConfirmPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getTax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getBank_number() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getBank_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getBank_brand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getHeigth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getWeigth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getTemporary_city() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getDistrict() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getTemporary_district() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part getFull_body() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part getId_front() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part getId_back() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getTemporary_address() {
        return null;
    }
    
    public CreateUserRequest(@org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody firstName, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody lastName, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody birthDay, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody email, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody password, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody confirmPassword, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody phone, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody gender, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody tax, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody bank_number, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody bank_name, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody bank_brand, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody heigth, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody weigth, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody id, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody city, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody temporary_city, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody district, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody temporary_district, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part avatar, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part full_body, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part id_front, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part id_back, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody address, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody temporary_address) {
        super();
    }
    
    public CreateUserRequest() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.remote.request.CreateUserRequest copy(@org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody firstName, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody lastName, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody birthDay, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody email, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody password, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody confirmPassword, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody phone, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody gender, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody tax, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody bank_number, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody bank_name, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody bank_brand, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody heigth, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody weigth, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody id, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody city, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody temporary_city, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody district, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody temporary_district, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part avatar, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part full_body, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part id_front, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part id_back, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody address, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody temporary_address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}