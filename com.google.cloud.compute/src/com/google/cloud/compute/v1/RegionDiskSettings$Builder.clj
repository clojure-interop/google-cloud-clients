(ns com.google.cloud.compute.v1.RegionDiskSettings$Builder
  "Builder for RegionDiskSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionDiskSettings$Builder]))

(defn delete-region-disk-settings
  "Returns the builder for the settings used for calls to deleteRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.deleteRegionDiskSettings))))

(defn get-region-disk-settings
  "Returns the builder for the settings used for calls to getRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.getRegionDiskSettings))))

(defn create-snapshot-region-disk-settings
  "Returns the builder for the settings used for calls to createSnapshotRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.createSnapshotRegionDiskSettings))))

(defn list-region-disks-settings
  "Returns the builder for the settings used for calls to listRegionDisks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.DiskList,com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.listRegionDisksSettings))))

(defn test-iam-permissions-region-disk-settings
  "Returns the builder for the settings used for calls to testIamPermissionsRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.testIamPermissionsRegionDiskSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RegionDiskSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RegionDiskSettings$Builder [^RegionDiskSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-labels-region-disk-settings
  "Returns the builder for the settings used for calls to setLabelsRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.setLabelsRegionDiskSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionDiskSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionDiskSettings [^RegionDiskSettings$Builder this]
    (-> this (.build))))

(defn insert-region-disk-settings
  "Returns the builder for the settings used for calls to insertRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.insertRegionDiskSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder [^RegionDiskSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn resize-region-disk-settings
  "Returns the builder for the settings used for calls to resizeRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskSettings$Builder this]
    (-> this (.resizeRegionDiskSettings))))

