(ns com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStub
  "Enhanced stub class for BigQuery Storage API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1.stub EnhancedBigQueryStorageStub]))

(defn *create
  "settings - `com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings`

  returns: `com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStub`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStub [^com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings settings]
    (EnhancedBigQueryStorageStub/create settings)))

(defn batch-create-read-session-streams-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EnhancedBigQueryStorageStub this]
    (-> this (.batchCreateReadSessionStreamsCallable))))

(defn create-read-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EnhancedBigQueryStorageStub this]
    (-> this (.createReadSessionCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^EnhancedBigQueryStorageStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^EnhancedBigQueryStorageStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^EnhancedBigQueryStorageStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^EnhancedBigQueryStorageStub this]
    (-> this (.close))))

(defn read-rows-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^EnhancedBigQueryStorageStub this]
    (-> this (.readRowsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^EnhancedBigQueryStorageStub this]
    (-> this (.isTerminated))))

(defn split-read-stream-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EnhancedBigQueryStorageStub this]
    (-> this (.splitReadStreamCallable))))

(defn shutdown-now
  ""
  ([^EnhancedBigQueryStorageStub this]
    (-> this (.shutdownNow))))

(defn finalize-stream-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EnhancedBigQueryStorageStub this]
    (-> this (.finalizeStreamCallable))))

