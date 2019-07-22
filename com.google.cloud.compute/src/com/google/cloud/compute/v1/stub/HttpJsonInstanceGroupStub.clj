(ns com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonInstanceGroupStub]))

(def *-add-instances-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupStub/addInstancesInstanceGroupMethodDescriptor)

(def *-aggregated-list-instance-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupAggregatedList>"
  HttpJsonInstanceGroupStub/aggregatedListInstanceGroupsMethodDescriptor)

(def *-delete-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupStub/deleteInstanceGroupMethodDescriptor)

(def *-get-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>"
  HttpJsonInstanceGroupStub/getInstanceGroupMethodDescriptor)

(def *-insert-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupStub/insertInstanceGroupMethodDescriptor)

(def *-list-instance-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupList>"
  HttpJsonInstanceGroupStub/listInstanceGroupsMethodDescriptor)

(def *-list-instances-instance-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupsListInstances>"
  HttpJsonInstanceGroupStub/listInstancesInstanceGroupsMethodDescriptor)

(def *-remove-instances-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.RemoveInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupStub/removeInstancesInstanceGroupMethodDescriptor)

(def *-set-named-ports-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetNamedPortsInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupStub/setNamedPortsInstanceGroupMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonInstanceGroupStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupStub [^com.google.cloud.compute.v1.stub.InstanceGroupStubSettings settings]
    (HttpJsonInstanceGroupStub/create settings)))

(defn delete-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.deleteInstanceGroupCallable))))

(defn list-instances-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupsListInstances>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.listInstancesInstanceGroupsCallable))))

(defn get-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.getInstanceGroupCallable))))

(defn list-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.listInstanceGroupsCallable))))

(defn list-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$ListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.listInstanceGroupsPagedCallable))))

(defn add-instances-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.addInstancesInstanceGroupCallable))))

(defn aggregated-list-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.aggregatedListInstanceGroupsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceGroupStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonInstanceGroupStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonInstanceGroupStub this]
    (-> this (.shutdown))))

(defn aggregated-list-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$AggregatedListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.aggregatedListInstanceGroupsPagedCallable))))

(defn close
  ""
  ([^HttpJsonInstanceGroupStub this]
    (-> this (.close))))

(defn insert-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.insertInstanceGroupCallable))))

(defn list-instances-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.listInstancesInstanceGroupsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceGroupStub this]
    (-> this (.isTerminated))))

(defn remove-instances-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.removeInstancesInstanceGroupCallable))))

(defn set-named-ports-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNamedPortsInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupStub this]
    (-> this (.setNamedPortsInstanceGroupCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonInstanceGroupStub this]
    (-> this (.shutdownNow))))

