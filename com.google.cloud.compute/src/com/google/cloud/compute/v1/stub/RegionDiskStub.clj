(ns com.google.cloud.compute.v1.stub.RegionDiskStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionDiskStub]))

(defn ->region-disk-stub
  "Constructor."
  (^RegionDiskStub []
    (new RegionDiskStub )))

(defn create-snapshot-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.createSnapshotRegionDiskCallable))))

(defn set-labels-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.setLabelsRegionDiskCallable))))

(defn test-iam-permissions-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.testIamPermissionsRegionDiskCallable))))

(defn delete-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.deleteRegionDiskCallable))))

(defn resize-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.resizeRegionDiskCallable))))

(defn close
  ""
  ([^RegionDiskStub this]
    (-> this (.close))))

(defn insert-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.insertRegionDiskCallable))))

(defn list-region-disks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.listRegionDisksPagedCallable))))

(defn list-region-disks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.DiskList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.listRegionDisksCallable))))

(defn get-region-disk-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskStub this]
    (-> this (.getRegionDiskCallable))))

