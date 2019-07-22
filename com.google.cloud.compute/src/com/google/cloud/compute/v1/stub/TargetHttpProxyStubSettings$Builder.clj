(ns com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings$Builder
  "Builder for TargetHttpProxyStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetHttpProxyStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings$Builder [^TargetHttpProxyStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^TargetHttpProxyStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-target-http-proxy-settings
  "Returns the builder for the settings used for calls to deleteTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpProxyStubSettings$Builder this]
    (-> this (.deleteTargetHttpProxySettings))))

(defn get-target-http-proxy-settings
  "Returns the builder for the settings used for calls to getTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpProxyStubSettings$Builder this]
    (-> this (.getTargetHttpProxySettings))))

(defn insert-target-http-proxy-settings
  "Returns the builder for the settings used for calls to insertTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpProxyStubSettings$Builder this]
    (-> this (.insertTargetHttpProxySettings))))

(defn list-target-http-proxies-settings
  "Returns the builder for the settings used for calls to listTargetHttpProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyList,com.google.cloud.compute.v1.TargetHttpProxyClient$ListTargetHttpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetHttpProxyStubSettings$Builder this]
    (-> this (.listTargetHttpProxiesSettings))))

(defn set-url-map-target-http-proxy-settings
  "Returns the builder for the settings used for calls to setUrlMapTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpProxyStubSettings$Builder this]
    (-> this (.setUrlMapTargetHttpProxySettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings [^TargetHttpProxyStubSettings$Builder this]
    (-> this (.build))))

