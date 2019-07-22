(ns com.google.cloud.compute.v1.ZoneSettings$Builder
  "Builder for ZoneSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ZoneStubSettings$Builder [^ZoneSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.ZoneSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.ZoneSettings$Builder [^ZoneSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-zone-settings
  "Returns the builder for the settings used for calls to getZone.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetZoneHttpRequest,com.google.cloud.compute.v1.Zone>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ZoneSettings$Builder this]
    (-> this (.getZoneSettings))))

(defn list-zones-settings
  "Returns the builder for the settings used for calls to listZones.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneList,com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ZoneSettings$Builder this]
    (-> this (.listZonesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.ZoneSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ZoneSettings [^ZoneSettings$Builder this]
    (-> this (.build))))

