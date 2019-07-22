(ns com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings
  "Settings class to configure an instance of BaseBigQueryStorageClient.

  The default instance has everything set to sensible defaults:


    The default service address (bigquerystorage.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createReadSession to 30 seconds:



  BaseBigQueryStorageSettings.Builder baseBigQueryStorageSettingsBuilder =
      BaseBigQueryStorageSettings.newBuilder();
  baseBigQueryStorageSettingsBuilder.createReadSessionSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  BaseBigQueryStorageSettings baseBigQueryStorageSettings = baseBigQueryStorageSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1 BaseBigQueryStorageSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (BaseBigQueryStorageSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (BaseBigQueryStorageSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (BaseBigQueryStorageSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder`"
  (^com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (BaseBigQueryStorageSettings/newBuilder client-context))
  (^com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder []
    (BaseBigQueryStorageSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (BaseBigQueryStorageSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings`

  returns: `com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings [^com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings stub]
    (BaseBigQueryStorageSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (BaseBigQueryStorageSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (BaseBigQueryStorageSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (BaseBigQueryStorageSettings/getDefaultServiceScopes )))

(defn create-read-session-settings
  "Returns the object with the settings used for calls to createReadSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BaseBigQueryStorageSettings this]
    (-> this (.createReadSessionSettings))))

(defn read-rows-settings
  "Returns the object with the settings used for calls to readRows.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^BaseBigQueryStorageSettings this]
    (-> this (.readRowsSettings))))

(defn batch-create-read-session-streams-settings
  "Returns the object with the settings used for calls to batchCreateReadSessionStreams.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BaseBigQueryStorageSettings this]
    (-> this (.batchCreateReadSessionStreamsSettings))))

(defn finalize-stream-settings
  "Returns the object with the settings used for calls to finalizeStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BaseBigQueryStorageSettings this]
    (-> this (.finalizeStreamSettings))))

(defn split-read-stream-settings
  "Returns the object with the settings used for calls to splitReadStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BaseBigQueryStorageSettings this]
    (-> this (.splitReadStreamSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder`"
  (^com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder [^BaseBigQueryStorageSettings this]
    (-> this (.toBuilder))))

