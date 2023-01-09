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
import com.crayon.fieldapp.data.model.User;
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
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser_1;

  private final EntityDeletionOrUpdateAdapter<User> __deletionAdapterOfUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `user` (`id`,`fullName`,`area_code`,`mobile_number`,`email_address`,`identification_number`,`avatar_url`,`birth_day`,`status`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFullName());
        }
        if (value.getArea_code() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getArea_code());
        }
        if (value.getMobile_number() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMobile_number());
        }
        if (value.getEmail_address() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEmail_address());
        }
        if (value.getIdentification_number() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIdentification_number());
        }
        if (value.getAvatar_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAvatar_url());
        }
        if (value.getBirth_day() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getBirth_day());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStatus());
        }
      }
    };
    this.__insertionAdapterOfUser_1 = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user` (`id`,`fullName`,`area_code`,`mobile_number`,`email_address`,`identification_number`,`avatar_url`,`birth_day`,`status`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFullName());
        }
        if (value.getArea_code() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getArea_code());
        }
        if (value.getMobile_number() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMobile_number());
        }
        if (value.getEmail_address() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEmail_address());
        }
        if (value.getIdentification_number() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIdentification_number());
        }
        if (value.getAvatar_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAvatar_url());
        }
        if (value.getBirth_day() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getBirth_day());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStatus());
        }
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteUser = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final User job, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUser.insert(job);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<User> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUser.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final User user, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUser_1.insert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteUser(final User user, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUser.handle(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteUser(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUser.acquire();
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
          __preparedStmtOfDeleteUser.release(_stmt);
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
  public Object getUsers(final Continuation<? super List<User>> p0) {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<User>>() {
      @Override
      public List<User> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfAreaCode = CursorUtil.getColumnIndexOrThrow(_cursor, "area_code");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfEmailAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "email_address");
          final int _cursorIndexOfIdentificationNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "identification_number");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfBirthDay = CursorUtil.getColumnIndexOrThrow(_cursor, "birth_day");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<User> _result = new ArrayList<User>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final User _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpArea_code;
            _tmpArea_code = _cursor.getString(_cursorIndexOfAreaCode);
            final String _tmpMobile_number;
            _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            final String _tmpEmail_address;
            _tmpEmail_address = _cursor.getString(_cursorIndexOfEmailAddress);
            final String _tmpIdentification_number;
            _tmpIdentification_number = _cursor.getString(_cursorIndexOfIdentificationNumber);
            final String _tmpAvatar_url;
            _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            final String _tmpBirth_day;
            _tmpBirth_day = _cursor.getString(_cursorIndexOfBirthDay);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _item = new User(_tmpId,_tmpFullName,_tmpArea_code,_tmpMobile_number,_tmpEmail_address,_tmpIdentification_number,_tmpAvatar_url,_tmpBirth_day,_tmpStatus);
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
  public Object getUser(final String id, final Continuation<? super User> p1) {
    final String _sql = "SELECT * FROM user WHERE user.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<User>() {
      @Override
      public User call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfAreaCode = CursorUtil.getColumnIndexOrThrow(_cursor, "area_code");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfEmailAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "email_address");
          final int _cursorIndexOfIdentificationNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "identification_number");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfBirthDay = CursorUtil.getColumnIndexOrThrow(_cursor, "birth_day");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final User _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpArea_code;
            _tmpArea_code = _cursor.getString(_cursorIndexOfAreaCode);
            final String _tmpMobile_number;
            _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            final String _tmpEmail_address;
            _tmpEmail_address = _cursor.getString(_cursorIndexOfEmailAddress);
            final String _tmpIdentification_number;
            _tmpIdentification_number = _cursor.getString(_cursorIndexOfIdentificationNumber);
            final String _tmpAvatar_url;
            _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            final String _tmpBirth_day;
            _tmpBirth_day = _cursor.getString(_cursorIndexOfBirthDay);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _result = new User(_tmpId,_tmpFullName,_tmpArea_code,_tmpMobile_number,_tmpEmail_address,_tmpIdentification_number,_tmpAvatar_url,_tmpBirth_day,_tmpStatus);
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
  public Object getUserPage(final int pageSize, final int pageIndex,
      final Continuation<? super List<User>> p2) {
    final String _sql = "SELECT * FROM user LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageIndex);
    return CoroutinesRoom.execute(__db, false, new Callable<List<User>>() {
      @Override
      public List<User> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfAreaCode = CursorUtil.getColumnIndexOrThrow(_cursor, "area_code");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfEmailAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "email_address");
          final int _cursorIndexOfIdentificationNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "identification_number");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfBirthDay = CursorUtil.getColumnIndexOrThrow(_cursor, "birth_day");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<User> _result = new ArrayList<User>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final User _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpArea_code;
            _tmpArea_code = _cursor.getString(_cursorIndexOfAreaCode);
            final String _tmpMobile_number;
            _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            final String _tmpEmail_address;
            _tmpEmail_address = _cursor.getString(_cursorIndexOfEmailAddress);
            final String _tmpIdentification_number;
            _tmpIdentification_number = _cursor.getString(_cursorIndexOfIdentificationNumber);
            final String _tmpAvatar_url;
            _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            final String _tmpBirth_day;
            _tmpBirth_day = _cursor.getString(_cursorIndexOfBirthDay);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _item = new User(_tmpId,_tmpFullName,_tmpArea_code,_tmpMobile_number,_tmpEmail_address,_tmpIdentification_number,_tmpAvatar_url,_tmpBirth_day,_tmpStatus);
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
