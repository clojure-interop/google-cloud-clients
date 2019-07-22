(ns com.google.cloud.compute.v1.TargetSslProxySettings
  "Settings class to configure an instance of TargetSslProxyClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetSslProxy to 30 seconds:



  TargetSslProxySettings.Builder targetSslProxySettingsBuilder =
      TargetSslProxySettings.newBuilder();
  targetSslProxySettingsBuilder.deleteTargetSslProxySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetSslProxySettings targetSslProxySettings = targetSslProxySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxySettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetSslProxySettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetSslProxySettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetSslProxySettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetSslProxySettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.TargetSslProxySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxySettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetSslProxySettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.TargetSslProxySettings$Builder []
    (TargetSslProxySettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetSslProxySettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetSslProxySettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings`

  returns: `com.google.cloud.compute.v1.TargetSslProxySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetSslProxySettings [^com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings stub]
    (TargetSslProxySettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetSslProxySettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetSslProxySettings/getDefaultServiceScopes )))

(defn set-ssl-policy-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setSslPolicyTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxySettings this]
    (-> this (.setSslPolicyTargetSslProxySettings))))

(defn insert-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to insertTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxySettings this]
    (-> this (.insertTargetSslProxySettings))))

(defn set-backend-service-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setBackendServiceTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxySettings this]
    (-> this (.setBackendServiceTargetSslProxySettings))))

(defn delete-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to deleteTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxySettings this]
    (-> this (.deleteTargetSslProxySettings))))

(defn set-ssl-certificates-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setSslCertificatesTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxySettings this]
    (-> this (.setSslCertificatesTargetSslProxySettings))))

(defn set-proxy-header-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to setProxyHeaderTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxySettings this]
    (-> this (.setProxyHeaderTargetSslProxySettings))))

(defn get-target-ssl-proxy-settings
  "Returns the object with the settings used for calls to getTargetSslProxy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest,com.google.cloud.compute.v1.TargetSslProxy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetSslProxySettings this]
    (-> this (.getTargetSslProxySettings))))

(defn list-target-ssl-proxies-settings
  "Returns the object with the settings used for calls to listTargetSslProxies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyList,com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetSslProxySettings this]
    (-> this (.listTargetSslProxiesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.TargetSslProxySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxySettings$Builder [^TargetSslProxySettings this]
    (-> this (.toBuilder))))

