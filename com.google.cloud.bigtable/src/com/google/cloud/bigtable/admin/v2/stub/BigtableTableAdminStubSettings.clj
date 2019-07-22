(ns com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings
  "Settings class to configure an instance of BigtableTableAdminStub.

  The default instance has everything set to sensible defaults:


    The default service address (bigtableadmin.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createTable to 30 seconds:



  BigtableTableAdminStubSettings.Builder baseBigtableTableAdminSettingsBuilder =
      BigtableTableAdminStubSettings.newBuilder();
  baseBigtableTableAdminSettingsBuilder.createTableSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  BigtableTableAdminStubSettings baseBigtableTableAdminSettings = baseBigtableTableAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.stub BigtableTableAdminStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (BigtableTableAdminStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (BigtableTableAdminStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (BigtableTableAdminStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (BigtableTableAdminStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (BigtableTableAdminStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (BigtableTableAdminStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (BigtableTableAdminStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (BigtableTableAdminStubSettings/newBuilder client-context))
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder []
    (BigtableTableAdminStubSettings/newBuilder )))

(defn create-table-settings
  "Returns the object with the settings used for calls to createTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.CreateTableRequest,com.google.bigtable.admin.v2.Table>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.createTableSettings))))

(defn delete-table-settings
  "Returns the object with the settings used for calls to deleteTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.DeleteTableRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.deleteTableSettings))))

(defn snapshot-table-settings
  "Returns the object with the settings used for calls to snapshotTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.SnapshotTableRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.snapshotTableSettings))))

(defn modify-column-families-settings
  "Returns the object with the settings used for calls to modifyColumnFamilies.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest,com.google.bigtable.admin.v2.Table>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.modifyColumnFamiliesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStub`

  throws: java.io.IOException"
  ([^BigtableTableAdminStubSettings this]
    (-> this (.createStub))))

(defn generate-consistency-token-settings
  "Returns the object with the settings used for calls to generateConsistencyToken.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.GenerateConsistencyTokenRequest,com.google.bigtable.admin.v2.GenerateConsistencyTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.generateConsistencyTokenSettings))))

(defn create-table-from-snapshot-operation-settings
  "Returns the object with the settings used for calls to createTableFromSnapshot.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.bigtable.admin.v2.CreateTableFromSnapshotRequest,com.google.bigtable.admin.v2.Table,com.google.bigtable.admin.v2.CreateTableFromSnapshotMetadata>`"
  ([^BigtableTableAdminStubSettings this]
    (-> this (.createTableFromSnapshotOperationSettings))))

(defn delete-snapshot-settings
  "Returns the object with the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.deleteSnapshotSettings))))

(defn snapshot-table-operation-settings
  "Returns the object with the settings used for calls to snapshotTable.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.bigtable.admin.v2.SnapshotTableRequest,com.google.bigtable.admin.v2.Snapshot,com.google.bigtable.admin.v2.SnapshotTableMetadata>`"
  ([^BigtableTableAdminStubSettings this]
    (-> this (.snapshotTableOperationSettings))))

(defn list-tables-settings
  "Returns the object with the settings used for calls to listTables.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.bigtable.admin.v2.ListTablesRequest,com.google.bigtable.admin.v2.ListTablesResponse,com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListTablesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.listTablesSettings))))

(defn drop-row-range-settings
  "Returns the object with the settings used for calls to dropRowRange.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.DropRowRangeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.dropRowRangeSettings))))

(defn get-table-settings
  "Returns the object with the settings used for calls to getTable.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.GetTableRequest,com.google.bigtable.admin.v2.Table>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.getTableSettings))))

(defn create-table-from-snapshot-settings
  "Returns the object with the settings used for calls to createTableFromSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.CreateTableFromSnapshotRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.createTableFromSnapshotSettings))))

(defn get-snapshot-settings
  "Returns the object with the settings used for calls to getSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.GetSnapshotRequest,com.google.bigtable.admin.v2.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.getSnapshotSettings))))

(defn check-consistency-settings
  "Returns the object with the settings used for calls to checkConsistency.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.CheckConsistencyRequest,com.google.bigtable.admin.v2.CheckConsistencyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.checkConsistencySettings))))

(defn list-snapshots-settings
  "Returns the object with the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.bigtable.admin.v2.ListSnapshotsRequest,com.google.bigtable.admin.v2.ListSnapshotsResponse,com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BigtableTableAdminStubSettings this]
    (-> this (.listSnapshotsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder [^BigtableTableAdminStubSettings this]
    (-> this (.toBuilder))))

