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
import com.crayon.fieldapp.data.model.Job;
import java.lang.Exception;
import java.lang.Long;
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
public final class JobDao_Impl implements JobDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Job> __insertionAdapterOfJob;

  private final EntityInsertionAdapter<Job> __insertionAdapterOfJob_1;

  private final EntityDeletionOrUpdateAdapter<Job> __deletionAdapterOfJob;

  private final SharedSQLiteStatement __preparedStmtOfDeleteJob;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public JobDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfJob = new EntityInsertionAdapter<Job>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `job` (`id`,`createdAt`,`updatedAt`,`name`,`description`,`status`,`role`,`start_time`,`end_time`,`agencyName`,`agencyId`,`projectName`,`projectId`,`storeName`,`storeId`,`picId`,`picAvatar`,`picFullName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Job value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getUpdatedAt());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
        if (value.getRole() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRole());
        }
        if (value.getStart_time() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getStart_time());
        }
        if (value.getEnd_time() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getEnd_time());
        }
        if (value.getAgencyName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAgencyName());
        }
        if (value.getAgencyId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getAgencyId());
        }
        if (value.getProjectName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getProjectName());
        }
        if (value.getProjectId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getProjectId());
        }
        if (value.getStoreName() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getStoreName());
        }
        if (value.getStoreId() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getStoreId());
        }
        if (value.getPicId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getPicId());
        }
        if (value.getPicAvatar() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getPicAvatar());
        }
        if (value.getPicFullName() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getPicFullName());
        }
      }
    };
    this.__insertionAdapterOfJob_1 = new EntityInsertionAdapter<Job>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `job` (`id`,`createdAt`,`updatedAt`,`name`,`description`,`status`,`role`,`start_time`,`end_time`,`agencyName`,`agencyId`,`projectName`,`projectId`,`storeName`,`storeId`,`picId`,`picAvatar`,`picFullName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Job value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getUpdatedAt());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
        if (value.getRole() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRole());
        }
        if (value.getStart_time() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getStart_time());
        }
        if (value.getEnd_time() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getEnd_time());
        }
        if (value.getAgencyName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAgencyName());
        }
        if (value.getAgencyId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getAgencyId());
        }
        if (value.getProjectName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getProjectName());
        }
        if (value.getProjectId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getProjectId());
        }
        if (value.getStoreName() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getStoreName());
        }
        if (value.getStoreId() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getStoreId());
        }
        if (value.getPicId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getPicId());
        }
        if (value.getPicAvatar() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getPicAvatar());
        }
        if (value.getPicFullName() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getPicFullName());
        }
      }
    };
    this.__deletionAdapterOfJob = new EntityDeletionOrUpdateAdapter<Job>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `job` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Job value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteJob = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM job WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM job";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Job job, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfJob.insert(job);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<Job> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfJob.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Job job, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfJob_1.insert(job);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteJob(final Job job, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfJob.handle(job);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteJob(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteJob.acquire();
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
          __preparedStmtOfDeleteJob.release(_stmt);
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
  public Object getJobs(final Continuation<? super List<Job>> p0) {
    final String _sql = "SELECT * FROM job";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Job>>() {
      @Override
      public List<Job> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfProjectName = CursorUtil.getColumnIndexOrThrow(_cursor, "projectName");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfStoreName = CursorUtil.getColumnIndexOrThrow(_cursor, "storeName");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "storeId");
          final int _cursorIndexOfPicId = CursorUtil.getColumnIndexOrThrow(_cursor, "picId");
          final int _cursorIndexOfPicAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "picAvatar");
          final int _cursorIndexOfPicFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "picFullName");
          final List<Job> _result = new ArrayList<Job>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Job _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpRole;
            _tmpRole = _cursor.getString(_cursorIndexOfRole);
            final Long _tmpStart_time;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStart_time = null;
            } else {
              _tmpStart_time = _cursor.getLong(_cursorIndexOfStartTime);
            }
            final Long _tmpEnd_time;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmpEnd_time = null;
            } else {
              _tmpEnd_time = _cursor.getLong(_cursorIndexOfEndTime);
            }
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpProjectName;
            _tmpProjectName = _cursor.getString(_cursorIndexOfProjectName);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpStoreName;
            _tmpStoreName = _cursor.getString(_cursorIndexOfStoreName);
            final String _tmpStoreId;
            _tmpStoreId = _cursor.getString(_cursorIndexOfStoreId);
            final String _tmpPicId;
            _tmpPicId = _cursor.getString(_cursorIndexOfPicId);
            final String _tmpPicAvatar;
            _tmpPicAvatar = _cursor.getString(_cursorIndexOfPicAvatar);
            final String _tmpPicFullName;
            _tmpPicFullName = _cursor.getString(_cursorIndexOfPicFullName);
            _item = new Job(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpStatus,_tmpRole,_tmpStart_time,_tmpEnd_time,_tmpAgencyName,_tmpAgencyId,_tmpProjectName,_tmpProjectId,_tmpStoreName,_tmpStoreId,_tmpPicId,_tmpPicAvatar,_tmpPicFullName);
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
  public Object getJob(final String id, final Continuation<? super Job> p1) {
    final String _sql = "SELECT * FROM job WHERE job.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Job>() {
      @Override
      public Job call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfProjectName = CursorUtil.getColumnIndexOrThrow(_cursor, "projectName");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfStoreName = CursorUtil.getColumnIndexOrThrow(_cursor, "storeName");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "storeId");
          final int _cursorIndexOfPicId = CursorUtil.getColumnIndexOrThrow(_cursor, "picId");
          final int _cursorIndexOfPicAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "picAvatar");
          final int _cursorIndexOfPicFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "picFullName");
          final Job _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpRole;
            _tmpRole = _cursor.getString(_cursorIndexOfRole);
            final Long _tmpStart_time;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStart_time = null;
            } else {
              _tmpStart_time = _cursor.getLong(_cursorIndexOfStartTime);
            }
            final Long _tmpEnd_time;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmpEnd_time = null;
            } else {
              _tmpEnd_time = _cursor.getLong(_cursorIndexOfEndTime);
            }
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpProjectName;
            _tmpProjectName = _cursor.getString(_cursorIndexOfProjectName);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpStoreName;
            _tmpStoreName = _cursor.getString(_cursorIndexOfStoreName);
            final String _tmpStoreId;
            _tmpStoreId = _cursor.getString(_cursorIndexOfStoreId);
            final String _tmpPicId;
            _tmpPicId = _cursor.getString(_cursorIndexOfPicId);
            final String _tmpPicAvatar;
            _tmpPicAvatar = _cursor.getString(_cursorIndexOfPicAvatar);
            final String _tmpPicFullName;
            _tmpPicFullName = _cursor.getString(_cursorIndexOfPicFullName);
            _result = new Job(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpStatus,_tmpRole,_tmpStart_time,_tmpEnd_time,_tmpAgencyName,_tmpAgencyId,_tmpProjectName,_tmpProjectId,_tmpStoreName,_tmpStoreId,_tmpPicId,_tmpPicAvatar,_tmpPicFullName);
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
  public Object getJobPage(final int pageSize, final int pageIndex,
      final Continuation<? super List<Job>> p2) {
    final String _sql = "SELECT * FROM job LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageIndex);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Job>>() {
      @Override
      public List<Job> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfProjectName = CursorUtil.getColumnIndexOrThrow(_cursor, "projectName");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfStoreName = CursorUtil.getColumnIndexOrThrow(_cursor, "storeName");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "storeId");
          final int _cursorIndexOfPicId = CursorUtil.getColumnIndexOrThrow(_cursor, "picId");
          final int _cursorIndexOfPicAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "picAvatar");
          final int _cursorIndexOfPicFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "picFullName");
          final List<Job> _result = new ArrayList<Job>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Job _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpRole;
            _tmpRole = _cursor.getString(_cursorIndexOfRole);
            final Long _tmpStart_time;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStart_time = null;
            } else {
              _tmpStart_time = _cursor.getLong(_cursorIndexOfStartTime);
            }
            final Long _tmpEnd_time;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmpEnd_time = null;
            } else {
              _tmpEnd_time = _cursor.getLong(_cursorIndexOfEndTime);
            }
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpProjectName;
            _tmpProjectName = _cursor.getString(_cursorIndexOfProjectName);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpStoreName;
            _tmpStoreName = _cursor.getString(_cursorIndexOfStoreName);
            final String _tmpStoreId;
            _tmpStoreId = _cursor.getString(_cursorIndexOfStoreId);
            final String _tmpPicId;
            _tmpPicId = _cursor.getString(_cursorIndexOfPicId);
            final String _tmpPicAvatar;
            _tmpPicAvatar = _cursor.getString(_cursorIndexOfPicAvatar);
            final String _tmpPicFullName;
            _tmpPicFullName = _cursor.getString(_cursorIndexOfPicFullName);
            _item = new Job(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpStatus,_tmpRole,_tmpStart_time,_tmpEnd_time,_tmpAgencyName,_tmpAgencyId,_tmpProjectName,_tmpProjectId,_tmpStoreName,_tmpStoreId,_tmpPicId,_tmpPicAvatar,_tmpPicFullName);
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

  @Override
  public Object filterJobByTime(final long startTime, final long endTime,
      final Continuation<? super List<Job>> p2) {
    final String _sql = "SELECT * FROM job WHERE start_time BETWEEN ? AND ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, startTime);
    _argIndex = 2;
    _statement.bindLong(_argIndex, endTime);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Job>>() {
      @Override
      public List<Job> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfProjectName = CursorUtil.getColumnIndexOrThrow(_cursor, "projectName");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfStoreName = CursorUtil.getColumnIndexOrThrow(_cursor, "storeName");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "storeId");
          final int _cursorIndexOfPicId = CursorUtil.getColumnIndexOrThrow(_cursor, "picId");
          final int _cursorIndexOfPicAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "picAvatar");
          final int _cursorIndexOfPicFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "picFullName");
          final List<Job> _result = new ArrayList<Job>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Job _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpRole;
            _tmpRole = _cursor.getString(_cursorIndexOfRole);
            final Long _tmpStart_time;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStart_time = null;
            } else {
              _tmpStart_time = _cursor.getLong(_cursorIndexOfStartTime);
            }
            final Long _tmpEnd_time;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmpEnd_time = null;
            } else {
              _tmpEnd_time = _cursor.getLong(_cursorIndexOfEndTime);
            }
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpProjectName;
            _tmpProjectName = _cursor.getString(_cursorIndexOfProjectName);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpStoreName;
            _tmpStoreName = _cursor.getString(_cursorIndexOfStoreName);
            final String _tmpStoreId;
            _tmpStoreId = _cursor.getString(_cursorIndexOfStoreId);
            final String _tmpPicId;
            _tmpPicId = _cursor.getString(_cursorIndexOfPicId);
            final String _tmpPicAvatar;
            _tmpPicAvatar = _cursor.getString(_cursorIndexOfPicAvatar);
            final String _tmpPicFullName;
            _tmpPicFullName = _cursor.getString(_cursorIndexOfPicFullName);
            _item = new Job(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpStatus,_tmpRole,_tmpStart_time,_tmpEnd_time,_tmpAgencyName,_tmpAgencyId,_tmpProjectName,_tmpProjectId,_tmpStoreName,_tmpStoreId,_tmpPicId,_tmpPicAvatar,_tmpPicFullName);
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

  @Override
  public Object filterJobByStatus(final String status, final Continuation<? super List<Job>> p1) {
    final String _sql = "SELECT * FROM job WHERE status =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (status == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, status);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<Job>>() {
      @Override
      public List<Job> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfProjectName = CursorUtil.getColumnIndexOrThrow(_cursor, "projectName");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfStoreName = CursorUtil.getColumnIndexOrThrow(_cursor, "storeName");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "storeId");
          final int _cursorIndexOfPicId = CursorUtil.getColumnIndexOrThrow(_cursor, "picId");
          final int _cursorIndexOfPicAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "picAvatar");
          final int _cursorIndexOfPicFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "picFullName");
          final List<Job> _result = new ArrayList<Job>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Job _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpRole;
            _tmpRole = _cursor.getString(_cursorIndexOfRole);
            final Long _tmpStart_time;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStart_time = null;
            } else {
              _tmpStart_time = _cursor.getLong(_cursorIndexOfStartTime);
            }
            final Long _tmpEnd_time;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmpEnd_time = null;
            } else {
              _tmpEnd_time = _cursor.getLong(_cursorIndexOfEndTime);
            }
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpProjectName;
            _tmpProjectName = _cursor.getString(_cursorIndexOfProjectName);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpStoreName;
            _tmpStoreName = _cursor.getString(_cursorIndexOfStoreName);
            final String _tmpStoreId;
            _tmpStoreId = _cursor.getString(_cursorIndexOfStoreId);
            final String _tmpPicId;
            _tmpPicId = _cursor.getString(_cursorIndexOfPicId);
            final String _tmpPicAvatar;
            _tmpPicAvatar = _cursor.getString(_cursorIndexOfPicAvatar);
            final String _tmpPicFullName;
            _tmpPicFullName = _cursor.getString(_cursorIndexOfPicFullName);
            _item = new Job(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpStatus,_tmpRole,_tmpStart_time,_tmpEnd_time,_tmpAgencyName,_tmpAgencyId,_tmpProjectName,_tmpProjectId,_tmpStoreName,_tmpStoreId,_tmpPicId,_tmpPicAvatar,_tmpPicFullName);
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
  public Object filterJobAtStore(final String projectId, final String storeId, final long startTime,
      final long endTime, final Continuation<? super List<Job>> p4) {
    final String _sql = "SELECT * FROM job WHERE projectId =? AND storeId =? AND start_time BETWEEN ? AND ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (projectId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, projectId);
    }
    _argIndex = 2;
    if (storeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, storeId);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, startTime);
    _argIndex = 4;
    _statement.bindLong(_argIndex, endTime);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Job>>() {
      @Override
      public List<Job> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfProjectName = CursorUtil.getColumnIndexOrThrow(_cursor, "projectName");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfStoreName = CursorUtil.getColumnIndexOrThrow(_cursor, "storeName");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "storeId");
          final int _cursorIndexOfPicId = CursorUtil.getColumnIndexOrThrow(_cursor, "picId");
          final int _cursorIndexOfPicAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "picAvatar");
          final int _cursorIndexOfPicFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "picFullName");
          final List<Job> _result = new ArrayList<Job>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Job _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpRole;
            _tmpRole = _cursor.getString(_cursorIndexOfRole);
            final Long _tmpStart_time;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStart_time = null;
            } else {
              _tmpStart_time = _cursor.getLong(_cursorIndexOfStartTime);
            }
            final Long _tmpEnd_time;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmpEnd_time = null;
            } else {
              _tmpEnd_time = _cursor.getLong(_cursorIndexOfEndTime);
            }
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpProjectName;
            _tmpProjectName = _cursor.getString(_cursorIndexOfProjectName);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpStoreName;
            _tmpStoreName = _cursor.getString(_cursorIndexOfStoreName);
            final String _tmpStoreId;
            _tmpStoreId = _cursor.getString(_cursorIndexOfStoreId);
            final String _tmpPicId;
            _tmpPicId = _cursor.getString(_cursorIndexOfPicId);
            final String _tmpPicAvatar;
            _tmpPicAvatar = _cursor.getString(_cursorIndexOfPicAvatar);
            final String _tmpPicFullName;
            _tmpPicFullName = _cursor.getString(_cursorIndexOfPicFullName);
            _item = new Job(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpStatus,_tmpRole,_tmpStart_time,_tmpEnd_time,_tmpAgencyName,_tmpAgencyId,_tmpProjectName,_tmpProjectId,_tmpStoreName,_tmpStoreId,_tmpPicId,_tmpPicAvatar,_tmpPicFullName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p4);
  }

  @Override
  public Object filterJobByProject(final String projectId,
      final Continuation<? super List<Job>> p1) {
    final String _sql = "SELECT * FROM job WHERE projectId =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (projectId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, projectId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<Job>>() {
      @Override
      public List<Job> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfProjectName = CursorUtil.getColumnIndexOrThrow(_cursor, "projectName");
          final int _cursorIndexOfProjectId = CursorUtil.getColumnIndexOrThrow(_cursor, "projectId");
          final int _cursorIndexOfStoreName = CursorUtil.getColumnIndexOrThrow(_cursor, "storeName");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "storeId");
          final int _cursorIndexOfPicId = CursorUtil.getColumnIndexOrThrow(_cursor, "picId");
          final int _cursorIndexOfPicAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "picAvatar");
          final int _cursorIndexOfPicFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "picFullName");
          final List<Job> _result = new ArrayList<Job>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Job _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final Long _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            final Long _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpRole;
            _tmpRole = _cursor.getString(_cursorIndexOfRole);
            final Long _tmpStart_time;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStart_time = null;
            } else {
              _tmpStart_time = _cursor.getLong(_cursorIndexOfStartTime);
            }
            final Long _tmpEnd_time;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmpEnd_time = null;
            } else {
              _tmpEnd_time = _cursor.getLong(_cursorIndexOfEndTime);
            }
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpProjectName;
            _tmpProjectName = _cursor.getString(_cursorIndexOfProjectName);
            final String _tmpProjectId;
            _tmpProjectId = _cursor.getString(_cursorIndexOfProjectId);
            final String _tmpStoreName;
            _tmpStoreName = _cursor.getString(_cursorIndexOfStoreName);
            final String _tmpStoreId;
            _tmpStoreId = _cursor.getString(_cursorIndexOfStoreId);
            final String _tmpPicId;
            _tmpPicId = _cursor.getString(_cursorIndexOfPicId);
            final String _tmpPicAvatar;
            _tmpPicAvatar = _cursor.getString(_cursorIndexOfPicAvatar);
            final String _tmpPicFullName;
            _tmpPicFullName = _cursor.getString(_cursorIndexOfPicFullName);
            _item = new Job(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpStatus,_tmpRole,_tmpStart_time,_tmpEnd_time,_tmpAgencyName,_tmpAgencyId,_tmpProjectName,_tmpProjectId,_tmpStoreName,_tmpStoreId,_tmpPicId,_tmpPicAvatar,_tmpPicFullName);
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
}
