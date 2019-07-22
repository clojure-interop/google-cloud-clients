(ns com.google.cloud.compute.v1.stub.SnapshotStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SnapshotStub]))

(defn ->snapshot-stub
  "Constructor."
  (^SnapshotStub []
    (new SnapshotStub )))

(defn set-iam-policy-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.setIamPolicySnapshotCallable))))

(defn list-snapshots-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.listSnapshotsCallable))))

(defn test-iam-permissions-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsSnapshotHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.testIamPermissionsSnapshotCallable))))

(defn delete-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.deleteSnapshotCallable))))

(defn close
  ""
  ([^SnapshotStub this]
    (-> this (.close))))

(defn set-labels-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.setLabelsSnapshotCallable))))

(defn get-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSnapshotHttpRequest,com.google.cloud.compute.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.getSnapshotCallable))))

(defn get-iam-policy-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.getIamPolicySnapshotCallable))))

(defn list-snapshots-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotStub this]
    (-> this (.listSnapshotsPagedCallable))))

