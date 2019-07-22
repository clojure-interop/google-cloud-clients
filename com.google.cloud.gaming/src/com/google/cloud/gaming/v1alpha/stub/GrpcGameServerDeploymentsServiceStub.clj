(ns com.google.cloud.gaming.v1alpha.stub.GrpcGameServerDeploymentsServiceStub
  "gRPC stub implementation for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GrpcGameServerDeploymentsServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.gaming.v1alpha.stub.GrpcGameServerDeploymentsServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.GrpcGameServerDeploymentsServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcGameServerDeploymentsServiceStub/create client-context callable-factory))
  (^com.google.cloud.gaming.v1alpha.stub.GrpcGameServerDeploymentsServiceStub [^com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings settings]
    (GrpcGameServerDeploymentsServiceStub/create settings)))

(defn list-game-server-deployments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.listGameServerDeploymentsPagedCallable))))

(defn delete-game-server-deployment-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.deleteGameServerDeploymentOperationCallable))))

(defn set-rollout-target-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.setRolloutTargetOperationCallable))))

(defn get-deployment-target-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetDeploymentTargetRequest,com.google.cloud.gaming.v1alpha.DeploymentTarget>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.getDeploymentTargetCallable))))

(defn set-rollout-target-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.setRolloutTargetCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.getOperationsStub))))

(defn create-game-server-deployment-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.createGameServerDeploymentOperationCallable))))

(defn get-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.getGameServerDeploymentCallable))))

(defn create-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.createGameServerDeploymentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcGameServerDeploymentsServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.deleteGameServerDeploymentCallable))))

(defn shutdown
  ""
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.shutdown))))

(defn list-game-server-deployments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.listGameServerDeploymentsCallable))))

(defn update-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.updateGameServerDeploymentCallable))))

(defn update-game-server-deployment-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.updateGameServerDeploymentOperationCallable))))

(defn commit-rollout-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.commitRolloutOperationCallable))))

(defn close
  ""
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.isTerminated))))

(defn start-rollout-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.startRolloutCallable))))

(defn start-rollout-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.startRolloutOperationCallable))))

(defn commit-rollout-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.commitRolloutCallable))))

(defn revert-rollout-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.revertRolloutOperationCallable))))

(defn shutdown-now
  ""
  ([^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.shutdownNow))))

(defn revert-rollout-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGameServerDeploymentsServiceStub this]
    (-> this (.revertRolloutCallable))))

