(ns com.google.cloud.compute.v1.RegionOperationSettings$Builder
  "Builder for RegionOperationSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionOperationSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RegionOperationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionOperationStubSettings$Builder [^RegionOperationSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RegionOperationSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RegionOperationSettings$Builder [^RegionOperationSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-region-operation-settings
  "Returns the builder for the settings used for calls to deleteRegionOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionOperationSettings$Builder this]
    (-> this (.deleteRegionOperationSettings))))

(defn get-region-operation-settings
  "Returns the builder for the settings used for calls to getRegionOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionOperationSettings$Builder this]
    (-> this (.getRegionOperationSettings))))

(defn list-region-operations-settings
  "Returns the builder for the settings used for calls to listRegionOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionOperationSettings$Builder this]
    (-> this (.listRegionOperationsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionOperationSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionOperationSettings [^RegionOperationSettings$Builder this]
    (-> this (.build))))

