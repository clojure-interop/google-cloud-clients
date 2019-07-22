(ns com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder
  "Builder for GameServerDeploymentsServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GameServerDeploymentsServiceStubSettings$Builder]))

(defn create-game-server-deployment-operation-settings
  "Returns the builder for the settings used for calls to createGameServerDeployment.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.createGameServerDeploymentOperationSettings))))

(defn start-rollout-settings
  "Returns the builder for the settings used for calls to startRollout.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.startRolloutSettings))))

(defn delete-game-server-deployment-operation-settings
  "Returns the builder for the settings used for calls to deleteGameServerDeployment.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.deleteGameServerDeploymentOperationSettings))))

(defn delete-game-server-deployment-settings
  "Returns the builder for the settings used for calls to deleteGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.deleteGameServerDeploymentSettings))))

(defn commit-rollout-operation-settings
  "Returns the builder for the settings used for calls to commitRollout.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.commitRolloutOperationSettings))))

(defn commit-rollout-settings
  "Returns the builder for the settings used for calls to commitRollout.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.commitRolloutSettings))))

(defn start-rollout-operation-settings
  "Returns the builder for the settings used for calls to startRollout.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.startRolloutOperationSettings))))

(defn create-game-server-deployment-settings
  "Returns the builder for the settings used for calls to createGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.createGameServerDeploymentSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder [^GameServerDeploymentsServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-game-server-deployment-settings
  "Returns the builder for the settings used for calls to updateGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.updateGameServerDeploymentSettings))))

(defn get-game-server-deployment-settings
  "Returns the builder for the settings used for calls to getGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.GetGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.getGameServerDeploymentSettings))))

(defn set-rollout-target-operation-settings
  "Returns the builder for the settings used for calls to setRolloutTarget.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.setRolloutTargetOperationSettings))))

(defn build
  "returns: `com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.build))))

(defn update-game-server-deployment-operation-settings
  "Returns the builder for the settings used for calls to updateGameServerDeployment.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.updateGameServerDeploymentOperationSettings))))

(defn revert-rollout-operation-settings
  "Returns the builder for the settings used for calls to revertRollout.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.revertRolloutOperationSettings))))

(defn set-rollout-target-settings
  "Returns the builder for the settings used for calls to setRolloutTarget.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.setRolloutTargetSettings))))

(defn list-game-server-deployments-settings
  "Returns the builder for the settings used for calls to listGameServerDeployments.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsResponse,com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.listGameServerDeploymentsSettings))))

(defn revert-rollout-settings
  "Returns the builder for the settings used for calls to revertRollout.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.revertRolloutSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-deployment-target-settings
  "Returns the builder for the settings used for calls to getDeploymentTarget.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.gaming.v1alpha.GetDeploymentTargetRequest,com.google.cloud.gaming.v1alpha.DeploymentTarget>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GameServerDeploymentsServiceStubSettings$Builder this]
    (-> this (.getDeploymentTargetSettings))))

