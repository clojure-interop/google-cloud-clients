(ns com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder
  "Builder for BigtableTableAdminStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.stub BigtableTableAdminStubSettings$Builder]))

(defn create-table-settings
  "Returns the builder for the settings used for calls to createTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.CreateTableRequest,com.google.bigtable.admin.v2.Table>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.createTableSettings))))

(defn delete-table-settings
  "Returns the builder for the settings used for calls to deleteTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.DeleteTableRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.deleteTableSettings))))

(defn snapshot-table-settings
  "Returns the builder for the settings used for calls to snapshotTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.SnapshotTableRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.snapshotTableSettings))))

(defn modify-column-families-settings
  "Returns the builder for the settings used for calls to modifyColumnFamilies.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest,com.google.bigtable.admin.v2.Table>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.modifyColumnFamiliesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder [^BigtableTableAdminStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn generate-consistency-token-settings
  "Returns the builder for the settings used for calls to generateConsistencyToken.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.GenerateConsistencyTokenRequest,com.google.bigtable.admin.v2.GenerateConsistencyTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.generateConsistencyTokenSettings))))

(defn create-table-from-snapshot-operation-settings
  "Returns the builder for the settings used for calls to createTableFromSnapshot.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.bigtable.admin.v2.CreateTableFromSnapshotRequest,com.google.bigtable.admin.v2.Table,com.google.bigtable.admin.v2.CreateTableFromSnapshotMetadata>`"
  ([^BigtableTableAdminStubSettings$Builder this]
    (-> this (.createTableFromSnapshotOperationSettings))))

(defn delete-snapshot-settings
  "Returns the builder for the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.deleteSnapshotSettings))))

(defn snapshot-table-operation-settings
  "Returns the builder for the settings used for calls to snapshotTable.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.bigtable.admin.v2.SnapshotTableRequest,com.google.bigtable.admin.v2.Snapshot,com.google.bigtable.admin.v2.SnapshotTableMetadata>`"
  ([^BigtableTableAdminStubSettings$Builder this]
    (-> this (.snapshotTableOperationSettings))))

(defn build
  "returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.build))))

(defn list-tables-settings
  "Returns the builder for the settings used for calls to listTables.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.bigtable.admin.v2.ListTablesRequest,com.google.bigtable.admin.v2.ListTablesResponse,com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListTablesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.listTablesSettings))))

(defn drop-row-range-settings
  "Returns the builder for the settings used for calls to dropRowRange.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.DropRowRangeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.dropRowRangeSettings))))

(defn get-table-settings
  "Returns the builder for the settings used for calls to getTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.GetTableRequest,com.google.bigtable.admin.v2.Table>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.getTableSettings))))

(defn create-table-from-snapshot-settings
  "Returns the builder for the settings used for calls to createTableFromSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.CreateTableFromSnapshotRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.createTableFromSnapshotSettings))))

(defn get-snapshot-settings
  "Returns the builder for the settings used for calls to getSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.GetSnapshotRequest,com.google.bigtable.admin.v2.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.getSnapshotSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn check-consistency-settings
  "Returns the builder for the settings used for calls to checkConsistency.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.CheckConsistencyRequest,com.google.bigtable.admin.v2.CheckConsistencyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.checkConsistencySettings))))

(defn list-snapshots-settings
  "Returns the builder for the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.bigtable.admin.v2.ListSnapshotsRequest,com.google.bigtable.admin.v2.ListSnapshotsResponse,com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^BigtableTableAdminStubSettings$Builder this]
    (-> this (.listSnapshotsSettings))))

