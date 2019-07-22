(ns com.google.cloud.talent.v4beta1.stub.CompletionStub
  "Base stub class for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub CompletionStub]))

(defn ->completion-stub
  "Constructor."
  (^CompletionStub []
    (new CompletionStub )))

(defn complete-query-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CompleteQueryRequest,com.google.cloud.talent.v4beta1.CompleteQueryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompletionStub this]
    (-> this (.completeQueryCallable))))

(defn close
  ""
  ([^CompletionStub this]
    (-> this (.close))))

