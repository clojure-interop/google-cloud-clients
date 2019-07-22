(ns com.google.cloud.compute.v1.stub.DiskStubSettings$Builder
  "Builder for DiskStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub DiskStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.DiskStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.DiskStubSettings$Builder [^DiskStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-disk-settings
  "Returns the builder for the settings used for calls to getDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.getDiskSettings))))

(defn set-labels-disk-settings
  "Returns the builder for the settings used for calls to setLabelsDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetLabelsDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.setLabelsDiskSettings))))

(defn insert-disk-settings
  "Returns the builder for the settings used for calls to insertDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.insertDiskSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.DiskStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.DiskStubSettings [^DiskStubSettings$Builder this]
    (-> this (.build))))

(defn set-iam-policy-disk-settings
  "Returns the builder for the settings used for calls to setIamPolicyDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.setIamPolicyDiskSettings))))

(defn test-iam-permissions-disk-settings
  "Returns the builder for the settings used for calls to testIamPermissionsDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.testIamPermissionsDiskSettings))))

(defn resize-disk-settings
  "Returns the builder for the settings used for calls to resizeDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ResizeDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.resizeDiskSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^DiskStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-disks-settings
  "Returns the builder for the settings used for calls to aggregatedListDisks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskAggregatedList,com.google.cloud.compute.v1.DiskClient$AggregatedListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.aggregatedListDisksSettings))))

(defn list-disks-settings
  "Returns the builder for the settings used for calls to listDisks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskList,com.google.cloud.compute.v1.DiskClient$ListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.listDisksSettings))))

(defn delete-disk-settings
  "Returns the builder for the settings used for calls to deleteDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.deleteDiskSettings))))

(defn get-iam-policy-disk-settings
  "Returns the builder for the settings used for calls to getIamPolicyDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.getIamPolicyDiskSettings))))

(defn create-snapshot-disk-settings
  "Returns the builder for the settings used for calls to createSnapshotDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskStubSettings$Builder this]
    (-> this (.createSnapshotDiskSettings))))

