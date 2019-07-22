(ns com.google.cloud.compute.v1.RegionSettings$Builder
  "Builder for RegionSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RegionStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionStubSettings$Builder [^RegionSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RegionSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RegionSettings$Builder [^RegionSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-region-settings
  "Returns the builder for the settings used for calls to getRegion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionHttpRequest,com.google.cloud.compute.v1.Region>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionSettings$Builder this]
    (-> this (.getRegionSettings))))

(defn list-regions-settings
  "Returns the builder for the settings used for calls to listRegions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionList,com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionSettings$Builder this]
    (-> this (.listRegionsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionSettings [^RegionSettings$Builder this]
    (-> this (.build))))

