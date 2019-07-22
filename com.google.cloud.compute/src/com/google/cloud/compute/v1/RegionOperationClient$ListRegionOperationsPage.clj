(ns com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionOperationClient$ListRegionOperationsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPage>`"
  (^com.google.api.core.ApiFuture [^RegionOperationClient$ListRegionOperationsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

