(ns com.google.cloud.asset.v1.AssetServiceSettings
  "Settings class to configure an instance of AssetServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (cloudasset.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of batchGetAssetsHistory to 30 seconds:



  AssetServiceSettings.Builder assetServiceSettingsBuilder =
      AssetServiceSettings.newBuilder();
  assetServiceSettingsBuilder.batchGetAssetsHistorySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AssetServiceSettings assetServiceSettings = assetServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.asset.v1 AssetServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AssetServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AssetServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AssetServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.asset.v1.AssetServiceSettings$Builder`"
  (^com.google.cloud.asset.v1.AssetServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AssetServiceSettings/newBuilder client-context))
  (^com.google.cloud.asset.v1.AssetServiceSettings$Builder []
    (AssetServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AssetServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.asset.v1.stub.AssetServiceStubSettings`

  returns: `com.google.cloud.asset.v1.AssetServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.asset.v1.AssetServiceSettings [^com.google.cloud.asset.v1.stub.AssetServiceStubSettings stub]
    (AssetServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AssetServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AssetServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AssetServiceSettings/getDefaultServiceScopes )))

(defn export-assets-settings
  "Returns the object with the settings used for calls to exportAssets.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.asset.v1.ExportAssetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AssetServiceSettings this]
    (-> this (.exportAssetsSettings))))

(defn export-assets-operation-settings
  "Returns the object with the settings used for calls to exportAssets.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.asset.v1.ExportAssetsRequest,com.google.cloud.asset.v1.ExportAssetsResponse,com.google.cloud.asset.v1.ExportAssetsRequest>`"
  ([^AssetServiceSettings this]
    (-> this (.exportAssetsOperationSettings))))

(defn batch-get-assets-history-settings
  "Returns the object with the settings used for calls to batchGetAssetsHistory.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.asset.v1.BatchGetAssetsHistoryRequest,com.google.cloud.asset.v1.BatchGetAssetsHistoryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AssetServiceSettings this]
    (-> this (.batchGetAssetsHistorySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.asset.v1.AssetServiceSettings$Builder`"
  (^com.google.cloud.asset.v1.AssetServiceSettings$Builder [^AssetServiceSettings this]
    (-> this (.toBuilder))))

