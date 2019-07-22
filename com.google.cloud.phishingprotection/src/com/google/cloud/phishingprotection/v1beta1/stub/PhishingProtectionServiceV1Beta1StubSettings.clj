(ns com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings
  "Settings class to configure an instance of PhishingProtectionServiceV1Beta1Stub.

  The default instance has everything set to sensible defaults:


    The default service address (phishingprotection.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of reportPhishing to 30 seconds:



  PhishingProtectionServiceV1Beta1StubSettings.Builder phishingProtectionServiceV1Beta1SettingsBuilder =
      PhishingProtectionServiceV1Beta1StubSettings.newBuilder();
  phishingProtectionServiceV1Beta1SettingsBuilder.reportPhishingSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  PhishingProtectionServiceV1Beta1StubSettings phishingProtectionServiceV1Beta1Settings = phishingProtectionServiceV1Beta1SettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.phishingprotection.v1beta1.stub PhishingProtectionServiceV1Beta1StubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (PhishingProtectionServiceV1Beta1StubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (PhishingProtectionServiceV1Beta1StubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (PhishingProtectionServiceV1Beta1StubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (PhishingProtectionServiceV1Beta1StubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (PhishingProtectionServiceV1Beta1StubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (PhishingProtectionServiceV1Beta1StubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (PhishingProtectionServiceV1Beta1StubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder`"
  (^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (PhishingProtectionServiceV1Beta1StubSettings/newBuilder client-context))
  (^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder []
    (PhishingProtectionServiceV1Beta1StubSettings/newBuilder )))

(defn report-phishing-settings
  "Returns the object with the settings used for calls to reportPhishing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.phishingprotection.v1beta1.ReportPhishingRequest,com.google.phishingprotection.v1beta1.ReportPhishingResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PhishingProtectionServiceV1Beta1StubSettings this]
    (-> this (.reportPhishingSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1Stub`

  throws: java.io.IOException"
  ([^PhishingProtectionServiceV1Beta1StubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder`"
  (^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder [^PhishingProtectionServiceV1Beta1StubSettings this]
    (-> this (.toBuilder))))

