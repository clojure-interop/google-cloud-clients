(ns com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings
  "Settings class to configure an instance of SessionsStub.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of detectIntent to 30 seconds:



  SessionsStubSettings.Builder sessionsSettingsBuilder =
      SessionsStubSettings.newBuilder();
  sessionsSettingsBuilder.detectIntentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SessionsStubSettings sessionsSettings = sessionsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub SessionsStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SessionsStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SessionsStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SessionsStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SessionsStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SessionsStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SessionsStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SessionsStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SessionsStubSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings$Builder []
    (SessionsStubSettings/newBuilder )))

(defn detect-intent-settings
  "Returns the object with the settings used for calls to detectIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DetectIntentRequest,com.google.cloud.dialogflow.v2beta1.DetectIntentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SessionsStubSettings this]
    (-> this (.detectIntentSettings))))

(defn streaming-detect-intent-settings
  "Returns the object with the settings used for calls to streamingDetectIntent.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest,com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^SessionsStubSettings this]
    (-> this (.streamingDetectIntentSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.SessionsStub`

  throws: java.io.IOException"
  ([^SessionsStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings$Builder [^SessionsStubSettings this]
    (-> this (.toBuilder))))

