package com.crayon.fieldapp.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.crayon.fieldapp.data.model.ProductEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity_1;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __deletionAdapterOfProductEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePrice;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProduct;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProduct_1;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `product` (`id`,`projectId`,`name`,`price`,`isEdit`,`endDate`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getProjectId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProjectId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindLong(4, value.getPrice());
        final int _tmp;
        _tmp = value.isEdit() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getEndDate());
      }
    };
    this.__insertionAdapterOfProductEntity_1 = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `product` (`id`,`projectId`,`name`,`price`,`isEdit`,`endDate`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getProjectId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProjectId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindLong(4, value.getPrice());
        final int _tmp;
        _tmp = value.isEdit() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getEndDate());
      }
    };
    this.__deletionAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `product` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfUpdatePrice = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE product SET price = ?, isEdit = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteProduct = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM product WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteProduct_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM product WHERE endDate <= ? ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM product";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ProductEntity product, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<ProductEntity> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final ProductEntity product, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity_1.insert(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteJob(final ProductEntity product, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductEntity.handle(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updatePrice(final String id, final long price, final boolean isEdit,
      final Continuation<? super Unit> p3) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePrice.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, price);
        _argIndex = 2;
        final int _tmp;
        _tmp = isEdit ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 3;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdatePrice.release(_stmt);
        }
      }
    }, p3);
  }

  @Override
  public Object deleteProduct(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProduct.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteProduct.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object deleteProduct(final long currentDate, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProduct_1.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, currentDate);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteProduct_1.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getProducts(final String projectId,
      final Continuation<? super List<ProductEntity>> p1) {
    final String _sql = "SELECT * FROM product WHERE product.projectId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (projectId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, projectId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<ProductEntity>>() {
      @Override
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsEdit = CursorUtil.getColumnIndexOrThrow(_cursor, "isEdit");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final long _tmpPrice;
            _tmpPrice = _cursor.getLong(_cursorIndexOfPrice);
            final boolean _tmpIsEdit;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsEdit);
            _tmpIsEdit = _tmp != 0;
            final long _tmpEndDate;
            _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
            _item = new ProductEntity(_tmpId,_tmpProjectId,_tmpName,_tmpPrice,_tmpIsEdit,_tmpEndDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getProduct(final String id, final Continuation<? super ProductEntity> p1) {
    final String _sql = "SELECT * FROM product WHERE product.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<ProductEntity>() {
      @Override
      public ProductEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsEdit = CursorUtil.getColumnIndexOrThrow(_cursor, "isEdit");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
          final ProductEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final long _tmpPrice;
            _tmpPrice = _cursor.getLong(_cursorIndexOfPrice);
            final boolean _tmpIsEdit;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsEdit);
            _tmpIsEdit = _tmp != 0;
            final long _tmpEndDate;
            _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
            _result = new ProductEntity(_tmpId,_tmpProjectId,_tmpName,_tmpPrice,_tmpIsEdit,_tmpEndDate);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
