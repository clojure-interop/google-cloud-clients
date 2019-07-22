(ns com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder
  "Builder for DiskTypeStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub DiskTypeStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.DiskTypeStubSettings$Builder [^DiskTypeStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^DiskTypeStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-disk-types-settings
  "Returns the builder for the settings used for calls to aggregatedListDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList,com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DiskTypeStubSettings$Builder this]
    (-> this (.aggregatedListDiskTypesSettings))))

(defn get-disk-type-settings
  "Returns the builder for the settings used for calls to getDiskType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DiskTypeStubSettings$Builder this]
    (-> this (.getDiskTypeSettings))))

(defn list-disk-types-settings
  "Returns the builder for the settings used for calls to listDiskTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList,com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DiskTypeStubSettings$Builder this]
    (-> this (.listDiskTypesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.DiskTypeStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.DiskTypeStubSettings [^DiskTypeStubSettings$Builder this]
    (-> this (.build))))

