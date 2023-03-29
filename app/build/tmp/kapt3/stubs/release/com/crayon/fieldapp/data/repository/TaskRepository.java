package com.crayon.fieldapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J?\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018JG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020!H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J=\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00060%j\b\u0012\u0004\u0012\u00020\u0006`&H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J/\u0010(\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0%j\b\u0012\u0004\u0012\u00020)`&0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\'\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\u0006\u00100\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J%\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*JM\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208020\u00032\u0006\u00109\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?J%\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00030\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J3\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208020\u00030\f2\u0006\u00109\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-Jq\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208020\u00032\u0006\u00109\u001a\u00020\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010E\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJA\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208020\u00030\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0006022\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010HJ3\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208020\u00030\f2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u001f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001f\u0010L\u001a\b\u0012\u0004\u0012\u0002080\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J+\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208020\u00030\f2\u0006\u0010B\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00032\u0006\u00100\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\u0006\u00100\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J/\u0010R\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0%j\b\u0012\u0004\u0012\u00020)`&0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J#\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208020\u00030\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010TJ\'\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020VH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010WJ/\u0010X\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J-\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\'\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J5\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00062\u0006\u0010`\u001a\u00020aH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010bJ/\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020!H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010eJ5\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u00100\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\u00062\u0006\u0010h\u001a\u00020iH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jJ5\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\u00062\u0006\u0010k\u001a\u00020lH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010mJ-\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010o\u001a\u00020pH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010qJ9\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010tJA\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010uJI\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010vJ?\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJG\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{JO\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010|J/\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J\'\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0080\u0001"}, d2 = {"Lcom/crayon/fieldapp/data/repository/TaskRepository;", "", "addProductToBill", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "taskId", "", "billId", "request", "Lcom/crayon/fieldapp/data/remote/request/AddPromotionGiftRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/AddPromotionGiftRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIn", "Landroidx/lifecycle/LiveData;", "file", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkOut", "createCustomerBill", "Lcom/crayon/fieldapp/data/remote/response/CreateCustomerBillResponse;", "customerId", "code_bill", "file1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "file2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "file3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createManagementTask", "form", "Lcom/crayon/fieldapp/data/remote/request/CreateTaskForm;", "(Lcom/crayon/fieldapp/data/remote/request/CreateTaskForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "Lcom/crayon/fieldapp/data/remote/response/OrderResponse;", "Lcom/crayon/fieldapp/data/remote/request/AddProductToOrderRequest;", "(Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/AddProductToOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAttachment", "ids", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConsumeGift", "Lcom/crayon/fieldapp/data/remote/response/GiftResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerBill", "Lcom/crayon/fieldapp/data/remote/response/DetailCustomerBillResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGiftList", "Lcom/crayon/fieldapp/data/remote/response/GetGiftListResponse;", "projectId", "getListCustomer", "", "Lcom/crayon/fieldapp/data/remote/response/CustomerResponse;", "getListCustomerBill", "Lcom/crayon/fieldapp/data/remote/response/CustomerBillResponse;", "getListOrder", "getManagementReportOpponents", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "agencyId", "startTime", "endTime", "skip", "", "take", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManagementTask", "getManagementTasks", "jobId", "getManagementTasksByFilter", "storeId", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPicReportByProject", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPicReportByTime", "getPicReportOpponents", "Lcom/crayon/fieldapp/data/remote/response/GetReportOpponentListResponse;", "getPicTask", "getPicTasks", "getProductList", "Lcom/crayon/fieldapp/data/remote/response/GetProductListResponse;", "getPromotionsList", "Lcom/crayon/fieldapp/data/remote/response/GetPromotionListResponse;", "getStoreGifts", "getTodayPicAttendances", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importGifts", "Lcom/crayon/fieldapp/data/remote/request/ReceiveGiftRequest;", "(Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/ReceiveGiftRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerCustomer", "name", "mobile_number", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeTask", "resendCustomerOtp", "updateCustomerFeedBack", "customerFeedId", "updateCustomerFeedbackRequest", "Lcom/crayon/fieldapp/data/remote/request/UpdateCustomerFeedbackRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/UpdateCustomerFeedbackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrder", "orderId", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/AddProductToOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePriceOfProduct", "productId", "price", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProduct", "Lcom/crayon/fieldapp/data/remote/request/UpdateProductRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/UpdateProductRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProductFeedBack", "updateProductFeedbackRequest", "Lcom/crayon/fieldapp/data/remote/request/UpdateProductFeedbackRequest;", "(Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/UpdateProductFeedbackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "notes", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadReportOpponents", "brandName", "note", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyCustomerOtp", "otp_number", "viewOrder", "app_release"})
public abstract interface TaskRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodayPicAttendances(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicReportByProject(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicReportByTime(@org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p5);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p4);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getManagementTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getManagementTasksByFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.Nullable()
    java.lang.String projectId, @org.jetbrains.annotations.Nullable()
    java.lang.String storeId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, int skip, int take, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> p8);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.TaskResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getManagementTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.TaskResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkIn(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkOut(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAttachment(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createManagementTask(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.CreateTaskForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.UpdateProductRequest updateProduct, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCustomerFeedBack(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerFeedId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.UpdateCustomerFeedbackRequest updateCustomerFeedbackRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProductFeedBack(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.UpdateProductFeedbackRequest updateProductFeedbackRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProductList(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetProductListResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPromotionsList(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetPromotionListResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGiftList(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetGiftListResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePriceOfProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, long price, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.CustomerBillResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String billId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.DetailCustomerBillResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String code_bill, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>> p4);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String code_bill, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>> p5);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String code_bill, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>> p6);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addProductToBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String billId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.AddPromotionGiftRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CustomerResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object verifyCustomerOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    java.lang.String otp_number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resendCustomerOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p7);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p6);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p5);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetReportOpponentListResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getManagementReportOpponents(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, int skip, int take, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> p6);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.CustomerResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.AddProductToOrderRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object viewOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.AddProductToOrderRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.OrderResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object importGifts(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.ReceiveGiftRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.lang.Object>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getConsumeGift(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStoreGifts(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse>>> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}