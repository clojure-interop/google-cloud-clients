(ns com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStub
  "Base stub class for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GameServerClustersServiceStub]))

(defn ->game-server-clusters-service-stub
  "Constructor."
  (^GameServerClustersServiceStub []
    (new GameServerClustersServiceStub )))

(defn list-game-server-clusters-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceStub this]
    (-> this (.listGameServerClustersPagedCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^GameServerClustersServiceStub this]
    (-> this (.getOperationsStub))))

(defn delete-game-server-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceStub this]
    (-> this (.deleteGameServerClusterOperationCallable))))

(defn delete-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceStub this]
    (-> this (.deleteGameServerClusterCallable))))

(defn close
  ""
  ([^GameServerClustersServiceStub this]
    (-> this (.close))))

(defn create-game-server-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceStub this]
    (-> this (.createGameServerClusterOperationCallable))))

(defn create-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceStub this]
    (-> this (.createGameServerClusterCallable))))

(defn list-game-server-clusters-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.ListGameServerClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceStub this]
    (-> this (.listGameServerClustersCallable))))

(defn get-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceStub this]
    (-> this (.getGameServerClusterCallable))))

(defn update-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceStub this]
    (-> this (.updateGameServerClusterCallable))))

(defn update-game-server-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceStub this]
    (-> this (.updateGameServerClusterOperationCallable))))

