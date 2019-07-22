(ns com.google.cloud.compute.v1.stub.SnapshotStubSettings
  "Settings class to configure an instance of SnapshotStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteSnapshot to 30 seconds:



  SnapshotStubSettings.Builder snapshotSettingsBuilder =
      SnapshotStubSettings.newBuilder();
  snapshotSettingsBuilder.deleteSnapshotSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SnapshotStubSettings snapshotSettings = snapshotSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SnapshotStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (SnapshotStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SnapshotStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SnapshotStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SnapshotStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SnapshotStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder []
    (SnapshotStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SnapshotStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (SnapshotStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SnapshotStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SnapshotStubSettings/getDefaultServiceScopes )))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SnapshotStub`

  throws: java.io.IOException"
  ([^SnapshotStubSettings this]
    (-> this (.createStub))))

(defn delete-snapshot-settings
  "Returns the object with the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SnapshotStubSettings this]
    (-> this (.deleteSnapshotSettings))))

(defn test-iam-permissions-snapshot-settings
  "Returns the object with the settings used for calls to testIamPermissionsSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsSnapshotHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SnapshotStubSettings this]
    (-> this (.testIamPermissionsSnapshotSettings))))

(defn get-iam-policy-snapshot-settings
  "Returns the object with the settings used for calls to getIamPolicySnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SnapshotStubSettings this]
    (-> this (.getIamPolicySnapshotSettings))))

(defn get-snapshot-settings
  "Returns the object with the settings used for calls to getSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSnapshotHttpRequest,com.google.cloud.compute.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SnapshotStubSettings this]
    (-> this (.getSnapshotSettings))))

(defn set-labels-snapshot-settings
  "Returns the object with the settings used for calls to setLabelsSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetLabelsSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SnapshotStubSettings this]
    (-> this (.setLabelsSnapshotSettings))))

(defn set-iam-policy-snapshot-settings
  "Returns the object with the settings used for calls to setIamPolicySnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SnapshotStubSettings this]
    (-> this (.setIamPolicySnapshotSettings))))

(defn list-snapshots-settings
  "Returns the object with the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotList,com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SnapshotStubSettings this]
    (-> this (.listSnapshotsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SnapshotStubSettings$Builder [^SnapshotStubSettings this]
    (-> this (.toBuilder))))

