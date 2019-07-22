(ns com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings
  "Settings class to configure an instance of GameServerClustersServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getGameServerCluster to 30 seconds:



  GameServerClustersServiceSettings.Builder gameServerClustersServiceSettingsBuilder =
      GameServerClustersServiceSettings.newBuilder();
  gameServerClustersServiceSettingsBuilder.getGameServerClusterSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GameServerClustersServiceSettings gameServerClustersServiceSettings = gameServerClustersServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha GameServerClustersServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GameServerClustersServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GameServerClustersServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GameServerClustersServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GameServerClustersServiceSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder []
    (GameServerClustersServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GameServerClustersServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings`

  returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings [^com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings stub]
    (GameServerClustersServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (GameServerClustersServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GameServerClustersServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GameServerClustersServiceSettings/getDefaultServiceScopes )))

(defn update-game-server-cluster-settings
  "Returns the object with the settings used for calls to updateGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceSettings this]
    (-> this (.updateGameServerClusterSettings))))

(defn update-game-server-cluster-operation-settings
  "Returns the object with the settings used for calls to updateGameServerCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceSettings this]
    (-> this (.updateGameServerClusterOperationSettings))))

(defn delete-game-server-cluster-operation-settings
  "Returns the object with the settings used for calls to deleteGameServerCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceSettings this]
    (-> this (.deleteGameServerClusterOperationSettings))))

(defn get-game-server-cluster-settings
  "Returns the object with the settings used for calls to getGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceSettings this]
    (-> this (.getGameServerClusterSettings))))

(defn delete-game-server-cluster-settings
  "Returns the object with the settings used for calls to deleteGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceSettings this]
    (-> this (.deleteGameServerClusterSettings))))

(defn create-game-server-cluster-operation-settings
  "Returns the object with the settings used for calls to createGameServerCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceSettings this]
    (-> this (.createGameServerClusterOperationSettings))))

(defn create-game-server-cluster-settings
  "Returns the object with the settings used for calls to createGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerClustersServiceSettings this]
    (-> this (.createGameServerClusterSettings))))

(defn list-game-server-clusters-settings
  "Returns the object with the settings used for calls to listGameServerClusters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.ListGameServerClustersResponse,com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GameServerClustersServiceSettings this]
    (-> this (.listGameServerClustersSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder [^GameServerClustersServiceSettings this]
    (-> this (.toBuilder))))

