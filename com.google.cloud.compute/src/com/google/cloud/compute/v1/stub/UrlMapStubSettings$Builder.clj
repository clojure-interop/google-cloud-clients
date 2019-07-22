(ns com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder
  "Builder for UrlMapStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub UrlMapStubSettings$Builder]))

(defn patch-url-map-settings
  "Returns the builder for the settings used for calls to patchUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.patchUrlMapSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.UrlMapStubSettings$Builder [^UrlMapStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn invalidate-cache-url-map-settings
  "Returns the builder for the settings used for calls to invalidateCacheUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.invalidateCacheUrlMapSettings))))

(defn validate-url-map-settings
  "Returns the builder for the settings used for calls to validateUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ValidateUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMapsValidateResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.validateUrlMapSettings))))

(defn delete-url-map-settings
  "Returns the builder for the settings used for calls to deleteUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.deleteUrlMapSettings))))

(defn insert-url-map-settings
  "Returns the builder for the settings used for calls to insertUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.insertUrlMapSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.UrlMapStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.UrlMapStubSettings [^UrlMapStubSettings$Builder this]
    (-> this (.build))))

(defn list-url-maps-settings
  "Returns the builder for the settings used for calls to listUrlMaps.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapList,com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.listUrlMapsSettings))))

(defn get-url-map-settings
  "Returns the builder for the settings used for calls to getUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMap>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.getUrlMapSettings))))

(defn update-url-map-settings
  "Returns the builder for the settings used for calls to updateUrlMap.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^UrlMapStubSettings$Builder this]
    (-> this (.updateUrlMapSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^UrlMapStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

