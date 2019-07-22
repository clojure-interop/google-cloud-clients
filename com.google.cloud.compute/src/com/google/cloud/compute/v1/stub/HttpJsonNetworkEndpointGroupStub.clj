(ns com.google.cloud.compute.v1.stub.HttpJsonNetworkEndpointGroupStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonNetworkEndpointGroupStub]))

(def *-aggregated-list-network-endpoint-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupAggregatedList>"
  HttpJsonNetworkEndpointGroupStub/aggregatedListNetworkEndpointGroupsMethodDescriptor)

(def *-attach-network-endpoints-network-endpoint-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkEndpointGroupStub/attachNetworkEndpointsNetworkEndpointGroupMethodDescriptor)

(def *-delete-network-endpoint-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkEndpointGroupStub/deleteNetworkEndpointGroupMethodDescriptor)

(def *-detach-network-endpoints-network-endpoint-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkEndpointGroupStub/detachNetworkEndpointsNetworkEndpointGroupMethodDescriptor)

(def *-get-network-endpoint-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroup>"
  HttpJsonNetworkEndpointGroupStub/getNetworkEndpointGroupMethodDescriptor)

(def *-insert-network-endpoint-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkEndpointGroupStub/insertNetworkEndpointGroupMethodDescriptor)

(def *-list-network-endpoint-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupList>"
  HttpJsonNetworkEndpointGroupStub/listNetworkEndpointGroupsMethodDescriptor)

(def *-list-network-endpoints-network-endpoint-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints>"
  HttpJsonNetworkEndpointGroupStub/listNetworkEndpointsNetworkEndpointGroupsMethodDescriptor)

(def *-test-iam-permissions-network-endpoint-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonNetworkEndpointGroupStub/testIamPermissionsNetworkEndpointGroupMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonNetworkEndpointGroupStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonNetworkEndpointGroupStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonNetworkEndpointGroupStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonNetworkEndpointGroupStub [^com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings settings]
    (HttpJsonNetworkEndpointGroupStub/create settings)))

(defn aggregated-list-network-endpoint-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.aggregatedListNetworkEndpointGroupsPagedCallable))))

(defn aggregated-list-network-endpoint-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.aggregatedListNetworkEndpointGroupsCallable))))

(defn insert-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.insertNetworkEndpointGroupCallable))))

(defn list-network-endpoints-network-endpoint-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonNetworkEndpointGroupStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.shutdown))))

(defn list-network-endpoints-network-endpoint-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsPagedCallable))))

(defn test-iam-permissions-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.testIamPermissionsNetworkEndpointGroupCallable))))

(defn get-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.getNetworkEndpointGroupCallable))))

(defn close
  ""
  ([^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.close))))

(defn list-network-endpoint-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointGroupsCallable))))

(defn detach-network-endpoints-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroupCallable))))

(defn list-network-endpoint-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.listNetworkEndpointGroupsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.isTerminated))))

(defn delete-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.deleteNetworkEndpointGroupCallable))))

(defn attach-network-endpoints-network-endpoint-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroupCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonNetworkEndpointGroupStub this]
    (-> this (.shutdownNow))))

