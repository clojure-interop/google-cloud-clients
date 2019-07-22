(ns com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings
  "Settings class to configure an instance of PhishingProtectionServiceV1Beta1Client.

  The default instance has everything set to sensible defaults:


    The default service address (phishingprotection.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of reportPhishing to 30 seconds:



  PhishingProtectionServiceV1Beta1Settings.Builder phishingProtectionServiceV1Beta1SettingsBuilder =
      PhishingProtectionServiceV1Beta1Settings.newBuilder();
  phishingProtectionServiceV1Beta1SettingsBuilder.reportPhishingSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  PhishingProtectionServiceV1Beta1Settings phishingProtectionServiceV1Beta1Settings = phishingProtectionServiceV1Beta1SettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.phishingprotection.v1beta1 PhishingProtectionServiceV1Beta1Settings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (PhishingProtectionServiceV1Beta1Settings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (PhishingProtectionServiceV1Beta1Settings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (PhishingProtectionServiceV1Beta1Settings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder`"
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (PhishingProtectionServiceV1Beta1Settings/newBuilder client-context))
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder []
    (PhishingProtectionServiceV1Beta1Settings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (PhishingProtectionServiceV1Beta1Settings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings`

  returns: `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings`

  throws: java.io.IOException"
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings [^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings stub]
    (PhishingProtectionServiceV1Beta1Settings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (PhishingProtectionServiceV1Beta1Settings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (PhishingProtectionServiceV1Beta1Settings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (PhishingProtectionServiceV1Beta1Settings/getDefaultServiceScopes )))

(defn report-phishing-settings
  "Returns the object with the settings used for calls to reportPhishing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.phishingprotection.v1beta1.ReportPhishingRequest,com.google.phishingprotection.v1beta1.ReportPhishingResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PhishingProtectionServiceV1Beta1Settings this]
    (-> this (.reportPhishingSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder`"
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder [^PhishingProtectionServiceV1Beta1Settings this]
    (-> this (.toBuilder))))

