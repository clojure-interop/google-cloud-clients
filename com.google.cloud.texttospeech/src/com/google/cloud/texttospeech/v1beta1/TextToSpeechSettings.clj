(ns com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings
  "Settings class to configure an instance of TextToSpeechClient.

  The default instance has everything set to sensible defaults:


    The default service address (texttospeech.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of listVoices to 30 seconds:



  TextToSpeechSettings.Builder textToSpeechSettingsBuilder =
      TextToSpeechSettings.newBuilder();
  textToSpeechSettingsBuilder.listVoicesSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TextToSpeechSettings textToSpeechSettings = textToSpeechSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.texttospeech.v1beta1 TextToSpeechSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TextToSpeechSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TextToSpeechSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TextToSpeechSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings$Builder`"
  (^com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TextToSpeechSettings/newBuilder client-context))
  (^com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings$Builder []
    (TextToSpeechSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TextToSpeechSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.texttospeech.v1beta1.stub.TextToSpeechStubSettings`

  returns: `com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings`

  throws: java.io.IOException"
  (^com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings [^com.google.cloud.texttospeech.v1beta1.stub.TextToSpeechStubSettings stub]
    (TextToSpeechSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (TextToSpeechSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TextToSpeechSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TextToSpeechSettings/getDefaultServiceScopes )))

(defn list-voices-settings
  "Returns the object with the settings used for calls to listVoices.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.texttospeech.v1beta1.ListVoicesRequest,com.google.cloud.texttospeech.v1beta1.ListVoicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TextToSpeechSettings this]
    (-> this (.listVoicesSettings))))

(defn synthesize-speech-settings
  "Returns the object with the settings used for calls to synthesizeSpeech.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest,com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TextToSpeechSettings this]
    (-> this (.synthesizeSpeechSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings$Builder`"
  (^com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings$Builder [^TextToSpeechSettings this]
    (-> this (.toBuilder))))

