(ns com.google.cloud.compute.v1.DiskSettings
  "Settings class to configure an instance of DiskClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createSnapshotDisk to 30 seconds:



  DiskSettings.Builder diskSettingsBuilder =
      DiskSettings.newBuilder();
  diskSettingsBuilder.createSnapshotDiskSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DiskSettings diskSettings = diskSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (DiskSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DiskSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DiskSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DiskSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.DiskSettings$Builder`"
  (^com.google.cloud.compute.v1.DiskSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DiskSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.DiskSettings$Builder []
    (DiskSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DiskSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (DiskSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.DiskStubSettings`

  returns: `com.google.cloud.compute.v1.DiskSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.DiskSettings [^com.google.cloud.compute.v1.stub.DiskStubSettings stub]
    (DiskSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DiskSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DiskSettings/getDefaultServiceScopes )))

(defn get-disk-settings
  "Returns the object with the settings used for calls to getDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.getDiskSettings))))

(defn set-labels-disk-settings
  "Returns the object with the settings used for calls to setLabelsDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetLabelsDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.setLabelsDiskSettings))))

(defn insert-disk-settings
  "Returns the object with the settings used for calls to insertDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.insertDiskSettings))))

(defn set-iam-policy-disk-settings
  "Returns the object with the settings used for calls to setIamPolicyDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.setIamPolicyDiskSettings))))

(defn test-iam-permissions-disk-settings
  "Returns the object with the settings used for calls to testIamPermissionsDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.testIamPermissionsDiskSettings))))

(defn resize-disk-settings
  "Returns the object with the settings used for calls to resizeDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ResizeDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.resizeDiskSettings))))

(defn aggregated-list-disks-settings
  "Returns the object with the settings used for calls to aggregatedListDisks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskAggregatedList,com.google.cloud.compute.v1.DiskClient$AggregatedListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DiskSettings this]
    (-> this (.aggregatedListDisksSettings))))

(defn list-disks-settings
  "Returns the object with the settings used for calls to listDisks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskList,com.google.cloud.compute.v1.DiskClient$ListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DiskSettings this]
    (-> this (.listDisksSettings))))

(defn delete-disk-settings
  "Returns the object with the settings used for calls to deleteDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.deleteDiskSettings))))

(defn get-iam-policy-disk-settings
  "Returns the object with the settings used for calls to getIamPolicyDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.getIamPolicyDiskSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.DiskSettings$Builder`"
  (^com.google.cloud.compute.v1.DiskSettings$Builder [^DiskSettings this]
    (-> this (.toBuilder))))

(defn create-snapshot-disk-settings
  "Returns the object with the settings used for calls to createSnapshotDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DiskSettings this]
    (-> this (.createSnapshotDiskSettings))))

