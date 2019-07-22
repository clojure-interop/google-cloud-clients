(ns com.google.cloud.compute.v1.InterconnectLocationSettings$Builder
  "Builder for InterconnectLocationSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocationSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder [^InterconnectLocationSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.InterconnectLocationSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.InterconnectLocationSettings$Builder [^InterconnectLocationSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-interconnect-location-settings
  "Returns the builder for the settings used for calls to getInterconnectLocation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectLocationSettings$Builder this]
    (-> this (.getInterconnectLocationSettings))))

(defn list-interconnect-locations-settings
  "Returns the builder for the settings used for calls to listInterconnectLocations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList,com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InterconnectLocationSettings$Builder this]
    (-> this (.listInterconnectLocationsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectLocationSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InterconnectLocationSettings [^InterconnectLocationSettings$Builder this]
    (-> this (.build))))

