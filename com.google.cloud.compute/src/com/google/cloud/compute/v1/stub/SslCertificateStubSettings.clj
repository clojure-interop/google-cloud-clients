(ns com.google.cloud.compute.v1.stub.SslCertificateStubSettings
  "Settings class to configure an instance of SslCertificateStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteSslCertificate to 30 seconds:



  SslCertificateStubSettings.Builder sslCertificateSettingsBuilder =
      SslCertificateStubSettings.newBuilder();
  sslCertificateSettingsBuilder.deleteSslCertificateSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SslCertificateStubSettings sslCertificateSettings = sslCertificateSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SslCertificateStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (SslCertificateStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SslCertificateStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SslCertificateStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SslCertificateStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SslCertificateStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder []
    (SslCertificateStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SslCertificateStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (SslCertificateStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SslCertificateStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SslCertificateStubSettings/getDefaultServiceScopes )))

(defn delete-ssl-certificate-settings
  "Returns the object with the settings used for calls to deleteSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslCertificateStubSettings this]
    (-> this (.deleteSslCertificateSettings))))

(defn get-ssl-certificate-settings
  "Returns the object with the settings used for calls to getSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslCertificateStubSettings this]
    (-> this (.getSslCertificateSettings))))

(defn insert-ssl-certificate-settings
  "Returns the object with the settings used for calls to insertSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslCertificateStubSettings this]
    (-> this (.insertSslCertificateSettings))))

(defn list-ssl-certificates-settings
  "Returns the object with the settings used for calls to listSslCertificates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList,com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SslCertificateStubSettings this]
    (-> this (.listSslCertificatesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SslCertificateStub`

  throws: java.io.IOException"
  ([^SslCertificateStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder [^SslCertificateStubSettings this]
    (-> this (.toBuilder))))

