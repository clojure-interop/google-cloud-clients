(ns com.google.cloud.compute.v1.stub.HttpJsonDiskStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonDiskStub]))

(def *-aggregated-list-disks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskAggregatedList>"
  HttpJsonDiskStub/aggregatedListDisksMethodDescriptor)

(def *-create-snapshot-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonDiskStub/createSnapshotDiskMethodDescriptor)

(def *-delete-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonDiskStub/deleteDiskMethodDescriptor)

(def *-get-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetDiskHttpRequest,com.google.cloud.compute.v1.Disk>"
  HttpJsonDiskStub/getDiskMethodDescriptor)

(def *-get-iam-policy-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonDiskStub/getIamPolicyDiskMethodDescriptor)

(def *-insert-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonDiskStub/insertDiskMethodDescriptor)

(def *-list-disks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskList>"
  HttpJsonDiskStub/listDisksMethodDescriptor)

(def *-resize-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ResizeDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonDiskStub/resizeDiskMethodDescriptor)

(def *-set-iam-policy-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonDiskStub/setIamPolicyDiskMethodDescriptor)

(def *-set-labels-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetLabelsDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonDiskStub/setLabelsDiskMethodDescriptor)

(def *-test-iam-permissions-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonDiskStub/testIamPermissionsDiskMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonDiskStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonDiskStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonDiskStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonDiskStub [^com.google.cloud.compute.v1.stub.DiskStubSettings settings]
    (HttpJsonDiskStub/create settings)))

(defn set-labels-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.setLabelsDiskCallable))))

(defn create-snapshot-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.createSnapshotDiskCallable))))

(defn get-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.getDiskCallable))))

(defn get-iam-policy-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.getIamPolicyDiskCallable))))

(defn aggregated-list-disks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskClient$AggregatedListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.aggregatedListDisksPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonDiskStub this]
    (-> this (.isShutdown))))

(defn list-disks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.listDisksCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonDiskStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonDiskStub this]
    (-> this (.shutdown))))

(defn insert-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.insertDiskCallable))))

(defn delete-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.deleteDiskCallable))))

(defn close
  ""
  ([^HttpJsonDiskStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonDiskStub this]
    (-> this (.isTerminated))))

(defn test-iam-permissions-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.testIamPermissionsDiskCallable))))

(defn set-iam-policy-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.setIamPolicyDiskCallable))))

(defn aggregated-list-disks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.aggregatedListDisksCallable))))

(defn list-disks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskClient$ListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.listDisksPagedCallable))))

(defn resize-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskStub this]
    (-> this (.resizeDiskCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonDiskStub this]
    (-> this (.shutdownNow))))

