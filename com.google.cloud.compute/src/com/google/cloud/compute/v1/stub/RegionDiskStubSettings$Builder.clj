(ns com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder
  "Builder for RegionDiskStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionDiskStubSettings$Builder]))

(defn delete-region-disk-settings
  "Returns the builder for the settings used for calls to deleteRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.deleteRegionDiskSettings))))

(defn get-region-disk-settings
  "Returns the builder for the settings used for calls to getRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.getRegionDiskSettings))))

(defn create-snapshot-region-disk-settings
  "Returns the builder for the settings used for calls to createSnapshotRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.createSnapshotRegionDiskSettings))))

(defn list-region-disks-settings
  "Returns the builder for the settings used for calls to listRegionDisks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.DiskList,com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.listRegionDisksSettings))))

(defn test-iam-permissions-region-disk-settings
  "Returns the builder for the settings used for calls to testIamPermissionsRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.testIamPermissionsRegionDiskSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder [^RegionDiskStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-labels-region-disk-settings
  "Returns the builder for the settings used for calls to setLabelsRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.setLabelsRegionDiskSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.RegionDiskStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.RegionDiskStubSettings [^RegionDiskStubSettings$Builder this]
    (-> this (.build))))

(defn insert-region-disk-settings
  "Returns the builder for the settings used for calls to insertRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.insertRegionDiskSettings))))

(defn resize-region-disk-settings
  "Returns the builder for the settings used for calls to resizeRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskStubSettings$Builder this]
    (-> this (.resizeRegionDiskSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RegionDiskStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

