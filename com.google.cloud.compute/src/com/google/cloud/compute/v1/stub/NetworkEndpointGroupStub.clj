(ns com.google.cloud.compute.v1.stub.NetworkEndpointGroupStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NetworkEndpointGroupStub]))

(defn ->network-endpoint-group-stub
  "Constructor."
  (^NetworkEndpointGroupStub []
    (new NetworkEndpointGroupStub )))

(defn aggregated-list-network-endpoint-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.aggregatedListNetworkEndpointGroupsPagedCallable))))

(defn aggregated-list-network-endpoint-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.aggregatedListNetworkEndpointGroupsCallable))))

(defn insert-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.insertNetworkEndpointGroupCallable))))

(defn list-network-endpoints-network-endpoint-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsCallable))))

(defn list-network-endpoints-network-endpoint-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsPagedCallable))))

(defn test-iam-permissions-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.testIamPermissionsNetworkEndpointGroupCallable))))

(defn get-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.getNetworkEndpointGroupCallable))))

(defn close
  ""
  ([^NetworkEndpointGroupStub this]
    (-> this (.close))))

(defn list-network-endpoint-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointGroupsCallable))))

(defn detach-network-endpoints-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroupCallable))))

(defn list-network-endpoint-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointGroupsPagedCallable))))

(defn delete-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.deleteNetworkEndpointGroupCallable))))

(defn attach-network-endpoints-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupStub this]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroupCallable))))

