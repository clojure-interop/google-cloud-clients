(ns com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonInstanceGroupManagerStub]))

(def *-abandon-instances-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/abandonInstancesInstanceGroupManagerMethodDescriptor)

(def *-aggregated-list-instance-group-managers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList>"
  HttpJsonInstanceGroupManagerStub/aggregatedListInstanceGroupManagersMethodDescriptor)

(def *-delete-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/deleteInstanceGroupManagerMethodDescriptor)

(def *-delete-instances-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/deleteInstancesInstanceGroupManagerMethodDescriptor)

(def *-get-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>"
  HttpJsonInstanceGroupManagerStub/getInstanceGroupManagerMethodDescriptor)

(def *-insert-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/insertInstanceGroupManagerMethodDescriptor)

(def *-list-instance-group-managers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerList>"
  HttpJsonInstanceGroupManagerStub/listInstanceGroupManagersMethodDescriptor)

(def *-list-managed-instances-instance-group-managers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse>"
  HttpJsonInstanceGroupManagerStub/listManagedInstancesInstanceGroupManagersMethodDescriptor)

(def *-patch-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/patchInstanceGroupManagerMethodDescriptor)

(def *-recreate-instances-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/recreateInstancesInstanceGroupManagerMethodDescriptor)

(def *-resize-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/resizeInstanceGroupManagerMethodDescriptor)

(def *-set-instance-template-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/setInstanceTemplateInstanceGroupManagerMethodDescriptor)

(def *-set-target-pools-instance-group-manager-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceGroupManagerStub/setTargetPoolsInstanceGroupManagerMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonInstanceGroupManagerStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceGroupManagerStub [^com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings settings]
    (HttpJsonInstanceGroupManagerStub/create settings)))

(defn delete-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.deleteInstanceGroupManagerCallable))))

(defn aggregated-list-instance-group-managers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.aggregatedListInstanceGroupManagersPagedCallable))))

(defn list-managed-instances-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.listManagedInstancesInstanceGroupManagersCallable))))

(defn set-instance-template-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.setInstanceTemplateInstanceGroupManagerCallable))))

(defn get-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.getInstanceGroupManagerCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.isShutdown))))

(defn resize-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.resizeInstanceGroupManagerCallable))))

(defn insert-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.insertInstanceGroupManagerCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonInstanceGroupManagerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonInstanceGroupManagerStub this]
    (-> this (.shutdown))))

(defn list-instance-group-managers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.listInstanceGroupManagersPagedCallable))))

(defn aggregated-list-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.aggregatedListInstanceGroupManagersCallable))))

(defn abandon-instances-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.abandonInstancesInstanceGroupManagerCallable))))

(defn close
  ""
  ([^HttpJsonInstanceGroupManagerStub this]
    (-> this (.close))))

(defn set-target-pools-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.setTargetPoolsInstanceGroupManagerCallable))))

(defn list-instance-group-managers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.listInstanceGroupManagersCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.isTerminated))))

(defn patch-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.patchInstanceGroupManagerCallable))))

(defn recreate-instances-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.recreateInstancesInstanceGroupManagerCallable))))

(defn delete-instances-instance-group-manager-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceGroupManagerStub this]
    (-> this (.deleteInstancesInstanceGroupManagerCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonInstanceGroupManagerStub this]
    (-> this (.shutdownNow))))

