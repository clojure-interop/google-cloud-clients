(ns com.google.cloud.compute.v1.stub.InstanceGroupStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceGroupStub]))

(defn ->instance-group-stub
  "Constructor."
  (^InstanceGroupStub []
    (new InstanceGroupStub )))

(defn delete-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.deleteInstanceGroupCallable))))

(defn list-instances-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupsListInstances>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.listInstancesInstanceGroupsCallable))))

(defn get-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.getInstanceGroupCallable))))

(defn list-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.listInstanceGroupsCallable))))

(defn list-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$ListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.listInstanceGroupsPagedCallable))))

(defn add-instances-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.addInstancesInstanceGroupCallable))))

(defn aggregated-list-instance-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.aggregatedListInstanceGroupsCallable))))

(defn aggregated-list-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$AggregatedListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.aggregatedListInstanceGroupsPagedCallable))))

(defn close
  ""
  ([^InstanceGroupStub this]
    (-> this (.close))))

(defn insert-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.insertInstanceGroupCallable))))

(defn list-instances-instance-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.listInstancesInstanceGroupsPagedCallable))))

(defn remove-instances-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.removeInstancesInstanceGroupCallable))))

(defn set-named-ports-instance-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNamedPortsInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupStub this]
    (-> this (.setNamedPortsInstanceGroupCallable))))

