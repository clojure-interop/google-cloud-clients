(ns com.google.cloud.firestore.v1.stub.FirestoreAdminStub
  "Base stub class for Google Cloud Firestore Admin API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1.stub FirestoreAdminStub]))

(defn ->firestore-admin-stub
  "Constructor."
  (^FirestoreAdminStub []
    (new FirestoreAdminStub )))

(defn delete-index-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.DeleteIndexRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.deleteIndexCallable))))

(defn list-fields-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListFieldsRequest,com.google.firestore.admin.v1.ListFieldsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.listFieldsCallable))))

(defn import-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ImportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.importDocumentsCallable))))

(defn list-fields-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListFieldsRequest,com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.listFieldsPagedCallable))))

(defn list-indexes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListIndexesRequest,com.google.firestore.admin.v1.ListIndexesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.listIndexesCallable))))

(defn get-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.GetFieldRequest,com.google.firestore.admin.v1.Field>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.getFieldCallable))))

(defn update-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.UpdateFieldRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.updateFieldCallable))))

(defn export-documents-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ExportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.exportDocumentsCallable))))

(defn close
  ""
  ([^FirestoreAdminStub this]
    (-> this (.close))))

(defn create-index-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.CreateIndexRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.createIndexCallable))))

(defn list-indexes-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.ListIndexesRequest,com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.listIndexesPagedCallable))))

(defn get-index-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.firestore.admin.v1.GetIndexRequest,com.google.firestore.admin.v1.Index>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirestoreAdminStub this]
    (-> this (.getIndexCallable))))

