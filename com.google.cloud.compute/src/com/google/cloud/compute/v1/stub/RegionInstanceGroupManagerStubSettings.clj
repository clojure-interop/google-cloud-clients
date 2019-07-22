(ns com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings
  "Settings class to configure an instance of RegionInstanceGroupManagerStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of abandonInstancesRegionInstanceGroupManager to 30 seconds:



  RegionInstanceGroupManagerStubSettings.Builder regionInstanceGroupManagerSettingsBuilder =
      RegionInstanceGroupManagerStubSettings.newBuilder();
  regionInstanceGroupManagerSettingsBuilder.abandonInstancesRegionInstanceGroupManagerSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionInstanceGroupManagerStubSettings regionInstanceGroupManagerSettings = regionInstanceGroupManagerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionInstanceGroupManagerStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionInstanceGroupManagerStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionInstanceGroupManagerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionInstanceGroupManagerStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionInstanceGroupManagerStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionInstanceGroupManagerStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings$Builder []
    (RegionInstanceGroupManagerStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionInstanceGroupManagerStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionInstanceGroupManagerStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionInstanceGroupManagerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionInstanceGroupManagerStubSettings/getDefaultServiceScopes )))

(defn patch-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to patchRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.patchRegionInstanceGroupManagerSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStub`

  throws: java.io.IOException"
  ([^RegionInstanceGroupManagerStubSettings this]
    (-> this (.createStub))))

(defn set-target-pools-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   setTargetPoolsRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.setTargetPoolsRegionInstanceGroupManagerSettings))))

(defn list-managed-instances-region-instance-group-managers-settings
  "Returns the object with the settings used for calls to
   listManagedInstancesRegionInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.listManagedInstancesRegionInstanceGroupManagersSettings))))

(defn abandon-instances-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   abandonInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.abandonInstancesRegionInstanceGroupManagerSettings))))

(defn delete-instances-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   deleteInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.deleteInstancesRegionInstanceGroupManagerSettings))))

(defn set-instance-template-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   setInstanceTemplateRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.setInstanceTemplateRegionInstanceGroupManagerSettings))))

(defn delete-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to deleteRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.deleteRegionInstanceGroupManagerSettings))))

(defn get-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to getRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.getRegionInstanceGroupManagerSettings))))

(defn resize-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to resizeRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.resizeRegionInstanceGroupManagerSettings))))

(defn list-region-instance-group-managers-settings
  "Returns the object with the settings used for calls to listRegionInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerList,com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.listRegionInstanceGroupManagersSettings))))

(defn insert-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to insertRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.insertRegionInstanceGroupManagerSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings$Builder [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.toBuilder))))

(defn recreate-instances-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   recreateInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerStubSettings this]
    (-> this (.recreateInstancesRegionInstanceGroupManagerSettings))))

