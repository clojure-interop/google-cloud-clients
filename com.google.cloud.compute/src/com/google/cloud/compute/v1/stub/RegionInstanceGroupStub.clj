(ns com.google.cloud.compute.v1.stub.RegionInstanceGroupStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionInstanceGroupStub]))

(defn ->region-instance-group-stub
  "Constructor."
  (^RegionInstanceGroupStub []
    (new RegionInstanceGroupStub )))

(defn get-region-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupStub this]
    (-> this (.getRegionInstanceGroupCallable))))

(defn list-region-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupStub this]
    (-> this (.listRegionInstanceGroupsPagedCallable))))

(defn list-region-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupStub this]
    (-> this (.listRegionInstanceGroupsCallable))))

(defn list-instances-region-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupStub this]
    (-> this (.listInstancesRegionInstanceGroupsPagedCallable))))

(defn list-instances-region-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupsListInstances>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupStub this]
    (-> this (.listInstancesRegionInstanceGroupsCallable))))

(defn set-named-ports-region-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupStub this]
    (-> this (.setNamedPortsRegionInstanceGroupCallable))))

(defn close
  ""
  ([^RegionInstanceGroupStub this]
    (-> this (.close))))

