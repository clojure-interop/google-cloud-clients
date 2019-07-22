(ns com.google.cloud.compute.v1.stub.InstanceGroupStubSettings
  "Settings class to configure an instance of InstanceGroupStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addInstancesInstanceGroup to 30 seconds:



  InstanceGroupStubSettings.Builder instanceGroupSettingsBuilder =
      InstanceGroupStubSettings.newBuilder();
  instanceGroupSettingsBuilder.addInstancesInstanceGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InstanceGroupStubSettings instanceGroupSettings = instanceGroupSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceGroupStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InstanceGroupStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InstanceGroupStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InstanceGroupStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InstanceGroupStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InstanceGroupStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder []
    (InstanceGroupStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InstanceGroupStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InstanceGroupStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InstanceGroupStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InstanceGroupStubSettings/getDefaultServiceScopes )))

(defn insert-instance-group-settings
  "Returns the object with the settings used for calls to insertInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupStubSettings this]
    (-> this (.insertInstanceGroupSettings))))

(defn aggregated-list-instance-groups-settings
  "Returns the object with the settings used for calls to aggregatedListInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupAggregatedList,com.google.cloud.compute.v1.InstanceGroupClient$AggregatedListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceGroupStubSettings this]
    (-> this (.aggregatedListInstanceGroupsSettings))))

(defn delete-instance-group-settings
  "Returns the object with the settings used for calls to deleteInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupStubSettings this]
    (-> this (.deleteInstanceGroupSettings))))

(defn list-instance-groups-settings
  "Returns the object with the settings used for calls to listInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupList,com.google.cloud.compute.v1.InstanceGroupClient$ListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceGroupStubSettings this]
    (-> this (.listInstanceGroupsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceGroupStub`

  throws: java.io.IOException"
  ([^InstanceGroupStubSettings this]
    (-> this (.createStub))))

(defn set-named-ports-instance-group-settings
  "Returns the object with the settings used for calls to setNamedPortsInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetNamedPortsInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupStubSettings this]
    (-> this (.setNamedPortsInstanceGroupSettings))))

(defn get-instance-group-settings
  "Returns the object with the settings used for calls to getInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupStubSettings this]
    (-> this (.getInstanceGroupSettings))))

(defn remove-instances-instance-group-settings
  "Returns the object with the settings used for calls to removeInstancesInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemoveInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupStubSettings this]
    (-> this (.removeInstancesInstanceGroupSettings))))

(defn list-instances-instance-groups-settings
  "Returns the object with the settings used for calls to listInstancesInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupsListInstances,com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceGroupStubSettings this]
    (-> this (.listInstancesInstanceGroupsSettings))))

(defn add-instances-instance-group-settings
  "Returns the object with the settings used for calls to addInstancesInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceGroupStubSettings this]
    (-> this (.addInstancesInstanceGroupSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceGroupStubSettings$Builder [^InstanceGroupStubSettings this]
    (-> this (.toBuilder))))

