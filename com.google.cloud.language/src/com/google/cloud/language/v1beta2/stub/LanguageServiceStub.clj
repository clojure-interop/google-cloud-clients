(ns com.google.cloud.language.v1beta2.stub.LanguageServiceStub
  "Base stub class for Google Cloud Natural Language API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.language.v1beta2.stub LanguageServiceStub]))

(defn ->language-service-stub
  "Constructor."
  (^LanguageServiceStub []
    (new LanguageServiceStub )))

(defn analyze-sentiment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeSentimentRequest,com.google.cloud.language.v1beta2.AnalyzeSentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceStub this]
    (-> this (.analyzeSentimentCallable))))

(defn analyze-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeEntitiesRequest,com.google.cloud.language.v1beta2.AnalyzeEntitiesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceStub this]
    (-> this (.analyzeEntitiesCallable))))

(defn analyze-entity-sentiment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest,com.google.cloud.language.v1beta2.AnalyzeEntitySentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceStub this]
    (-> this (.analyzeEntitySentimentCallable))))

(defn analyze-syntax-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeSyntaxRequest,com.google.cloud.language.v1beta2.AnalyzeSyntaxResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceStub this]
    (-> this (.analyzeSyntaxCallable))))

(defn classify-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.ClassifyTextRequest,com.google.cloud.language.v1beta2.ClassifyTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceStub this]
    (-> this (.classifyTextCallable))))

(defn annotate-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnnotateTextRequest,com.google.cloud.language.v1beta2.AnnotateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LanguageServiceStub this]
    (-> this (.annotateTextCallable))))

(defn close
  ""
  ([^LanguageServiceStub this]
    (-> this (.close))))

