(ns com.google.cloud.translate.v3beta1.stub.GrpcTranslationServiceStub
  "gRPC stub implementation for Cloud Translation API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.v3beta1.stub GrpcTranslationServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.translate.v3beta1.stub.GrpcTranslationServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.translate.v3beta1.stub.GrpcTranslationServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcTranslationServiceStub/create client-context callable-factory))
  (^com.google.cloud.translate.v3beta1.stub.GrpcTranslationServiceStub [^com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings settings]
    (GrpcTranslationServiceStub/create settings)))

(defn batch-translate-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.batchTranslateTextCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcTranslationServiceStub this]
    (-> this (.getOperationsStub))))

(defn translate-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.TranslateTextRequest,com.google.cloud.translate.v3beta1.TranslateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.translateTextCallable))))

(defn delete-glossary-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.cloud.translate.v3beta1.DeleteGlossaryResponse,com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata>`"
  ([^GrpcTranslationServiceStub this]
    (-> this (.deleteGlossaryOperationCallable))))

(defn create-glossary-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary,com.google.cloud.translate.v3beta1.CreateGlossaryMetadata>`"
  ([^GrpcTranslationServiceStub this]
    (-> this (.createGlossaryOperationCallable))))

(defn get-glossary-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.GetGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.getGlossaryCallable))))

(defn delete-glossary-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.deleteGlossaryCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcTranslationServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcTranslationServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcTranslationServiceStub this]
    (-> this (.shutdown))))

(defn list-glossaries-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.listGlossariesPagedCallable))))

(defn close
  ""
  ([^GrpcTranslationServiceStub this]
    (-> this (.close))))

(defn get-supported-languages-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest,com.google.cloud.translate.v3beta1.SupportedLanguages>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.getSupportedLanguagesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcTranslationServiceStub this]
    (-> this (.isTerminated))))

(defn detect-language-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.DetectLanguageRequest,com.google.cloud.translate.v3beta1.DetectLanguageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.detectLanguageCallable))))

(defn list-glossaries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.ListGlossariesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.listGlossariesCallable))))

(defn shutdown-now
  ""
  ([^GrpcTranslationServiceStub this]
    (-> this (.shutdownNow))))

(defn create-glossary-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTranslationServiceStub this]
    (-> this (.createGlossaryCallable))))

(defn batch-translate-text-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.cloud.translate.v3beta1.BatchTranslateResponse,com.google.cloud.translate.v3beta1.BatchTranslateMetadata>`"
  ([^GrpcTranslationServiceStub this]
    (-> this (.batchTranslateTextOperationCallable))))

