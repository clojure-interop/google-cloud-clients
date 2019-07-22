(ns com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder
  "Builder for ZoneOperationStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ZoneOperationStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder [^ZoneOperationStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ZoneOperationStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-zone-operation-settings
  "Returns the builder for the settings used for calls to deleteZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ZoneOperationStubSettings$Builder this]
    (-> this (.deleteZoneOperationSettings))))

(defn get-zone-operation-settings
  "Returns the builder for the settings used for calls to getZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ZoneOperationStubSettings$Builder this]
    (-> this (.getZoneOperationSettings))))

(defn list-zone-operations-settings
  "Returns the builder for the settings used for calls to listZoneOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ZoneOperationStubSettings$Builder this]
    (-> this (.listZoneOperationsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.ZoneOperationStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings [^ZoneOperationStubSettings$Builder this]
    (-> this (.build))))

