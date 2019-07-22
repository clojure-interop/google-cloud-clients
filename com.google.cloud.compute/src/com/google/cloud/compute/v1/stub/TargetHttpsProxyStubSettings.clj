(ns com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings
  "Settings class to configure an instance of TargetHttpsProxyStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetHttpsProxy to 30 seconds:



  TargetHttpsProxyStubSettings.Builder targetHttpsProxySettingsBuilder =
      TargetHttpsProxyStubSettings.newBuilder();
  targetHttpsProxySettingsBuilder.deleteTargetHttpsProxySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetHttpsProxyStubSettings targetHttpsProxySettings = targetHttpsProxySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetHttpsProxyStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetHttpsProxyStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetHttpsProxyStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetHttpsProxyStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetHttpsProxyStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetHttpsProxyStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings$Builder []
    (TargetHttpsProxyStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetHttpsProxyStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetHttpsProxyStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetHttpsProxyStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetHttpsProxyStubSettings/getDefaultServiceScopes )))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetHttpsProxyStub`

  throws: java.io.IOException"
  ([^TargetHttpsProxyStubSettings this]
    (-> this (.createStub))))

(defn set-quic-override-target-https-proxy-settings
  "Returns the object with the settings used for calls to setQuicOverrideTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.setQuicOverrideTargetHttpsProxySettings))))

(defn delete-target-https-proxy-settings
  "Returns the object with the settings used for calls to deleteTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.deleteTargetHttpsProxySettings))))

(defn set-ssl-certificates-target-https-proxy-settings
  "Returns the object with the settings used for calls to setSslCertificatesTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.setSslCertificatesTargetHttpsProxySettings))))

(defn list-target-https-proxies-settings
  "Returns the object with the settings used for calls to listTargetHttpsProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyList,com.google.cloud.compute.v1.TargetHttpsProxyClient$ListTargetHttpsProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.listTargetHttpsProxiesSettings))))

(defn set-ssl-policy-target-https-proxy-settings
  "Returns the object with the settings used for calls to setSslPolicyTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.setSslPolicyTargetHttpsProxySettings))))

(defn get-target-https-proxy-settings
  "Returns the object with the settings used for calls to getTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.getTargetHttpsProxySettings))))

(defn set-url-map-target-https-proxy-settings
  "Returns the object with the settings used for calls to setUrlMapTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.setUrlMapTargetHttpsProxySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings$Builder [^TargetHttpsProxyStubSettings this]
    (-> this (.toBuilder))))

(defn insert-target-https-proxy-settings
  "Returns the object with the settings used for calls to insertTargetHttpsProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetHttpsProxyStubSettings this]
    (-> this (.insertTargetHttpsProxySettings))))

