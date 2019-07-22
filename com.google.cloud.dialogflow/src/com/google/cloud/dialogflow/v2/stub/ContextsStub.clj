(ns com.google.cloud.dialogflow.v2.stub.ContextsStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2.stub ContextsStub]))

(defn ->contexts-stub
  "Constructor."
  (^ContextsStub []
    (new ContextsStub )))

(defn list-contexts-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListContextsRequest,com.google.cloud.dialogflow.v2.ContextsClient$ListContextsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsStub this]
    (-> this (.listContextsPagedCallable))))

(defn list-contexts-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListContextsRequest,com.google.cloud.dialogflow.v2.ListContextsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsStub this]
    (-> this (.listContextsCallable))))

(defn get-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.GetContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsStub this]
    (-> this (.getContextCallable))))

(defn create-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.CreateContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsStub this]
    (-> this (.createContextCallable))))

(defn update-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.UpdateContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsStub this]
    (-> this (.updateContextCallable))))

(defn delete-context-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DeleteContextRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsStub this]
    (-> this (.deleteContextCallable))))

(defn delete-all-contexts-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DeleteAllContextsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsStub this]
    (-> this (.deleteAllContextsCallable))))

(defn close
  ""
  ([^ContextsStub this]
    (-> this (.close))))

