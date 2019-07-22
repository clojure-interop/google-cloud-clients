(ns com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder
  "Builder for GlobalOperationStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalOperationStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder [^GlobalOperationStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^GlobalOperationStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-global-operations-settings
  "Returns the builder for the settings used for calls to aggregatedListGlobalOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationAggregatedList,com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GlobalOperationStubSettings$Builder this]
    (-> this (.aggregatedListGlobalOperationsSettings))))

(defn delete-global-operation-settings
  "Returns the builder for the settings used for calls to deleteGlobalOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalOperationStubSettings$Builder this]
    (-> this (.deleteGlobalOperationSettings))))

(defn get-global-operation-settings
  "Returns the builder for the settings used for calls to getGlobalOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetGlobalOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalOperationStubSettings$Builder this]
    (-> this (.getGlobalOperationSettings))))

(defn list-global-operations-settings
  "Returns the builder for the settings used for calls to listGlobalOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GlobalOperationStubSettings$Builder this]
    (-> this (.listGlobalOperationsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.GlobalOperationStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.GlobalOperationStubSettings [^GlobalOperationStubSettings$Builder this]
    (-> this (.build))))

