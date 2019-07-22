(ns com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStub
  "Base stub class for BigQuery Storage API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1.stub BigQueryStorageStub]))

(defn ->big-query-storage-stub
  "Constructor."
  (^BigQueryStorageStub []
    (new BigQueryStorageStub )))

(defn create-read-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageStub this]
    (-> this (.createReadSessionCallable))))

(defn read-rows-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^BigQueryStorageStub this]
    (-> this (.readRowsCallable))))

(defn batch-create-read-session-streams-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageStub this]
    (-> this (.batchCreateReadSessionStreamsCallable))))

(defn finalize-stream-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageStub this]
    (-> this (.finalizeStreamCallable))))

(defn split-read-stream-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageStub this]
    (-> this (.splitReadStreamCallable))))

(defn close
  ""
  ([^BigQueryStorageStub this]
    (-> this (.close))))

