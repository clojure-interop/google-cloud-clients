(ns com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings
  "Settings class to configure an instance of BigQueryStorageClient.

  The default instance has everything set to sensible defaults:


    The default service address (bigquerystorage.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createReadSession to 30 seconds:



  BigQueryStorageSettings.Builder settingsBuilder = BaseBigQueryStorageSettings.newBuilder();
  settingsBuilder.createReadSessionSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  BaseBigQueryStorageSettings settings = settingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1 BigQueryStorageSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (BigQueryStorageSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (BigQueryStorageSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (BigQueryStorageSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings$Builder`"
  (^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (BigQueryStorageSettings/newBuilder client-context))
  (^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings$Builder []
    (BigQueryStorageSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (BigQueryStorageSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "settings - `com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings`

  returns: `com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings [^com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings settings]
    (BigQueryStorageSettings/create settings)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (BigQueryStorageSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (BigQueryStorageSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (BigQueryStorageSettings/getDefaultServiceScopes )))

(defn create-read-session-settings
  "Returns the object with the settings used for calls to createReadSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigQueryStorageSettings this]
    (-> this (.createReadSessionSettings))))

(defn read-rows-settings
  "Returns the object with the settings used for calls to readRows.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^BigQueryStorageSettings this]
    (-> this (.readRowsSettings))))

(defn batch-create-read-session-streams-settings
  "Returns the object with the settings used for calls to batchCreateReadSessionStreams.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigQueryStorageSettings this]
    (-> this (.batchCreateReadSessionStreamsSettings))))

(defn finalize-stream-settings
  "Returns the object with the settings used for calls to finalizeStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigQueryStorageSettings this]
    (-> this (.finalizeStreamSettings))))

(defn split-read-stream-settings
  "Returns the object with the settings used for calls to splitReadStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigQueryStorageSettings this]
    (-> this (.splitReadStreamSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings$Builder`"
  (^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings$Builder [^BigQueryStorageSettings this]
    (-> this (.toBuilder))))

