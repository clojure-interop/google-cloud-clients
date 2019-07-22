(ns com.google.cloud.compute.v1.TargetHttpProxySettings
  "Settings class to configure an instance of TargetHttpProxyClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetHttpProxy to 30 seconds:



  TargetHttpProxySettings.Builder targetHttpProxySettingsBuilder =
      TargetHttpProxySettings.newBuilder();
  targetHttpProxySettingsBuilder.deleteTargetHttpProxySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetHttpProxySettings targetHttpProxySettings = targetHttpProxySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpProxySettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetHttpProxySettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetHttpProxySettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetHttpProxySettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetHttpProxySettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.TargetHttpProxySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxySettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetHttpProxySettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.TargetHttpProxySettings$Builder []
    (TargetHttpProxySettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetHttpProxySettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetHttpProxySettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings`

  returns: `com.google.cloud.compute.v1.TargetHttpProxySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetHttpProxySettings [^com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings stub]
    (TargetHttpProxySettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetHttpProxySettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetHttpProxySettings/getDefaultServiceScopes )))

(defn delete-target-http-proxy-settings
  "Returns the object with the settings used for calls to deleteTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpProxySettings this]
    (-> this (.deleteTargetHttpProxySettings))))

(defn get-target-http-proxy-settings
  "Returns the object with the settings used for calls to getTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpProxySettings this]
    (-> this (.getTargetHttpProxySettings))))

(defn insert-target-http-proxy-settings
  "Returns the object with the settings used for calls to insertTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpProxySettings this]
    (-> this (.insertTargetHttpProxySettings))))

(defn list-target-http-proxies-settings
  "Returns the object with the settings used for calls to listTargetHttpProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyList,com.google.cloud.compute.v1.TargetHttpProxyClient$ListTargetHttpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetHttpProxySettings this]
    (-> this (.listTargetHttpProxiesSettings))))

(defn set-url-map-target-http-proxy-settings
  "Returns the object with the settings used for calls to setUrlMapTargetHttpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpProxySettings this]
    (-> this (.setUrlMapTargetHttpProxySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.TargetHttpProxySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxySettings$Builder [^TargetHttpProxySettings this]
    (-> this (.toBuilder))))

