(ns com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings
  "Settings class to configure an instance of TargetTcpProxyStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetTcpProxy to 30 seconds:



  TargetTcpProxyStubSettings.Builder targetTcpProxySettingsBuilder =
      TargetTcpProxyStubSettings.newBuilder();
  targetTcpProxySettingsBuilder.deleteTargetTcpProxySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetTcpProxyStubSettings targetTcpProxySettings = targetTcpProxySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetTcpProxyStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetTcpProxyStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetTcpProxyStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetTcpProxyStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetTcpProxyStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetTcpProxyStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder []
    (TargetTcpProxyStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetTcpProxyStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetTcpProxyStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetTcpProxyStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetTcpProxyStubSettings/getDefaultServiceScopes )))

(defn delete-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to deleteTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxyStubSettings this]
    (-> this (.deleteTargetTcpProxySettings))))

(defn get-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to getTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.TargetTcpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxyStubSettings this]
    (-> this (.getTargetTcpProxySettings))))

(defn insert-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to insertTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxyStubSettings this]
    (-> this (.insertTargetTcpProxySettings))))

(defn list-target-tcp-proxies-settings
  "Returns the object with the settings used for calls to listTargetTcpProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyList,com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetTcpProxyStubSettings this]
    (-> this (.listTargetTcpProxiesSettings))))

(defn set-backend-service-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to setBackendServiceTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxyStubSettings this]
    (-> this (.setBackendServiceTargetTcpProxySettings))))

(defn set-proxy-header-target-tcp-proxy-settings
  "Returns the object with the settings used for calls to setProxyHeaderTargetTcpProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetTcpProxyStubSettings this]
    (-> this (.setProxyHeaderTargetTcpProxySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetTcpProxyStub`

  throws: java.io.IOException"
  ([^TargetTcpProxyStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings$Builder [^TargetTcpProxyStubSettings this]
    (-> this (.toBuilder))))

