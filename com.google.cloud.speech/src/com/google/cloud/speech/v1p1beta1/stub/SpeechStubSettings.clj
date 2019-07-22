(ns com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings
  "Settings class to configure an instance of SpeechStub.

  The default instance has everything set to sensible defaults:


    The default service address (speech.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of recognize to 30 seconds:



  SpeechStubSettings.Builder speechSettingsBuilder =
      SpeechStubSettings.newBuilder();
  speechSettingsBuilder.recognizeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SpeechStubSettings speechSettings = speechSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.speech.v1p1beta1.stub SpeechStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SpeechStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SpeechStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SpeechStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SpeechStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SpeechStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SpeechStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SpeechStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings$Builder`"
  (^com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SpeechStubSettings/newBuilder client-context))
  (^com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings$Builder []
    (SpeechStubSettings/newBuilder )))

(defn recognize-settings
  "Returns the object with the settings used for calls to recognize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.speech.v1p1beta1.RecognizeRequest,com.google.cloud.speech.v1p1beta1.RecognizeResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpeechStubSettings this]
    (-> this (.recognizeSettings))))

(defn long-running-recognize-settings
  "Returns the object with the settings used for calls to longRunningRecognize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpeechStubSettings this]
    (-> this (.longRunningRecognizeSettings))))

(defn long-running-recognize-operation-settings
  "Returns the object with the settings used for calls to longRunningRecognize.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest,com.google.cloud.speech.v1p1beta1.LongRunningRecognizeResponse,com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadata>`"
  ([^SpeechStubSettings this]
    (-> this (.longRunningRecognizeOperationSettings))))

(defn streaming-recognize-settings
  "Returns the object with the settings used for calls to streamingRecognize.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest,com.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^SpeechStubSettings this]
    (-> this (.streamingRecognizeSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.speech.v1p1beta1.stub.SpeechStub`

  throws: java.io.IOException"
  ([^SpeechStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings$Builder`"
  (^com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings$Builder [^SpeechStubSettings this]
    (-> this (.toBuilder))))

