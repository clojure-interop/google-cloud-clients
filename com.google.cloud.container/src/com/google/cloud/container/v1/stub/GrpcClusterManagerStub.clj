(ns com.google.cloud.container.v1.stub.GrpcClusterManagerStub
  "gRPC stub implementation for Kubernetes Engine API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.container.v1.stub GrpcClusterManagerStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.container.v1.stub.GrpcClusterManagerStub`

  throws: java.io.IOException"
  (^com.google.cloud.container.v1.stub.GrpcClusterManagerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcClusterManagerStub/create client-context callable-factory))
  (^com.google.cloud.container.v1.stub.GrpcClusterManagerStub [^com.google.cloud.container.v1.stub.ClusterManagerStubSettings settings]
    (GrpcClusterManagerStub/create settings)))

(defn get-server-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetServerConfigRequest,com.google.container.v1.ServerConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.getServerConfigCallable))))

(defn list-clusters-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListClustersRequest,com.google.container.v1.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.listClustersCallable))))

(defn set-node-pool-management-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolManagementRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setNodePoolManagementCallable))))

(defn set-legacy-abac-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLegacyAbacRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setLegacyAbacCallable))))

(defn create-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CreateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.createNodePoolCallable))))

(defn create-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CreateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.createClusterCallable))))

(defn list-node-pools-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListNodePoolsRequest,com.google.container.v1.ListNodePoolsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.listNodePoolsCallable))))

(defn set-maintenance-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMaintenancePolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setMaintenancePolicyCallable))))

(defn get-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetClusterRequest,com.google.container.v1.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.getClusterCallable))))

(defn set-logging-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLoggingServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setLoggingServiceCallable))))

(defn set-node-pool-size-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolSizeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setNodePoolSizeCallable))))

(defn set-node-pool-autoscaling-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolAutoscalingRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setNodePoolAutoscalingCallable))))

(defn update-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.updateClusterCallable))))

(defn set-locations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLocationsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setLocationsCallable))))

(defn cancel-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CancelOperationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.cancelOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcClusterManagerStub this]
    (-> this (.isShutdown))))

(defn complete-ip-rotation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CompleteIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.completeIPRotationCallable))))

(defn set-labels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLabelsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setLabelsCallable))))

(defn set-network-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNetworkPolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setNetworkPolicyCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcClusterManagerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcClusterManagerStub this]
    (-> this (.shutdown))))

(defn start-ip-rotation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.StartIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.startIPRotationCallable))))

(defn delete-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.DeleteClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.deleteClusterCallable))))

(defn set-addons-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetAddonsConfigRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setAddonsConfigCallable))))

(defn delete-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.DeleteNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.deleteNodePoolCallable))))

(defn get-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetOperationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.getOperationCallable))))

(defn close
  ""
  ([^GrpcClusterManagerStub this]
    (-> this (.close))))

(defn update-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.updateNodePoolCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcClusterManagerStub this]
    (-> this (.isTerminated))))

(defn get-node-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetNodePoolRequest,com.google.container.v1.NodePool>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.getNodePoolCallable))))

(defn rollback-node-pool-upgrade-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.RollbackNodePoolUpgradeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.rollbackNodePoolUpgradeCallable))))

(defn list-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListOperationsRequest,com.google.container.v1.ListOperationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.listOperationsCallable))))

(defn update-master-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateMasterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.updateMasterCallable))))

(defn shutdown-now
  ""
  ([^GrpcClusterManagerStub this]
    (-> this (.shutdownNow))))

(defn set-master-auth-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMasterAuthRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setMasterAuthCallable))))

(defn set-monitoring-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMonitoringServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterManagerStub this]
    (-> this (.setMonitoringServiceCallable))))

