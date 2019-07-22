(ns com.google.cloud.speech.v1p1beta1.SpeechSettings
  "Settings class to configure an instance of SpeechClient.

  The default instance has everything set to sensible defaults:


    The default service address (speech.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of recognize to 30 seconds:



  SpeechSettings.Builder speechSettingsBuilder =
      SpeechSettings.newBuilder();
  speechSettingsBuilder.recognizeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SpeechSettings speechSettings = speechSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.speech.v1p1beta1 SpeechSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SpeechSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SpeechSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SpeechSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.speech.v1p1beta1.SpeechSettings$Builder`"
  (^com.google.cloud.speech.v1p1beta1.SpeechSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SpeechSettings/newBuilder client-context))
  (^com.google.cloud.speech.v1p1beta1.SpeechSettings$Builder []
    (SpeechSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SpeechSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings`

  returns: `com.google.cloud.speech.v1p1beta1.SpeechSettings`

  throws: java.io.IOException"
  (^com.google.cloud.speech.v1p1beta1.SpeechSettings [^com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings stub]
    (SpeechSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SpeechSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SpeechSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SpeechSettings/getDefaultServiceScopes )))

(defn recognize-settings
  "Returns the object with the settings used for calls to recognize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.speech.v1p1beta1.RecognizeRequest,com.google.cloud.speech.v1p1beta1.RecognizeResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpeechSettings this]
    (-> this (.recognizeSettings))))

(defn long-running-recognize-settings
  "Returns the object with the settings used for calls to longRunningRecognize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpeechSettings this]
    (-> this (.longRunningRecognizeSettings))))

(defn long-running-recognize-operation-settings
  "Returns the object with the settings used for calls to longRunningRecognize.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest,com.google.cloud.speech.v1p1beta1.LongRunningRecognizeResponse,com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadata>`"
  ([^SpeechSettings this]
    (-> this (.longRunningRecognizeOperationSettings))))

(defn streaming-recognize-settings
  "Returns the object with the settings used for calls to streamingRecognize.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest,com.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^SpeechSettings this]
    (-> this (.streamingRecognizeSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.speech.v1p1beta1.SpeechSettings$Builder`"
  (^com.google.cloud.speech.v1p1beta1.SpeechSettings$Builder [^SpeechSettings this]
    (-> this (.toBuilder))))

