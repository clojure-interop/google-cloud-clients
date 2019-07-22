(ns com.google.cloud.language.v1beta2.LanguageServiceSettings
  "Settings class to configure an instance of LanguageServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (language.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of analyzeSentiment to 30 seconds:



  LanguageServiceSettings.Builder languageServiceSettingsBuilder =
      LanguageServiceSettings.newBuilder();
  languageServiceSettingsBuilder.analyzeSentimentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LanguageServiceSettings languageServiceSettings = languageServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.language.v1beta2 LanguageServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LanguageServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LanguageServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LanguageServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder`"
  (^com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LanguageServiceSettings/newBuilder client-context))
  (^com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder []
    (LanguageServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LanguageServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings`

  returns: `com.google.cloud.language.v1beta2.LanguageServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.language.v1beta2.LanguageServiceSettings [^com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings stub]
    (LanguageServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (LanguageServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LanguageServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LanguageServiceSettings/getDefaultServiceScopes )))

(defn analyze-sentiment-settings
  "Returns the object with the settings used for calls to analyzeSentiment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1beta2.AnalyzeSentimentRequest,com.google.cloud.language.v1beta2.AnalyzeSentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceSettings this]
    (-> this (.analyzeSentimentSettings))))

(defn analyze-entities-settings
  "Returns the object with the settings used for calls to analyzeEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1beta2.AnalyzeEntitiesRequest,com.google.cloud.language.v1beta2.AnalyzeEntitiesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceSettings this]
    (-> this (.analyzeEntitiesSettings))))

(defn analyze-entity-sentiment-settings
  "Returns the object with the settings used for calls to analyzeEntitySentiment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest,com.google.cloud.language.v1beta2.AnalyzeEntitySentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceSettings this]
    (-> this (.analyzeEntitySentimentSettings))))

(defn analyze-syntax-settings
  "Returns the object with the settings used for calls to analyzeSyntax.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1beta2.AnalyzeSyntaxRequest,com.google.cloud.language.v1beta2.AnalyzeSyntaxResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceSettings this]
    (-> this (.analyzeSyntaxSettings))))

(defn classify-text-settings
  "Returns the object with the settings used for calls to classifyText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1beta2.ClassifyTextRequest,com.google.cloud.language.v1beta2.ClassifyTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceSettings this]
    (-> this (.classifyTextSettings))))

(defn annotate-text-settings
  "Returns the object with the settings used for calls to annotateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1beta2.AnnotateTextRequest,com.google.cloud.language.v1beta2.AnnotateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceSettings this]
    (-> this (.annotateTextSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder`"
  (^com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder [^LanguageServiceSettings this]
    (-> this (.toBuilder))))

