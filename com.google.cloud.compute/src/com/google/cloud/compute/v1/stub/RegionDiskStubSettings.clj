(ns com.google.cloud.compute.v1.stub.RegionDiskStubSettings
  "Settings class to configure an instance of RegionDiskStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createSnapshotRegionDisk to 30 seconds:



  RegionDiskStubSettings.Builder regionDiskSettingsBuilder =
      RegionDiskStubSettings.newBuilder();
  regionDiskSettingsBuilder.createSnapshotRegionDiskSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionDiskStubSettings regionDiskSettings = regionDiskSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionDiskStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionDiskStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionDiskStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionDiskStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionDiskStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionDiskStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder []
    (RegionDiskStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionDiskStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionDiskStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionDiskStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionDiskStubSettings/getDefaultServiceScopes )))

(defn delete-region-disk-settings
  "Returns the object with the settings used for calls to deleteRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskStubSettings this]
    (-> this (.deleteRegionDiskSettings))))

(defn get-region-disk-settings
  "Returns the object with the settings used for calls to getRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskStubSettings this]
    (-> this (.getRegionDiskSettings))))

(defn create-snapshot-region-disk-settings
  "Returns the object with the settings used for calls to createSnapshotRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskStubSettings this]
    (-> this (.createSnapshotRegionDiskSettings))))

(defn list-region-disks-settings
  "Returns the object with the settings used for calls to listRegionDisks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.DiskList,com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionDiskStubSettings this]
    (-> this (.listRegionDisksSettings))))

(defn test-iam-permissions-region-disk-settings
  "Returns the object with the settings used for calls to testIamPermissionsRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskStubSettings this]
    (-> this (.testIamPermissionsRegionDiskSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionDiskStub`

  throws: java.io.IOException"
  ([^RegionDiskStubSettings this]
    (-> this (.createStub))))

(defn set-labels-region-disk-settings
  "Returns the object with the settings used for calls to setLabelsRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskStubSettings this]
    (-> this (.setLabelsRegionDiskSettings))))

(defn insert-region-disk-settings
  "Returns the object with the settings used for calls to insertRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskStubSettings this]
    (-> this (.insertRegionDiskSettings))))

(defn resize-region-disk-settings
  "Returns the object with the settings used for calls to resizeRegionDisk.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionDiskStubSettings this]
    (-> this (.resizeRegionDiskSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionDiskStubSettings$Builder [^RegionDiskStubSettings this]
    (-> this (.toBuilder))))

