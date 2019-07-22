(ns com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings
  "Settings class to configure an instance of RegionInstanceGroupStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRegionInstanceGroup to 30 seconds:



  RegionInstanceGroupStubSettings.Builder regionInstanceGroupSettingsBuilder =
      RegionInstanceGroupStubSettings.newBuilder();
  regionInstanceGroupSettingsBuilder.getRegionInstanceGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionInstanceGroupStubSettings regionInstanceGroupSettings = regionInstanceGroupSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionInstanceGroupStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionInstanceGroupStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionInstanceGroupStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionInstanceGroupStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionInstanceGroupStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionInstanceGroupStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings$Builder []
    (RegionInstanceGroupStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionInstanceGroupStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionInstanceGroupStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionInstanceGroupStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionInstanceGroupStubSettings/getDefaultServiceScopes )))

(defn get-region-instance-group-settings
  "Returns the object with the settings used for calls to getRegionInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupStubSettings this]
    (-> this (.getRegionInstanceGroupSettings))))

(defn list-region-instance-groups-settings
  "Returns the object with the settings used for calls to listRegionInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupList,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionInstanceGroupStubSettings this]
    (-> this (.listRegionInstanceGroupsSettings))))

(defn list-instances-region-instance-groups-settings
  "Returns the object with the settings used for calls to listInstancesRegionInstanceGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupsListInstances,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionInstanceGroupStubSettings this]
    (-> this (.listInstancesRegionInstanceGroupsSettings))))

(defn set-named-ports-region-instance-group-settings
  "Returns the object with the settings used for calls to setNamedPortsRegionInstanceGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionInstanceGroupStubSettings this]
    (-> this (.setNamedPortsRegionInstanceGroupSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionInstanceGroupStub`

  throws: java.io.IOException"
  ([^RegionInstanceGroupStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings$Builder [^RegionInstanceGroupStubSettings this]
    (-> this (.toBuilder))))

