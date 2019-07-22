(ns com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStub
  "Base stub class for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub EntityTypesStub]))

(defn ->entity-types-stub
  "Constructor."
  (^EntityTypesStub []
    (new EntityTypesStub )))

(defn batch-create-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.batchCreateEntitiesCallable))))

(defn batch-update-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.batchUpdateEntitiesCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^EntityTypesStub this]
    (-> this (.getOperationsStub))))

(defn create-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.createEntityTypeCallable))))

(defn batch-delete-entities-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStub this]
    (-> this (.batchDeleteEntitiesOperationCallable))))

(defn list-entity-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.EntityTypesClient$ListEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.listEntityTypesPagedCallable))))

(defn get-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.getEntityTypeCallable))))

(defn list-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.listEntityTypesCallable))))

(defn update-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.updateEntityTypeCallable))))

(defn delete-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.deleteEntityTypeCallable))))

(defn batch-delete-entity-types-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStub this]
    (-> this (.batchDeleteEntityTypesOperationCallable))))

(defn batch-update-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.batchUpdateEntityTypesCallable))))

(defn batch-delete-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.batchDeleteEntitiesCallable))))

(defn close
  ""
  ([^EntityTypesStub this]
    (-> this (.close))))

(defn batch-create-entities-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStub this]
    (-> this (.batchCreateEntitiesOperationCallable))))

(defn batch-update-entities-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStub this]
    (-> this (.batchUpdateEntitiesOperationCallable))))

(defn batch-delete-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesStub this]
    (-> this (.batchDeleteEntityTypesCallable))))

(defn batch-update-entity-types-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse,com.google.protobuf.Struct>`"
  ([^EntityTypesStub this]
    (-> this (.batchUpdateEntityTypesOperationCallable))))

