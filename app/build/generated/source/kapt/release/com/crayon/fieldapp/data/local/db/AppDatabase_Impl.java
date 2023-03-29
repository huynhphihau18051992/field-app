package com.crayon.fieldapp.data.local.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.crayon.fieldapp.data.local.dao.GroupStoreDao;
import com.crayon.fieldapp.data.local.dao.GroupStoreDao_Impl;
import com.crayon.fieldapp.data.local.dao.GroupUserDao;
import com.crayon.fieldapp.data.local.dao.GroupUserDao_Impl;
import com.crayon.fieldapp.data.local.dao.JobDao;
import com.crayon.fieldapp.data.local.dao.JobDao_Impl;
import com.crayon.fieldapp.data.local.dao.ProductDao;
import com.crayon.fieldapp.data.local.dao.ProductDao_Impl;
import com.crayon.fieldapp.data.local.dao.ProjectDao;
import com.crayon.fieldapp.data.local.dao.ProjectDao_Impl;
import com.crayon.fieldapp.data.local.dao.StoreDao;
import com.crayon.fieldapp.data.local.dao.StoreDao_Impl;
import com.crayon.fieldapp.data.local.dao.UserDao;
import com.crayon.fieldapp.data.local.dao.UserDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile JobDao _jobDao;

  private volatile ProductDao _productDao;

  private volatile StoreDao _storeDao;

  private volatile ProjectDao _projectDao;

  private volatile UserDao _userDao;

  private volatile GroupStoreDao _groupStoreDao;

  private volatile GroupUserDao _groupUserDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `job` (`id` TEXT NOT NULL, `createdAt` INTEGER, `updatedAt` INTEGER, `name` TEXT, `description` TEXT, `status` TEXT, `role` TEXT, `start_time` INTEGER, `end_time` INTEGER, `agencyName` TEXT, `agencyId` TEXT, `projectName` TEXT, `projectId` TEXT, `storeName` TEXT, `storeId` TEXT, `picId` TEXT, `picAvatar` TEXT, `picFullName` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `product` (`id` TEXT NOT NULL, `projectId` TEXT NOT NULL, `name` TEXT, `price` INTEGER NOT NULL, `isEdit` INTEGER NOT NULL, `endDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `store` (`id` TEXT NOT NULL, `code` TEXT, `name` TEXT, `description` TEXT, `address` TEXT, `lat` REAL, `lng` REAL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `project` (`id` TEXT NOT NULL, `createdAt` INTEGER, `updatedAt` INTEGER, `name` TEXT, `description` TEXT, `brand_name` TEXT, `industry` TEXT, `start_date` INTEGER, `end_date` INTEGER, `status` TEXT, `agencyId` TEXT, `agencyName` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`id` TEXT NOT NULL, `fullName` TEXT, `area_code` TEXT, `mobile_number` TEXT, `email_address` TEXT, `identification_number` TEXT, `avatar_url` TEXT, `birth_day` TEXT, `status` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `groupUser` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `agency` TEXT NOT NULL, `manager` TEXT NOT NULL, `parent` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `groupStore` (`id` TEXT NOT NULL, `code` TEXT NOT NULL, `name` TEXT NOT NULL, `agency` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '70468525c64b00cdce7539e3ebad4959')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `job`");
        _db.execSQL("DROP TABLE IF EXISTS `product`");
        _db.execSQL("DROP TABLE IF EXISTS `store`");
        _db.execSQL("DROP TABLE IF EXISTS `project`");
        _db.execSQL("DROP TABLE IF EXISTS `user`");
        _db.execSQL("DROP TABLE IF EXISTS `groupUser`");
        _db.execSQL("DROP TABLE IF EXISTS `groupStore`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsJob = new HashMap<String, TableInfo.Column>(18);
        _columnsJob.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("role", new TableInfo.Column("role", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("start_time", new TableInfo.Column("start_time", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("end_time", new TableInfo.Column("end_time", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("agencyName", new TableInfo.Column("agencyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("agencyId", new TableInfo.Column("agencyId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("projectName", new TableInfo.Column("projectName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("projectId", new TableInfo.Column("projectId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("storeName", new TableInfo.Column("storeName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("storeId", new TableInfo.Column("storeId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("picId", new TableInfo.Column("picId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("picAvatar", new TableInfo.Column("picAvatar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJob.put("picFullName", new TableInfo.Column("picFullName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysJob = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesJob = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoJob = new TableInfo("job", _columnsJob, _foreignKeysJob, _indicesJob);
        final TableInfo _existingJob = TableInfo.read(_db, "job");
        if (! _infoJob.equals(_existingJob)) {
          return new RoomOpenHelper.ValidationResult(false, "job(com.crayon.fieldapp.data.model.Job).\n"
                  + " Expected:\n" + _infoJob + "\n"
                  + " Found:\n" + _existingJob);
        }
        final HashMap<String, TableInfo.Column> _columnsProduct = new HashMap<String, TableInfo.Column>(6);
        _columnsProduct.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("projectId", new TableInfo.Column("projectId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("isEdit", new TableInfo.Column("isEdit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("endDate", new TableInfo.Column("endDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProduct = new TableInfo("product", _columnsProduct, _foreignKeysProduct, _indicesProduct);
        final TableInfo _existingProduct = TableInfo.read(_db, "product");
        if (! _infoProduct.equals(_existingProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "product(com.crayon.fieldapp.data.model.ProductEntity).\n"
                  + " Expected:\n" + _infoProduct + "\n"
                  + " Found:\n" + _existingProduct);
        }
        final HashMap<String, TableInfo.Column> _columnsStore = new HashMap<String, TableInfo.Column>(7);
        _columnsStore.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStore.put("code", new TableInfo.Column("code", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStore.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStore.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStore.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStore.put("lat", new TableInfo.Column("lat", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStore.put("lng", new TableInfo.Column("lng", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStore = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStore = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStore = new TableInfo("store", _columnsStore, _foreignKeysStore, _indicesStore);
        final TableInfo _existingStore = TableInfo.read(_db, "store");
        if (! _infoStore.equals(_existingStore)) {
          return new RoomOpenHelper.ValidationResult(false, "store(com.crayon.fieldapp.data.model.Store).\n"
                  + " Expected:\n" + _infoStore + "\n"
                  + " Found:\n" + _existingStore);
        }
        final HashMap<String, TableInfo.Column> _columnsProject = new HashMap<String, TableInfo.Column>(12);
        _columnsProject.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("brand_name", new TableInfo.Column("brand_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("industry", new TableInfo.Column("industry", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("start_date", new TableInfo.Column("start_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("end_date", new TableInfo.Column("end_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("agencyId", new TableInfo.Column("agencyId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProject.put("agencyName", new TableInfo.Column("agencyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProject = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProject = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProject = new TableInfo("project", _columnsProject, _foreignKeysProject, _indicesProject);
        final TableInfo _existingProject = TableInfo.read(_db, "project");
        if (! _infoProject.equals(_existingProject)) {
          return new RoomOpenHelper.ValidationResult(false, "project(com.crayon.fieldapp.data.model.Project).\n"
                  + " Expected:\n" + _infoProject + "\n"
                  + " Found:\n" + _existingProject);
        }
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(9);
        _columnsUser.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("fullName", new TableInfo.Column("fullName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("area_code", new TableInfo.Column("area_code", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("mobile_number", new TableInfo.Column("mobile_number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("email_address", new TableInfo.Column("email_address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("identification_number", new TableInfo.Column("identification_number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("birth_day", new TableInfo.Column("birth_day", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "user(com.crayon.fieldapp.data.model.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsGroupUser = new HashMap<String, TableInfo.Column>(5);
        _columnsGroupUser.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupUser.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupUser.put("agency", new TableInfo.Column("agency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupUser.put("manager", new TableInfo.Column("manager", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupUser.put("parent", new TableInfo.Column("parent", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroupUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGroupUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroupUser = new TableInfo("groupUser", _columnsGroupUser, _foreignKeysGroupUser, _indicesGroupUser);
        final TableInfo _existingGroupUser = TableInfo.read(_db, "groupUser");
        if (! _infoGroupUser.equals(_existingGroupUser)) {
          return new RoomOpenHelper.ValidationResult(false, "groupUser(com.crayon.fieldapp.data.model.GroupUser).\n"
                  + " Expected:\n" + _infoGroupUser + "\n"
                  + " Found:\n" + _existingGroupUser);
        }
        final HashMap<String, TableInfo.Column> _columnsGroupStore = new HashMap<String, TableInfo.Column>(4);
        _columnsGroupStore.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupStore.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupStore.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupStore.put("agency", new TableInfo.Column("agency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroupStore = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGroupStore = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroupStore = new TableInfo("groupStore", _columnsGroupStore, _foreignKeysGroupStore, _indicesGroupStore);
        final TableInfo _existingGroupStore = TableInfo.read(_db, "groupStore");
        if (! _infoGroupStore.equals(_existingGroupStore)) {
          return new RoomOpenHelper.ValidationResult(false, "groupStore(com.crayon.fieldapp.data.model.GroupStore).\n"
                  + " Expected:\n" + _infoGroupStore + "\n"
                  + " Found:\n" + _existingGroupStore);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "70468525c64b00cdce7539e3ebad4959", "016e68bf405d269bf1f85c80faaa3a48");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "job","product","store","project","user","groupUser","groupStore");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `job`");
      _db.execSQL("DELETE FROM `product`");
      _db.execSQL("DELETE FROM `store`");
      _db.execSQL("DELETE FROM `project`");
      _db.execSQL("DELETE FROM `user`");
      _db.execSQL("DELETE FROM `groupUser`");
      _db.execSQL("DELETE FROM `groupStore`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public JobDao jobDao() {
    if (_jobDao != null) {
      return _jobDao;
    } else {
      synchronized(this) {
        if(_jobDao == null) {
          _jobDao = new JobDao_Impl(this);
        }
        return _jobDao;
      }
    }
  }

  @Override
  public ProductDao productDao() {
    if (_productDao != null) {
      return _productDao;
    } else {
      synchronized(this) {
        if(_productDao == null) {
          _productDao = new ProductDao_Impl(this);
        }
        return _productDao;
      }
    }
  }

  @Override
  public StoreDao storeDao() {
    if (_storeDao != null) {
      return _storeDao;
    } else {
      synchronized(this) {
        if(_storeDao == null) {
          _storeDao = new StoreDao_Impl(this);
        }
        return _storeDao;
      }
    }
  }

  @Override
  public ProjectDao projectDao() {
    if (_projectDao != null) {
      return _projectDao;
    } else {
      synchronized(this) {
        if(_projectDao == null) {
          _projectDao = new ProjectDao_Impl(this);
        }
        return _projectDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public GroupStoreDao groupStoreDao() {
    if (_groupStoreDao != null) {
      return _groupStoreDao;
    } else {
      synchronized(this) {
        if(_groupStoreDao == null) {
          _groupStoreDao = new GroupStoreDao_Impl(this);
        }
        return _groupStoreDao;
      }
    }
  }

  @Override
  public GroupUserDao groupUserDao() {
    if (_groupUserDao != null) {
      return _groupUserDao;
    } else {
      synchronized(this) {
        if(_groupUserDao == null) {
          _groupUserDao = new GroupUserDao_Impl(this);
        }
        return _groupUserDao;
      }
    }
  }
}
