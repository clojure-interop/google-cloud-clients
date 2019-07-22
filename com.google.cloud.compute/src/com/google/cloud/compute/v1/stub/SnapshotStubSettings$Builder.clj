(ns com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder
  "Builder for SnapshotStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SnapshotStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder [^SnapshotStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-snapshot-settings
  "Returns the builder for the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SnapshotStubSettings$Builder this]
    (-> this (.deleteSnapshotSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.SnapshotStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.SnapshotStubSettings [^SnapshotStubSettings$Builder this]
    (-> this (.build))))

(defn test-iam-permissions-snapshot-settings
  "Returns the builder for the settings used for calls to testIamPermissionsSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsSnapshotHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SnapshotStubSettings$Builder this]
    (-> this (.testIamPermissionsSnapshotSettings))))

(defn get-iam-policy-snapshot-settings
  "Returns the builder for the settings used for calls to getIamPolicySnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SnapshotStubSettings$Builder this]
    (-> this (.getIamPolicySnapshotSettings))))

(defn get-snapshot-settings
  "Returns the builder for the settings used for calls to getSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSnapshotHttpRequest,com.google.cloud.compute.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SnapshotStubSettings$Builder this]
    (-> this (.getSnapshotSettings))))

(defn set-labels-snapshot-settings
  "Returns the builder for the settings used for calls to setLabelsSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetLabelsSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SnapshotStubSettings$Builder this]
    (-> this (.setLabelsSnapshotSettings))))

(defn set-iam-policy-snapshot-settings
  "Returns the builder for the settings used for calls to setIamPolicySnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SnapshotStubSettings$Builder this]
    (-> this (.setIamPolicySnapshotSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SnapshotStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-snapshots-settings
  "Returns the builder for the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotList,com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SnapshotStubSettings$Builder this]
    (-> this (.listSnapshotsSettings))))

