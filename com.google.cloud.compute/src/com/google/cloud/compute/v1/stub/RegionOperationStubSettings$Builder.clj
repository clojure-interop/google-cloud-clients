(ns com.google.cloud.compute.v1.stub.RegionOperationStubSettings$Builder
  "Builder for RegionOperationStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionOperationStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.RegionOperationStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.RegionOperationStubSettings$Builder [^RegionOperationStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RegionOperationStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-region-operation-settings
  "Returns the builder for the settings used for calls to deleteRegionOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionOperationStubSettings$Builder this]
    (-> this (.deleteRegionOperationSettings))))

(defn get-region-operation-settings
  "Returns the builder for the settings used for calls to getRegionOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionOperationStubSettings$Builder this]
    (-> this (.getRegionOperationSettings))))

(defn list-region-operations-settings
  "Returns the builder for the settings used for calls to listRegionOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionOperationStubSettings$Builder this]
    (-> this (.listRegionOperationsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.RegionOperationStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.RegionOperationStubSettings [^RegionOperationStubSettings$Builder this]
    (-> this (.build))))

