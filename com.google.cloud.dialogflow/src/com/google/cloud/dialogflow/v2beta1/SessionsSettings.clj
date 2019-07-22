(ns com.google.cloud.dialogflow.v2beta1.SessionsSettings
  "Settings class to configure an instance of SessionsClient.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of detectIntent to 30 seconds:



  SessionsSettings.Builder sessionsSettingsBuilder =
      SessionsSettings.newBuilder();
  sessionsSettingsBuilder.detectIntentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SessionsSettings sessionsSettings = sessionsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 SessionsSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SessionsSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SessionsSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SessionsSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.SessionsSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SessionsSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.SessionsSettings$Builder []
    (SessionsSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SessionsSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.SessionsSettings [^com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings stub]
    (SessionsSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SessionsSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SessionsSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SessionsSettings/getDefaultServiceScopes )))

(defn detect-intent-settings
  "Returns the object with the settings used for calls to detectIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DetectIntentRequest,com.google.cloud.dialogflow.v2beta1.DetectIntentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SessionsSettings this]
    (-> this (.detectIntentSettings))))

(defn streaming-detect-intent-settings
  "Returns the object with the settings used for calls to streamingDetectIntent.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest,com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^SessionsSettings this]
    (-> this (.streamingDetectIntentSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.SessionsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.SessionsSettings$Builder [^SessionsSettings this]
    (-> this (.toBuilder))))

