(ns com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder
  "Builder for ZoneStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ZoneStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder [^ZoneStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ZoneStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-zone-settings
  "Returns the builder for the settings used for calls to getZone.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetZoneHttpRequest,com.google.cloud.compute.v1.Zone>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ZoneStubSettings$Builder this]
    (-> this (.getZoneSettings))))

(defn list-zones-settings
  "Returns the builder for the settings used for calls to listZones.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneList,com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ZoneStubSettings$Builder this]
    (-> this (.listZonesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.ZoneStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.ZoneStubSettings [^ZoneStubSettings$Builder this]
    (-> this (.build))))

