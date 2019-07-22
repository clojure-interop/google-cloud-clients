(ns com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2.stub SessionEntityTypesStub]))

(defn ->session-entity-types-stub
  "Constructor."
  (^SessionEntityTypesStub []
    (new SessionEntityTypesStub )))

(defn list-session-entity-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesStub this]
    (-> this (.listSessionEntityTypesPagedCallable))))

(defn list-session-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2.ListSessionEntityTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesStub this]
    (-> this (.listSessionEntityTypesCallable))))

(defn get-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.GetSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesStub this]
    (-> this (.getSessionEntityTypeCallable))))

(defn create-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.CreateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesStub this]
    (-> this (.createSessionEntityTypeCallable))))

(defn update-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesStub this]
    (-> this (.updateSessionEntityTypeCallable))))

(defn delete-session-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesStub this]
    (-> this (.deleteSessionEntityTypeCallable))))

(defn close
  ""
  ([^SessionEntityTypesStub this]
    (-> this (.close))))

