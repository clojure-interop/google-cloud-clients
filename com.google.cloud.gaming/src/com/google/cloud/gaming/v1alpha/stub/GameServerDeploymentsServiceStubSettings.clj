(ns com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings
  "Settings class to configure an instance of GameServerDeploymentsServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getGameServerDeployment to 30 seconds:



  GameServerDeploymentsServiceStubSettings.Builder gameServerDeploymentsServiceSettingsBuilder =
      GameServerDeploymentsServiceStubSettings.newBuilder();
  gameServerDeploymentsServiceSettingsBuilder.getGameServerDeploymentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GameServerDeploymentsServiceStubSettings gameServerDeploymentsServiceSettings = gameServerDeploymentsServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GameServerDeploymentsServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GameServerDeploymentsServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GameServerDeploymentsServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GameServerDeploymentsServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GameServerDeploymentsServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (GameServerDeploymentsServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GameServerDeploymentsServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GameServerDeploymentsServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GameServerDeploymentsServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder []
    (GameServerDeploymentsServiceStubSettings/newBuilder )))

(defn create-game-server-deployment-operation-settings
  "Returns the object with the settings used for calls to createGameServerDeployment.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.createGameServerDeploymentOperationSettings))))

(defn start-rollout-settings
  "Returns the object with the settings used for calls to startRollout.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.startRolloutSettings))))

(defn delete-game-server-deployment-operation-settings
  "Returns the object with the settings used for calls to deleteGameServerDeployment.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.deleteGameServerDeploymentOperationSettings))))

(defn delete-game-server-deployment-settings
  "Returns the object with the settings used for calls to deleteGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.deleteGameServerDeploymentSettings))))

(defn commit-rollout-operation-settings
  "Returns the object with the settings used for calls to commitRollout.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.commitRolloutOperationSettings))))

(defn commit-rollout-settings
  "Returns the object with the settings used for calls to commitRollout.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.commitRolloutSettings))))

(defn start-rollout-operation-settings
  "Returns the object with the settings used for calls to startRollout.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.startRolloutOperationSettings))))

(defn create-game-server-deployment-settings
  "Returns the object with the settings used for calls to createGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.createGameServerDeploymentSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStub`

  throws: java.io.IOException"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.createStub))))

(defn update-game-server-deployment-settings
  "Returns the object with the settings used for calls to updateGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.updateGameServerDeploymentSettings))))

(defn get-game-server-deployment-settings
  "Returns the object with the settings used for calls to getGameServerDeployment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.getGameServerDeploymentSettings))))

(defn set-rollout-target-operation-settings
  "Returns the object with the settings used for calls to setRolloutTarget.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.setRolloutTargetOperationSettings))))

(defn update-game-server-deployment-operation-settings
  "Returns the object with the settings used for calls to updateGameServerDeployment.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.updateGameServerDeploymentOperationSettings))))

(defn revert-rollout-operation-settings
  "Returns the object with the settings used for calls to revertRollout.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceStubSettings this]
    (-> this (.revertRolloutOperationSettings))))

(defn set-rollout-target-settings
  "Returns the object with the settings used for calls to setRolloutTarget.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.setRolloutTargetSettings))))

(defn list-game-server-deployments-settings
  "Returns the object with the settings used for calls to listGameServerDeployments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsResponse,com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.listGameServerDeploymentsSettings))))

(defn revert-rollout-settings
  "Returns the object with the settings used for calls to revertRollout.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.revertRolloutSettings))))

(defn get-deployment-target-settings
  "Returns the object with the settings used for calls to getDeploymentTarget.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetDeploymentTargetRequest,com.google.cloud.gaming.v1alpha.DeploymentTarget>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.getDeploymentTargetSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder [^GameServerDeploymentsServiceStubSettings this]
    (-> this (.toBuilder))))

