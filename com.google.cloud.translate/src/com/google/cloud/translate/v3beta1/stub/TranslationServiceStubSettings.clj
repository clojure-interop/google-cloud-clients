(ns com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings
  "Settings class to configure an instance of TranslationServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (translate.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of detectLanguage to 30 seconds:



  TranslationServiceStubSettings.Builder translationServiceSettingsBuilder =
      TranslationServiceStubSettings.newBuilder();
  translationServiceSettingsBuilder.detectLanguageSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TranslationServiceStubSettings translationServiceSettings = translationServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.v3beta1.stub TranslationServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TranslationServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TranslationServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TranslationServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TranslationServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (TranslationServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TranslationServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TranslationServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder`"
  (^com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TranslationServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder []
    (TranslationServiceStubSettings/newBuilder )))

(defn delete-glossary-settings
  "Returns the object with the settings used for calls to deleteGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceStubSettings this]
    (-> this (.deleteGlossarySettings))))

(defn create-glossary-operation-settings
  "Returns the object with the settings used for calls to createGlossary.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary,com.google.cloud.translate.v3beta1.CreateGlossaryMetadata>`"
  ([^TranslationServiceStubSettings this]
    (-> this (.createGlossaryOperationSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.translate.v3beta1.stub.TranslationServiceStub`

  throws: java.io.IOException"
  ([^TranslationServiceStubSettings this]
    (-> this (.createStub))))

(defn delete-glossary-operation-settings
  "Returns the object with the settings used for calls to deleteGlossary.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.cloud.translate.v3beta1.DeleteGlossaryResponse,com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata>`"
  ([^TranslationServiceStubSettings this]
    (-> this (.deleteGlossaryOperationSettings))))

(defn create-glossary-settings
  "Returns the object with the settings used for calls to createGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceStubSettings this]
    (-> this (.createGlossarySettings))))

(defn get-glossary-settings
  "Returns the object with the settings used for calls to getGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.GetGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceStubSettings this]
    (-> this (.getGlossarySettings))))

(defn batch-translate-text-operation-settings
  "Returns the object with the settings used for calls to batchTranslateText.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.cloud.translate.v3beta1.BatchTranslateResponse,com.google.cloud.translate.v3beta1.BatchTranslateMetadata>`"
  ([^TranslationServiceStubSettings this]
    (-> this (.batchTranslateTextOperationSettings))))

(defn batch-translate-text-settings
  "Returns the object with the settings used for calls to batchTranslateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceStubSettings this]
    (-> this (.batchTranslateTextSettings))))

(defn detect-language-settings
  "Returns the object with the settings used for calls to detectLanguage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.DetectLanguageRequest,com.google.cloud.translate.v3beta1.DetectLanguageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceStubSettings this]
    (-> this (.detectLanguageSettings))))

(defn list-glossaries-settings
  "Returns the object with the settings used for calls to listGlossaries.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.ListGlossariesResponse,com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TranslationServiceStubSettings this]
    (-> this (.listGlossariesSettings))))

(defn get-supported-languages-settings
  "Returns the object with the settings used for calls to getSupportedLanguages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest,com.google.cloud.translate.v3beta1.SupportedLanguages>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceStubSettings this]
    (-> this (.getSupportedLanguagesSettings))))

(defn translate-text-settings
  "Returns the object with the settings used for calls to translateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.translate.v3beta1.TranslateTextRequest,com.google.cloud.translate.v3beta1.TranslateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TranslationServiceStubSettings this]
    (-> this (.translateTextSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder`"
  (^com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder [^TranslationServiceStubSettings this]
    (-> this (.toBuilder))))

