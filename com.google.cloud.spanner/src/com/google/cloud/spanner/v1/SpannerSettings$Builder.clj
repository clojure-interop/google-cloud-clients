(ns com.google.cloud.spanner.v1.SpannerSettings$Builder
  "Builder for SpannerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.v1 SpannerSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.spanner.v1.SpannerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.spanner.v1.SpannerSettings$Builder [^SpannerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn execute-batch-dml-settings
  "Returns the builder for the settings used for calls to executeBatchDml.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.ExecuteBatchDmlRequest,com.google.spanner.v1.ExecuteBatchDmlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.executeBatchDmlSettings))))

(defn rollback-settings
  "Returns the builder for the settings used for calls to rollback.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.rollbackSettings))))

(defn list-sessions-settings
  "Returns the builder for the settings used for calls to listSessions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.spanner.v1.ListSessionsRequest,com.google.spanner.v1.ListSessionsResponse,com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.listSessionsSettings))))

(defn delete-session-settings
  "Returns the builder for the settings used for calls to deleteSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.DeleteSessionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.deleteSessionSettings))))

(defn commit-settings
  "Returns the builder for the settings used for calls to commit.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.CommitRequest,com.google.spanner.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.commitSettings))))

(defn create-session-settings
  "Returns the builder for the settings used for calls to createSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.CreateSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.createSessionSettings))))

(defn build
  "returns: `com.google.cloud.spanner.v1.SpannerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.v1.SpannerSettings [^SpannerSettings$Builder this]
    (-> this (.build))))

(defn begin-transaction-settings
  "Returns the builder for the settings used for calls to beginTransaction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.BeginTransactionRequest,com.google.spanner.v1.Transaction>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.beginTransactionSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.spanner.v1.stub.SpannerStubSettings$Builder`"
  (^com.google.cloud.spanner.v1.stub.SpannerStubSettings$Builder [^SpannerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn execute-streaming-sql-settings
  "Returns the builder for the settings used for calls to executeStreamingSql.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings.Builder<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.executeStreamingSqlSettings))))

(defn execute-sql-settings
  "Returns the builder for the settings used for calls to executeSql.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.executeSqlSettings))))

(defn partition-read-settings
  "Returns the builder for the settings used for calls to partitionRead.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.PartitionReadRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.partitionReadSettings))))

(defn read-settings
  "Returns the builder for the settings used for calls to read.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.readSettings))))

(defn streaming-read-settings
  "Returns the builder for the settings used for calls to streamingRead.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings.Builder<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.streamingReadSettings))))

(defn get-session-settings
  "Returns the builder for the settings used for calls to getSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.GetSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.getSessionSettings))))

(defn partition-query-settings
  "Returns the builder for the settings used for calls to partitionQuery.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.spanner.v1.PartitionQueryRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SpannerSettings$Builder this]
    (-> this (.partitionQuerySettings))))

