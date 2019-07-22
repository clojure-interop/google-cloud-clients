(ns com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse/createAsync context future-response)))

