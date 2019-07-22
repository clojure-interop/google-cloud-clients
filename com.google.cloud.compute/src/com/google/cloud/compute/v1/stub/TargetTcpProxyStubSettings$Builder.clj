(ns com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder
  "Builder for TargetTcpProxyStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetTcpProxyStubSettings$Builder]))

(defn list-target-tcp-proxies-settings
  "Returns the builder for the settings used for calls to listTargetTcpProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyList,com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.listTargetTcpProxiesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder [^TargetTcpProxyStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-target-tcp-proxy-settings
  "Returns the builder for the settings used for calls to deleteTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.deleteTargetTcpProxySettings))))

(defn set-backend-service-target-tcp-proxy-settings
  "Returns the builder for the settings used for calls to setBackendServiceTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.setBackendServiceTargetTcpProxySettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.build))))

(defn set-proxy-header-target-tcp-proxy-settings
  "Returns the builder for the settings used for calls to setProxyHeaderTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.setProxyHeaderTargetTcpProxySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-target-tcp-proxy-settings
  "Returns the builder for the settings used for calls to getTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.TargetTcpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.getTargetTcpProxySettings))))

(defn insert-target-tcp-proxy-settings
  "Returns the builder for the settings used for calls to insertTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetTcpProxyStubSettings$Builder this]
    (-> this (.insertTargetTcpProxySettings))))

