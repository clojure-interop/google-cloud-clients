(ns com.google.cloud.compute.v1.DiskTypeSettings$Builder
  "Builder for DiskTypeSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskTypeSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder [^DiskTypeSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.DiskTypeSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.DiskTypeSettings$Builder [^DiskTypeSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-disk-types-settings
  "Returns the builder for the settings used for calls to aggregatedListDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList,com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DiskTypeSettings$Builder this]
    (-> this (.aggregatedListDiskTypesSettings))))

(defn get-disk-type-settings
  "Returns the builder for the settings used for calls to getDiskType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskTypeSettings$Builder this]
    (-> this (.getDiskTypeSettings))))

(defn list-disk-types-settings
  "Returns the builder for the settings used for calls to listDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList,com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DiskTypeSettings$Builder this]
    (-> this (.listDiskTypesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.DiskTypeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.DiskTypeSettings [^DiskTypeSettings$Builder this]
    (-> this (.build))))

