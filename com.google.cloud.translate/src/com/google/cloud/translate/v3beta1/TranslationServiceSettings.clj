(ns com.google.cloud.translate.v3beta1.TranslationServiceSettings
  "Settings class to configure an instance of TranslationServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (translate.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of detectLanguage to 30 seconds:



  TranslationServiceSettings.Builder translationServiceSettingsBuilder =
      TranslationServiceSettings.newBuilder();
  translationServiceSettingsBuilder.detectLanguageSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TranslationServiceSettings translationServiceSettings = translationServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.v3beta1 TranslationServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TranslationServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TranslationServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TranslationServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder`"
  (^com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TranslationServiceSettings/newBuilder client-context))
  (^com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder []
    (TranslationServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TranslationServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings`

  returns: `com.google.cloud.translate.v3beta1.TranslationServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.translate.v3beta1.TranslationServiceSettings [^com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings stub]
    (TranslationServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (TranslationServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TranslationServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TranslationServiceSettings/getDefaultServiceScopes )))

(defn delete-glossary-settings
  "Returns the object with the settings used for calls to deleteGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceSettings this]
    (-> this (.deleteGlossarySettings))))

(defn create-glossary-operation-settings
  "Returns the object with the settings used for calls to createGlossary.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary,com.google.cloud.translate.v3beta1.CreateGlossaryMetadata>`"
  ([^TranslationServiceSettings this]
    (-> this (.createGlossaryOperationSettings))))

(defn delete-glossary-operation-settings
  "Returns the object with the settings used for calls to deleteGlossary.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.cloud.translate.v3beta1.DeleteGlossaryResponse,com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata>`"
  ([^TranslationServiceSettings this]
    (-> this (.deleteGlossaryOperationSettings))))

(defn create-glossary-settings
  "Returns the object with the settings used for calls to createGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceSettings this]
    (-> this (.createGlossarySettings))))

(defn get-glossary-settings
  "Returns the object with the settings used for calls to getGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.GetGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceSettings this]
    (-> this (.getGlossarySettings))))

(defn batch-translate-text-operation-settings
  "Returns the object with the settings used for calls to batchTranslateText.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.cloud.translate.v3beta1.BatchTranslateResponse,com.google.cloud.translate.v3beta1.BatchTranslateMetadata>`"
  ([^TranslationServiceSettings this]
    (-> this (.batchTranslateTextOperationSettings))))

(defn batch-translate-text-settings
  "Returns the object with the settings used for calls to batchTranslateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceSettings this]
    (-> this (.batchTranslateTextSettings))))

(defn detect-language-settings
  "Returns the object with the settings used for calls to detectLanguage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.DetectLanguageRequest,com.google.cloud.translate.v3beta1.DetectLanguageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceSettings this]
    (-> this (.detectLanguageSettings))))

(defn list-glossaries-settings
  "Returns the object with the settings used for calls to listGlossaries.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.ListGlossariesResponse,com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TranslationServiceSettings this]
    (-> this (.listGlossariesSettings))))

(defn get-supported-languages-settings
  "Returns the object with the settings used for calls to getSupportedLanguages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest,com.google.cloud.translate.v3beta1.SupportedLanguages>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceSettings this]
    (-> this (.getSupportedLanguagesSettings))))

(defn translate-text-settings
  "Returns the object with the settings used for calls to translateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.TranslateTextRequest,com.google.cloud.translate.v3beta1.TranslateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceSettings this]
    (-> this (.translateTextSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder`"
  (^com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder [^TranslationServiceSettings this]
    (-> this (.toBuilder))))

