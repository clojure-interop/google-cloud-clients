(ns com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings
  "Settings class to configure an instance of TargetSslProxyStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetSslProxy to 30 seconds:



  TargetSslProxyStubSettings.Builder targetSslProxySettingsBuilder =
      TargetSslProxyStubSettings.newBuilder();
  targetSslProxySettingsBuilder.deleteTargetSslProxySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetSslProxyStubSettings targetSslProxySettings = targetSslProxySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetSslProxyStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetSslProxyStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetSslProxyStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetSslProxyStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetSslProxyStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetSslProxyStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder []
    (TargetSslProxyStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetSslProxyStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetSslProxyStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetSslProxyStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetSslProxyStubSettings/getDefaultServiceScopes )))

(defn set-ssl-policy-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setSslPolicyTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.setSslPolicyTargetSslProxySettings))))

(defn insert-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to insertTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.insertTargetSslProxySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetSslProxyStub`

  throws: java.io.IOException"
  ([^TargetSslProxyStubSettings this]
    (-> this (.createStub))))

(defn set-backend-service-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setBackendServiceTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.setBackendServiceTargetSslProxySettings))))

(defn delete-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to deleteTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.deleteTargetSslProxySettings))))

(defn set-ssl-certificates-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setSslCertificatesTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.setSslCertificatesTargetSslProxySettings))))

(defn set-proxy-header-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setProxyHeaderTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.setProxyHeaderTargetSslProxySettings))))

(defn get-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to getTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest,com.google.cloud.compute.v1.TargetSslProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.getTargetSslProxySettings))))

(defn list-target-ssl-proxies-settings
  "Returns the object with the settings used for calls to listTargetSslProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyList,com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetSslProxyStubSettings this]
    (-> this (.listTargetSslProxiesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings$Builder [^TargetSslProxyStubSettings this]
    (-> this (.toBuilder))))

