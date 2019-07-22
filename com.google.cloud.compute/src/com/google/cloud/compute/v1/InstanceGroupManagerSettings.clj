(ns com.google.cloud.compute.v1.InstanceGroupManagerSettings
  "Settings class to configure an instance of InstanceGroupManagerClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of abandonInstancesInstanceGroupManager to 30 seconds:



  InstanceGroupManagerSettings.Builder instanceGroupManagerSettingsBuilder =
      InstanceGroupManagerSettings.newBuilder();
  instanceGroupManagerSettingsBuilder.abandonInstancesInstanceGroupManagerSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InstanceGroupManagerSettings instanceGroupManagerSettings = instanceGroupManagerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InstanceGroupManagerSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InstanceGroupManagerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InstanceGroupManagerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InstanceGroupManagerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InstanceGroupManagerSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder []
    (InstanceGroupManagerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InstanceGroupManagerSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InstanceGroupManagerSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceGroupManagerSettings [^com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings stub]
    (InstanceGroupManagerSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InstanceGroupManagerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InstanceGroupManagerSettings/getDefaultServiceScopes )))

(defn delete-instances-instance-group-manager-settings
  "Returns the object with the settings used for calls to deleteInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.deleteInstancesInstanceGroupManagerSettings))))

(defn set-instance-template-instance-group-manager-settings
  "Returns the object with the settings used for calls to setInstanceTemplateInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.setInstanceTemplateInstanceGroupManagerSettings))))

(defn set-target-pools-instance-group-manager-settings
  "Returns the object with the settings used for calls to setTargetPoolsInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.setTargetPoolsInstanceGroupManagerSettings))))

(defn recreate-instances-instance-group-manager-settings
  "Returns the object with the settings used for calls to recreateInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.recreateInstancesInstanceGroupManagerSettings))))

(defn patch-instance-group-manager-settings
  "Returns the object with the settings used for calls to patchInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.patchInstanceGroupManagerSettings))))

(defn list-managed-instances-instance-group-managers-settings
  "Returns the object with the settings used for calls to
   listManagedInstancesInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.listManagedInstancesInstanceGroupManagersSettings))))

(defn resize-instance-group-manager-settings
  "Returns the object with the settings used for calls to resizeInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.resizeInstanceGroupManagerSettings))))

(defn insert-instance-group-manager-settings
  "Returns the object with the settings used for calls to insertInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.insertInstanceGroupManagerSettings))))

(defn get-instance-group-manager-settings
  "Returns the object with the settings used for calls to getInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.getInstanceGroupManagerSettings))))

(defn abandon-instances-instance-group-manager-settings
  "Returns the object with the settings used for calls to abandonInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.abandonInstancesInstanceGroupManagerSettings))))

(defn aggregated-list-instance-group-managers-settings
  "Returns the object with the settings used for calls to aggregatedListInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList,com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.aggregatedListInstanceGroupManagersSettings))))

(defn delete-instance-group-manager-settings
  "Returns the object with the settings used for calls to deleteInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.deleteInstanceGroupManagerSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerSettings$Builder [^InstanceGroupManagerSettings this]
    (-> this (.toBuilder))))

(defn list-instance-group-managers-settings
  "Returns the object with the settings used for calls to listInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerList,com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceGroupManagerSettings this]
    (-> this (.listInstanceGroupManagersSettings))))

