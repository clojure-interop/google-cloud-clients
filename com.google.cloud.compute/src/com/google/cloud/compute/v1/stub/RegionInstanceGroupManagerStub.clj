(ns com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionInstanceGroupManagerStub]))

(defn ->region-instance-group-manager-stub
  "Constructor."
  (^RegionInstanceGroupManagerStub []
    (new RegionInstanceGroupManagerStub )))

(defn insert-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.insertRegionInstanceGroupManagerCallable))))

(defn list-region-instance-group-managers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.listRegionInstanceGroupManagersPagedCallable))))

(defn patch-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.patchRegionInstanceGroupManagerCallable))))

(defn resize-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.resizeRegionInstanceGroupManagerCallable))))

(defn set-target-pools-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.setTargetPoolsRegionInstanceGroupManagerCallable))))

(defn set-instance-template-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.setInstanceTemplateRegionInstanceGroupManagerCallable))))

(defn recreate-instances-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.recreateInstancesRegionInstanceGroupManagerCallable))))

(defn list-managed-instances-region-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.listManagedInstancesRegionInstanceGroupManagersCallable))))

(defn close
  ""
  ([^RegionInstanceGroupManagerStub this]
    (-> this (.close))))

(defn get-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.getRegionInstanceGroupManagerCallable))))

(defn abandon-instances-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.abandonInstancesRegionInstanceGroupManagerCallable))))

(defn delete-instances-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.deleteInstancesRegionInstanceGroupManagerCallable))))

(defn delete-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.deleteRegionInstanceGroupManagerCallable))))

(defn list-region-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerStub this]
    (-> this (.listRegionInstanceGroupManagersCallable))))

