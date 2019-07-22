(ns com.google.cloud.compute.v1.stub.VpnTunnelStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub VpnTunnelStub]))

(defn ->vpn-tunnel-stub
  "Constructor."
  (^VpnTunnelStub []
    (new VpnTunnelStub )))

(defn aggregated-list-vpn-tunnels-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelStub this]
    (-> this (.aggregatedListVpnTunnelsPagedCallable))))

(defn aggregated-list-vpn-tunnels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelStub this]
    (-> this (.aggregatedListVpnTunnelsCallable))))

(defn delete-vpn-tunnel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelStub this]
    (-> this (.deleteVpnTunnelCallable))))

(defn get-vpn-tunnel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetVpnTunnelHttpRequest,com.google.cloud.compute.v1.VpnTunnel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelStub this]
    (-> this (.getVpnTunnelCallable))))

(defn insert-vpn-tunnel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelStub this]
    (-> this (.insertVpnTunnelCallable))))

(defn list-vpn-tunnels-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelClient$ListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelStub this]
    (-> this (.listVpnTunnelsPagedCallable))))

(defn list-vpn-tunnels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelStub this]
    (-> this (.listVpnTunnelsCallable))))

(defn close
  ""
  ([^VpnTunnelStub this]
    (-> this (.close))))

