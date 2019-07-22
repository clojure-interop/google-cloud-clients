(ns com.google.cloud.compute.v1.NetworkEndpointGroupSettings
  "Settings class to configure an instance of NetworkEndpointGroupClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of attachNetworkEndpointsNetworkEndpointGroup to 30 seconds:



  NetworkEndpointGroupSettings.Builder networkEndpointGroupSettingsBuilder =
      NetworkEndpointGroupSettings.newBuilder();
  networkEndpointGroupSettingsBuilder.attachNetworkEndpointsNetworkEndpointGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  NetworkEndpointGroupSettings networkEndpointGroupSettings = networkEndpointGroupSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (NetworkEndpointGroupSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (NetworkEndpointGroupSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (NetworkEndpointGroupSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (NetworkEndpointGroupSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (NetworkEndpointGroupSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder []
    (NetworkEndpointGroupSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (NetworkEndpointGroupSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (NetworkEndpointGroupSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupSettings [^com.google.cloud.compute.v1.stub.NetworkEndpointGroupStubSettings stub]
    (NetworkEndpointGroupSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (NetworkEndpointGroupSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (NetworkEndpointGroupSettings/getDefaultServiceScopes )))

(defn insert-network-endpoint-group-settings
  "Returns the object with the settings used for calls to insertNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.insertNetworkEndpointGroupSettings))))

(defn get-network-endpoint-group-settings
  "Returns the object with the settings used for calls to getNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.getNetworkEndpointGroupSettings))))

(defn aggregated-list-network-endpoint-groups-settings
  "Returns the object with the settings used for calls to aggregatedListNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupAggregatedList,com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.aggregatedListNetworkEndpointGroupsSettings))))

(defn detach-network-endpoints-network-endpoint-group-settings
  "Returns the object with the settings used for calls to
   detachNetworkEndpointsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroupSettings))))

(defn attach-network-endpoints-network-endpoint-group-settings
  "Returns the object with the settings used for calls to
   attachNetworkEndpointsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroupSettings))))

(defn delete-network-endpoint-group-settings
  "Returns the object with the settings used for calls to deleteNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.deleteNetworkEndpointGroupSettings))))

(defn list-network-endpoint-groups-settings
  "Returns the object with the settings used for calls to listNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupList,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.listNetworkEndpointGroupsSettings))))

(defn list-network-endpoints-network-endpoint-groups-settings
  "Returns the object with the settings used for calls to
   listNetworkEndpointsNetworkEndpointGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupSettings$Builder [^NetworkEndpointGroupSettings this]
    (-> this (.toBuilder))))

(defn test-iam-permissions-network-endpoint-group-settings
  "Returns the object with the settings used for calls to testIamPermissionsNetworkEndpointGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkEndpointGroupSettings this]
    (-> this (.testIamPermissionsNetworkEndpointGroupSettings))))

