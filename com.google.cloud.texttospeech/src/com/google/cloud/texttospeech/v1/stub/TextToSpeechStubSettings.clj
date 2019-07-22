(ns com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings
  "Settings class to configure an instance of TextToSpeechStub.

  The default instance has everything set to sensible defaults:


    The default service address (texttospeech.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of listVoices to 30 seconds:



  TextToSpeechStubSettings.Builder textToSpeechSettingsBuilder =
      TextToSpeechStubSettings.newBuilder();
  textToSpeechSettingsBuilder.listVoicesSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TextToSpeechStubSettings textToSpeechSettings = textToSpeechSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.texttospeech.v1.stub TextToSpeechStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TextToSpeechStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TextToSpeechStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TextToSpeechStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TextToSpeechStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (TextToSpeechStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TextToSpeechStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TextToSpeechStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder`"
  (^com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TextToSpeechStubSettings/newBuilder client-context))
  (^com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder []
    (TextToSpeechStubSettings/newBuilder )))

(defn list-voices-settings
  "Returns the object with the settings used for calls to listVoices.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.texttospeech.v1.ListVoicesRequest,com.google.cloud.texttospeech.v1.ListVoicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TextToSpeechStubSettings this]
    (-> this (.listVoicesSettings))))

(defn synthesize-speech-settings
  "Returns the object with the settings used for calls to synthesizeSpeech.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest,com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TextToSpeechStubSettings this]
    (-> this (.synthesizeSpeechSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.texttospeech.v1.stub.TextToSpeechStub`

  throws: java.io.IOException"
  ([^TextToSpeechStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder`"
  (^com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder [^TextToSpeechStubSettings this]
    (-> this (.toBuilder))))

