(ns com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnelClient$AggregatedListVpnTunnelsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPage>`"
  (^com.google.api.core.ApiFuture [^VpnTunnelClient$AggregatedListVpnTunnelsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

