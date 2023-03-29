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
import com.crayon.fieldapp.data.model.GroupUser;
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
public final class GroupUserDao_Impl implements GroupUserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GroupUser> __insertionAdapterOfGroupUser;

  private final EntityInsertionAdapter<GroupUser> __insertionAdapterOfGroupUser_1;

  private final EntityDeletionOrUpdateAdapter<GroupUser> __deletionAdapterOfGroupUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteGroup;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public GroupUserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGroupUser = new EntityInsertionAdapter<GroupUser>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `groupUser` (`id`,`name`,`agency`,`manager`,`parent`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupUser value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAgency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAgency());
        }
        if (value.getManager() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getManager());
        }
        if (value.getParent() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getParent());
        }
      }
    };
    this.__insertionAdapterOfGroupUser_1 = new EntityInsertionAdapter<GroupUser>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `groupUser` (`id`,`name`,`agency`,`manager`,`parent`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupUser value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAgency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAgency());
        }
        if (value.getManager() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getManager());
        }
        if (value.getParent() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getParent());
        }
      }
    };
    this.__deletionAdapterOfGroupUser = new EntityDeletionOrUpdateAdapter<GroupUser>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `groupUser` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupUser value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteGroup = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM groupUser WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM groupUser";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final GroupUser group, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGroupUser.insert(group);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<GroupUser> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGroupUser.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final GroupUser group, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGroupUser_1.insert(group);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteGroup(final GroupUser group, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGroupUser.handle(group);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteGroup(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteGroup.acquire();
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
          __preparedStmtOfDeleteGroup.release(_stmt);
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
  public Object getGroups(final Continuation<? super List<GroupUser>> p0) {
    final String _sql = "SELECT * FROM groupUser";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<GroupUser>>() {
      @Override
      public List<GroupUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAgency = CursorUtil.getColumnIndexOrThrow(_cursor, "agency");
          final int _cursorIndexOfManager = CursorUtil.getColumnIndexOrThrow(_cursor, "manager");
          final int _cursorIndexOfParent = CursorUtil.getColumnIndexOrThrow(_cursor, "parent");
          final List<GroupUser> _result = new ArrayList<GroupUser>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GroupUser _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpAgency;
            _tmpAgency = _cursor.getString(_cursorIndexOfAgency);
            final String _tmpManager;
            _tmpManager = _cursor.getString(_cursorIndexOfManager);
            final String _tmpParent;
            _tmpParent = _cursor.getString(_cursorIndexOfParent);
            _item = new GroupUser(_tmpId,_tmpName,_tmpAgency,_tmpManager,_tmpParent);
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
  public Object getGroup(final String id, final Continuation<? super GroupUser> p1) {
    final String _sql = "SELECT * FROM groupUser WHERE groupUser.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<GroupUser>() {
      @Override
      public GroupUser call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAgency = CursorUtil.getColumnIndexOrThrow(_cursor, "agency");
          final int _cursorIndexOfManager = CursorUtil.getColumnIndexOrThrow(_cursor, "manager");
          final int _cursorIndexOfParent = CursorUtil.getColumnIndexOrThrow(_cursor, "parent");
          final GroupUser _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpAgency;
            _tmpAgency = _cursor.getString(_cursorIndexOfAgency);
            final String _tmpManager;
            _tmpManager = _cursor.getString(_cursorIndexOfManager);
            final String _tmpParent;
            _tmpParent = _cursor.getString(_cursorIndexOfParent);
            _result = new GroupUser(_tmpId,_tmpName,_tmpAgency,_tmpManager,_tmpParent);
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
  public Object getGroupPage(final int pageSize, final int pageIndex,
      final Continuation<? super List<GroupUser>> p2) {
    final String _sql = "SELECT * FROM groupUser LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageIndex);
    return CoroutinesRoom.execute(__db, false, new Callable<List<GroupUser>>() {
      @Override
      public List<GroupUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAgency = CursorUtil.getColumnIndexOrThrow(_cursor, "agency");
          final int _cursorIndexOfManager = CursorUtil.getColumnIndexOrThrow(_cursor, "manager");
          final int _cursorIndexOfParent = CursorUtil.getColumnIndexOrThrow(_cursor, "parent");
          final List<GroupUser> _result = new ArrayList<GroupUser>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GroupUser _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpAgency;
            _tmpAgency = _cursor.getString(_cursorIndexOfAgency);
            final String _tmpManager;
            _tmpManager = _cursor.getString(_cursorIndexOfManager);
            final String _tmpParent;
            _tmpParent = _cursor.getString(_cursorIndexOfParent);
            _item = new GroupUser(_tmpId,_tmpName,_tmpAgency,_tmpManager,_tmpParent);
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
