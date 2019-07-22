(ns com.google.cloud.compute.v1.stub.VpnTunnelStubSettings$Builder
  "Builder for VpnTunnelStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub VpnTunnelStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.VpnTunnelStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.VpnTunnelStubSettings$Builder [^VpnTunnelStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^VpnTunnelStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-vpn-tunnels-settings
  "Returns the builder for the settings used for calls to aggregatedListVpnTunnels.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelAggregatedList,com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^VpnTunnelStubSettings$Builder this]
    (-> this (.aggregatedListVpnTunnelsSettings))))

(defn delete-vpn-tunnel-settings
  "Returns the builder for the settings used for calls to deleteVpnTunnel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^VpnTunnelStubSettings$Builder this]
    (-> this (.deleteVpnTunnelSettings))))

(defn get-vpn-tunnel-settings
  "Returns the builder for the settings used for calls to getVpnTunnel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetVpnTunnelHttpRequest,com.google.cloud.compute.v1.VpnTunnel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^VpnTunnelStubSettings$Builder this]
    (-> this (.getVpnTunnelSettings))))

(defn insert-vpn-tunnel-settings
  "Returns the builder for the settings used for calls to insertVpnTunnel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^VpnTunnelStubSettings$Builder this]
    (-> this (.insertVpnTunnelSettings))))

(defn list-vpn-tunnels-settings
  "Returns the builder for the settings used for calls to listVpnTunnels.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelList,com.google.cloud.compute.v1.VpnTunnelClient$ListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^VpnTunnelStubSettings$Builder this]
    (-> this (.listVpnTunnelsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.VpnTunnelStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.VpnTunnelStubSettings [^VpnTunnelStubSettings$Builder this]
    (-> this (.build))))

