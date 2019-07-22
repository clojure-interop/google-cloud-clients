(ns com.google.cloud.spanner.v1.stub.GrpcSpannerStub
  "gRPC stub implementation for Cloud Spanner API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.v1.stub GrpcSpannerStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.spanner.v1.stub.GrpcSpannerStub`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.v1.stub.GrpcSpannerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcSpannerStub/create client-context callable-factory))
  (^com.google.cloud.spanner.v1.stub.GrpcSpannerStub [^com.google.cloud.spanner.v1.stub.SpannerStubSettings settings]
    (GrpcSpannerStub/create settings)))

(defn partition-query-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.PartitionQueryRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.partitionQueryCallable))))

(defn streaming-read-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^GrpcSpannerStub this]
    (-> this (.streamingReadCallable))))

(defn partition-read-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.PartitionReadRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.partitionReadCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcSpannerStub this]
    (-> this (.isShutdown))))

(defn list-sessions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ListSessionsRequest,com.google.spanner.v1.ListSessionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.listSessionsCallable))))

(defn get-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.GetSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.getSessionCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcSpannerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn read-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.readCallable))))

(defn shutdown
  ""
  ([^GrpcSpannerStub this]
    (-> this (.shutdown))))

(defn execute-streaming-sql-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^GrpcSpannerStub this]
    (-> this (.executeStreamingSqlCallable))))

(defn close
  ""
  ([^GrpcSpannerStub this]
    (-> this (.close))))

(defn commit-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.CommitRequest,com.google.spanner.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.commitCallable))))

(defn rollback-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.rollbackCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcSpannerStub this]
    (-> this (.isTerminated))))

(defn delete-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.DeleteSessionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.deleteSessionCallable))))

(defn create-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.CreateSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.createSessionCallable))))

(defn execute-batch-dml-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ExecuteBatchDmlRequest,com.google.spanner.v1.ExecuteBatchDmlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.executeBatchDmlCallable))))

(defn list-sessions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ListSessionsRequest,com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.listSessionsPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcSpannerStub this]
    (-> this (.shutdownNow))))

(defn begin-transaction-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.BeginTransactionRequest,com.google.spanner.v1.Transaction>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.beginTransactionCallable))))

(defn execute-sql-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSpannerStub this]
    (-> this (.executeSqlCallable))))

