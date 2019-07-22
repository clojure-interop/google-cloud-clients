(ns com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings
  "Settings class to configure an instance of EnhancedBigQueryStorageStub.

  The default instance dynamically reads and applies the default values used by BigQueryStorageStub.

  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createReadSession to 30 seconds:



  EnhancedBigQueryStorageStubSettings.Builder builder =
      EnhancedBigQueryStorageStubSettings.newBuilder();
  builder.createReadSessionSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  EnhancedBigQueryStorageStubSettings settings = builder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1.stub EnhancedBigQueryStorageStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (EnhancedBigQueryStorageStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EnhancedBigQueryStorageStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (EnhancedBigQueryStorageStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (EnhancedBigQueryStorageStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (EnhancedBigQueryStorageStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (EnhancedBigQueryStorageStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (EnhancedBigQueryStorageStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings$Builder`"
  (^com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (EnhancedBigQueryStorageStubSettings/newBuilder client-context))
  (^com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings$Builder []
    (EnhancedBigQueryStorageStubSettings/newBuilder )))

(defn create-read-session-settings
  "Returns the object with the settings used for calls to createReadSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigQueryStorageStubSettings this]
    (-> this (.createReadSessionSettings))))

(defn read-rows-settings
  "Returns the object with the settings used for calls to readRows.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^EnhancedBigQueryStorageStubSettings this]
    (-> this (.readRowsSettings))))

(defn batch-create-read-session-streams-settings
  "Returns the object with the settings used for calls to batchCreateReadSessionStreams.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigQueryStorageStubSettings this]
    (-> this (.batchCreateReadSessionStreamsSettings))))

(defn finalize-stream-settings
  "Returns the object with the settings used for calls to finalizeStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigQueryStorageStubSettings this]
    (-> this (.finalizeStreamSettings))))

(defn split-read-stream-settings
  "Returns the object with the settings used for calls to splitReadStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigQueryStorageStubSettings this]
    (-> this (.splitReadStreamSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings$Builder`"
  (^com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings$Builder [^EnhancedBigQueryStorageStubSettings this]
    (-> this (.toBuilder))))

