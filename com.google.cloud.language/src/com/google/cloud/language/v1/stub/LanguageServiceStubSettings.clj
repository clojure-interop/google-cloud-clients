(ns com.google.cloud.language.v1.stub.LanguageServiceStubSettings
  "Settings class to configure an instance of LanguageServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (language.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of analyzeSentiment to 30 seconds:



  LanguageServiceStubSettings.Builder languageServiceSettingsBuilder =
      LanguageServiceStubSettings.newBuilder();
  languageServiceSettingsBuilder.analyzeSentimentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LanguageServiceStubSettings languageServiceSettings = languageServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.language.v1.stub LanguageServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LanguageServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LanguageServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LanguageServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LanguageServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (LanguageServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LanguageServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LanguageServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.language.v1.stub.LanguageServiceStubSettings$Builder`"
  (^com.google.cloud.language.v1.stub.LanguageServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LanguageServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.language.v1.stub.LanguageServiceStubSettings$Builder []
    (LanguageServiceStubSettings/newBuilder )))

(defn analyze-sentiment-settings
  "Returns the object with the settings used for calls to analyzeSentiment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1.AnalyzeSentimentRequest,com.google.cloud.language.v1.AnalyzeSentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceStubSettings this]
    (-> this (.analyzeSentimentSettings))))

(defn analyze-entities-settings
  "Returns the object with the settings used for calls to analyzeEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1.AnalyzeEntitiesRequest,com.google.cloud.language.v1.AnalyzeEntitiesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceStubSettings this]
    (-> this (.analyzeEntitiesSettings))))

(defn analyze-entity-sentiment-settings
  "Returns the object with the settings used for calls to analyzeEntitySentiment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1.AnalyzeEntitySentimentRequest,com.google.cloud.language.v1.AnalyzeEntitySentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceStubSettings this]
    (-> this (.analyzeEntitySentimentSettings))))

(defn analyze-syntax-settings
  "Returns the object with the settings used for calls to analyzeSyntax.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1.AnalyzeSyntaxRequest,com.google.cloud.language.v1.AnalyzeSyntaxResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceStubSettings this]
    (-> this (.analyzeSyntaxSettings))))

(defn classify-text-settings
  "Returns the object with the settings used for calls to classifyText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1.ClassifyTextRequest,com.google.cloud.language.v1.ClassifyTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceStubSettings this]
    (-> this (.classifyTextSettings))))

(defn annotate-text-settings
  "Returns the object with the settings used for calls to annotateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.language.v1.AnnotateTextRequest,com.google.cloud.language.v1.AnnotateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LanguageServiceStubSettings this]
    (-> this (.annotateTextSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.language.v1.stub.LanguageServiceStub`

  throws: java.io.IOException"
  ([^LanguageServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.language.v1.stub.LanguageServiceStubSettings$Builder`"
  (^com.google.cloud.language.v1.stub.LanguageServiceStubSettings$Builder [^LanguageServiceStubSettings this]
    (-> this (.toBuilder))))

