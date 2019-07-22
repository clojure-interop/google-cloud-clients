(ns com.google.cloud.dialogflow.v2beta1.stub.IntentsStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub IntentsStub]))

(defn ->intents-stub
  "Constructor."
  (^IntentsStub []
    (new IntentsStub )))

(defn batch-delete-intents-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^IntentsStub this]
    (-> this (.batchDeleteIntentsOperationCallable))))

(defn get-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.getIntentCallable))))

(defn list-intents-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.listIntentsPagedCallable))))

(defn list-intents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,com.google.cloud.dialogflow.v2beta1.ListIntentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.listIntentsCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^IntentsStub this]
    (-> this (.getOperationsStub))))

(defn batch-update-intents-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse,com.google.protobuf.Struct>`"
  ([^IntentsStub this]
    (-> this (.batchUpdateIntentsOperationCallable))))

(defn update-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.updateIntentCallable))))

(defn batch-update-intents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.batchUpdateIntentsCallable))))

(defn delete-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.deleteIntentCallable))))

(defn close
  ""
  ([^IntentsStub this]
    (-> this (.close))))

(defn batch-delete-intents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.batchDeleteIntentsCallable))))

(defn create-intent-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsStub this]
    (-> this (.createIntentCallable))))

