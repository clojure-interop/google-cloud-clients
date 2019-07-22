(ns com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionInstanceGroupManagerStub]))

(def *-abandon-instances-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/abandonInstancesRegionInstanceGroupManagerMethodDescriptor)

(def *-delete-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/deleteRegionInstanceGroupManagerMethodDescriptor)

(def *-delete-instances-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/deleteInstancesRegionInstanceGroupManagerMethodDescriptor)

(def *-get-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>"
  HttpJsonRegionInstanceGroupManagerStub/getRegionInstanceGroupManagerMethodDescriptor)

(def *-insert-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/insertRegionInstanceGroupManagerMethodDescriptor)

(def *-list-region-instance-group-managers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerList>"
  HttpJsonRegionInstanceGroupManagerStub/listRegionInstanceGroupManagersMethodDescriptor)

(def *-list-managed-instances-region-instance-group-managers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse>"
  HttpJsonRegionInstanceGroupManagerStub/listManagedInstancesRegionInstanceGroupManagersMethodDescriptor)

(def *-patch-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/patchRegionInstanceGroupManagerMethodDescriptor)

(def *-recreate-instances-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/recreateInstancesRegionInstanceGroupManagerMethodDescriptor)

(def *-resize-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/resizeRegionInstanceGroupManagerMethodDescriptor)

(def *-set-instance-template-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor)

(def *-set-target-pools-region-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionInstanceGroupManagerStub/setTargetPoolsRegionInstanceGroupManagerMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionInstanceGroupManagerStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupManagerStub [^com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings settings]
    (HttpJsonRegionInstanceGroupManagerStub/create settings)))

(defn insert-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.insertRegionInstanceGroupManagerCallable))))

(defn list-region-instance-group-managers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.listRegionInstanceGroupManagersPagedCallable))))

(defn patch-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.patchRegionInstanceGroupManagerCallable))))

(defn resize-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.resizeRegionInstanceGroupManagerCallable))))

(defn set-target-pools-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.setTargetPoolsRegionInstanceGroupManagerCallable))))

(defn set-instance-template-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.setInstanceTemplateRegionInstanceGroupManagerCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionInstanceGroupManagerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn recreate-instances-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.recreateInstancesRegionInstanceGroupManagerCallable))))

(defn shutdown
  ""
  ([^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.shutdown))))

(defn list-managed-instances-region-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.listManagedInstancesRegionInstanceGroupManagersCallable))))

(defn close
  ""
  ([^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.close))))

(defn get-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.getRegionInstanceGroupManagerCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.isTerminated))))

(defn abandon-instances-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.abandonInstancesRegionInstanceGroupManagerCallable))))

(defn delete-instances-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.deleteInstancesRegionInstanceGroupManagerCallable))))

(defn delete-region-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.deleteRegionInstanceGroupManagerCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.shutdownNow))))

(defn list-region-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionInstanceGroupManagerStub this]
    (-> this (.listRegionInstanceGroupManagersCallable))))

