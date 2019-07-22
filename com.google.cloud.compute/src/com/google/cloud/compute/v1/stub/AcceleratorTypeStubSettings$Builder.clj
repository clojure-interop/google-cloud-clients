(ns com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder
  "Builder for AcceleratorTypeStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AcceleratorTypeStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings$Builder [^AcceleratorTypeStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^AcceleratorTypeStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-accelerator-types-settings
  "Returns the builder for the settings used for calls to aggregatedListAcceleratorTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeAggregatedList,com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AcceleratorTypeStubSettings$Builder this]
    (-> this (.aggregatedListAcceleratorTypesSettings))))

(defn get-accelerator-type-settings
  "Returns the builder for the settings used for calls to getAcceleratorType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetAcceleratorTypeHttpRequest,com.google.cloud.compute.v1.AcceleratorType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AcceleratorTypeStubSettings$Builder this]
    (-> this (.getAcceleratorTypeSettings))))

(defn list-accelerator-types-settings
  "Returns the builder for the settings used for calls to listAcceleratorTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeList,com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AcceleratorTypeStubSettings$Builder this]
    (-> this (.listAcceleratorTypesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings [^AcceleratorTypeStubSettings$Builder this]
    (-> this (.build))))

