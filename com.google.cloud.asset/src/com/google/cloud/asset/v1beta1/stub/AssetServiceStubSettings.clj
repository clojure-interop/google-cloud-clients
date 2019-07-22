(ns com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings
  "Settings class to configure an instance of AssetServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (cloudasset.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of batchGetAssetsHistory to 30 seconds:



  AssetServiceStubSettings.Builder assetServiceSettingsBuilder =
      AssetServiceStubSettings.newBuilder();
  assetServiceSettingsBuilder.batchGetAssetsHistorySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AssetServiceStubSettings assetServiceSettings = assetServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.asset.v1beta1.stub AssetServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AssetServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AssetServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AssetServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AssetServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AssetServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AssetServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AssetServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder`"
  (^com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AssetServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder []
    (AssetServiceStubSettings/newBuilder )))

(defn export-assets-settings
  "Returns the object with the settings used for calls to exportAssets.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AssetServiceStubSettings this]
    (-> this (.exportAssetsSettings))))

(defn export-assets-operation-settings
  "Returns the object with the settings used for calls to exportAssets.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.cloud.asset.v1beta1.ExportAssetsResponse,com.google.cloud.asset.v1beta1.ExportAssetsRequest>`"
  ([^AssetServiceStubSettings this]
    (-> this (.exportAssetsOperationSettings))))

(defn batch-get-assets-history-settings
  "Returns the object with the settings used for calls to batchGetAssetsHistory.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest,com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AssetServiceStubSettings this]
    (-> this (.batchGetAssetsHistorySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.asset.v1beta1.stub.AssetServiceStub`

  throws: java.io.IOException"
  ([^AssetServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder`"
  (^com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder [^AssetServiceStubSettings this]
    (-> this (.toBuilder))))

