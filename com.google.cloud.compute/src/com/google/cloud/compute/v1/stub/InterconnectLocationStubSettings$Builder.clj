(ns com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder
  "Builder for InterconnectLocationStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectLocationStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings$Builder [^InterconnectLocationStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^InterconnectLocationStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-interconnect-location-settings
  "Returns the builder for the settings used for calls to getInterconnectLocation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectLocationStubSettings$Builder this]
    (-> this (.getInterconnectLocationSettings))))

(defn list-interconnect-locations-settings
  "Returns the builder for the settings used for calls to listInterconnectLocations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList,com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InterconnectLocationStubSettings$Builder this]
    (-> this (.listInterconnectLocationsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings [^InterconnectLocationStubSettings$Builder this]
    (-> this (.build))))

