(ns com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder
  "Builder for RegionDiskTypeStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionDiskTypeStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings$Builder [^RegionDiskTypeStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RegionDiskTypeStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-region-disk-type-settings
  "Returns the builder for the settings used for calls to getRegionDiskType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionDiskTypeStubSettings$Builder this]
    (-> this (.getRegionDiskTypeSettings))))

(defn list-region-disk-types-settings
  "Returns the builder for the settings used for calls to listRegionDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeList,com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionDiskTypeStubSettings$Builder this]
    (-> this (.listRegionDiskTypesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings [^RegionDiskTypeStubSettings$Builder this]
    (-> this (.build))))

