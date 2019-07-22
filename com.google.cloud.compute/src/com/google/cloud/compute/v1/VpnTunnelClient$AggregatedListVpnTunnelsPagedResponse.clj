(ns com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse/createAsync context future-response)))

