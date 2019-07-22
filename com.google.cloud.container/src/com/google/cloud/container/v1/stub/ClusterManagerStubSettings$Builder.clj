(ns com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder
  "Builder for ClusterManagerStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.container.v1.stub ClusterManagerStubSettings$Builder]))

(defn get-operation-settings
  "Returns the builder for the settings used for calls to getOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.GetOperationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.getOperationSettings))))

(defn set-master-auth-settings
  "Returns the builder for the settings used for calls to setMasterAuth.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetMasterAuthRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setMasterAuthSettings))))

(defn update-master-settings
  "Returns the builder for the settings used for calls to updateMaster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.UpdateMasterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.updateMasterSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.container.v1.stub.ClusterManagerStubSettings$Builder [^ClusterManagerStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-server-config-settings
  "Returns the builder for the settings used for calls to getServerConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.GetServerConfigRequest,com.google.container.v1.ServerConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.getServerConfigSettings))))

(defn update-node-pool-settings
  "Returns the builder for the settings used for calls to updateNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.UpdateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.updateNodePoolSettings))))

(defn delete-node-pool-settings
  "Returns the builder for the settings used for calls to deleteNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.DeleteNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.deleteNodePoolSettings))))

(defn update-cluster-settings
  "Returns the builder for the settings used for calls to updateCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.UpdateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.updateClusterSettings))))

(defn set-network-policy-settings
  "Returns the builder for the settings used for calls to setNetworkPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetNetworkPolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setNetworkPolicySettings))))

(defn set-locations-settings
  "Returns the builder for the settings used for calls to setLocations.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetLocationsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setLocationsSettings))))

(defn set-addons-config-settings
  "Returns the builder for the settings used for calls to setAddonsConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetAddonsConfigRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setAddonsConfigSettings))))

(defn complete-ip-rotation-settings
  "Returns the builder for the settings used for calls to completeIPRotation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.CompleteIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.completeIPRotationSettings))))

(defn set-node-pool-autoscaling-settings
  "Returns the builder for the settings used for calls to setNodePoolAutoscaling.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetNodePoolAutoscalingRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setNodePoolAutoscalingSettings))))

(defn build
  "returns: `com.google.cloud.container.v1.stub.ClusterManagerStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.container.v1.stub.ClusterManagerStubSettings [^ClusterManagerStubSettings$Builder this]
    (-> this (.build))))

(defn delete-cluster-settings
  "Returns the builder for the settings used for calls to deleteCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.DeleteClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.deleteClusterSettings))))

(defn set-labels-settings
  "Returns the builder for the settings used for calls to setLabels.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetLabelsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setLabelsSettings))))

(defn set-monitoring-service-settings
  "Returns the builder for the settings used for calls to setMonitoringService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetMonitoringServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setMonitoringServiceSettings))))

(defn set-node-pool-management-settings
  "Returns the builder for the settings used for calls to setNodePoolManagement.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetNodePoolManagementRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setNodePoolManagementSettings))))

(defn set-logging-service-settings
  "Returns the builder for the settings used for calls to setLoggingService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetLoggingServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setLoggingServiceSettings))))

(defn cancel-operation-settings
  "Returns the builder for the settings used for calls to cancelOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.CancelOperationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.cancelOperationSettings))))

(defn get-node-pool-settings
  "Returns the builder for the settings used for calls to getNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.GetNodePoolRequest,com.google.container.v1.NodePool>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.getNodePoolSettings))))

(defn set-maintenance-policy-settings
  "Returns the builder for the settings used for calls to setMaintenancePolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetMaintenancePolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setMaintenancePolicySettings))))

(defn set-node-pool-size-settings
  "Returns the builder for the settings used for calls to setNodePoolSize.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetNodePoolSizeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setNodePoolSizeSettings))))

(defn list-clusters-settings
  "Returns the builder for the settings used for calls to listClusters.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.ListClustersRequest,com.google.container.v1.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.listClustersSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ClusterManagerStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn start-ip-rotation-settings
  "Returns the builder for the settings used for calls to startIPRotation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.StartIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.startIPRotationSettings))))

(defn list-operations-settings
  "Returns the builder for the settings used for calls to listOperations.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.ListOperationsRequest,com.google.container.v1.ListOperationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.listOperationsSettings))))

(defn rollback-node-pool-upgrade-settings
  "Returns the builder for the settings used for calls to rollbackNodePoolUpgrade.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.RollbackNodePoolUpgradeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.rollbackNodePoolUpgradeSettings))))

(defn create-node-pool-settings
  "Returns the builder for the settings used for calls to createNodePool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.CreateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.createNodePoolSettings))))

(defn create-cluster-settings
  "Returns the builder for the settings used for calls to createCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.CreateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.createClusterSettings))))

(defn set-legacy-abac-settings
  "Returns the builder for the settings used for calls to setLegacyAbac.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.SetLegacyAbacRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.setLegacyAbacSettings))))

(defn get-cluster-settings
  "Returns the builder for the settings used for calls to getCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.GetClusterRequest,com.google.container.v1.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.getClusterSettings))))

(defn list-node-pools-settings
  "Returns the builder for the settings used for calls to listNodePools.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.container.v1.ListNodePoolsRequest,com.google.container.v1.ListNodePoolsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterManagerStubSettings$Builder this]
    (-> this (.listNodePoolsSettings))))

