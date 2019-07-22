(ns com.google.cloud.compute.v1.TargetTcpProxySettings
  "Settings class to configure an instance of TargetTcpProxyClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetTcpProxy to 30 seconds:



  TargetTcpProxySettings.Builder targetTcpProxySettingsBuilder =
      TargetTcpProxySettings.newBuilder();
  targetTcpProxySettingsBuilder.deleteTargetTcpProxySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetTcpProxySettings targetTcpProxySettings = targetTcpProxySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxySettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetTcpProxySettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetTcpProxySettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetTcpProxySettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetTcpProxySettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.TargetTcpProxySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxySettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetTcpProxySettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.TargetTcpProxySettings$Builder []
    (TargetTcpProxySettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetTcpProxySettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetTcpProxySettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings`

  returns: `com.google.cloud.compute.v1.TargetTcpProxySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetTcpProxySettings [^com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings stub]
    (TargetTcpProxySettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetTcpProxySettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetTcpProxySettings/getDefaultServiceScopes )))

(defn delete-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to deleteTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxySettings this]
    (-> this (.deleteTargetTcpProxySettings))))

(defn get-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to getTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.TargetTcpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxySettings this]
    (-> this (.getTargetTcpProxySettings))))

(defn insert-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to insertTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxySettings this]
    (-> this (.insertTargetTcpProxySettings))))

(defn list-target-tcp-proxies-settings
  "Returns the object with the settings used for calls to listTargetTcpProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyList,com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetTcpProxySettings this]
    (-> this (.listTargetTcpProxiesSettings))))

(defn set-backend-service-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to setBackendServiceTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxySettings this]
    (-> this (.setBackendServiceTargetTcpProxySettings))))

(defn set-proxy-header-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to setProxyHeaderTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxySettings this]
    (-> this (.setProxyHeaderTargetTcpProxySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.TargetTcpProxySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxySettings$Builder [^TargetTcpProxySettings this]
    (-> this (.toBuilder))))

