(ns com.google.cloud.spanner.v1.SpannerSettings
  "Settings class to configure an instance of SpannerClient.

  The default instance has everything set to sensible defaults:


    The default service address (spanner.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createSession to 30 seconds:



  SpannerSettings.Builder spannerSettingsBuilder =
      SpannerSettings.newBuilder();
  spannerSettingsBuilder.createSessionSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SpannerSettings spannerSettings = spannerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.v1 SpannerSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SpannerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SpannerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SpannerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.spanner.v1.SpannerSettings$Builder`"
  (^com.google.cloud.spanner.v1.SpannerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SpannerSettings/newBuilder client-context))
  (^com.google.cloud.spanner.v1.SpannerSettings$Builder []
    (SpannerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SpannerSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.spanner.v1.stub.SpannerStubSettings`

  returns: `com.google.cloud.spanner.v1.SpannerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.v1.SpannerSettings [^com.google.cloud.spanner.v1.stub.SpannerStubSettings stub]
    (SpannerSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SpannerSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SpannerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SpannerSettings/getDefaultServiceScopes )))

(defn execute-batch-dml-settings
  "Returns the object with the settings used for calls to executeBatchDml.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.ExecuteBatchDmlRequest,com.google.spanner.v1.ExecuteBatchDmlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.executeBatchDmlSettings))))

(defn rollback-settings
  "Returns the object with the settings used for calls to rollback.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.rollbackSettings))))

(defn list-sessions-settings
  "Returns the object with the settings used for calls to listSessions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.spanner.v1.ListSessionsRequest,com.google.spanner.v1.ListSessionsResponse,com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SpannerSettings this]
    (-> this (.listSessionsSettings))))

(defn delete-session-settings
  "Returns the object with the settings used for calls to deleteSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.DeleteSessionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.deleteSessionSettings))))

(defn commit-settings
  "Returns the object with the settings used for calls to commit.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.CommitRequest,com.google.spanner.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.commitSettings))))

(defn create-session-settings
  "Returns the object with the settings used for calls to createSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.CreateSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.createSessionSettings))))

(defn begin-transaction-settings
  "Returns the object with the settings used for calls to beginTransaction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.BeginTransactionRequest,com.google.spanner.v1.Transaction>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.beginTransactionSettings))))

(defn execute-streaming-sql-settings
  "Returns the object with the settings used for calls to executeStreamingSql.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^SpannerSettings this]
    (-> this (.executeStreamingSqlSettings))))

(defn execute-sql-settings
  "Returns the object with the settings used for calls to executeSql.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.executeSqlSettings))))

(defn partition-read-settings
  "Returns the object with the settings used for calls to partitionRead.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.PartitionReadRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.partitionReadSettings))))

(defn read-settings
  "Returns the object with the settings used for calls to read.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.readSettings))))

(defn streaming-read-settings
  "Returns the object with the settings used for calls to streamingRead.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^SpannerSettings this]
    (-> this (.streamingReadSettings))))

(defn get-session-settings
  "Returns the object with the settings used for calls to getSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.GetSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.getSessionSettings))))

(defn partition-query-settings
  "Returns the object with the settings used for calls to partitionQuery.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.spanner.v1.PartitionQueryRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SpannerSettings this]
    (-> this (.partitionQuerySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.spanner.v1.SpannerSettings$Builder`"
  (^com.google.cloud.spanner.v1.SpannerSettings$Builder [^SpannerSettings this]
    (-> this (.toBuilder))))

