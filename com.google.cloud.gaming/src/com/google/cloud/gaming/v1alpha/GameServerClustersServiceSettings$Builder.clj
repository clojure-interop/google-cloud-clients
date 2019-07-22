(ns com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder
  "Builder for GameServerClustersServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha GameServerClustersServiceSettings$Builder]))

(defn update-game-server-cluster-settings
  "Returns the builder for the settings used for calls to updateGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerClustersServiceSettings$Builder this]
    (-> this (.updateGameServerClusterSettings))))

(defn update-game-server-cluster-operation-settings
  "Returns the builder for the settings used for calls to updateGameServerCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceSettings$Builder this]
    (-> this (.updateGameServerClusterOperationSettings))))

(defn delete-game-server-cluster-operation-settings
  "Returns the builder for the settings used for calls to deleteGameServerCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceSettings$Builder this]
    (-> this (.deleteGameServerClusterOperationSettings))))

(defn get-game-server-cluster-settings
  "Returns the builder for the settings used for calls to getGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.GetGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerClustersServiceSettings$Builder this]
    (-> this (.getGameServerClusterSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder [^GameServerClustersServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-game-server-cluster-settings
  "Returns the builder for the settings used for calls to deleteGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerClustersServiceSettings$Builder this]
    (-> this (.deleteGameServerClusterSettings))))

(defn create-game-server-cluster-operation-settings
  "Returns the builder for the settings used for calls to createGameServerCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceSettings$Builder this]
    (-> this (.createGameServerClusterOperationSettings))))

(defn build
  "returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings [^GameServerClustersServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder [^GameServerClustersServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn create-game-server-cluster-settings
  "Returns the builder for the settings used for calls to createGameServerCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerClustersServiceSettings$Builder this]
    (-> this (.createGameServerClusterSettings))))

(defn list-game-server-clusters-settings
  "Returns the builder for the settings used for calls to listGameServerClusters.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.ListGameServerClustersResponse,com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GameServerClustersServiceSettings$Builder this]
    (-> this (.listGameServerClustersSettings))))

