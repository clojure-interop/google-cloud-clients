(ns com.google.cloud.dialogflow.v2beta1.stub.GrpcEntityTypesStub
  "gRPC stub implementation for Dialogflow API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub GrpcEntityTypesStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.GrpcEntityTypesStub`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcEntityTypesStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcEntityTypesStub/create client-context callable-factory))
  (^com.google.cloud.dialogflow.v2beta1.stub.GrpcEntityTypesStub [^com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings settings]
    (GrpcEntityTypesStub/create settings)))

(defn batch-create-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.batchCreateEntitiesCallable))))

(defn batch-update-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.batchUpdateEntitiesCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcEntityTypesStub this]
    (-> this (.getOperationsStub))))

(defn create-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.createEntityTypeCallable))))

(defn batch-delete-entities-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcEntityTypesStub this]
    (-> this (.batchDeleteEntitiesOperationCallable))))

(defn list-entity-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.EntityTypesClient$ListEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.listEntityTypesPagedCallable))))

(defn get-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.getEntityTypeCallable))))

(defn list-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.listEntityTypesCallable))))

(defn update-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.updateEntityTypeCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcEntityTypesStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcEntityTypesStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcEntityTypesStub this]
    (-> this (.shutdown))))

(defn delete-entity-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.deleteEntityTypeCallable))))

(defn batch-delete-entity-types-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcEntityTypesStub this]
    (-> this (.batchDeleteEntityTypesOperationCallable))))

(defn batch-update-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.batchUpdateEntityTypesCallable))))

(defn batch-delete-entities-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.batchDeleteEntitiesCallable))))

(defn close
  ""
  ([^GrpcEntityTypesStub this]
    (-> this (.close))))

(defn batch-create-entities-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcEntityTypesStub this]
    (-> this (.batchCreateEntitiesOperationCallable))))

(defn batch-update-entities-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^GrpcEntityTypesStub this]
    (-> this (.batchUpdateEntitiesOperationCallable))))

(defn batch-delete-entity-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcEntityTypesStub this]
    (-> this (.batchDeleteEntityTypesCallable))))

(defn batch-update-entity-types-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse,com.google.protobuf.Struct>`"
  ([^GrpcEntityTypesStub this]
    (-> this (.batchUpdateEntityTypesOperationCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcEntityTypesStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcEntityTypesStub this]
    (-> this (.shutdownNow))))

