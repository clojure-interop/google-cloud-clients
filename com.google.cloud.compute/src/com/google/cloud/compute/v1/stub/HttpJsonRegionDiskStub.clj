(ns com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionDiskStub]))

(def *-create-snapshot-region-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionDiskStub/createSnapshotRegionDiskMethodDescriptor)

(def *-delete-region-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionDiskStub/deleteRegionDiskMethodDescriptor)

(def *-get-region-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionDiskHttpRequest,com.google.cloud.compute.v1.Disk>"
  HttpJsonRegionDiskStub/getRegionDiskMethodDescriptor)

(def *-insert-region-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionDiskStub/insertRegionDiskMethodDescriptor)

(def *-list-region-disks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.DiskList>"
  HttpJsonRegionDiskStub/listRegionDisksMethodDescriptor)

(def *-resize-region-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionDiskStub/resizeRegionDiskMethodDescriptor)

(def *-set-labels-region-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionDiskStub/setLabelsRegionDiskMethodDescriptor)

(def *-test-iam-permissions-region-disk-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonRegionDiskStub/testIamPermissionsRegionDiskMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionDiskStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionDiskStub [^com.google.cloud.compute.v1.stub.RegionDiskStubSettings settings]
    (HttpJsonRegionDiskStub/create settings)))

(defn create-snapshot-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.createSnapshotRegionDiskCallable))))

(defn set-labels-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.setLabelsRegionDiskCallable))))

(defn test-iam-permissions-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.testIamPermissionsRegionDiskCallable))))

(defn delete-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.deleteRegionDiskCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionDiskStub this]
    (-> this (.isShutdown))))

(defn resize-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.resizeRegionDiskCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionDiskStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRegionDiskStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonRegionDiskStub this]
    (-> this (.close))))

(defn insert-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.insertRegionDiskCallable))))

(defn list-region-disks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.listRegionDisksPagedCallable))))

(defn list-region-disks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.DiskList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.listRegionDisksCallable))))

(defn get-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskStub this]
    (-> this (.getRegionDiskCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionDiskStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionDiskStub this]
    (-> this (.shutdownNow))))

