(ns com.google.cloud.container.v1.stub.ClusterManagerStub
  "Base stub class for Kubernetes Engine API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.container.v1.stub ClusterManagerStub]))

(defn ->cluster-manager-stub
  "Constructor."
  (^ClusterManagerStub []
    (new ClusterManagerStub )))

(defn get-server-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetServerConfigRequest,com.google.container.v1.ServerConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.getServerConfigCallable))))

(defn list-clusters-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListClustersRequest,com.google.container.v1.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.listClustersCallable))))

(defn set-node-pool-management-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolManagementRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setNodePoolManagementCallable))))

(defn set-legacy-abac-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLegacyAbacRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setLegacyAbacCallable))))

(defn create-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CreateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.createNodePoolCallable))))

(defn create-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CreateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.createClusterCallable))))

(defn list-node-pools-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListNodePoolsRequest,com.google.container.v1.ListNodePoolsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.listNodePoolsCallable))))

(defn set-maintenance-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMaintenancePolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setMaintenancePolicyCallable))))

(defn get-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetClusterRequest,com.google.container.v1.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.getClusterCallable))))

(defn set-logging-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLoggingServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setLoggingServiceCallable))))

(defn set-node-pool-size-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolSizeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setNodePoolSizeCallable))))

(defn set-node-pool-autoscaling-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolAutoscalingRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setNodePoolAutoscalingCallable))))

(defn update-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.updateClusterCallable))))

(defn set-locations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLocationsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setLocationsCallable))))

(defn cancel-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CancelOperationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.cancelOperationCallable))))

(defn complete-ip-rotation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CompleteIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.completeIPRotationCallable))))

(defn set-labels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLabelsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setLabelsCallable))))

(defn set-network-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNetworkPolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setNetworkPolicyCallable))))

(defn start-ip-rotation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.StartIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.startIPRotationCallable))))

(defn delete-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.DeleteClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.deleteClusterCallable))))

(defn set-addons-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetAddonsConfigRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setAddonsConfigCallable))))

(defn delete-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.DeleteNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.deleteNodePoolCallable))))

(defn get-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetOperationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.getOperationCallable))))

(defn close
  ""
  ([^ClusterManagerStub this]
    (-> this (.close))))

(defn update-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.updateNodePoolCallable))))

(defn get-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetNodePoolRequest,com.google.container.v1.NodePool>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.getNodePoolCallable))))

(defn rollback-node-pool-upgrade-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.RollbackNodePoolUpgradeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.rollbackNodePoolUpgradeCallable))))

(defn list-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListOperationsRequest,com.google.container.v1.ListOperationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.listOperationsCallable))))

(defn update-master-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateMasterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.updateMasterCallable))))

(defn set-master-auth-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMasterAuthRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setMasterAuthCallable))))

(defn set-monitoring-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMonitoringServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerStub this]
    (-> this (.setMonitoringServiceCallable))))

