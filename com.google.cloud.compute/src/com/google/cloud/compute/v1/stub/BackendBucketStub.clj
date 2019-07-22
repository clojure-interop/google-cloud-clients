(ns com.google.cloud.compute.v1.stub.BackendBucketStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub BackendBucketStub]))

(defn ->backend-bucket-stub
  "Constructor."
  (^BackendBucketStub []
    (new BackendBucketStub )))

(defn update-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.updateBackendBucketCallable))))

(defn delete-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.deleteBackendBucketCallable))))

(defn delete-signed-url-key-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.deleteSignedUrlKeyBackendBucketCallable))))

(defn get-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetBackendBucketHttpRequest,com.google.cloud.compute.v1.BackendBucket>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.getBackendBucketCallable))))

(defn patch-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.patchBackendBucketCallable))))

(defn close
  ""
  ([^BackendBucketStub this]
    (-> this (.close))))

(defn list-backend-buckets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.listBackendBucketsCallable))))

(defn list-backend-buckets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.listBackendBucketsPagedCallable))))

(defn insert-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.insertBackendBucketCallable))))

(defn add-signed-url-key-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendBucketStub this]
    (-> this (.addSignedUrlKeyBackendBucketCallable))))

