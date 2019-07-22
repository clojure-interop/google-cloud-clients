(ns com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionInstanceGroupStub]))

(def *-get-region-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>"
  HttpJsonRegionInstanceGroupStub/getRegionInstanceGroupMethodDescriptor)

(def *-list-region-instance-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupList>"
  HttpJsonRegionInstanceGroupStub/listRegionInstanceGroupsMethodDescriptor)

(def *-list-instances-region-instance-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupsListInstances>"
  HttpJsonRegionInstanceGroupStub/listInstancesRegionInstanceGroupsMethodDescriptor)

(def *-set-named-ports-region-instance-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupStub/setNamedPortsRegionInstanceGroupMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionInstanceGroupStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub [^com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings settings]
    (HttpJsonRegionInstanceGroupStub/create settings)))

(defn set-named-ports-region-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.setNamedPortsRegionInstanceGroupCallable))))

(defn get-region-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.getRegionInstanceGroupCallable))))

(defn list-region-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.listRegionInstanceGroupsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionInstanceGroupStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRegionInstanceGroupStub this]
    (-> this (.shutdown))))

(defn list-instances-region-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.listInstancesRegionInstanceGroupsPagedCallable))))

(defn close
  ""
  ([^HttpJsonRegionInstanceGroupStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.isTerminated))))

(defn list-instances-region-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupsListInstances>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.listInstancesRegionInstanceGroupsCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionInstanceGroupStub this]
    (-> this (.shutdownNow))))

(defn list-region-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupStub this]
    (-> this (.listRegionInstanceGroupsPagedCallable))))

