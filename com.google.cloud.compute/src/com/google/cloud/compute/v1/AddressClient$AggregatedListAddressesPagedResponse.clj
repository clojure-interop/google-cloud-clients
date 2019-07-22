(ns com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddressClient$AggregatedListAddressesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (AddressClient$AggregatedListAddressesPagedResponse/createAsync context future-response)))

