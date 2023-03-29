package com.crayon.fieldapp.data.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J-\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ?\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJG\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010!\u001a\u00020\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\'\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020&H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J=\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u000b0*j\b\u0012\u0004\u0012\u00020\u000b`+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J/\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020.0*j\b\u0012\u0004\u0012\u00020.`+0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\'\u00100\u001a\b\u0012\u0004\u0012\u0002010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u001f\u00103\u001a\b\u0012\u0004\u0012\u0002040\b2\u0006\u00105\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208070\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J%\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:070\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%070\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/JM\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=070\b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020BH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ%\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\b0\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J3\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=070\b0\u00112\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102Jg\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=070\b2\u0006\u0010>\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u000b2\b\u0010I\u001a\u0004\u0018\u00010\u000b2\b\u0010J\u001a\u0004\u0018\u00010B2\b\u0010?\u001a\u0004\u0018\u00010\u000b2\b\u0010@\u001a\u0004\u0018\u00010\u000b2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020BH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010KJA\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=070\b0\u00112\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b072\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ3\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=070\b0\u00112\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J+\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=070\b0\u00112\u0006\u0010G\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\b2\u0006\u00105\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\b2\u0006\u00105\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J/\u0010W\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020.0*j\b\u0012\u0004\u0012\u00020.`+0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J#\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=070\b0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ\'\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\\H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010]J/\u0010^\u001a\b\u0012\u0004\u0012\u0002080\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010aJ-\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\'\u0010c\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J5\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020gH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010hJ/\u0010i\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020&H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010kJ5\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u00105\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020oH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010pJ5\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010sJ-\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020vH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010wJ7\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010y\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJ?\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010y\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{JG\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\u0010y\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010|J@\u0010}\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0080\u0001JH\u0010}\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001JP\u0010}\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0082\u0001J1\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000b2\u0007\u0010\u0084\u0001\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010aJ(\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020%0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0086\u0001"}, d2 = {"Lcom/crayon/fieldapp/data/repository/impl/TaskRepositoryImpl;", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "apiService", "Lcom/crayon/fieldapp/data/remote/ApiService;", "jobDao", "Lcom/crayon/fieldapp/data/local/dao/JobDao;", "(Lcom/crayon/fieldapp/data/remote/ApiService;Lcom/crayon/fieldapp/data/local/dao/JobDao;)V", "addProductToBill", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "taskId", "", "billId", "request", "Lcom/crayon/fieldapp/data/remote/request/AddPromotionGiftRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/AddPromotionGiftRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIn", "Landroidx/lifecycle/LiveData;", "file", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkOut", "createCustomerBill", "Lcom/crayon/fieldapp/data/remote/response/CreateCustomerBillResponse;", "customerId", "code_bill", "file1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "file2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "file3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createManagementTask", "form", "Lcom/crayon/fieldapp/data/remote/request/CreateTaskForm;", "(Lcom/crayon/fieldapp/data/remote/request/CreateTaskForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "Lcom/crayon/fieldapp/data/remote/response/OrderResponse;", "Lcom/crayon/fieldapp/data/remote/request/AddProductToOrderRequest;", "(Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/AddProductToOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAttachment", "ids", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConsumeGift", "Lcom/crayon/fieldapp/data/remote/response/GiftResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerBill", "Lcom/crayon/fieldapp/data/remote/response/DetailCustomerBillResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGiftList", "Lcom/crayon/fieldapp/data/remote/response/GetGiftListResponse;", "projectId", "getListCustomer", "", "Lcom/crayon/fieldapp/data/remote/response/CustomerResponse;", "getListCustomerBill", "Lcom/crayon/fieldapp/data/remote/response/CustomerBillResponse;", "getListOrder", "getManagementReportOpponents", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "agencyId", "startTime", "endTime", "skip", "", "take", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManagementTask", "getManagementTasks", "jobId", "getManagementTasksByFilter", "storeId", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPicReportByProject", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPicReportByTime", "getPicReportOpponents", "Lcom/crayon/fieldapp/data/remote/response/GetReportOpponentListResponse;", "getPicTask", "getPicTasks", "getProductList", "Lcom/crayon/fieldapp/data/remote/response/GetProductListResponse;", "getPromotionsList", "Lcom/crayon/fieldapp/data/remote/response/GetPromotionListResponse;", "getStoreGifts", "getTodayPicAttendances", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importGifts", "", "Lcom/crayon/fieldapp/data/remote/request/ReceiveGiftRequest;", "(Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/ReceiveGiftRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerCustomer", "name", "mobile_number", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeTask", "resendCustomerOtp", "updateCustomerFeedBack", "customerFeedId", "updateCustomerFeedbackRequest", "Lcom/crayon/fieldapp/data/remote/request/UpdateCustomerFeedbackRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/UpdateCustomerFeedbackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrder", "orderId", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/AddProductToOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePriceOfProduct", "productId", "price", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProduct", "Lcom/crayon/fieldapp/data/remote/request/UpdateProductRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/UpdateProductRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProductFeedBack", "updateProductFeedbackRequest", "Lcom/crayon/fieldapp/data/remote/request/UpdateProductFeedbackRequest;", "(Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/UpdateProductFeedbackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "notes", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadReportOpponents", "brandName", "note", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyCustomerOtp", "otp_number", "viewOrder", "app_debug"})
public final class TaskRepositoryImpl implements com.crayon.fieldapp.data.repository.TaskRepository {
    private final com.crayon.fieldapp.data.remote.ApiService apiService = null;
    private final com.crayon.fieldapp.data.local.dao.JobDao jobDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTodayPicAttendances(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicReportByProject(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicReportByTime(@org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p5) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementTasksByFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.Nullable()
    java.lang.String projectId, @org.jetbrains.annotations.Nullable()
    java.lang.String storeId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, int skip, int take, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> p8) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.TaskResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.TaskResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkIn(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkOut(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAttachment(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createManagementTask(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.CreateTaskForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.UpdateProductRequest updateProduct, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateCustomerFeedBack(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerFeedId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.UpdateCustomerFeedbackRequest updateCustomerFeedbackRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateProductFeedBack(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.UpdateProductFeedbackRequest updateProductFeedbackRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProductList(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetProductListResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPromotionsList(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetPromotionListResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getGiftList(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetGiftListResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updatePriceOfProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, long price, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getListCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.CustomerBillResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String billId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.DetailCustomerBillResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String code_bill, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String code_bill, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>> p5) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String code_bill, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>> p6) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addProductToBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String billId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.AddPromotionGiftRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CustomerResponse>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object verifyCustomerOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    java.lang.String otp_number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object resendCustomerOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object uploadReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p7) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object uploadReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p6) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object uploadReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p5) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetReportOpponentListResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, int skip, int take, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> p6) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getListCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.CustomerResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.AddProductToOrderRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object viewOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.AddProductToOrderRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getListOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.OrderResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object importGifts(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.ReceiveGiftRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.lang.Object>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getConsumeGift(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStoreGifts(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse>>> p1) {
        return null;
    }
    
    public TaskRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.dao.JobDao jobDao) {
        super();
    }
}