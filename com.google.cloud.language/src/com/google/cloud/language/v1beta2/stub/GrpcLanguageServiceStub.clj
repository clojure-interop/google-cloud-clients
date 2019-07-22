(ns com.google.cloud.language.v1beta2.stub.GrpcLanguageServiceStub
  "gRPC stub implementation for Google Cloud Natural Language API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.language.v1beta2.stub GrpcLanguageServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.language.v1beta2.stub.GrpcLanguageServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.language.v1beta2.stub.GrpcLanguageServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcLanguageServiceStub/create client-context callable-factory))
  (^com.google.cloud.language.v1beta2.stub.GrpcLanguageServiceStub [^com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings settings]
    (GrpcLanguageServiceStub/create settings)))

(defn analyze-sentiment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeSentimentRequest,com.google.cloud.language.v1beta2.AnalyzeSentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLanguageServiceStub this]
    (-> this (.analyzeSentimentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcLanguageServiceStub this]
    (-> this (.isShutdown))))

(defn analyze-syntax-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeSyntaxRequest,com.google.cloud.language.v1beta2.AnalyzeSyntaxResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLanguageServiceStub this]
    (-> this (.analyzeSyntaxCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcLanguageServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcLanguageServiceStub this]
    (-> this (.shutdown))))

(defn analyze-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeEntitiesRequest,com.google.cloud.language.v1beta2.AnalyzeEntitiesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLanguageServiceStub this]
    (-> this (.analyzeEntitiesCallable))))

(defn analyze-entity-sentiment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest,com.google.cloud.language.v1beta2.AnalyzeEntitySentimentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLanguageServiceStub this]
    (-> this (.analyzeEntitySentimentCallable))))

(defn close
  ""
  ([^GrpcLanguageServiceStub this]
    (-> this (.close))))

(defn classify-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.ClassifyTextRequest,com.google.cloud.language.v1beta2.ClassifyTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLanguageServiceStub this]
    (-> this (.classifyTextCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcLanguageServiceStub this]
    (-> this (.isTerminated))))

(defn annotate-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.language.v1beta2.AnnotateTextRequest,com.google.cloud.language.v1beta2.AnnotateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcLanguageServiceStub this]
    (-> this (.annotateTextCallable))))

(defn shutdown-now
  ""
  ([^GrpcLanguageServiceStub this]
    (-> this (.shutdownNow))))

