(ns com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings
  "Settings class to configure an instance of RegionInstanceGroupManagerClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of abandonInstancesRegionInstanceGroupManager to 30 seconds:



  RegionInstanceGroupManagerSettings.Builder regionInstanceGroupManagerSettingsBuilder =
      RegionInstanceGroupManagerSettings.newBuilder();
  regionInstanceGroupManagerSettingsBuilder.abandonInstancesRegionInstanceGroupManagerSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionInstanceGroupManagerSettings regionInstanceGroupManagerSettings = regionInstanceGroupManagerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagerSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionInstanceGroupManagerSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionInstanceGroupManagerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionInstanceGroupManagerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionInstanceGroupManagerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionInstanceGroupManagerSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder []
    (RegionInstanceGroupManagerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionInstanceGroupManagerSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionInstanceGroupManagerSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings [^com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStubSettings stub]
    (RegionInstanceGroupManagerSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionInstanceGroupManagerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionInstanceGroupManagerSettings/getDefaultServiceScopes )))

(defn patch-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to patchRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.patchRegionInstanceGroupManagerSettings))))

(defn set-target-pools-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   setTargetPoolsRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.setTargetPoolsRegionInstanceGroupManagerSettings))))

(defn list-managed-instances-region-instance-group-managers-settings
  "Returns the object with the settings used for calls to
   listManagedInstancesRegionInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.listManagedInstancesRegionInstanceGroupManagersSettings))))

(defn abandon-instances-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   abandonInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.abandonInstancesRegionInstanceGroupManagerSettings))))

(defn delete-instances-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   deleteInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.deleteInstancesRegionInstanceGroupManagerSettings))))

(defn set-instance-template-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   setInstanceTemplateRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.setInstanceTemplateRegionInstanceGroupManagerSettings))))

(defn delete-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to deleteRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.deleteRegionInstanceGroupManagerSettings))))

(defn get-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to getRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.getRegionInstanceGroupManagerSettings))))

(defn resize-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to resizeRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.resizeRegionInstanceGroupManagerSettings))))

(defn list-region-instance-group-managers-settings
  "Returns the object with the settings used for calls to listRegionInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerList,com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.listRegionInstanceGroupManagersSettings))))

(defn insert-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to insertRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.insertRegionInstanceGroupManagerSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings$Builder [^RegionInstanceGroupManagerSettings this]
    (-> this (.toBuilder))))

(defn recreate-instances-region-instance-group-manager-settings
  "Returns the object with the settings used for calls to
   recreateInstancesRegionInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupManagerSettings this]
    (-> this (.recreateInstancesRegionInstanceGroupManagerSettings))))

