(ns com.google.cloud.compute.v1.ZoneOperationSettings$Builder
  "Builder for ZoneOperationSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneOperationSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings$Builder [^ZoneOperationSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.ZoneOperationSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.ZoneOperationSettings$Builder [^ZoneOperationSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-zone-operation-settings
  "Returns the builder for the settings used for calls to deleteZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ZoneOperationSettings$Builder this]
    (-> this (.deleteZoneOperationSettings))))

(defn get-zone-operation-settings
  "Returns the builder for the settings used for calls to getZoneOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ZoneOperationSettings$Builder this]
    (-> this (.getZoneOperationSettings))))

(defn list-zone-operations-settings
  "Returns the builder for the settings used for calls to listZoneOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ZoneOperationSettings$Builder this]
    (-> this (.listZoneOperationsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.ZoneOperationSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ZoneOperationSettings [^ZoneOperationSettings$Builder this]
    (-> this (.build))))

