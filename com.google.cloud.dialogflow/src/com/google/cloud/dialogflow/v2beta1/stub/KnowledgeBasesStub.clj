(ns com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub KnowledgeBasesStub]))

(defn ->knowledge-bases-stub
  "Constructor."
  (^KnowledgeBasesStub []
    (new KnowledgeBasesStub )))

(defn list-knowledge-bases-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesStub this]
    (-> this (.listKnowledgeBasesPagedCallable))))

(defn list-knowledge-bases-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesStub this]
    (-> this (.listKnowledgeBasesCallable))))

(defn get-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesStub this]
    (-> this (.getKnowledgeBaseCallable))))

(defn create-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesStub this]
    (-> this (.createKnowledgeBaseCallable))))

(defn delete-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesStub this]
    (-> this (.deleteKnowledgeBaseCallable))))

(defn update-knowledge-base-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesStub this]
    (-> this (.updateKnowledgeBaseCallable))))

(defn close
  ""
  ([^KnowledgeBasesStub this]
    (-> this (.close))))

