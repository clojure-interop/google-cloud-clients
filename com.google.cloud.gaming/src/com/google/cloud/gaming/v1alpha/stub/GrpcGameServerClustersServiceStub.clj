(ns com.google.cloud.gaming.v1alpha.stub.GrpcGameServerClustersServiceStub
  "gRPC stub implementation for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GrpcGameServerClustersServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.gaming.v1alpha.stub.GrpcGameServerClustersServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.GrpcGameServerClustersServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcGameServerClustersServiceStub/create client-context callable-factory))
  (^com.google.cloud.gaming.v1alpha.stub.GrpcGameServerClustersServiceStub [^com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings settings]
    (GrpcGameServerClustersServiceStub/create settings)))

(defn list-game-server-clusters-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerClustersServiceStub this]
    (-> this (.listGameServerClustersPagedCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcGameServerClustersServiceStub this]
    (-> this (.getOperationsStub))))

(defn delete-game-server-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GrpcGameServerClustersServiceStub this]
    (-> this (.deleteGameServerClusterOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcGameServerClustersServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcGameServerClustersServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcGameServerClustersServiceStub this]
    (-> this (.shutdown))))

(defn delete-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerClustersServiceStub this]
    (-> this (.deleteGameServerClusterCallable))))

(defn close
  ""
  ([^GrpcGameServerClustersServiceStub this]
    (-> this (.close))))

(defn create-game-server-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GrpcGameServerClustersServiceStub this]
    (-> this (.createGameServerClusterOperationCallable))))

(defn create-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerClustersServiceStub this]
    (-> this (.createGameServerClusterCallable))))

(defn list-game-server-clusters-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.ListGameServerClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerClustersServiceStub this]
    (-> this (.listGameServerClustersCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcGameServerClustersServiceStub this]
    (-> this (.isTerminated))))

(defn get-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerClustersServiceStub this]
    (-> this (.getGameServerClusterCallable))))

(defn update-game-server-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerClustersServiceStub this]
    (-> this (.updateGameServerClusterCallable))))

(defn shutdown-now
  ""
  ([^GrpcGameServerClustersServiceStub this]
    (-> this (.shutdownNow))))

(defn update-game-server-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GrpcGameServerClustersServiceStub this]
    (-> this (.updateGameServerClusterOperationCallable))))

