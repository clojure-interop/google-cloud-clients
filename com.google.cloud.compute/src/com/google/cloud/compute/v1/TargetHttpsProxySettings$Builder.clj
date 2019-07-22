(ns com.google.cloud.compute.v1.TargetHttpsProxySettings$Builder
  "Builder for TargetHttpsProxySettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxySettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxySettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.TargetHttpsProxySettings$Builder [^TargetHttpsProxySettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-quic-override-target-https-proxy-settings
  "Returns the builder for the settings used for calls to setQuicOverrideTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.setQuicOverrideTargetHttpsProxySettings))))

(defn delete-target-https-proxy-settings
  "Returns the builder for the settings used for calls to deleteTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.deleteTargetHttpsProxySettings))))

(defn set-ssl-certificates-target-https-proxy-settings
  "Returns the builder for the settings used for calls to setSslCertificatesTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.setSslCertificatesTargetHttpsProxySettings))))

(defn list-target-https-proxies-settings
  "Returns the builder for the settings used for calls to listTargetHttpsProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyList,com.google.cloud.compute.v1.TargetHttpsProxyClient$ListTargetHttpsProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.listTargetHttpsProxiesSettings))))

(defn set-ssl-policy-target-https-proxy-settings
  "Returns the builder for the settings used for calls to setSslPolicyTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.setSslPolicyTargetHttpsProxySettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetHttpsProxySettings [^TargetHttpsProxySettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings$Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn get-target-https-proxy-settings
  "Returns the builder for the settings used for calls to getTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.getTargetHttpsProxySettings))))

(defn set-url-map-target-https-proxy-settings
  "Returns the builder for the settings used for calls to setUrlMapTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.setUrlMapTargetHttpsProxySettings))))

(defn insert-target-https-proxy-settings
  "Returns the builder for the settings used for calls to insertTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetHttpsProxySettings$Builder this]
    (-> this (.insertTargetHttpsProxySettings))))

