(ns com.google.cloud.firestore.v1.stub.GrpcFirestoreAdminStub
  "gRPC stub implementation for Google Cloud Firestore Admin API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1.stub GrpcFirestoreAdminStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.firestore.v1.stub.GrpcFirestoreAdminStub`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.stub.GrpcFirestoreAdminStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcFirestoreAdminStub/create client-context callable-factory))
  (^com.google.cloud.firestore.v1.stub.GrpcFirestoreAdminStub [^com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings settings]
    (GrpcFirestoreAdminStub/create settings)))

(defn delete-index-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.DeleteIndexRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.deleteIndexCallable))))

(defn list-fields-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListFieldsRequest,com.google.firestore.admin.v1.ListFieldsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.listFieldsCallable))))

(defn import-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ImportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.importDocumentsCallable))))

(defn list-fields-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListFieldsRequest,com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.listFieldsPagedCallable))))

(defn list-indexes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListIndexesRequest,com.google.firestore.admin.v1.ListIndexesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.listIndexesCallable))))

(defn get-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.GetFieldRequest,com.google.firestore.admin.v1.Field>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.getFieldCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcFirestoreAdminStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcFirestoreAdminStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcFirestoreAdminStub this]
    (-> this (.shutdown))))

(defn update-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.UpdateFieldRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.updateFieldCallable))))

(defn export-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ExportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.exportDocumentsCallable))))

(defn close
  ""
  ([^GrpcFirestoreAdminStub this]
    (-> this (.close))))

(defn create-index-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.CreateIndexRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.createIndexCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcFirestoreAdminStub this]
    (-> this (.isTerminated))))

(defn list-indexes-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListIndexesRequest,com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.listIndexesPagedCallable))))

(defn get-index-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.GetIndexRequest,com.google.firestore.admin.v1.Index>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcFirestoreAdminStub this]
    (-> this (.getIndexCallable))))

(defn shutdown-now
  ""
  ([^GrpcFirestoreAdminStub this]
    (-> this (.shutdownNow))))

