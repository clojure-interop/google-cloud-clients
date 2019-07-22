(ns com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings
  "Settings class to configure an instance of InstanceGroupManagerStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of abandonInstancesInstanceGroupManager to 30 seconds:



  InstanceGroupManagerStubSettings.Builder instanceGroupManagerSettingsBuilder =
      InstanceGroupManagerStubSettings.newBuilder();
  instanceGroupManagerSettingsBuilder.abandonInstancesInstanceGroupManagerSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InstanceGroupManagerStubSettings instanceGroupManagerSettings = instanceGroupManagerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceGroupManagerStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InstanceGroupManagerStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InstanceGroupManagerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InstanceGroupManagerStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InstanceGroupManagerStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InstanceGroupManagerStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings$Builder []
    (InstanceGroupManagerStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InstanceGroupManagerStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InstanceGroupManagerStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InstanceGroupManagerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InstanceGroupManagerStubSettings/getDefaultServiceScopes )))

(defn delete-instances-instance-group-manager-settings
  "Returns the object with the settings used for calls to deleteInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.deleteInstancesInstanceGroupManagerSettings))))

(defn set-instance-template-instance-group-manager-settings
  "Returns the object with the settings used for calls to setInstanceTemplateInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.setInstanceTemplateInstanceGroupManagerSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceGroupManagerStub`

  throws: java.io.IOException"
  ([^InstanceGroupManagerStubSettings this]
    (-> this (.createStub))))

(defn set-target-pools-instance-group-manager-settings
  "Returns the object with the settings used for calls to setTargetPoolsInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.setTargetPoolsInstanceGroupManagerSettings))))

(defn recreate-instances-instance-group-manager-settings
  "Returns the object with the settings used for calls to recreateInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.recreateInstancesInstanceGroupManagerSettings))))

(defn patch-instance-group-manager-settings
  "Returns the object with the settings used for calls to patchInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.patchInstanceGroupManagerSettings))))

(defn list-managed-instances-instance-group-managers-settings
  "Returns the object with the settings used for calls to
   listManagedInstancesInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.listManagedInstancesInstanceGroupManagersSettings))))

(defn resize-instance-group-manager-settings
  "Returns the object with the settings used for calls to resizeInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.resizeInstanceGroupManagerSettings))))

(defn insert-instance-group-manager-settings
  "Returns the object with the settings used for calls to insertInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.insertInstanceGroupManagerSettings))))

(defn get-instance-group-manager-settings
  "Returns the object with the settings used for calls to getInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.getInstanceGroupManagerSettings))))

(defn abandon-instances-instance-group-manager-settings
  "Returns the object with the settings used for calls to abandonInstancesInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.abandonInstancesInstanceGroupManagerSettings))))

(defn aggregated-list-instance-group-managers-settings
  "Returns the object with the settings used for calls to aggregatedListInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList,com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.aggregatedListInstanceGroupManagersSettings))))

(defn delete-instance-group-manager-settings
  "Returns the object with the settings used for calls to deleteInstanceGroupManager.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.deleteInstanceGroupManagerSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceGroupManagerStubSettings$Builder [^InstanceGroupManagerStubSettings this]
    (-> this (.toBuilder))))

(defn list-instance-group-managers-settings
  "Returns the object with the settings used for calls to listInstanceGroupManagers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerList,com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceGroupManagerStubSettings this]
    (-> this (.listInstanceGroupManagersSettings))))

