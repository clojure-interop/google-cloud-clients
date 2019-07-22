(ns com.google.cloud.bigquery.storage.v1beta1.stub.GrpcBigQueryStorageStub
  "gRPC stub implementation for BigQuery Storage API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1.stub GrpcBigQueryStorageStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.bigquery.storage.v1beta1.stub.GrpcBigQueryStorageStub`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.storage.v1beta1.stub.GrpcBigQueryStorageStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcBigQueryStorageStub/create client-context callable-factory))
  (^com.google.cloud.bigquery.storage.v1beta1.stub.GrpcBigQueryStorageStub [^com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings settings]
    (GrpcBigQueryStorageStub/create settings)))

(defn batch-create-read-session-streams-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcBigQueryStorageStub this]
    (-> this (.batchCreateReadSessionStreamsCallable))))

(defn create-read-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcBigQueryStorageStub this]
    (-> this (.createReadSessionCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcBigQueryStorageStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcBigQueryStorageStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcBigQueryStorageStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcBigQueryStorageStub this]
    (-> this (.close))))

(defn read-rows-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^GrpcBigQueryStorageStub this]
    (-> this (.readRowsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcBigQueryStorageStub this]
    (-> this (.isTerminated))))

(defn split-read-stream-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcBigQueryStorageStub this]
    (-> this (.splitReadStreamCallable))))

(defn shutdown-now
  ""
  ([^GrpcBigQueryStorageStub this]
    (-> this (.shutdownNow))))

(defn finalize-stream-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcBigQueryStorageStub this]
    (-> this (.finalizeStreamCallable))))

