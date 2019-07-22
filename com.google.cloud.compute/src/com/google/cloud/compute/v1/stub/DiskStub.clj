(ns com.google.cloud.compute.v1.stub.DiskStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub DiskStub]))

(defn ->disk-stub
  "Constructor."
  (^DiskStub []
    (new DiskStub )))

(defn set-labels-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.setLabelsDiskCallable))))

(defn create-snapshot-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.createSnapshotDiskCallable))))

(defn get-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.getDiskCallable))))

(defn get-iam-policy-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.getIamPolicyDiskCallable))))

(defn aggregated-list-disks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskClient$AggregatedListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.aggregatedListDisksPagedCallable))))

(defn list-disks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.listDisksCallable))))

(defn insert-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.insertDiskCallable))))

(defn delete-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.deleteDiskCallable))))

(defn close
  ""
  ([^DiskStub this]
    (-> this (.close))))

(defn test-iam-permissions-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.testIamPermissionsDiskCallable))))

(defn set-iam-policy-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.setIamPolicyDiskCallable))))

(defn aggregated-list-disks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.aggregatedListDisksCallable))))

(defn list-disks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskClient$ListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.listDisksPagedCallable))))

(defn resize-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskStub this]
    (-> this (.resizeDiskCallable))))

