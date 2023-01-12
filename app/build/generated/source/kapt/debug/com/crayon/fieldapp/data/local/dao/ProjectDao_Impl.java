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
import com.crayon.fieldapp.data.model.Project;
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
public final class ProjectDao_Impl implements ProjectDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Project> __insertionAdapterOfProject;

  private final EntityInsertionAdapter<Project> __insertionAdapterOfProject_1;

  private final EntityDeletionOrUpdateAdapter<Project> __deletionAdapterOfProject;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProject;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ProjectDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProject = new EntityInsertionAdapter<Project>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `project` (`id`,`createdAt`,`updatedAt`,`name`,`description`,`brand_name`,`industry`,`start_date`,`end_date`,`status`,`agencyId`,`agencyName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Project value) {
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
        if (value.getBrand_name() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBrand_name());
        }
        if (value.getIndustry() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIndustry());
        }
        if (value.getStart_date() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getStart_date());
        }
        if (value.getEnd_date() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getEnd_date());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStatus());
        }
        if (value.getAgencyId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getAgencyId());
        }
        if (value.getAgencyName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAgencyName());
        }
      }
    };
    this.__insertionAdapterOfProject_1 = new EntityInsertionAdapter<Project>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `project` (`id`,`createdAt`,`updatedAt`,`name`,`description`,`brand_name`,`industry`,`start_date`,`end_date`,`status`,`agencyId`,`agencyName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Project value) {
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
        if (value.getBrand_name() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBrand_name());
        }
        if (value.getIndustry() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIndustry());
        }
        if (value.getStart_date() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getStart_date());
        }
        if (value.getEnd_date() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getEnd_date());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStatus());
        }
        if (value.getAgencyId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getAgencyId());
        }
        if (value.getAgencyName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAgencyName());
        }
      }
    };
    this.__deletionAdapterOfProject = new EntityDeletionOrUpdateAdapter<Project>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `project` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Project value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteProject = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM project WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM project";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Project project, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProject.insert(project);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<Project> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProject.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Project project, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProject_1.insert(project);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteProject(final Project project, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProject.handle(project);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteProject(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProject.acquire();
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
          __preparedStmtOfDeleteProject.release(_stmt);
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
  public Object getProjects(final Continuation<? super List<Project>> p0) {
    final String _sql = "SELECT * FROM project";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Project>>() {
      @Override
      public List<Project> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_name");
          final int _cursorIndexOfIndustry = CursorUtil.getColumnIndexOrThrow(_cursor, "industry");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final List<Project> _result = new ArrayList<Project>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Project _item;
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
            final String _tmpBrand_name;
            _tmpBrand_name = _cursor.getString(_cursorIndexOfBrandName);
            final String _tmpIndustry;
            _tmpIndustry = _cursor.getString(_cursorIndexOfIndustry);
            final Long _tmpStart_date;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmpStart_date = null;
            } else {
              _tmpStart_date = _cursor.getLong(_cursorIndexOfStartDate);
            }
            final Long _tmpEnd_date;
            if (_cursor.isNull(_cursorIndexOfEndDate)) {
              _tmpEnd_date = null;
            } else {
              _tmpEnd_date = _cursor.getLong(_cursorIndexOfEndDate);
            }
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            _item = new Project(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpBrand_name,_tmpIndustry,_tmpStart_date,_tmpEnd_date,_tmpStatus,_tmpAgencyId,_tmpAgencyName);
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
  public Object getProject(final String id, final Continuation<? super Project> p1) {
    final String _sql = "SELECT * FROM project WHERE project.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Project>() {
      @Override
      public Project call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_name");
          final int _cursorIndexOfIndustry = CursorUtil.getColumnIndexOrThrow(_cursor, "industry");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final Project _result;
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
            final String _tmpBrand_name;
            _tmpBrand_name = _cursor.getString(_cursorIndexOfBrandName);
            final String _tmpIndustry;
            _tmpIndustry = _cursor.getString(_cursorIndexOfIndustry);
            final Long _tmpStart_date;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmpStart_date = null;
            } else {
              _tmpStart_date = _cursor.getLong(_cursorIndexOfStartDate);
            }
            final Long _tmpEnd_date;
            if (_cursor.isNull(_cursorIndexOfEndDate)) {
              _tmpEnd_date = null;
            } else {
              _tmpEnd_date = _cursor.getLong(_cursorIndexOfEndDate);
            }
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            _result = new Project(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpBrand_name,_tmpIndustry,_tmpStart_date,_tmpEnd_date,_tmpStatus,_tmpAgencyId,_tmpAgencyName);
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
  public Object getProjectPage(final int pageSize, final int pageIndex,
      final Continuation<? super List<Project>> p2) {
    final String _sql = "SELECT * FROM project LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageIndex);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Project>>() {
      @Override
      public List<Project> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_name");
          final int _cursorIndexOfIndustry = CursorUtil.getColumnIndexOrThrow(_cursor, "industry");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final List<Project> _result = new ArrayList<Project>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Project _item;
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
            final String _tmpBrand_name;
            _tmpBrand_name = _cursor.getString(_cursorIndexOfBrandName);
            final String _tmpIndustry;
            _tmpIndustry = _cursor.getString(_cursorIndexOfIndustry);
            final Long _tmpStart_date;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmpStart_date = null;
            } else {
              _tmpStart_date = _cursor.getLong(_cursorIndexOfStartDate);
            }
            final Long _tmpEnd_date;
            if (_cursor.isNull(_cursorIndexOfEndDate)) {
              _tmpEnd_date = null;
            } else {
              _tmpEnd_date = _cursor.getLong(_cursorIndexOfEndDate);
            }
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            _item = new Project(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpBrand_name,_tmpIndustry,_tmpStart_date,_tmpEnd_date,_tmpStatus,_tmpAgencyId,_tmpAgencyName);
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
  public Object filterProjectByStatus(final String status,
      final Continuation<? super List<Project>> p1) {
    final String _sql = "SELECT * FROM project WHERE status =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (status == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, status);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<Project>>() {
      @Override
      public List<Project> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_name");
          final int _cursorIndexOfIndustry = CursorUtil.getColumnIndexOrThrow(_cursor, "industry");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfAgencyId = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyId");
          final int _cursorIndexOfAgencyName = CursorUtil.getColumnIndexOrThrow(_cursor, "agencyName");
          final List<Project> _result = new ArrayList<Project>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Project _item;
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
            final String _tmpBrand_name;
            _tmpBrand_name = _cursor.getString(_cursorIndexOfBrandName);
            final String _tmpIndustry;
            _tmpIndustry = _cursor.getString(_cursorIndexOfIndustry);
            final Long _tmpStart_date;
            if (_cursor.isNull(_cursorIndexOfStartDate)) {
              _tmpStart_date = null;
            } else {
              _tmpStart_date = _cursor.getLong(_cursorIndexOfStartDate);
            }
            final Long _tmpEnd_date;
            if (_cursor.isNull(_cursorIndexOfEndDate)) {
              _tmpEnd_date = null;
            } else {
              _tmpEnd_date = _cursor.getLong(_cursorIndexOfEndDate);
            }
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpAgencyId;
            _tmpAgencyId = _cursor.getString(_cursorIndexOfAgencyId);
            final String _tmpAgencyName;
            _tmpAgencyName = _cursor.getString(_cursorIndexOfAgencyName);
            _item = new Project(_tmpId,_tmpCreatedAt,_tmpUpdatedAt,_tmpName,_tmpDescription,_tmpBrand_name,_tmpIndustry,_tmpStart_date,_tmpEnd_date,_tmpStatus,_tmpAgencyId,_tmpAgencyName);
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
