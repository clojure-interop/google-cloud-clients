(ns com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder
  "Builder for LanguageServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.language.v1beta2 LanguageServiceSettings$Builder]))

(defn analyze-entity-sentiment-settings
  "Returns the builder for the settings used for calls to analyzeEntitySentiment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest,com.google.cloud.language.v1beta2.AnalyzeEntitySentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LanguageServiceSettings$Builder this]
    (-> this (.analyzeEntitySentimentSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder [^LanguageServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn analyze-entities-settings
  "Returns the builder for the settings used for calls to analyzeEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.language.v1beta2.AnalyzeEntitiesRequest,com.google.cloud.language.v1beta2.AnalyzeEntitiesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LanguageServiceSettings$Builder this]
    (-> this (.analyzeEntitiesSettings))))

(defn build
  "returns: `com.google.cloud.language.v1beta2.LanguageServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.language.v1beta2.LanguageServiceSettings [^LanguageServiceSettings$Builder this]
    (-> this (.build))))

(defn classify-text-settings
  "Returns the builder for the settings used for calls to classifyText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.language.v1beta2.ClassifyTextRequest,com.google.cloud.language.v1beta2.ClassifyTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LanguageServiceSettings$Builder this]
    (-> this (.classifyTextSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings$Builder`"
  (^com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings$Builder [^LanguageServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn analyze-syntax-settings
  "Returns the builder for the settings used for calls to analyzeSyntax.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.language.v1beta2.AnalyzeSyntaxRequest,com.google.cloud.language.v1beta2.AnalyzeSyntaxResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LanguageServiceSettings$Builder this]
    (-> this (.analyzeSyntaxSettings))))

(defn analyze-sentiment-settings
  "Returns the builder for the settings used for calls to analyzeSentiment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.language.v1beta2.AnalyzeSentimentRequest,com.google.cloud.language.v1beta2.AnalyzeSentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LanguageServiceSettings$Builder this]
    (-> this (.analyzeSentimentSettings))))

(defn annotate-text-settings
  "Returns the builder for the settings used for calls to annotateText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.language.v1beta2.AnnotateTextRequest,com.google.cloud.language.v1beta2.AnnotateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LanguageServiceSettings$Builder this]
    (-> this (.annotateTextSettings))))

