(ns com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder
  "Builder for TranslationServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.v3beta1 TranslationServiceSettings$Builder]))

(defn delete-glossary-settings
  "Returns the builder for the settings used for calls to deleteGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.deleteGlossarySettings))))

(defn create-glossary-operation-settings
  "Returns the builder for the settings used for calls to createGlossary.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary,com.google.cloud.translate.v3beta1.CreateGlossaryMetadata>`"
  ([^TranslationServiceSettings$Builder this]
    (-> this (.createGlossaryOperationSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder [^TranslationServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-glossary-operation-settings
  "Returns the builder for the settings used for calls to deleteGlossary.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.cloud.translate.v3beta1.DeleteGlossaryResponse,com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata>`"
  ([^TranslationServiceSettings$Builder this]
    (-> this (.deleteGlossaryOperationSettings))))

(defn create-glossary-settings
  "Returns the builder for the settings used for calls to createGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.createGlossarySettings))))

(defn get-glossary-settings
  "Returns the builder for the settings used for calls to getGlossary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.translate.v3beta1.GetGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.getGlossarySettings))))

(defn batch-translate-text-operation-settings
  "Returns the builder for the settings used for calls to batchTranslateText.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.cloud.translate.v3beta1.BatchTranslateResponse,com.google.cloud.translate.v3beta1.BatchTranslateMetadata>`"
  ([^TranslationServiceSettings$Builder this]
    (-> this (.batchTranslateTextOperationSettings))))

(defn build
  "returns: `com.google.cloud.translate.v3beta1.TranslationServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.translate.v3beta1.TranslationServiceSettings [^TranslationServiceSettings$Builder this]
    (-> this (.build))))

(defn batch-translate-text-settings
  "Returns the builder for the settings used for calls to batchTranslateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.batchTranslateTextSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder`"
  (^com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder [^TranslationServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn detect-language-settings
  "Returns the builder for the settings used for calls to detectLanguage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.translate.v3beta1.DetectLanguageRequest,com.google.cloud.translate.v3beta1.DetectLanguageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.detectLanguageSettings))))

(defn list-glossaries-settings
  "Returns the builder for the settings used for calls to listGlossaries.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.ListGlossariesResponse,com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.listGlossariesSettings))))

(defn get-supported-languages-settings
  "Returns the builder for the settings used for calls to getSupportedLanguages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest,com.google.cloud.translate.v3beta1.SupportedLanguages>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.getSupportedLanguagesSettings))))

(defn translate-text-settings
  "Returns the builder for the settings used for calls to translateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.translate.v3beta1.TranslateTextRequest,com.google.cloud.translate.v3beta1.TranslateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TranslationServiceSettings$Builder this]
    (-> this (.translateTextSettings))))

