(ns com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings
  "Settings class to configure an instance of GameServerClustersServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getGameServerCluster to 30 seconds:



  GameServerClustersServiceStubSettings.Builder gameServerClustersServiceSettingsBuilder =
      GameServerClustersServiceStubSettings.newBuilder();
  gameServerClustersServiceSettingsBuilder.getGameServerClusterSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GameServerClustersServiceStubSettings gameServerClustersServiceSettings = gameServerClustersServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GameServerClustersServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GameServerClustersServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GameServerClustersServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GameServerClustersServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GameServerClustersServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (GameServerClustersServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GameServerClustersServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GameServerClustersServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GameServerClustersServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder []
    (GameServerClustersServiceStubSettings/newBuilder )))

(defn update-game-server-cluster-settings
  "Returns the object with the settings used for calls to updateGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceStubSettings this]
    (-> this (.updateGameServerClusterSettings))))

(defn update-game-server-cluster-operation-settings
  "Returns the object with the settings used for calls to updateGameServerCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceStubSettings this]
    (-> this (.updateGameServerClusterOperationSettings))))

(defn delete-game-server-cluster-operation-settings
  "Returns the object with the settings used for calls to deleteGameServerCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceStubSettings this]
    (-> this (.deleteGameServerClusterOperationSettings))))

(defn get-game-server-cluster-settings
  "Returns the object with the settings used for calls to getGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceStubSettings this]
    (-> this (.getGameServerClusterSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStub`

  throws: java.io.IOException"
  ([^GameServerClustersServiceStubSettings this]
    (-> this (.createStub))))

(defn delete-game-server-cluster-settings
  "Returns the object with the settings used for calls to deleteGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceStubSettings this]
    (-> this (.deleteGameServerClusterSettings))))

(defn create-game-server-cluster-operation-settings
  "Returns the object with the settings used for calls to createGameServerCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceStubSettings this]
    (-> this (.createGameServerClusterOperationSettings))))

(defn create-game-server-cluster-settings
  "Returns the object with the settings used for calls to createGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceStubSettings this]
    (-> this (.createGameServerClusterSettings))))

(defn list-game-server-clusters-settings
  "Returns the object with the settings used for calls to listGameServerClusters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.ListGameServerClustersResponse,com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GameServerClustersServiceStubSettings this]
    (-> this (.listGameServerClustersSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder [^GameServerClustersServiceStubSettings this]
    (-> this (.toBuilder))))

