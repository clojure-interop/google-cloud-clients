(ns com.google.cloud.translate.v3beta1.stub.TranslationServiceStub
  "Base stub class for Cloud Translation API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.v3beta1.stub TranslationServiceStub]))

(defn ->translation-service-stub
  "Constructor."
  (^TranslationServiceStub []
    (new TranslationServiceStub )))

(defn batch-translate-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.batchTranslateTextCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^TranslationServiceStub this]
    (-> this (.getOperationsStub))))

(defn translate-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.TranslateTextRequest,com.google.cloud.translate.v3beta1.TranslateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.translateTextCallable))))

(defn delete-glossary-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.cloud.translate.v3beta1.DeleteGlossaryResponse,com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata>`"
  ([^TranslationServiceStub this]
    (-> this (.deleteGlossaryOperationCallable))))

(defn create-glossary-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary,com.google.cloud.translate.v3beta1.CreateGlossaryMetadata>`"
  ([^TranslationServiceStub this]
    (-> this (.createGlossaryOperationCallable))))

(defn get-glossary-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.GetGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.getGlossaryCallable))))

(defn delete-glossary-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.deleteGlossaryCallable))))

(defn list-glossaries-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.listGlossariesPagedCallable))))

(defn close
  ""
  ([^TranslationServiceStub this]
    (-> this (.close))))

(defn get-supported-languages-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest,com.google.cloud.translate.v3beta1.SupportedLanguages>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.getSupportedLanguagesCallable))))

(defn detect-language-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.DetectLanguageRequest,com.google.cloud.translate.v3beta1.DetectLanguageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.detectLanguageCallable))))

(defn list-glossaries-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.ListGlossariesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.listGlossariesCallable))))

(defn create-glossary-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceStub this]
    (-> this (.createGlossaryCallable))))

(defn batch-translate-text-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.cloud.translate.v3beta1.BatchTranslateResponse,com.google.cloud.translate.v3beta1.BatchTranslateMetadata>`"
  ([^TranslationServiceStub this]
    (-> this (.batchTranslateTextOperationCallable))))

