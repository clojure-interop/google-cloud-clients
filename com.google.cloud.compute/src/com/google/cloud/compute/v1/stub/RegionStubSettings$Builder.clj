(ns com.google.cloud.compute.v1.stub.RegionStubSettings$Builder
  "Builder for RegionStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.RegionStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.RegionStubSettings$Builder [^RegionStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RegionStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-region-settings
  "Returns the builder for the settings used for calls to getRegion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionHttpRequest,com.google.cloud.compute.v1.Region>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionStubSettings$Builder this]
    (-> this (.getRegionSettings))))

(defn list-regions-settings
  "Returns the builder for the settings used for calls to listRegions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionList,com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionStubSettings$Builder this]
    (-> this (.listRegionsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.RegionStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.RegionStubSettings [^RegionStubSettings$Builder this]
    (-> this (.build))))

