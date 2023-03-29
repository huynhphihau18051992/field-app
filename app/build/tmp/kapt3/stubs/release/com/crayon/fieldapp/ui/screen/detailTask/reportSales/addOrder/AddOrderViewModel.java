package com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u0012\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00112\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000e0#j\b\u0012\u0004\u0012\u00020\u000e`$J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0011J.\u0010\u001c\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u00112\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000e0#j\b\u0012\u0004\u0012\u00020\u000e`$J\u0016\u0010\u001e\u001a\u00020 2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R)\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\t0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015\u00a8\u0006+"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/addOrder/AddOrderViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "productDao", "Lcom/crayon/fieldapp/data/local/dao/ProductDao;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/data/local/dao/ProductDao;)V", "_addOrder", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/OrderResponse;", "_products", "", "Lcom/crayon/fieldapp/data/remote/response/ProductResponse;", "_updateOrder", "_updatePrice", "", "addOrder", "Landroidx/lifecycle/LiveData;", "getAddOrder", "()Landroidx/lifecycle/LiveData;", "getProductDao", "()Lcom/crayon/fieldapp/data/local/dao/ProductDao;", "products", "getProducts", "getTaskRepository", "()Lcom/crayon/fieldapp/data/repository/TaskRepository;", "updateOrder", "getUpdateOrder", "updatePrice", "getUpdatePrice", "", "taskId", "listProducts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fetchProducts", "projectId", "orderId", "product", "price", "", "app_release"})
public final class AddOrderViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>>> _addOrder = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>>> _updateOrder = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.String>>> _updatePrice = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProductResponse>>>> _products = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.data.local.dao.ProductDao productDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>>> getAddOrder() {
        return null;
    }
    
    public final void addOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> listProducts) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.OrderResponse>>> getUpdateOrder() {
        return null;
    }
    
    public final void updateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> listProducts) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.String>>> getUpdatePrice() {
        return null;
    }
    
    public final void updatePrice(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.ProductResponse product, long price) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProductResponse>>>> getProducts() {
        return null;
    }
    
    public final void fetchProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.local.dao.ProductDao getProductDao() {
        return null;
    }
    
    public AddOrderViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.dao.ProductDao productDao) {
        super();
    }
}