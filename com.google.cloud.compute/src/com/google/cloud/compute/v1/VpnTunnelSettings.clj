(ns com.google.cloud.compute.v1.VpnTunnelSettings
  "Settings class to configure an instance of VpnTunnelClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteVpnTunnel to 30 seconds:



  VpnTunnelSettings.Builder vpnTunnelSettingsBuilder =
      VpnTunnelSettings.newBuilder();
  vpnTunnelSettingsBuilder.deleteVpnTunnelSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  VpnTunnelSettings vpnTunnelSettings = vpnTunnelSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnelSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (VpnTunnelSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (VpnTunnelSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (VpnTunnelSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (VpnTunnelSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.VpnTunnelSettings$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (VpnTunnelSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.VpnTunnelSettings$Builder []
    (VpnTunnelSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (VpnTunnelSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (VpnTunnelSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.VpnTunnelStubSettings`

  returns: `com.google.cloud.compute.v1.VpnTunnelSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.VpnTunnelSettings [^com.google.cloud.compute.v1.stub.VpnTunnelStubSettings stub]
    (VpnTunnelSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (VpnTunnelSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (VpnTunnelSettings/getDefaultServiceScopes )))

(defn aggregated-list-vpn-tunnels-settings
  "Returns the object with the settings used for calls to aggregatedListVpnTunnels.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelAggregatedList,com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^VpnTunnelSettings this]
    (-> this (.aggregatedListVpnTunnelsSettings))))

(defn delete-vpn-tunnel-settings
  "Returns the object with the settings used for calls to deleteVpnTunnel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^VpnTunnelSettings this]
    (-> this (.deleteVpnTunnelSettings))))

(defn get-vpn-tunnel-settings
  "Returns the object with the settings used for calls to getVpnTunnel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetVpnTunnelHttpRequest,com.google.cloud.compute.v1.VpnTunnel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^VpnTunnelSettings this]
    (-> this (.getVpnTunnelSettings))))

(defn insert-vpn-tunnel-settings
  "Returns the object with the settings used for calls to insertVpnTunnel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^VpnTunnelSettings this]
    (-> this (.insertVpnTunnelSettings))))

(defn list-vpn-tunnels-settings
  "Returns the object with the settings used for calls to listVpnTunnels.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelList,com.google.cloud.compute.v1.VpnTunnelClient$ListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^VpnTunnelSettings this]
    (-> this (.listVpnTunnelsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.VpnTunnelSettings$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelSettings$Builder [^VpnTunnelSettings this]
    (-> this (.toBuilder))))

