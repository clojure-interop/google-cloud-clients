(ns com.google.cloud.container.v1.stub.ClusterManagerStubSettings
  "Settings class to configure an instance of ClusterManagerStub.

  The default instance has everything set to sensible defaults:


    The default service address (container.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of listClusters to 30 seconds:



  ClusterManagerStubSettings.Builder clusterManagerSettingsBuilder =
      ClusterManagerStubSettings.newBuilder();
  clusterManagerSettingsBuilder.listClustersSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ClusterManagerStubSettings clusterManagerSettings = clusterManagerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.container.v1.stub ClusterManagerStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ClusterManagerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ClusterManagerStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ClusterManagerStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ClusterManagerStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ClusterManagerStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ClusterManagerStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ClusterManagerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder`"
  (^com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ClusterManagerStubSettings/newBuilder client-context))
  (^com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder []
    (ClusterManagerStubSettings/newBuilder )))

(defn get-operation-settings
  "Returns the object with the settings used for calls to getOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.GetOperationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.getOperationSettings))))

(defn set-master-auth-settings
  "Returns the object with the settings used for calls to setMasterAuth.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetMasterAuthRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setMasterAuthSettings))))

(defn update-master-settings
  "Returns the object with the settings used for calls to updateMaster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.UpdateMasterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.updateMasterSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.container.v1.stub.ClusterManagerStub`

  throws: java.io.IOException"
  ([^ClusterManagerStubSettings this]
    (-> this (.createStub))))

(defn get-server-config-settings
  "Returns the object with the settings used for calls to getServerConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.GetServerConfigRequest,com.google.container.v1.ServerConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.getServerConfigSettings))))

(defn update-node-pool-settings
  "Returns the object with the settings used for calls to updateNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.UpdateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.updateNodePoolSettings))))

(defn delete-node-pool-settings
  "Returns the object with the settings used for calls to deleteNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.DeleteNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.deleteNodePoolSettings))))

(defn update-cluster-settings
  "Returns the object with the settings used for calls to updateCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.UpdateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.updateClusterSettings))))

(defn set-network-policy-settings
  "Returns the object with the settings used for calls to setNetworkPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetNetworkPolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setNetworkPolicySettings))))

(defn set-locations-settings
  "Returns the object with the settings used for calls to setLocations.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetLocationsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setLocationsSettings))))

(defn set-addons-config-settings
  "Returns the object with the settings used for calls to setAddonsConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetAddonsConfigRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setAddonsConfigSettings))))

(defn complete-ip-rotation-settings
  "Returns the object with the settings used for calls to completeIPRotation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.CompleteIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.completeIPRotationSettings))))

(defn set-node-pool-autoscaling-settings
  "Returns the object with the settings used for calls to setNodePoolAutoscaling.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetNodePoolAutoscalingRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setNodePoolAutoscalingSettings))))

(defn delete-cluster-settings
  "Returns the object with the settings used for calls to deleteCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.DeleteClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.deleteClusterSettings))))

(defn set-labels-settings
  "Returns the object with the settings used for calls to setLabels.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetLabelsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setLabelsSettings))))

(defn set-monitoring-service-settings
  "Returns the object with the settings used for calls to setMonitoringService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetMonitoringServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setMonitoringServiceSettings))))

(defn set-node-pool-management-settings
  "Returns the object with the settings used for calls to setNodePoolManagement.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetNodePoolManagementRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setNodePoolManagementSettings))))

(defn set-logging-service-settings
  "Returns the object with the settings used for calls to setLoggingService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetLoggingServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setLoggingServiceSettings))))

(defn cancel-operation-settings
  "Returns the object with the settings used for calls to cancelOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.CancelOperationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.cancelOperationSettings))))

(defn get-node-pool-settings
  "Returns the object with the settings used for calls to getNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.GetNodePoolRequest,com.google.container.v1.NodePool>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.getNodePoolSettings))))

(defn set-maintenance-policy-settings
  "Returns the object with the settings used for calls to setMaintenancePolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetMaintenancePolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setMaintenancePolicySettings))))

(defn set-node-pool-size-settings
  "Returns the object with the settings used for calls to setNodePoolSize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetNodePoolSizeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setNodePoolSizeSettings))))

(defn list-clusters-settings
  "Returns the object with the settings used for calls to listClusters.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.ListClustersRequest,com.google.container.v1.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.listClustersSettings))))

(defn start-ip-rotation-settings
  "Returns the object with the settings used for calls to startIPRotation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.StartIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.startIPRotationSettings))))

(defn list-operations-settings
  "Returns the object with the settings used for calls to listOperations.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.ListOperationsRequest,com.google.container.v1.ListOperationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.listOperationsSettings))))

(defn rollback-node-pool-upgrade-settings
  "Returns the object with the settings used for calls to rollbackNodePoolUpgrade.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.RollbackNodePoolUpgradeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.rollbackNodePoolUpgradeSettings))))

(defn create-node-pool-settings
  "Returns the object with the settings used for calls to createNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.CreateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.createNodePoolSettings))))

(defn create-cluster-settings
  "Returns the object with the settings used for calls to createCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.CreateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.createClusterSettings))))

(defn set-legacy-abac-settings
  "Returns the object with the settings used for calls to setLegacyAbac.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.SetLegacyAbacRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.setLegacyAbacSettings))))

(defn get-cluster-settings
  "Returns the object with the settings used for calls to getCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.GetClusterRequest,com.google.container.v1.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.getClusterSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder`"
  (^com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder [^ClusterManagerStubSettings this]
    (-> this (.toBuilder))))

(defn list-node-pools-settings
  "Returns the object with the settings used for calls to listNodePools.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.container.v1.ListNodePoolsRequest,com.google.container.v1.ListNodePoolsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterManagerStubSettings this]
    (-> this (.listNodePoolsSettings))))

