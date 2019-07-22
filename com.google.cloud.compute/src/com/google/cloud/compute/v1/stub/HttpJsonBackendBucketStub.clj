(ns com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonBackendBucketStub]))

(def *-add-signed-url-key-backend-bucket-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendBucketStub/addSignedUrlKeyBackendBucketMethodDescriptor)

(def *-delete-backend-bucket-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendBucketStub/deleteBackendBucketMethodDescriptor)

(def *-delete-signed-url-key-backend-bucket-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendBucketStub/deleteSignedUrlKeyBackendBucketMethodDescriptor)

(def *-get-backend-bucket-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetBackendBucketHttpRequest,com.google.cloud.compute.v1.BackendBucket>"
  HttpJsonBackendBucketStub/getBackendBucketMethodDescriptor)

(def *-insert-backend-bucket-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendBucketStub/insertBackendBucketMethodDescriptor)

(def *-list-backend-buckets-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketList>"
  HttpJsonBackendBucketStub/listBackendBucketsMethodDescriptor)

(def *-patch-backend-bucket-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendBucketStub/patchBackendBucketMethodDescriptor)

(def *-update-backend-bucket-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonBackendBucketStub/updateBackendBucketMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonBackendBucketStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonBackendBucketStub [^com.google.cloud.compute.v1.stub.BackendBucketStubSettings settings]
    (HttpJsonBackendBucketStub/create settings)))

(defn update-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.updateBackendBucketCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonBackendBucketStub this]
    (-> this (.isShutdown))))

(defn delete-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.deleteBackendBucketCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonBackendBucketStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-signed-url-key-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.deleteSignedUrlKeyBackendBucketCallable))))

(defn shutdown
  ""
  ([^HttpJsonBackendBucketStub this]
    (-> this (.shutdown))))

(defn get-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetBackendBucketHttpRequest,com.google.cloud.compute.v1.BackendBucket>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.getBackendBucketCallable))))

(defn patch-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.patchBackendBucketCallable))))

(defn close
  ""
  ([^HttpJsonBackendBucketStub this]
    (-> this (.close))))

(defn list-backend-buckets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.listBackendBucketsCallable))))

(defn list-backend-buckets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.listBackendBucketsPagedCallable))))

(defn insert-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.insertBackendBucketCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonBackendBucketStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonBackendBucketStub this]
    (-> this (.shutdownNow))))

(defn add-signed-url-key-backend-bucket-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonBackendBucketStub this]
    (-> this (.addSignedUrlKeyBackendBucketCallable))))

