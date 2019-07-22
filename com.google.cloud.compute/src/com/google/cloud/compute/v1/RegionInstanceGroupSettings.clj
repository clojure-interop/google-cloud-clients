(ns com.google.cloud.compute.v1.RegionInstanceGroupSettings
  "Settings class to configure an instance of RegionInstanceGroupClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRegionInstanceGroup to 30 seconds:



  RegionInstanceGroupSettings.Builder regionInstanceGroupSettingsBuilder =
      RegionInstanceGroupSettings.newBuilder();
  regionInstanceGroupSettingsBuilder.getRegionInstanceGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionInstanceGroupSettings regionInstanceGroupSettings = regionInstanceGroupSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionInstanceGroupSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionInstanceGroupSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionInstanceGroupSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionInstanceGroupSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionInstanceGroupSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder []
    (RegionInstanceGroupSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionInstanceGroupSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionInstanceGroupSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionInstanceGroupSettings [^com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings stub]
    (RegionInstanceGroupSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionInstanceGroupSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionInstanceGroupSettings/getDefaultServiceScopes )))

(defn get-region-instance-group-settings
  "Returns the object with the settings used for calls to getRegionInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupSettings this]
    (-> this (.getRegionInstanceGroupSettings))))

(defn list-region-instance-groups-settings
  "Returns the object with the settings used for calls to listRegionInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupList,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionInstanceGroupSettings this]
    (-> this (.listRegionInstanceGroupsSettings))))

(defn list-instances-region-instance-groups-settings
  "Returns the object with the settings used for calls to listInstancesRegionInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupsListInstances,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionInstanceGroupSettings this]
    (-> this (.listInstancesRegionInstanceGroupsSettings))))

(defn set-named-ports-region-instance-group-settings
  "Returns the object with the settings used for calls to setNamedPortsRegionInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupSettings this]
    (-> this (.setNamedPortsRegionInstanceGroupSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupSettings$Builder [^RegionInstanceGroupSettings this]
    (-> this (.toBuilder))))

