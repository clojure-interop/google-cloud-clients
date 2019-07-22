(ns com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStub
  "Base stub class for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GameServerDeploymentsServiceStub]))

(defn ->game-server-deployments-service-stub
  "Constructor."
  (^GameServerDeploymentsServiceStub []
    (new GameServerDeploymentsServiceStub )))

(defn list-game-server-deployments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.listGameServerDeploymentsPagedCallable))))

(defn delete-game-server-deployment-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.deleteGameServerDeploymentOperationCallable))))

(defn set-rollout-target-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.setRolloutTargetOperationCallable))))

(defn get-deployment-target-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetDeploymentTargetRequest,com.google.cloud.gaming.v1alpha.DeploymentTarget>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.getDeploymentTargetCallable))))

(defn set-rollout-target-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.setRolloutTargetCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.getOperationsStub))))

(defn create-game-server-deployment-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.createGameServerDeploymentOperationCallable))))

(defn get-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.getGameServerDeploymentCallable))))

(defn create-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.createGameServerDeploymentCallable))))

(defn delete-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.deleteGameServerDeploymentCallable))))

(defn list-game-server-deployments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.listGameServerDeploymentsCallable))))

(defn update-game-server-deployment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.updateGameServerDeploymentCallable))))

(defn update-game-server-deployment-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.updateGameServerDeploymentOperationCallable))))

(defn commit-rollout-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.commitRolloutOperationCallable))))

(defn close
  ""
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.close))))

(defn start-rollout-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.startRolloutCallable))))

(defn start-rollout-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.startRolloutOperationCallable))))

(defn commit-rollout-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.commitRolloutCallable))))

(defn revert-rollout-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStub this]
    (-> this (.revertRolloutOperationCallable))))

(defn revert-rollout-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceStub this]
    (-> this (.revertRolloutCallable))))

