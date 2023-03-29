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
import com.crayon.fieldapp.data.model.Store;
import java.lang.Double;
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
public final class StoreDao_Impl implements StoreDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Store> __insertionAdapterOfStore;

  private final EntityInsertionAdapter<Store> __insertionAdapterOfStore_1;

  private final EntityDeletionOrUpdateAdapter<Store> __deletionAdapterOfStore;

  private final SharedSQLiteStatement __preparedStmtOfDeleteStore;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public StoreDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStore = new EntityInsertionAdapter<Store>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `store` (`id`,`code`,`name`,`description`,`address`,`lat`,`lng`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Store value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAddress());
        }
        if (value.getLat() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getLat());
        }
        if (value.getLng() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getLng());
        }
      }
    };
    this.__insertionAdapterOfStore_1 = new EntityInsertionAdapter<Store>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `store` (`id`,`code`,`name`,`description`,`address`,`lat`,`lng`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Store value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAddress());
        }
        if (value.getLat() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getLat());
        }
        if (value.getLng() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getLng());
        }
      }
    };
    this.__deletionAdapterOfStore = new EntityDeletionOrUpdateAdapter<Store>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `store` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Store value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteStore = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM store WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM store";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Store store, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStore.insert(store);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<Store> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStore.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Store store, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStore_1.insert(store);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteStore(final Store store, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStore.handle(store);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteStore(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteStore.acquire();
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
          __preparedStmtOfDeleteStore.release(_stmt);
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
  public Object getStores(final Continuation<? super List<Store>> p0) {
    final String _sql = "SELECT * FROM store";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Store>>() {
      @Override
      public List<Store> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
          final List<Store> _result = new ArrayList<Store>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Store _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpCode;
            _tmpCode = _cursor.getString(_cursorIndexOfCode);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final Double _tmpLat;
            if (_cursor.isNull(_cursorIndexOfLat)) {
              _tmpLat = null;
            } else {
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
            }
            final Double _tmpLng;
            if (_cursor.isNull(_cursorIndexOfLng)) {
              _tmpLng = null;
            } else {
              _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
            }
            _item = new Store(_tmpId,_tmpCode,_tmpName,_tmpDescription,_tmpAddress,_tmpLat,_tmpLng);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getStore(final String id, final Continuation<? super Store> p1) {
    final String _sql = "SELECT * FROM store WHERE store.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Store>() {
      @Override
      public Store call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
          final Store _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpCode;
            _tmpCode = _cursor.getString(_cursorIndexOfCode);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final Double _tmpLat;
            if (_cursor.isNull(_cursorIndexOfLat)) {
              _tmpLat = null;
            } else {
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
            }
            final Double _tmpLng;
            if (_cursor.isNull(_cursorIndexOfLng)) {
              _tmpLng = null;
            } else {
              _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
            }
            _result = new Store(_tmpId,_tmpCode,_tmpName,_tmpDescription,_tmpAddress,_tmpLat,_tmpLng);
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

  @Override
  public Object getStorePage(final int pageSize, final int pageIndex,
      final Continuation<? super List<Store>> p2) {
    final String _sql = "SELECT * FROM store LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageIndex);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Store>>() {
      @Override
      public List<Store> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
          final List<Store> _result = new ArrayList<Store>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Store _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpCode;
            _tmpCode = _cursor.getString(_cursorIndexOfCode);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final Double _tmpLat;
            if (_cursor.isNull(_cursorIndexOfLat)) {
              _tmpLat = null;
            } else {
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
            }
            final Double _tmpLng;
            if (_cursor.isNull(_cursorIndexOfLng)) {
              _tmpLng = null;
            } else {
              _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
            }
            _item = new Store(_tmpId,_tmpCode,_tmpName,_tmpDescription,_tmpAddress,_tmpLat,_tmpLng);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }
}
