(ns com.google.cloud.compute.v1.SslCertificateSettings
  "Settings class to configure an instance of SslCertificateClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteSslCertificate to 30 seconds:



  SslCertificateSettings.Builder sslCertificateSettingsBuilder =
      SslCertificateSettings.newBuilder();
  sslCertificateSettingsBuilder.deleteSslCertificateSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SslCertificateSettings sslCertificateSettings = sslCertificateSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslCertificateSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (SslCertificateSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SslCertificateSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SslCertificateSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SslCertificateSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.SslCertificateSettings$Builder`"
  (^com.google.cloud.compute.v1.SslCertificateSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SslCertificateSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.SslCertificateSettings$Builder []
    (SslCertificateSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SslCertificateSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (SslCertificateSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.SslCertificateStubSettings`

  returns: `com.google.cloud.compute.v1.SslCertificateSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SslCertificateSettings [^com.google.cloud.compute.v1.stub.SslCertificateStubSettings stub]
    (SslCertificateSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SslCertificateSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SslCertificateSettings/getDefaultServiceScopes )))

(defn delete-ssl-certificate-settings
  "Returns the object with the settings used for calls to deleteSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslCertificateSettings this]
    (-> this (.deleteSslCertificateSettings))))

(defn get-ssl-certificate-settings
  "Returns the object with the settings used for calls to getSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslCertificateSettings this]
    (-> this (.getSslCertificateSettings))))

(defn insert-ssl-certificate-settings
  "Returns the object with the settings used for calls to insertSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslCertificateSettings this]
    (-> this (.insertSslCertificateSettings))))

(defn list-ssl-certificates-settings
  "Returns the object with the settings used for calls to listSslCertificates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList,com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SslCertificateSettings this]
    (-> this (.listSslCertificatesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.SslCertificateSettings$Builder`"
  (^com.google.cloud.compute.v1.SslCertificateSettings$Builder [^SslCertificateSettings this]
    (-> this (.toBuilder))))

