(ns com.google.cloud.spanner.v1.stub.SpannerStub
  "Base stub class for Cloud Spanner API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.v1.stub SpannerStub]))

(defn ->spanner-stub
  "Constructor."
  (^SpannerStub []
    (new SpannerStub )))

(defn partition-query-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.PartitionQueryRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.partitionQueryCallable))))

(defn streaming-read-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^SpannerStub this]
    (-> this (.streamingReadCallable))))

(defn partition-read-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.PartitionReadRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.partitionReadCallable))))

(defn list-sessions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ListSessionsRequest,com.google.spanner.v1.ListSessionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.listSessionsCallable))))

(defn get-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.GetSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.getSessionCallable))))

(defn read-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.readCallable))))

(defn execute-streaming-sql-callable
  "returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^SpannerStub this]
    (-> this (.executeStreamingSqlCallable))))

(defn close
  ""
  ([^SpannerStub this]
    (-> this (.close))))

(defn commit-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.CommitRequest,com.google.spanner.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.commitCallable))))

(defn rollback-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.rollbackCallable))))

(defn delete-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.DeleteSessionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.deleteSessionCallable))))

(defn create-session-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.CreateSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.createSessionCallable))))

(defn execute-batch-dml-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ExecuteBatchDmlRequest,com.google.spanner.v1.ExecuteBatchDmlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.executeBatchDmlCallable))))

(defn list-sessions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ListSessionsRequest,com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.listSessionsPagedCallable))))

(defn begin-transaction-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.BeginTransactionRequest,com.google.spanner.v1.Transaction>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.beginTransactionCallable))))

(defn execute-sql-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerStub this]
    (-> this (.executeSqlCallable))))

