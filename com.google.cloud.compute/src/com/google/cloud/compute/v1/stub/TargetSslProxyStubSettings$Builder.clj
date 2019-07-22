(ns com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder
  "Builder for TargetSslProxyStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetSslProxyStubSettings$Builder]))

(defn set-ssl-policy-target-ssl-proxy-settings
  "Returns the builder for the settings used for calls to setSslPolicyTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.setSslPolicyTargetSslProxySettings))))

(defn insert-target-ssl-proxy-settings
  "Returns the builder for the settings used for calls to insertTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.insertTargetSslProxySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder [^TargetSslProxyStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-backend-service-target-ssl-proxy-settings
  "Returns the builder for the settings used for calls to setBackendServiceTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.setBackendServiceTargetSslProxySettings))))

(defn delete-target-ssl-proxy-settings
  "Returns the builder for the settings used for calls to deleteTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.deleteTargetSslProxySettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings [^TargetSslProxyStubSettings$Builder this]
    (-> this (.build))))

(defn set-ssl-certificates-target-ssl-proxy-settings
  "Returns the builder for the settings used for calls to setSslCertificatesTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.setSslCertificatesTargetSslProxySettings))))

(defn set-proxy-header-target-ssl-proxy-settings
  "Returns the builder for the settings used for calls to setProxyHeaderTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.setProxyHeaderTargetSslProxySettings))))

(defn get-target-ssl-proxy-settings
  "Returns the builder for the settings used for calls to getTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest,com.google.cloud.compute.v1.TargetSslProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.getTargetSslProxySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^TargetSslProxyStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-target-ssl-proxies-settings
  "Returns the builder for the settings used for calls to listTargetSslProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyList,com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetSslProxyStubSettings$Builder this]
    (-> this (.listTargetSslProxiesSettings))))

