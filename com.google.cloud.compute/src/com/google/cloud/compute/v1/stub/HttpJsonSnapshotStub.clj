(ns com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonSnapshotStub]))

(def *-delete-snapshot-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSnapshotStub/deleteSnapshotMethodDescriptor)

(def *-get-snapshot-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetSnapshotHttpRequest,com.google.cloud.compute.v1.Snapshot>"
  HttpJsonSnapshotStub/getSnapshotMethodDescriptor)

(def *-get-iam-policy-snapshot-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonSnapshotStub/getIamPolicySnapshotMethodDescriptor)

(def *-list-snapshots-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotList>"
  HttpJsonSnapshotStub/listSnapshotsMethodDescriptor)

(def *-set-iam-policy-snapshot-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonSnapshotStub/setIamPolicySnapshotMethodDescriptor)

(def *-set-labels-snapshot-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetLabelsSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSnapshotStub/setLabelsSnapshotMethodDescriptor)

(def *-test-iam-permissions-snapshot-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsSnapshotHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonSnapshotStub/testIamPermissionsSnapshotMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonSnapshotStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonSnapshotStub [^com.google.cloud.compute.v1.stub.SnapshotStubSettings settings]
    (HttpJsonSnapshotStub/create settings)))

(defn set-iam-policy-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.setIamPolicySnapshotCallable))))

(defn list-snapshots-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.listSnapshotsCallable))))

(defn test-iam-permissions-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsSnapshotHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.testIamPermissionsSnapshotCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSnapshotStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonSnapshotStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonSnapshotStub this]
    (-> this (.shutdown))))

(defn delete-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.deleteSnapshotCallable))))

(defn close
  ""
  ([^HttpJsonSnapshotStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSnapshotStub this]
    (-> this (.isTerminated))))

(defn set-labels-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.setLabelsSnapshotCallable))))

(defn get-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSnapshotHttpRequest,com.google.cloud.compute.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.getSnapshotCallable))))

(defn get-iam-policy-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.getIamPolicySnapshotCallable))))

(defn list-snapshots-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSnapshotStub this]
    (-> this (.listSnapshotsPagedCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonSnapshotStub this]
    (-> this (.shutdownNow))))

