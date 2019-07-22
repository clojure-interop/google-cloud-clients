(ns com.google.cloud.compute.v1.stub.InstanceGroupManagerStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceGroupManagerStub]))

(defn ->instance-group-manager-stub
  "Constructor."
  (^InstanceGroupManagerStub []
    (new InstanceGroupManagerStub )))

(defn delete-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.deleteInstanceGroupManagerCallable))))

(defn aggregated-list-instance-group-managers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.aggregatedListInstanceGroupManagersPagedCallable))))

(defn list-managed-instances-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.listManagedInstancesInstanceGroupManagersCallable))))

(defn set-instance-template-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.setInstanceTemplateInstanceGroupManagerCallable))))

(defn get-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.getInstanceGroupManagerCallable))))

(defn resize-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.resizeInstanceGroupManagerCallable))))

(defn insert-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.insertInstanceGroupManagerCallable))))

(defn list-instance-group-managers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.listInstanceGroupManagersPagedCallable))))

(defn aggregated-list-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.aggregatedListInstanceGroupManagersCallable))))

(defn abandon-instances-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.abandonInstancesInstanceGroupManagerCallable))))

(defn close
  ""
  ([^InstanceGroupManagerStub this]
    (-> this (.close))))

(defn set-target-pools-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.setTargetPoolsInstanceGroupManagerCallable))))

(defn list-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.listInstanceGroupManagersCallable))))

(defn patch-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.patchInstanceGroupManagerCallable))))

(defn recreate-instances-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.recreateInstancesInstanceGroupManagerCallable))))

(defn delete-instances-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerStub this]
    (-> this (.deleteInstancesInstanceGroupManagerCallable))))

